package tree;

public class Traversal {

    /**
     * 递归
     * 中序遍历二叉树
     * @param node
     * @return
     */
    public static void inOrderTraversal(TreeNode node){
        if (node == null) {
            return;
        }
        inOrderTraversal(node.leftNode);
        System.out.println(node.data);
        inOrderTraversal(node.rightNode);
    }

    public static void preOrderTraversal(TreeNode node){
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.leftNode);
        preOrderTraversal(node.rightNode);
    }
}
