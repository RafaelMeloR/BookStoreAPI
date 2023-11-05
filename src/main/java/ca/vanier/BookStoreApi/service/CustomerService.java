package ca.vanier.BookStoreApi.service;

import java.util.Optional;

import ca.vanier.BookStoreApi.entity.Customer;

public interface CustomerService {

    public Customer save(Customer customer);

    public String delete(Long id);

    public Optional<Customer> findById(Long id);

}
