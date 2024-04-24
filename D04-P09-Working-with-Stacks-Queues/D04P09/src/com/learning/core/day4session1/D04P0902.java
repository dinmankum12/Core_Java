package com.learning.core.day4session1;

class Node {
    double data;
    Node next;
 
    Node(double data) {
        this.data = data;
        this.next = null;
    }
}
 
public class D04P0902 {
    private Node top;
 
    D04P0902() {
this.top = null;
    }
 
    public void push(double data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
 
    public double pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        } else {
            double popped = top.data;
            top = top.next;
            return popped;
        }
    }
 
    public void printStack() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
 
    public static void main(String[] args) {
        D04P0902 stack = new D04P0902();
        double[] input = {10.0, 20.0, 30.0, 40.0};
 
        for (double value : input) {
            stack.push(value);
        }
 
        stack.printStack();
 
        stack.pop();
        stack.pop();
 
        System.out.print("After popping twice: ");
        stack.printStack();
    }
}
