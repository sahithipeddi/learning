package com.learning.Algorithms.binarytrees;


import java.util.ArrayList;
import java.util.List;

import static com.learning.Algorithms.binarytrees.LowestCommonAncestor.newNode;

public class largestValueInEachLevel {

        private static List<Integer> largestValues(LowestCommonAncestor.Node root) {
            List<Integer> res = new ArrayList<Integer>();
            helper(root, res, 0);
            return res;
        }
        private static void helper(LowestCommonAncestor.Node root, List<Integer> res, int d){
            if(root == null){
                return;
            }
            //expand list size
            if(d == res.size()){
                res.add(root.value);
            }
            else{
                //or set value
                res.set(d, Math.max(res.get(d), root.value));
            }
            helper(root.left, res, d+1);
            helper(root.right, res, d+1);
        }

    public static void main(String[] args)
    {
        LowestCommonAncestor.Node root = newNode(1);
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

        List<Integer> integers = largestValues(root);

        integers.stream().forEach(System.out::println);
    }
}
