package com.webline.dsasession.linkedlist.sll.Exercise01;

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
    

    public void append(int newData){
        Node newNode = new Node(newData);
        if (head==null) {
            head = new Node(newData);
            return;
        }

        newNode.next = null;

        Node last = head;
        while (last.next!=null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }


    public boolean search(Node head, int x)
    {
        Node current = head;    
        while (current != null){
            if (current.data == x)
                return true;    
            current = current.next;
        }
        return false;    
    }
    
    public static void main(String[] args) {
        

        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.push(4);


        linkedList.printList();
        if (linkedList.search(linkedList.head, 5))
            System.out.println("True");
        else
            System.out.println("False");
        
    }
}
