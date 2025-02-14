package com.author.author.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long authorId;

    private String firstName;

    private String middleName;

    private String biography;

}
