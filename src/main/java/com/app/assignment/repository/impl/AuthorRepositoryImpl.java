package com.app.assignment.repository.impl;

import com.app.assignment.models.Author;
import com.app.assignment.repository.AuthorRepository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class AuthorRepositoryImpl extends  BaseRepositoryImpl<Author, Long> implements AuthorRepository {
    public AuthorRepositoryImpl(EntityManager em) {
        super(Author.class, em);
    }

    @Override
    public Optional<Author> findAuthorByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<Author> findAllAuthors() {
        return null;
    }

    @Override
    public List<Author> getAllBooksOfAuthor() {
        return null;
    }
}
