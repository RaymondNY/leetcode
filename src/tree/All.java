package tree;

import java.util.Arrays;
import java.util.LinkedList;

public class All {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(new Integer[]{
                3,2,9,null,null,10,null,null,8,null,4
        }));
        TreeNode treeNode = BinaryTree.creatPreBinaryTree(list);
        Traversal.preOrderTraversal(treeNode);
    }
}
