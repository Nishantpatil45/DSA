package com.webline.dsasession.stack.Exercise02;

public class Stack {
    
    public static final int max = 7;
    int top;
    int stackArray[] = new int[max];


    public Stack(){
        top = -1;
    }


    boolean isEmpty(){
        return top < 0;
    }


    boolean push(int data){
        if (top >= (max-1)) {
            System.out.println("Stack Overflow");
            return false;
        }else{
            stackArray[++top] = data;
        }
        return false;
    }


    int pop(){
        if (isEmpty()) {
            return 0;
        }else{
            return stackArray[top--];
        }
    }


    int peek(){
        if (isEmpty()) {
            return 0;
        }else{
            return stackArray[top];
        }
    }


    public void printStack(){
        for(int i = top;i>-1;i--){
            System.out.println(stackArray[i]);
        }
    }


    public void insertBottom(int data){
        if (isEmpty()) {
            push(data);
        }else{
            int x = peek();
            pop();
            insertBottom(data);
            push(x);
        }
    }


    public void reverse(){
        if(top > 0){
            int x = peek();
            pop();
            reverse();
            insertBottom(x);
        }
    }


    public static void main(String[] args) {
        

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original Stack");
        stack.printStack();

        stack.reverse();
        System.out.println("Reversed Stack");
        stack.printStack();
    }
}
