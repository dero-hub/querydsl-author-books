package com.app.assignment.controller;

import com.app.assignment.models.Author;
import com.app.assignment.models.Books;
import com.app.assignment.services.AuthBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthorAndBooks {
    @Autowired
    private AuthBookService authBookService;

    @PostMapping("/authors")
    public Author saveAuthorAndBook(@RequestBody Author author){
        return authBookService.saveAuthorAndBooks(author);
    }

    @GetMapping("/authors")
    public List<Author> findAllAuthorsAndBooks(){
        return authBookService.findAllAuthors();
    }

    @GetMapping("/author/{email}")
    public Optional<List<Author>> getAuthorByEmail(@PathVariable String email){
        return authBookService.findAuthorByEmail(email);
    }

    @GetMapping("/books")
    public List<Books> findAllBooks(){
        return authBookService.findAllBooks();
    }

    @GetMapping("/author/active_books")
    public List<Author> findAllActiveBooks(){
        return authBookService.findActiveBooks();
    }
}
