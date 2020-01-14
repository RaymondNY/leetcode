package tree;

import tools.TraceThreadPool;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class All {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(new Integer[]{
                3,2,9,null,null,10,null,null,8,null,4
        }));
        /**
         *             3
         *        2       8
         *     9    10       4
         */
        TreeNode treeNode = BinaryTree.creatPreBinaryTree(list);
        List cexubianli = Traversal.cexubianli(treeNode);
        System.out.println(cexubianli);

    }
}
