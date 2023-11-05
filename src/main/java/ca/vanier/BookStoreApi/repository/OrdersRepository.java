package ca.vanier.BookStoreApi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.BookStoreApi.entity.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {

}
