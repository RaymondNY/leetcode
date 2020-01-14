package tree;

import java.util.*;

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
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }

    public static void preOrderTraversal(TreeNode node){
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void postOrderTraversal(TreeNode node){
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

    /**
     * 非递归
     * 遍历二叉树
     * @param root
     * @return
     */
    public static void preOrderTraversalWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;
        List list = new ArrayList();
        while (treeNode != null||!stack.isEmpty()){
            if (treeNode!= null) {
                stack.push(treeNode);
                list.add(treeNode.data);
                treeNode = treeNode.left;
            }else {
                TreeNode pop = stack.pop();
                treeNode = pop.right;
            }
        }
    }

    public static void inOrderTraversalWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;
        List list = new ArrayList();
        while (treeNode != null||!stack.isEmpty()){
            if (treeNode!= null) {
                stack.push(treeNode);
                treeNode=treeNode.left;
            }else {
                TreeNode pop = stack.pop();
                list.add(pop.data);
                treeNode = pop.right;
            }
        }

    }

    public static void postOrderTraversalWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;
        List list = new ArrayList();
        while (treeNode != null||!stack.isEmpty()){
            if (treeNode!= null) {
                stack.push(treeNode);
                list.add(treeNode.data);
                treeNode = treeNode.right;
            }else {
                TreeNode pop = stack.pop();
                treeNode = pop.left;
            }
        }
        Collections.reverse(list);
    }
    public static List cexubianli(TreeNode root){
        List list = new ArrayList();
        if (root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode poll = q.poll();
            list.add(poll.data);
            if (poll.left!=null) {
                q.offer(poll.left);
            }
            if (poll.right!=null) {
                q.offer(poll.right);
            }
        }
        return list;
    }
    /**
     * 104. 二叉树的最大深度
     */
    public static void maxDepth(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int deep=0;
        while (!q.isEmpty()){
            deep++;
            int len = q.size();
            for (int i = 0; i < len; i++) {
                TreeNode poll = q.poll();
                if (poll.left!=null) {
                    q.offer(poll.left);
                }
                if (poll.right!=null) {
                    q.offer(poll.right);
                }
            }
        }
    }
}
