package com.webline.dsasession.linkedlist.sll.Exercise05;

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


    int search(int x){
        Node temp = head;
        int search = 0;
        while (temp != null) {
            if (temp.data == x)
                search++;
            temp = temp.next;
        }
        return search;
    }
    


    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(3);
        linkedList.push(7);
        linkedList.push(4);
        linkedList.push(3);
        linkedList.push(7);
        linkedList.push(2);
    
    
        System.out.println("\nCreated Linked list is:");
        linkedList.printList();

        System.out.println("Count of no 7 is: " + linkedList.search(7));
    }
}
