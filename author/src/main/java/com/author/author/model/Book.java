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

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumns({ @JoinColumn(name = "author", referencedColumnName = "author_id", insertable = false, updatable = false) })
    private Author author;

    public Book(long l, String hope, String s, int i, int i1, Author author) {
    }
}
