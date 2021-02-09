package com.learning.Algorithms.binarytrees;

public class FlattentoLL {

    static class Node{
        Node left, right, parent;
        int value;
    }

    static Node newNode(int value)
    {
        FlattentoLL.Node temp = new FlattentoLL.Node();
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

        flattentoLL(root);
    }

    private static void flattentoLL(Node root) {

        if(root == null) return;
        if(root.right == null && root.left == null) return;
        flattentoLL(root.right);
        flattentoLL(root.left);
        Node temp = root.right;
        root.right = root.left;
        root.left = null;
        while(root.right != null)
            {
                root = root.right;
                System.out.println(root.value);
            }
        root.right = temp;
    }

}
