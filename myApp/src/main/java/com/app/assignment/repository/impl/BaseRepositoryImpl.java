package com.app.assignment.repository.impl;

import com.app.assignment.models.QAuthor;
import com.app.assignment.models.QBooks;
import com.app.assignment.repository.BaseRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public abstract class BaseRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {
   protected final EntityManager em;
   protected final JPAQueryFactory jpaQuery;

     QAuthor author = QAuthor.author;
     QBooks books = QBooks.books;


    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.em = em;
        this.jpaQuery = new JPAQueryFactory(em);

    }


}
