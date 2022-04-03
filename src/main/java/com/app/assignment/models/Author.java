package com.app.assignment.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authors")
@Setter
@Getter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private String email;


    @OneToMany(mappedBy = "author")
    private Set<Books> books = new HashSet<>();

    public void addBook(Books book){
        books.add(book);
        book.setAuthor(this);
    }
    public  Author(){}

    public Author(String name){
        this.name = name;
    }

}
