package com.learning.core.day4session1;

public class D04P0906 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
 
    public D04P0906(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
 
    public boolean isEmpty() {
        return size == 0;
    }
 
    public boolean isFull() {
        return size == capacity;
    }
 
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }
 
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
 
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in circular queue: ");
        for (int i = front; i != rear; i = (i + 1) % capacity) {
            System.out.print(queue[i] + " ");
        }
        System.out.println(queue[rear]);
    }
 
    public static void main(String[] args) {
        D04P0906 cq = new D04P0906(5);
        cq.enqueue(14);
        cq.enqueue(13);
        cq.enqueue(22);
        cq.enqueue(8);
        cq.display();
        System.out.println("After removing first element: " + cq.dequeue() + " " + cq.dequeue());
        cq.display();
    }
}