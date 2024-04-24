package com.learning.core.day7session1.bookstore.service;

import com.learning.core.day7session1.bookstore.entity.Book;
import com.learning.core.day7session1.bookstore.repository.BookStoreRepository;
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

    public Book updateBook(Book book) {
        return repository.save(book);
    }

    public List<Book> getAllBooks() {
        return (List<Book>) repository.findAll();
    }

    public Book getBookById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteBookById(String id) {
        repository.deleteById(id);
    }
}
