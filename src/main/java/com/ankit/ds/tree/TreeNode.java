package com.ankit.ds.tree;

public class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data=data;
    }

    public static void inOrderTraverse(TreeNode treeNode){
        if(treeNode!=null){
            inOrderTraverse(treeNode.left);
            System.out.println(treeNode.data);
            inOrderTraverse(treeNode.right);
        }

    }

    public static void preOrderTraverse(TreeNode treeNode){
        if(treeNode!=null){
            System.out.println(treeNode.data);
            preOrderTraverse(treeNode.left);
            preOrderTraverse(treeNode.right);
        }
    }

    public static void postOrderTraverse(TreeNode treeNode){
        if(treeNode !=null){
            postOrderTraverse(treeNode.left);
            postOrderTraverse(treeNode.right);
            System.out.println(treeNode.data);

        }
    }


    public static int height(TreeNode treeNode){
        if(treeNode==null){
            return 0;
        }else{
            return Math.max(height(treeNode.left),height(treeNode.right))+1;
        }

    }

   //                                   1
 //                                 2         3
 //                            4
//                          7    8

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.right = new TreeNode(8);
        //inOrderTraverse(treeNode);
        //preOrderTraverse(treeNode);
       // postOrderTraverse(treeNode);
        System.out.println(height(treeNode));


    }
}
