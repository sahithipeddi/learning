package com.learning.DataStructures.BinaryTrees.problems;

public class SameTree {

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

        SumLeftLeaves.TreeNode treeNode4 = new SumLeftLeaves.TreeNode();
        treeNode.right = treeNode4;
        treeNode.right.value = 5;

        SumLeftLeaves.TreeNode treeNode5 = new SumLeftLeaves.TreeNode();
        treeNode.right.left = treeNode5;
        treeNode.right.left.value = 4;

        /*Binary Tree 2 */

        SumLeftLeaves.TreeNode treeNode10 = new SumLeftLeaves.TreeNode();
        treeNode.value = 7;

        SumLeftLeaves.TreeNode treeNode11 = new SumLeftLeaves.TreeNode();
        treeNode.left = treeNode1;
        treeNode.left.value = 5;

        SumLeftLeaves.TreeNode treeNode12 = new SumLeftLeaves.TreeNode();
        treeNode.left.left = treeNode2;
        treeNode.left.left.value = 4;

        SumLeftLeaves.TreeNode treeNode14 = new SumLeftLeaves.TreeNode();
        treeNode.right = treeNode4;
        treeNode.right.value = 5;

        SumLeftLeaves.TreeNode treeNode15 = new SumLeftLeaves.TreeNode();
        treeNode.right.left = treeNode5;
        treeNode.right.left.value = 4;

        System.out.println(sameBinaryTree(treeNode, treeNode10));
    }

    private static Boolean sameBinaryTree(SumLeftLeaves.TreeNode root1, SumLeftLeaves.TreeNode root2) {

        if (root1 == null) return (root2 == null);

        else {
            if (root2.value == null) return false;

            return ((root1.value == root2.value) && sameBinaryTree(root1.left, root2.left) && sameBinaryTree(root1.right, root2.right));

        }


    }


}
