package com.learning.core.day4session1;

public class D04P0901 {
    private int maxSize;
    private int[] stackArray;
    private int top;
 
    public D04P0901(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
 
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full, cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }
 
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top--];
    }
 
    public static void main(String[] args) {
        D04P0901 stack = new D04P0901(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
 
        System.out.println("After Pushing 4 Elements:");
for (int i = 0; i <= stack.top; i++) {
            System.out.print(stack.stackArray[i] + " ");
        }
        System.out.println();
 
        System.out.println("After a Pop:");
        stack.pop();
for (int i = 0; i <= stack.top; i++) {
            System.out.print(stack.stackArray[i] + " ");
        }
    }
}
