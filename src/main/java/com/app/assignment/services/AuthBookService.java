package com.app.assignment.services;

import com.app.assignment.models.Author;
import com.app.assignment.models.Books;
import com.app.assignment.repository.AuthorRepository;
import com.app.assignment.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthBookService {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BooksRepository booksRepository;

    public Author saveAuthorAndBooks(Author author){
        author.getBooks().forEach((b -> this.booksRepository.save(b)));
        return authorRepository.save(author);
    }

    public List<Author> findAllAuthors(){
        return this.authorRepository.findAllAuthors();
    }

    public List<Author> findAll(){
        return  this.authorRepository.findAll();
    }

    public List<Books> findAllBooks(){
        return this.booksRepository.findAll();
    }

    public Optional<List<Author>> findAuthorByEmail(String email){
        return  this.authorRepository.findAuthorByEmail(email);
    }

    public List<Author> findAuthorBooks(){
        return  authorRepository.getAllBooksOfAuthor();
    }
}
