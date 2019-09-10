package tree;

import java.util.Arrays;
import java.util.LinkedList;

public class All {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(new Integer[]{
//                3,2,9,null,null,10,null,null,8,null,4
//        }));
//        TreeNode treeNode = BinaryTree.creatPreBinaryTree(list);
//        Traversal.preOrderTraversal(treeNode);

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(new Integer[]{
                null,1,null,2,null,3,null,4,5,6,7,8,9,null
        }));
        TreeNode treeNode = BinaryTree.creatInBinaryTree(list);
        Traversal.inOrderTraversal(treeNode);
    }
}
