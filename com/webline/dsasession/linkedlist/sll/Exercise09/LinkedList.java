package com.webline.dsasession.linkedlist.sll.Exercise09;

public class LinkedList {
    
    Node head;    
 
    public void printList(){

        Node n = head;
        while (n!=null) {
            System.out.println(n.data);
            n = n.next;
        }

    }
    

    public void push(int newData,int x){
        newData += x;
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        linkedList.push(1,1);
        linkedList.push(3,1);
        linkedList.push(7,1);
        linkedList.push(4,1);
        linkedList.push(3,1);
        linkedList.push(7,1);
        linkedList.push(2,1);
    
    
        System.out.println("\nNew Linked list is:");
        linkedList.printList();


        
    }
}
