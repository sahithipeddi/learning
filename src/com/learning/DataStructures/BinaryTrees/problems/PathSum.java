package com.learning.DataStructures.BinaryTrees.problems;

public class PathSum {

    public static void main(String[] args) {
  /*            7
              /  \
              5    8
              / \   /
              4   6  2
    */
        SumLeftLeaves.TreeNode treeNode = new SumLeftLeaves.TreeNode();
        treeNode.value = 10;

        SumLeftLeaves.TreeNode treeNode1 = new SumLeftLeaves.TreeNode();
        treeNode.left = treeNode1;
        treeNode.left.value = 5;

        SumLeftLeaves.TreeNode treeNode2 = new SumLeftLeaves.TreeNode();
        treeNode.left.left = treeNode2;
        treeNode.left.left.value = 5;

        SumLeftLeaves.TreeNode treeNode4 = new SumLeftLeaves.TreeNode();
        treeNode.right = treeNode4;
        treeNode.right.value = 5;

        SumLeftLeaves.TreeNode treeNode5 = new SumLeftLeaves.TreeNode();
        treeNode.right.left = treeNode5;
        treeNode.right.left.value = 4;
        
        System.out.println(pathSum(treeNode.left, treeNode.value));
    }

    private static boolean pathSum(SumLeftLeaves.TreeNode treeNode, Integer sum) {
        if(treeNode == null) return false;

        if(treeNode.left == null && treeNode.right == null) return (treeNode.value == sum);

        return pathSum(treeNode.left, sum - treeNode.value) || pathSum(treeNode.right, sum - treeNode.value);
    }


}
