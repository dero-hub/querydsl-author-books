package com.app.assignment.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.List;
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


    @OneToMany(targetEntity = Books.class,
    cascade = CascadeType.ALL,
    fetch = FetchType.LAZY)

    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private List<Books> books;

  Author(){}

    public Author(String name){
        this.name = name;
    }

}
