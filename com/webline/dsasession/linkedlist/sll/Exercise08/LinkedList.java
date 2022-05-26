package com.webline.dsasession.linkedlist.sll.Exercise08;

public class LinkedList {
    
    Node head;    
 
    public void printList(){

        Node n = head;
        while (n!=null) {
            System.out.println(n.data);
            n = n.next;
        }

    }
    

    public void push(int newData){
    
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void addToTheLast(Node node){
        if (head == null){
        head = node;
        }
        else{
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
        }
    }

    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        linkedList.push(4);
        linkedList.push(7);
        linkedList.push(3);
        linkedList.push(1);
        LinkedList linkedList2 = new LinkedList();
        linkedList2.push(1);
        linkedList2.push(7);
        linkedList2.push(5);
        linkedList2.push(4);
        linkedList2.push(2);
    
    
        System.out.println("\nCreated Linked list is:");
        linkedList.printList();
        linkedList2.printList();
        
        linkedList.addToTheLast(linkedList2.head);
    }
}

