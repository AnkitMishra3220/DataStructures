package com.ankit.ds.tree;

public class PrintNodeAtKPosition {

    static int i=0;

    public static void printNodeAtKPosition(TreeNode treeNode,int k){
        if(treeNode==null){
            return;
        }
        if(k==0){
            System.out.println(treeNode.data);

        }else {
            printNodeAtKPosition(treeNode.left, k - 1);
            printNodeAtKPosition(treeNode.right, k - 1);
        }



    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.left.left = new TreeNode(7);
        treeNode.left.left.right = new TreeNode(8);
        printNodeAtKPosition(treeNode,2);


    }
}
