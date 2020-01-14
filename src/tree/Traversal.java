package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;
        List list = new ArrayList();
        while (treeNode != null||!stack.isEmpty()){
            if (treeNode!= null) {
                stack.push(treeNode);
                list.add(treeNode.data);
                treeNode = treeNode.leftNode;
            }else {
                TreeNode pop = stack.pop();
                treeNode = pop.rightNode;
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
                treeNode=treeNode.leftNode;
            }else {
                TreeNode pop = stack.pop();
                list.add(pop.data);
                treeNode = pop.rightNode;
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
                treeNode = treeNode.rightNode;
            }else {
                TreeNode pop = stack.pop();
                treeNode = pop.leftNode;
            }
        }
        Collections.reverse(list);
    }
}
