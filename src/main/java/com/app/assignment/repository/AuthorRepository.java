package com.app.assignment.repository;

import com.app.assignment.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends BaseRepository<Author, Long>{

    public Optional<Author> findAuthorByEmail(String email);

    public List<Author> findAllAuthors();

    public List<Author> getAllBooksOfAuthor();
}
