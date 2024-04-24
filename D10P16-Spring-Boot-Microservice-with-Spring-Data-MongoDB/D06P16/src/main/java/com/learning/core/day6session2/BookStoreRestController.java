package com.learning.core.day6session2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
 
@RestController
@RequestMapping("/books")
public class BookStoreRestController {
    @Autowired
    private BookStoreService service;
 
    @GetMapping
    public List<Book> getAllBooks() {
        return service.findAllBooks();
    }
 
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable String id) {
        return service.findBookById(id);
    }
 
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }
 
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable String id, @RequestBody Book updatedBook) {
        return service.updateBook(id, updatedBook);
    }
 
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        service.deleteBook(id);
    }
}
