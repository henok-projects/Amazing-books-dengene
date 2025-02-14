package com.customer.customer.openfeignclient;

import com.customer.customer.dto.BookDetailDTO;
import com.customer.customer.dto.BooksDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "author",
        path = "/author",
        url = "localhost:8082/book/{id}:",
        configuration = FeignClientInterceptor.class)
@Component
public interface CustomerClient {

    @PostMapping("/book-detail/id")
    public ResponseEntity<BookDetailDTO> fetchBookDetails(@PathVariable("isbn") Long isbn, @RequestBody BooksDTO booksDTO);



}
