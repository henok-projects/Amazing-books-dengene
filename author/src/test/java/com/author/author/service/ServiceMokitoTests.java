package com.author.author.service;

import com.author.author.model.Author;
import com.author.author.model.Book;
import com.author.author.repository.BookRepository;
import com.author.author.services.BookService;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ServiceMokitoTests {

    @Mock
    BookRepository bookRepository;

    @InjectMocks
    BookService bookService;

    public List<Book> Books;

    @Test
    @Order(1)
    public void test_getAllBooks() {

        List<Book> books= new ArrayList<Book>();

        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());
        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());
        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());

        when(bookRepository.findAll()).thenReturn(books); // Moking statement

        assertEquals(3,bookService.getAllBooks().size());
    }

    @Test
    @Order(2)
    public void test_getBookById() {

        List<Book> books= new ArrayList<Book>();

        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());
        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());
        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());

        Long bookId=1L;

        when(bookRepository.findAll()).thenReturn(books); // Moking statement
        assertEquals(bookId, bookService.getBookById(bookId).get().getIsbn());


    }
}
