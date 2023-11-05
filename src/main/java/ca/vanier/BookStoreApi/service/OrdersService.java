package ca.vanier.BookStoreApi.service;

import java.util.Optional;

import ca.vanier.BookStoreApi.entity.Orders;

public interface OrdersService {

    public Orders save(Orders order);

    public String delete(Long id);

    public Optional<Orders> findById(Long id);

}
