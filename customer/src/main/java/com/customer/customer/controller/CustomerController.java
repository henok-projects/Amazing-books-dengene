package com.customer.customer.controller;

import com.customer.customer.dto.BookDetailDTO;
import com.customer.customer.model.Customer;
import com.customer.customer.services.serviceImpl.CustomerServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class CustomerController {

    @Autowired
    CustomerServiceImplementation customerService;


    @GetMapping()
    public List<Customer> getAllBooks() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping()
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/{id}")
    public Optional<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @GetMapping
    public Optional<List<BookDetailDTO>> getAvailableCopies() {
        return customerService.getAvailableCopies();
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {customerService.deleteCustomer(id);
    }

}
