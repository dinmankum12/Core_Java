package com.learning.core.day8session1.ebookstore.repository;

import com.example.ebookstore.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
 
import java.util.List;
 
public interface BookStoreRepository extends MongoRepository<Book, String> {
 
    List<Book> findByTitle(String title);
    List<Book> findByPublisher(String publisher);
    List<Book> findByYear(int year);
}
