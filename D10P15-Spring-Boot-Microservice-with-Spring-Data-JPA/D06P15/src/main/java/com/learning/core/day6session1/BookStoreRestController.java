package com.learning.core.day6session1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 
@RestController
@RequestMapping("/books")
public class BookStoreRestController {
    @Autowired
    private BookStoreService service;
 
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = service.addBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }
 
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        // Implement update logic here
    }
 
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = service.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = service.getBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
 
    // Additional methods for searching by title, publisher, and year
}
