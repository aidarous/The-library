package com.example.practice2.models;

import javax.persistence.*;

@Entity
@Table(name = "Languages")
public class LanguageBooks {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String bookGenre;

    @Column
    private String title;

    @Column
    private String price;

}
