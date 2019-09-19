package tree;

import tools.TraceThreadPool;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class All {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(new Integer[]{
//                3,2,9,null,null,10,null,null,8,null,4
//        }));
//        TreeNode treeNode = BinaryTree.creatPreBinaryTree(list);
//        Traversal.preOrderTraversal(treeNode);
//
//        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(new Integer[]{
//                null,1,null,2,null,3,null,4,5,6,7,8,9,null
//        }));
//        TreeNode treeNode = BinaryTree.creatPreBinaryTree(list);
//        Traversal.inOrderTraversal(treeNode);
        TraceThreadPool traceThreadPool = new TraceThreadPool(5,10,0, TimeUnit.NANOSECONDS,new ArrayBlockingQueue<Runnable>(10));
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            traceThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    double a = 5/ finalI;
                    System.out.println(a+Thread.currentThread().getName());
                }
            });
        }
        traceThreadPool.shutdown();
    }
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            int finalI = i;
//            executorService.execute(new Runnable() {
//                @Override
//                public void run() {
//                    double a = 5/ finalI;
//                    System.out.println(a+Thread.currentThread().getName());
//                }
//            });
//        }
//        executorService.shutdown();
//    }
}
