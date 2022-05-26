package com.webline.dsasession.linkedlist.dll.Exercise05;

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


    public void append(int newData){

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



    public void sortList() {  
        Node current = null, index = null;  
        int temp;  
        if(head == null) {  
            return;  
        }  
        else {  
            for(current = head; current.next != null; current = current.next) {  
                for(index = current.next; index != null; index = index.next) {  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                }  
            }  
        }
    }
    


    public static void main(String[] args) {
        

        LinkedList linkedList = new LinkedList();
        linkedList.append(9);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.println("LinkedList is: ");
        linkedList.printlist();

        linkedList.sortList();
        System.out.println("\nSorted LinkedList is: ");
        linkedList.printlist();
    }
}
