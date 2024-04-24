package com.learning.core.day8session1.ebookstore.service;

import com.learning.core.day8session1.ebookstore.entity.Book;
import com.learning.core.day8session1.ebookstore.repository.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.Optional;
 
@Service
public class BookStoreService {
 
    @Autowired
    private BookStoreRepository bookStoreRepository;
 
    public Book addBook(Book book) {
        return bookStoreRepository.save(book);
    }
 
    public Book updateBook(String id, Book book) {
        book.setId(id); // Ensure the provided ID matches the book ID
        return bookStoreRepository.save(book);
    }
 
    public List<Book> getAllBooks() {
        return bookStoreRepository.findAll();
    }
 
    public Book getBookById(String id) {
        Optional<Book> optionalBook = bookStoreRepository.findById(id);
        return optionalBook.orElse(null);
    }
 
    public void deleteBookById(String id) {
        bookStoreRepository.deleteById(id);
    }
 
    public List<Book> getBooksByTitle(String title) {
        return bookStoreRepository.findByTitle(title);
    }
 
    public List<Book> getBooksByPublisher(String publisher) {
        return bookStoreRepository.findByPublisher(publisher);
    }
 
    public List<Book> getBooksByYear(int year) {
        return bookStoreRepository.findByYear(year);
    }
}