package com.webline.dsasession.binarytree.Exercise02;

public class BinaryTree {
    
    static Node head;
     
    Node insert(Node node, int data) {
        if (node == null) {
            return (new Node(data));
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
            return node;
        }
    }
 

    int minvalue(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }


    public static void main(String[] args) {
        
        BinaryTree binaryTree = new BinaryTree();
        Node root = null;
        root = binaryTree.insert(root, 1);
        binaryTree.insert(root, 2);
        binaryTree.insert(root, 3);
        binaryTree.insert(root, 4);
        binaryTree.insert(root, 5);


        System.out.println("Minimum value of BST is " + binaryTree.minvalue(root));
    }
}
