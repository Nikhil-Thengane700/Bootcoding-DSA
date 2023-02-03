package com.bootcoding.dsa.Tree;

public class inorder {
    public static TreeNode create(){
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        return root;
    }

    public static void inorderTraversal( TreeNode root){
        if(root== null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + ",");
        inorderTraversal(root.right);
    }

    public static void preOrderTraversal( TreeNode root){
        if(root== null){
            return;
        }
        System.out.print(root.data + ",");
        preOrderTraversal(root.left);

        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal( TreeNode root){
        if(root== null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + ",");

    }
    public static void main(String[] args) {
        System.out.println("Inorder Traversal");
        inorderTraversal(create());
        System.out.println();

        System.out.println("Pre-Order Traversal");
        preOrderTraversal(create());
        System.out.println();

        System.out.println("Post-Order");
        postOrderTraversal(create());






    }
}
