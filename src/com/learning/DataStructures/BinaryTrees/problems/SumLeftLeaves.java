package com.learning.DataStructures.BinaryTrees.problems;


public class SumLeftLeaves {

    public static void main(String[] args) {
  /*            7
              /  \
              5    8
              / \   /
              4   6  2
    */
        TreeNode treeNode = new TreeNode();
        treeNode.value = 7;

        TreeNode treeNode1 = new TreeNode();
        treeNode.left = treeNode1;
        treeNode.left.value = 5;

        TreeNode treeNode2 = new TreeNode();
        treeNode.left.left = treeNode2;
        treeNode.left.left.value = 4;


        TreeNode treeNode3 = new TreeNode();
        treeNode.left.right = treeNode3;
        treeNode.left.right.value = 6;

        TreeNode treeNode4 = new TreeNode();
        treeNode.right = treeNode4;
        treeNode.right.value = 8;

        TreeNode treeNode5 = new TreeNode();
        treeNode.right.left = treeNode5;
        treeNode.right.left.value = 2;

        System.out.println(sumOfLeftLeaves(treeNode));
    }

    private static Integer sumOfLeftLeaves(TreeNode root) {

        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }

        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                return root.left.value + sumOfLeftLeaves(root.right);
            }
        }

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }


    public static class TreeNode{

        TreeNode left;
        TreeNode right;
        Integer value;
    }
}
