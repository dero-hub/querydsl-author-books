package com.app.assignment.repository.impl;

import com.app.assignment.models.Author;
import com.app.assignment.repository.AuthorRepository;
import com.querydsl.core.types.Projections;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public class AuthorRepositoryImpl extends  BaseRepositoryImpl<Author, Long> implements AuthorRepository {
    public AuthorRepositoryImpl(EntityManager em) {
        super(Author.class, em);
    }

    @Override
    public Optional<List<Author>> findAuthorByEmail(String email) {
        return Optional.ofNullable(
                jpaQuery
                        .select(author)
                        .from(author)
                        .where(author.email.equalsIgnoreCase(email))
                        .fetch());
    }

    @Override
    public List<Author> findAllAuthors() {
        return jpaQuery.select(author)
                .distinct()
                .from(author)
                .innerJoin(author.books, books)
                .fetchJoin().fetchAll().fetch();
    }

    @Override
    public List<Author> getAllBooksOfAuthor() {
        return jpaQuery.from(author)
                .innerJoin(author.books, books)
                .groupBy(author.name)
                .select(Projections.constructor(Author.class, author.name, books.count())).fetch();
    }
}
