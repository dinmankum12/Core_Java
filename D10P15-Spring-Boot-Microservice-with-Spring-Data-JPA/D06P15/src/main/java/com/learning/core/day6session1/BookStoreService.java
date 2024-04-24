package com.learning.core.day6session1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class BookStoreService {
    @Autowired
    private BookStoreRepository repository;
 
    public Book addBook(Book book) {
        return repository.save(book);
    }
 
    public List<Book> getAllBooks() {
        return repository.findAll();
    }
 
    public Book getBookById(Long id) {
        return repository.findById(id).orElse(null);
    }
 
    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
 
    // Additional methods for querying by title, publisher, and year
}
