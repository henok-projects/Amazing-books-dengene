package com.author.author.services;

import com.author.author.model.Author;
import com.author.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> updateAuthor(Long id, Author updatedAuthor) {
        return authorRepository.findById(id).map(author -> {
            author.setAuthorId(updatedAuthor.getAuthorId());
            author.setFirstName(updatedAuthor.getFirstName());
            author.setMiddleName(updatedAuthor.getMiddleName());
            author.setBiography(updatedAuthor.getBiography());
            return authorRepository.save(author);
        });
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
