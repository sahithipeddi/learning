package com.learning.Algorithms.binarytrees;

public class PostOrderTraversalSerachNode {

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

    static Node postorderSuccessor(Node root, Node n)
    {
        // Root has no successor in postorder
        // traversal
        if (n == root)
            return null;

        // If given node is right child of its
        // parent or parent's right is empty, then
        // parent is postorder successor.
        Node parent = n.parent;
        if (parent.right == null || parent.right == n)
            return parent;

        // In all other cases, find the leftmost
        // child in right substree of parent.
        Node curr = parent.right;
        while (curr.left != null)
            curr = curr.left;

        return curr;
    }

    public static void main(String[] args)
    {
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


        Node res = postorderSuccessor(root, root.left.right.left);
        if (res != null)
            System.out.println("Postorder successor of "+
                    root.left.right.left.value + " is "+ res.value);
        else
            System.out.println("Postorder successor of " +
                    root.left.right.left.value + " is NULL");
    }
}
