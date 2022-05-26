package com.webline.dsasession.stack;

public class Queue {

    public static final int max = 5;
    int front, rear, size;
    int queueArray[] = new int[max];

    public Queue() {
        front = size = 0;
        rear = max - 1;
    }

    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            return;
        } else {
            rear = (rear + 1) % max;
            queueArray[rear] = data;
            size++;
            System.out.println(data + " enqueued to queue");
        }
    }

    int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            int data = queueArray[front];
            front = (front + 1) % max;
            size--;
            System.out.println(data + " dequeued from queue");
            return data;
        }
    }

    public void printQueue() {
        System.out.println("Print Queue: ");
        for (int i = front; i < queueArray.length; i++) {
            System.out.println(queueArray[i]);
        }
    }

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.printQueue();

    }
}
