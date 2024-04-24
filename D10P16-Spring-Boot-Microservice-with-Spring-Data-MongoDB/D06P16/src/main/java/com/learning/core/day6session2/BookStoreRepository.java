package com.learning.core.day6session2;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookStoreRepository extends MongoRepository<Book, String> {
    List<Book> findByTitle(String title);
    List<Book> findByPublisherLike(String publisher);
    List<Book> findByYear(int year);
}
