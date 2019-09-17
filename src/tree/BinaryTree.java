package tree;

import java.util.LinkedList;

public class BinaryTree {
    /**
     * 前序构建
     * @param list
     * @return
     */
    public static TreeNode creatPreBinaryTree(LinkedList<Integer> list){
        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer integer = list.removeFirst();
        if (integer!=null) {
            node=new TreeNode(integer);
            node.leftNode=creatPreBinaryTree(list);
            node.rightNode=creatPreBinaryTree(list);
        }
        return node;
    }
}
