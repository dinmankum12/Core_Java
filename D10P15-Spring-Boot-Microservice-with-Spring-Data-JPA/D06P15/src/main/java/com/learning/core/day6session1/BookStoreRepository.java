package com.learning.core.day6session1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import java.util.List;
 
@Repository
public interface BookStoreRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);
    List<Book> findByPublisherContaining(String publisher);
    List<Book> findByYear(int year);
}