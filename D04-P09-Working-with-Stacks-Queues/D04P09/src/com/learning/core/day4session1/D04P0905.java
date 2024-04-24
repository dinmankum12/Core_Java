package com.learning.core.day4session1;

class Node {
    int data;
    Node next;
 
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 
class Queue {
    private Node front, rear;
 
    public Queue() {
        this.front = this.rear = null;
    }
 
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
 
    public void dequeue() {
        if (front == null)
            return;
        Node temp = front;
        front = front.next;
        if (front == null)
            rear = null;
    }
 
    public void display() {
        System.out.print("Elements in queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
 
public class D04P0905 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(8999);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        System.out.print("After removing two elements: ");
        queue.display();
    }
}
