package com.app.assignment.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Setter
@Getter
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank
    private String title;

//    @NotBlank
    private Boolean published;



    public Books(){
    }

    public Books(String title, Boolean published){
        this.title = title;
        this.published = published;
    }
}
