package com.webline.dsasession.linkedlist.dll.Exercise02;

public class LinkedList {

    Node head;

    public void printlist() {
        Node n = head;
        Node last = null;
        while (n != null) {
            System.out.print(n.data + " ");
            last = n;
            n = n.next;
        }
    }

    public void push(int newData) {

        Node newNode = new Node(newData);
        newNode.next = head;
        newNode.prev = null;

        if (head != null)
            head.prev = newNode;

        head = newNode;
    }

    public void append(int newData) {

        Node newNode = new Node(newData);

        Node last = head;
        newNode.next = null;

        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null)
            last = last.next;

        last.next = newNode;
        newNode.prev = last;
    }

    public void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.println("LinkedList is: ");
        linkedList.printlist();

        linkedList.reverse();
        System.out.println("\nReverse LinkedList is: ");
        linkedList.printlist();
    }
}
