package com.webline.dsasession.linkedlist.dll.Exercise01;

public class LinkedList {
    
    Node head;

    public void printlist(){
        Node n = head;
        Node last = null;
        while (n != null) {
            System.out.print(n.data + " ");
            last = n;
            n = n.next;
        }
    }


    public void push(int newData){
        
        Node newNode = new Node(newData);
        newNode.next = head;
        newNode.prev = null;
 
        if (head != null)
            head.prev = newNode;
 
        head = newNode;
    }


    void append(int newData){

        Node newNode = new Node(newData);
 
        Node last = head; 
        newNode.next = null;
 
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return ;
        }
        while (last.next != null)
            last = last.next;

        last.next = newNode;
        newNode.prev = last;
    }


    public void InsertAfter(Node prevNode, int newData){
 
        if (prevNode == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if (newNode.next != null)
            newNode.next.prev = newNode;
    }


    public void InsertBefore(Node nextNode, int newData){

        if(nextNode == null){
            System.out.println("The given next node can not be NULL");
            return;
        }
         
        Node newNode = new Node(newData);
        newNode.prev = nextNode.prev;
        nextNode.prev = newNode;
        newNode.next = nextNode;
        if(newNode.prev != null)
            newNode.prev.next = newNode;
        else
            head = newNode;
    }

    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        linkedList.push(2);
        linkedList.push(1);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.InsertAfter(linkedList.head.next, 5);
        linkedList.InsertBefore(linkedList.head.next, 6);

        System.out.println("LinkedList is: ");
        linkedList.printlist();
    }
}
