package com.customer.customer.services;

import com.customer.customer.dto.BookDetailDTO;
import com.customer.customer.model.Customer;
import com.customer.customer.repository.CustomerRepository;
import com.customer.customer.services.serviceImpl.CustomerServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomerServiceImplementation {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public Optional<Customer> updateCustomer(Long id, Customer updatedCustomer) {
        return customerRepository.findById(id).map(customer -> {
            customer.setCustomerId(updatedCustomer.getCustomerId());
            customer.setIsbn(updatedCustomer.getIsbn());
            customer.setNooFCopies(updatedCustomer.getNooFCopies());
            return customerRepository.save(customer);
        });
    }

    @Override
    public Optional<List<BookDetailDTO>> getAvailableCopies() {
        return customerRepository.getAvailableCopies();
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }


}
