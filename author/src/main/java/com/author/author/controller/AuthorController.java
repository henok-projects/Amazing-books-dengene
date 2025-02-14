package com.author.author.controller;

import com.author.author.model.Author;
import com.author.author.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorServicey;

    @GetMapping()
    public List<Author> getAllAuthors() {
        return authorServicey.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable Long id) {
        return authorServicey.getAuthorById(id);
    }

    @PostMapping()
    public Author createAuthor(@RequestBody Author author) {
        return authorServicey.createAuthor(author);
    }

    @PutMapping("/{id}")
    public Optional<Author> updateAuthor(@PathVariable Long id, Author updatedAuthor) {
        return authorServicey.updateAuthor(id, updatedAuthor);
        };

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorServicey.deleteAuthor(id);
    }
}
