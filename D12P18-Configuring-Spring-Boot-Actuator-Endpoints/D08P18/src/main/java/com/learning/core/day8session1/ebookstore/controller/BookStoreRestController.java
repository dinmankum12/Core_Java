package com.learning.core.day8session1.ebookstore.controller;

import com.learning.core.day8session1.ebookstore.entity.Book;
import com.learning.core.day8session1.ebookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
 
@Controller
@RequestMapping("/books")
public class BookStoreRestController {
 
    @Autowired
    private BookStoreService bookStoreService;
 
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookStoreService.addBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }
 
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book book) {
        Book updatedBook = bookStoreService.updateBook(id, book);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }
 
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookStoreService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable String id) {
        Book book = bookStoreService.getBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable String id) {
        bookStoreService.deleteBookById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
 
    @GetMapping("/title/{title}")
    public ResponseEntity<List<Book>> getBooksByTitle(@PathVariable String title) {
        List<Book> books = bookStoreService.getBooksByTitle(title);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
 
    @GetMapping("/publisher/{publisher}")
    public ResponseEntity<List<Book>> getBooksByPublisher(@PathVariable String publisher) {
        List<Book> books = bookStoreService.getBooksByPublisher(publisher);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
 
    @GetMapping("/year/{year}")
    public ResponseEntity<List<Book>> getBooksByYear(@PathVariable int year) {
        List<Book> books = bookStoreService.getBooksByYear(year);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}