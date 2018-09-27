package com.datastructures;

/*
The left subtree of a node contains only nodes with keys lesser than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
The left and right subtree each must also be a binary search tree.
There must be no duplicate nodes.
*/
public class BinarySearchTree {
    class Node {
        int key;
        Node left;
        Node right;

        Node(int key){
            this.key = key;
            left = right = null;
        }
    }

    private Node root;
    private BinarySearchTree() { root= null; }

    private void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);

        return root;
    }

    private void print(){
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(60);
        bst.insert(70);
        bst.insert(80);
        bst.insert(90);

        bst.print();
    }
}
