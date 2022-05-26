package com.webline.dsasession.linkedlist.sll.Exercise03;

public class LinkedList {

    Node head;

    public void printList() {

        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    public void push(int newData) {

        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    void deleteKey(int key) {
        Node temp = head, prev = null;
        while (temp != null && temp.data == key) {
            head = temp.next;
            temp = head;
        }

        while (temp != null) {
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null)
                return;
            prev.next = temp.next;
            temp = prev.next;
        }
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

        linkedList.deleteKey(7);
        System.out.println("\nLinked List after Deletion is:");
        linkedList.printList();
    }

}
