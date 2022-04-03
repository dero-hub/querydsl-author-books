package com.app.assignment.repository;

import com.app.assignment.models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends BaseRepository<Books, Long>{
}
