package ca.vanier.BookStoreApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.BookStoreApi.entity.Orders;
import ca.vanier.BookStoreApi.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders save(Orders order) {
        return ordersRepository.save(order);
    }

    @Override
    public String delete(Long id) {
        ordersRepository.deleteById(id);
        return "Order deleted successfully";
    }

    @Override
    public Optional<Orders> findById(Long id) {
        return ordersRepository.findById(id);
    }

}
