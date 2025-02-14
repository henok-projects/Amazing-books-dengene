package com.author.author.controller;

import com.author.author.model.Author;
import com.author.author.model.Book;
import com.author.author.services.BookService;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class ControllerMokitoTests {

    @Mock
    BookService bookService;

    @Test
    @Order(1)
    public void test_getAllBooks() {

        List<Book> books= new ArrayList<Book>();

        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());
        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());
        books.add(new Book(1L,"hope", "12/02/2024", 1, 3, new Author());

        when(bookService.getAllBooks()).thenReturn(books); // Moking statement

        assertEquals(3,bookService.getAllBooks().size());
    }
}
