package com.learning.DataStructures.BinaryTrees.problems;

public class InvertBinaryTree {
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

        SumLeftLeaves.TreeNode treeNode6 = new SumLeftLeaves.TreeNode();
        treeNode.left.left.left = treeNode6;
        treeNode.left.left.left.value = 9;

        SumLeftLeaves.TreeNode treeNode3 = new SumLeftLeaves.TreeNode();
        treeNode.left.right = treeNode3;
        treeNode.left.right.value = 6;

        SumLeftLeaves.TreeNode treeNode4 = new SumLeftLeaves.TreeNode();
        treeNode.right = treeNode4;
        treeNode.right.value = 8;

        SumLeftLeaves.TreeNode treeNode5 = new SumLeftLeaves.TreeNode();
        treeNode.right.left = treeNode5;
        treeNode.right.left.value = 2;

        System.out.println(invertBinaryTree(treeNode));
    }

    private static SumLeftLeaves.TreeNode invertBinaryTree(SumLeftLeaves.TreeNode root) {

        if(root == null || (root.left == null && root.right == null)) return root;

        SumLeftLeaves.TreeNode node = root.left;

        root.left = invertBinaryTree(root.right);
        root.right = invertBinaryTree(node);

        return root;

    }


}
