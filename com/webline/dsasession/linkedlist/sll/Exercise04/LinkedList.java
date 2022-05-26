package com.webline.dsasession.linkedlist.sll.Exercise04;
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


    public void deleteLast(int x)
{
    Node temp = head;
    Node ptr = null;
     
    while (temp != null){
        if (temp.data == x)
            ptr = temp;
        temp = temp.next;
    }
   
    if (ptr != null && ptr.next == null){
        temp = head;     
        while (temp.next != ptr){
            temp = temp.next;
        }
        temp.next = null;
    }
     
    if (ptr != null && ptr.next != null){
        ptr.data = ptr.next.data;
        temp = ptr.next;
        ptr.next = ptr.next.next;
    }
    return;
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


    linkedList.deleteLast(7);
    System.out.print("List after deletion of 4: \n");
    linkedList.printList();
}
    
}
