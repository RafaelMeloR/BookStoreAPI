package ca.vanier.BookStoreApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.vanier.BookStoreApi.entity.Customer;
import ca.vanier.BookStoreApi.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
        System.out.println("Customer saved successfully");
        return customerService.save(customer);
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id) {
        return customerService.delete(id);
    }

    @GetMapping("/findById")
    public Optional<Customer> findById(@RequestParam Long id) {
        System.out.println("Customer found successfully");
        return customerService.findById(id);

    }
}
