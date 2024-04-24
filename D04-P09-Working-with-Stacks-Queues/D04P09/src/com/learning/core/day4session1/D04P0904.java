package com.learning.core.day4session1;

public class D04P0904 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;
 
    public D04P0904(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
 
    public void insert(int value) {
        if (rear == maxSize - 1) // If rear is at end of array, wrap around
            rear = -1;
        queueArray[++rear] = value;
        nItems++;
    }
 
    public int remove() {
        int temp = queueArray[front++];
        if (front == maxSize) // If front is at end of array, wrap around
            front = 0;
        nItems--;
        return temp;
    }
 
    public boolean isEmpty() {
        return (nItems == 0);
    }
 
    public void display() {
        System.out.print("Elements in queue: ");
        int current = front;
        for (int i = 0; i < nItems; i++) {
            System.out.print(queueArray[current++] + " ");
            if (current == maxSize) // Wrap around
                current = 0;
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        D04P0904 myQueue = new D04P0904(5);
        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(40);
        myQueue.display();
        myQueue.remove(); // Removing the first element
        myQueue.display();
    }
}