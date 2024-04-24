package com.learning.core.day6session2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
 
@Service
public class BookStoreService {
    @Autowired
    private BookStoreRepository repository;
 
    public List<Book> findAllBooks() {
        return repository.findAll();
    }
 
    public Optional<Book> findBookById(String id) {
        return repository.findById(id);
    }
 
    public List<Book> findBooksByTitle(String title) {
        return repository.findByTitle(title);
    }
 
    public List<Book> findBooksByPublisher(String publisher) {
        return repository.findByPublisherLike(publisher);
    }
 
    public List<Book> findBooksByYear(int year) {
        return repository.findByYear(year);
    }
 
    public Book addBook(Book book) {
        return repository.save(book);
    }
 
    public Book updateBook(String id, Book updatedBook) {
        Optional<Book> optionalBook = repository.findById(id);
        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setPublisher(updatedBook.getPublisher());
            existingBook.setYear(updatedBook.getYear());
            return repository.save(existingBook);
        } else {
            // Handle if book not found
            return null;
        }
    }
 
    public void deleteBook(String id) {
        repository.deleteById(id);
    }
}
