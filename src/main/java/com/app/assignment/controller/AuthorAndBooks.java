package com.app.assignment.controller;

import com.app.assignment.models.Author;
import com.app.assignment.services.AuthBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorAndBooks {
    @Autowired
    private AuthBookService authBookService;

    @PostMapping("/author")
    public Author saveAuthorAndBook(@RequestBody Author author){
        return authBookService.saveAuthorAndBooks(author);
    }

    @GetMapping("/author")
    public List<Author> findAllAuthorsAndBooks(){
        return authBookService.findAllAuthors();
    }
}
