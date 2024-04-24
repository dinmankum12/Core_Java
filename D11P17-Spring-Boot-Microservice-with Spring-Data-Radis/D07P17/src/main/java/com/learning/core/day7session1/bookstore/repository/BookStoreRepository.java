package com.learning.core.day7session1.bookstore.repository;

import com.learning.core.day7session1.bookstore.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookStoreRepository extends CrudRepository<Book, String> {
    List<Book> findByTitle(String title);
    List<Book> findByAuthorLike(String author);
    List<Book> findByYear(int year);
}
