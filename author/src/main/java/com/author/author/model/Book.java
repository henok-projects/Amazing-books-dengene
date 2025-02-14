package com.author.author.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "isbn", nullable = false)
    private Long isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "publisher_date")
    private Date publisherDate;

    @Column(name = "total_copies")
    private Integer totalCopies;

    @Column(name = "issued_copies")
    private Integer issuedCopies;

    @OneToMany()
    private Author author;
}
