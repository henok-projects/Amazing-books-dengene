package com.author.author.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long authorId;

    private String firstName;

    private String middleName;

    private String biography;

    public Author(String firstName, String middleName, String biography) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.biography = biography;
    }
}
