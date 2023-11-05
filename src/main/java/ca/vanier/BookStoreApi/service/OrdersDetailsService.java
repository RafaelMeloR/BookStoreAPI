package ca.vanier.BookStoreApi.service;

import java.util.Optional;

import ca.vanier.BookStoreApi.entity.OrdersDetails;

public interface OrdersDetailsService {

    public OrdersDetails save(OrdersDetails order);

    public String delete(Long id);

    public Optional<OrdersDetails> findById(Long id);

}
