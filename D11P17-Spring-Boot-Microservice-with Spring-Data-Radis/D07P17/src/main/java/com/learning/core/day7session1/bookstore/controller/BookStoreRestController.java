package com.learning.core.day7session1.bookstore.controller;

import com.learning.core.day7session1.bookstore.entity.Book;
import com.learning.core.day7session1.bookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookStoreRestController {

    @Autowired
    private BookStoreService service;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id) {
        return service.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable String id) {
        service.deleteBookById(id);
    }

    // Additional methods for searching by title, author, year
}
