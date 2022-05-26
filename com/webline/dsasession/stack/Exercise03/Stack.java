package com.webline.dsasession.stack.Exercise03;

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
        System.out.println("Print Stack: ");
        for(int i = top;i>-1;i--){
            System.out.println(stackArray[i]);
        }
    }


    public static Stack sortStack(Stack stack, Stack tmpStack){
        while (stack.isEmpty()) {
            int tmp = stack.pop();
            while (tmpStack.isEmpty() && tmpStack.peek()>tmp) {
                stack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }


    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(8);
        stack.push(4);
        stack.push(5);
        stack.printStack();

        Stack tmpStack = new Stack();
        tmpStack.sortStack(stack, tmpStack);
        System.out.println("Sorted numbers are: ");
        

        while (!tmpStack.isEmpty())
        {
            System.out.print(tmpStack.pop()+" ");
        }
    }
}
