package ca.vanier.BookStoreApi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.BookStoreApi.entity.OrdersDetails;

@Repository
public interface OrdersDetailsRepository extends CrudRepository<OrdersDetails, Long> {

}
