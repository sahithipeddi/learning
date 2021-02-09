package com.learning.DataStructures.BinaryTrees;

public class AVLTree {

    BinaryNodeAVL root;

    public AVLTree() {

        this.root = null;

    }

    public BinaryNodeAVL insert(int value){
        BinaryNodeAVL newNode = insert(root, value);

        return null;
    }

    private BinaryNodeAVL insert(BinaryNodeAVL root, int value){

        if(root == null){
            BinaryNodeAVL binaryNodeAVL = new BinaryNodeAVL();
            binaryNodeAVL.setValue(value);
            binaryNodeAVL.setHeight(0);
            return binaryNodeAVL;
        }
        else if( value < root.value ){
            root.setLeft(insert(root.left, value));
        }else {
            root.setRight(insert(root.right, value));
        }

//        int balance = checkBalance(root.getLeft(),root.getRight());
        return null;
    }

    private int checkBalance(BinaryNodeAVL rootLeft, BinaryNodeAVL rootRight) {

        if(rootLeft == null && rootRight == null){
            return 0;
        }/*else if(rootLeft)
*/

        return -1;
    }
}
