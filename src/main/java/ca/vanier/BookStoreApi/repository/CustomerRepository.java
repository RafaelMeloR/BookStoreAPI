package ca.vanier.BookStoreApi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.BookStoreApi.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
