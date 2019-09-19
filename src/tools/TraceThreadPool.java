package tools;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TraceThreadPool extends ThreadPoolExecutor {

    public TraceThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    @Override
    public void execute(Runnable command) {
        super.execute(wrap(command,clientTraceException(),Thread.currentThread().getName()));
    }

    private Exception clientTraceException(){
        return new Exception("stack trace");
    }
    private Runnable wrap(final Runnable command,final Exception exception,String clientThreadName){
        return new Runnable() {
            @Override
            public void run() {
                try {
                    command.run();
                } catch (Exception e) {
                    exception.printStackTrace();
                    throw e;
                }
            }
        };
    }
}
