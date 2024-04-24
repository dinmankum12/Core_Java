package com.learning.core.day1session1;

public class Book {
    private String title;
    private double price;
 
    // Getter and setter methods
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
}
 
public class D01P01 {
    // Method to create a Book object
    public static Book createBooks(String title, double price) {
        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        return book;
    }
 
    // Method to display book details
    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice());
    }
 
    public static void main(String[] args) {
        // Example usage
        Book book = createBooks("Java Programming", 350.00);
        showBooks(book);
    }
}