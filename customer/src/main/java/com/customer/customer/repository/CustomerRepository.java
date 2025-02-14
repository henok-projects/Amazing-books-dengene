package com.customer.customer.repository;

import com.customer.customer.dto.BookDetailDTO;
import com.customer.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT" +
        "    Customer.isbn AS bookId,\n" +
        "    Book.totalCopies - SUM(book.issuedCopies) AS available_copies\n" +
        "    FROM Customer\n" +
        "    INNER JOIN Book ON Customer.isbn = Book.isbn\n" +
        "    GROUP BY Customer.isbn")
    Optional<List<BookDetailDTO>> getAvailableCopies();




}
