package com.app.assignment.repository.impl;

import com.app.assignment.models.Books;
import com.app.assignment.repository.BooksRepository;

import javax.persistence.EntityManager;

public class BookRepositoryImpl extends  BaseRepositoryImpl<Books, Long> implements BooksRepository {
    public BookRepositoryImpl( EntityManager em) {
        super(Books.class, em);
    }
}
