package com.learning.Algorithms.binarytrees;

public class LowestCommonAncestor {

    private static Node ans;

    public LowestCommonAncestor(){
        this.ans = null;
    }

    static class Node{
        Node left, right, parent;
        int value;
    }

    static Node newNode(int value)
    {
        Node temp = new Node();
        temp.left = null;
        temp.right = null;
        temp.parent = null;
        temp.value = value;
        return temp;
    }
    public static void main(String[] args) {
        Node root = newNode(1);
        root.parent = null;
        root.left = newNode(2);
        root.left.parent = root;
        root.left.left = newNode(4);
        root.left.left.parent = root.left;
        root.left.right = newNode(5);
        root.left.right.parent = root.left;
        root.right = newNode(3);
        root.right.parent = root;
        root.right.left = newNode(6);
        root.right.left.parent = root.right;
        root.right.right = newNode(7);
        root.right.right.parent = root.right;
        root.left.right.left = newNode(10);
        root.left.right.left.parent = root.left.right;
        root.left.right.right = newNode(11);
        root.left.right.right.parent = root.left.right.right;
        root.left.left.right = newNode(9);
        root.left.left.right.parent = root.left.left.right;
        root.left.left.left = newNode(8);
        root.left.left.left.parent = root.left.left.left;

        System.out.println("HI : " +lowestCommonAncestor(root, root.left.left.right, root.left.right.right ).value);


    }

        private static boolean recurseTree(Node currentNode, Node p, Node q) {

        // If reached the end of a branch, return false.
        if (currentNode == null) {
            return false;
        }

        // Left Recursion. If left recursion returns true, set left = 1 else 0
        int left = recurseTree(currentNode.left, p, q) ? 1 : 0;

        // Right Recursion
        int right = recurseTree(currentNode.right, p, q) ? 1 : 0;

        // If the current node is one of p or q
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;


        // If any two of the flags left, right or mid become True
        if (mid + left + right >= 2) {
            ans = currentNode;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        // Traverse the tree
        boolean b = recurseTree(root, p, q);
        return ans;
    }
}
