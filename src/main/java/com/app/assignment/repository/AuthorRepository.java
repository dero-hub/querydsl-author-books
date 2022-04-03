package com.app.assignment.repository;

import com.app.assignment.models.Author;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends BaseRepository<Author, Long>{

    public Optional<List<Author>> findAuthorByEmail(String email);

    public List<Author> findAllAuthors();

    public List<Author> getAllBooksOfAuthor();

    public List<Author> findActiveBooks();
}
