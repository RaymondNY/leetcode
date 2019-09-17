package tree;

import java.util.Stack;

public class Traversal {

    /**
     * 递归
     * 遍历二叉树
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

    public static void postOrderTraversal(TreeNode node){
        if (node == null) {
            return;
        }
        postOrderTraversal(node.leftNode);
        postOrderTraversal(node.rightNode);
        System.out.println(node.data);
    }

    /**
     * 非递归
     * 遍历二叉树
     * @param root
     * @return
     */
    public static void preOrderTraversalWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode = root;
        while (treeNode != null||!stack.isEmpty()){
            while (treeNode!=null){
                System.out.println(treeNode.data);
                stack.push(treeNode);
                treeNode=treeNode.leftNode;
            }
            if (!stack.isEmpty()) {
                stack.pop();
                treeNode = treeNode.rightNode;
            }
        }
    }

    public static void inOrderTraversalWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode = root;
        while (treeNode != null||!stack.isEmpty()){
            while (treeNode!=null){
               stack.push(treeNode);
               treeNode=treeNode.leftNode;
            }
            if (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                System.out.println(pop.data);
                treeNode=pop.rightNode;
            }
        }
    }

    public static void postOrderTraversalWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode = root;
        TreeNode last;
        while (treeNode != null||!stack.isEmpty()){
            while (treeNode!=null){
                stack.push(treeNode);
                treeNode=treeNode.leftNode;
            }
            if (!stack.isEmpty()) {

            }
        }
    }
}
