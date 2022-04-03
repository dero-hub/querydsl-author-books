package com.app.assignment.repository.impl;

import com.app.assignment.models.QAuthor;
import com.app.assignment.models.QBooks;
import com.app.assignment.repository.BaseRepository;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;

public abstract class BaseRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {
    EntityManager em;
    JPAQuery jpaQuery;

    protected QAuthor qAuthor = QAuthor.author;
    protected QBooks qBooks = QBooks.books;


    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.em = em;
        this.jpaQuery = new JPAQuery<>(em);
    }

    @Override
    public T findByMandatoryId(ID id) throws IllegalArgumentException {
        return findById(id)
                .orElseThrow(() -> new IllegalArgumentException(("Entity not Found")));
    }
}
