package com.customer.customer.services.serviceImpl;

import com.customer.customer.dto.BookDetailDTO;
import com.customer.customer.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceImplementation {

    List<Customer> getAllCustomers();

    Optional<Customer> getCustomerById(Long id);

    Customer createCustomer(Customer customer);

    Optional<Customer> updateCustomer(Long id, Customer updatedCustomer);

    Optional<List<BookDetailDTO>> getAvailableCopies();

    void deleteCustomer(Long id);

}
