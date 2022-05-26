package com.webline.dsasession.binarytree;

public class BinaryTree {

    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        binaryTree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        binaryTree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        binaryTree.printPostorder();

    }
}
