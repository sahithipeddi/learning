package com.learning.DataStructures.BinaryTrees.problems;

import java.util.Map;

public class MaxDepthBinaryTree {

    public static void main(String[] args) {
  /*            7
              /  \
              5    8
              / \   /
              4   6  2
    */
        SumLeftLeaves.TreeNode treeNode = new SumLeftLeaves.TreeNode();
        treeNode.value = 7;

        SumLeftLeaves.TreeNode treeNode1 = new SumLeftLeaves.TreeNode();
        treeNode.left = treeNode1;
        treeNode.left.value = 5;

        SumLeftLeaves.TreeNode treeNode2 = new SumLeftLeaves.TreeNode();
        treeNode.left.left = treeNode2;
        treeNode.left.left.value = 4;


        SumLeftLeaves.TreeNode treeNode3 = new SumLeftLeaves.TreeNode();
        treeNode.left.right = treeNode3;
        treeNode.left.right.value = 6;

        SumLeftLeaves.TreeNode treeNode4 = new SumLeftLeaves.TreeNode();
        treeNode.right = treeNode4;
        treeNode.right.value = 8;

        SumLeftLeaves.TreeNode treeNode5 = new SumLeftLeaves.TreeNode();
        treeNode.right.left = treeNode5;
        treeNode.right.left.value = 2;

        SumLeftLeaves.TreeNode treeNode6 = new SumLeftLeaves.TreeNode();
        treeNode.left.left.left = treeNode6;
        treeNode.left.left.left.value = 9;


        System.out.println(maxDepthBinaryTree(treeNode));
    }

    private static Integer maxDepthBinaryTree(SumLeftLeaves.TreeNode root) {

        if(root == null) return 0;

        if(root.left == null && root.right == null) return  1;

        return 1 + Math.max(maxDepthBinaryTree(root.left), maxDepthBinaryTree(root.right));

    }


}
