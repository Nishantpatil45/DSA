package com.webline.dsasession.linkedlist.sll.Exercise02;

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


    public void deleteNode(int key){
        
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;
        prev.next = temp.next;
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

        linkedList.deleteNode(7);

        System.out.println("\nLinked List after Deletion of 1:");
        linkedList.printList();
    }
   
}
