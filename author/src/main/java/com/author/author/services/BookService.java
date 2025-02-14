package com.author.author.services;

import com.author.author.model.Book;
import com.author.author.repository.BookRepository;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Optional<Book> updateBook(Long id, Book updatedBook) {
        return bookRepository.findById(id).map(book -> {
            book.setIsbn(updatedBook.getIsbn());
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setTotalCopies(updatedBook.getTotalCopies());
            book.setIssuedCopies(updatedBook.getIssuedCopies());
            book.setPublisherDate(updatedBook.getPublisherDate());
            return bookRepository.save(book);
        });
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }


}
