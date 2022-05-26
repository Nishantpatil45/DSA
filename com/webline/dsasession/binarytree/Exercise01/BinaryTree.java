package com.webline.dsasession.binarytree.Exercise01;
import java.util.*;
public class BinaryTree {
    
    Node head;
    BinaryTreeNode root;
  
    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
  

    BinaryTreeNode convertList2Binary(BinaryTreeNode node){
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        if (head == null){
            node = null;
            return null;
        }
        node = new BinaryTreeNode(head.data);
        q.add(node);
        head = head.next;
        while (head != null){
            BinaryTreeNode parent = q.peek();
            BinaryTreeNode leftChild = null, rightChild = null;
            leftChild = new BinaryTreeNode(head.data);
            q.add(leftChild);
            head = head.next;
            if (head != null){
                rightChild = new BinaryTreeNode(head.data);
                q.add(rightChild);
                head = head.next;
            }
            parent.left = leftChild;
            parent.right = rightChild;
        }  
        return node;
    }
  

    void inorderTraversal(BinaryTreeNode node){
        if (node != null){
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }


    public static void main(String[] args) {
        
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.push(1);
        binaryTree.push(2);
        binaryTree.push(3);
        binaryTree.push(4);
        binaryTree.push(5);
        binaryTree.push(6);

        BinaryTreeNode node = binaryTree.convertList2Binary(binaryTree.root);
        System.out.println("Inorder Traversal of the constructed Binary Tree is: ");
        binaryTree.inorderTraversal(node);
    }
}
