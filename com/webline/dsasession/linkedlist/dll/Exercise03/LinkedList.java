package com.webline.dsasession.linkedlist.dll.Exercise03;

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

    public int largestNode() {  
        //Node current will point to head  
        Node current = head;  
        int max;  
  
        //Checks if list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return 0;  
        }  
        else {  
            //Initially, max will store the value of head's data  
            max = head.data;  
            //If value of max is lesser than current's data  
            //Then, replace value of max with current node's data  
            while(current != null) {  
                if(current.data > max)  
                    max = current.data;  
                current = current.next;  
            }  
        }  
        return max;  
    } 


    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.println("LinkedList is: ");
        linkedList.printlist();

        System.out.println("\nLargest Node in LinkedList is: " + linkedList.largestNode());
    }
}
