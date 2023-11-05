package ca.vanier.BookStoreApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.vanier.BookStoreApi.entity.OrdersDetails;
import ca.vanier.BookStoreApi.repository.OrdersDetailsRepository;

@Service
public class OrdersDetailsServiceImpl implements OrdersDetailsService {

    @Autowired
    private OrdersDetailsRepository ordersDetailsRepository;

    @Override
    public OrdersDetails save(OrdersDetails order) {
        return ordersDetailsRepository.save(order);
    }

    @Override
    public String delete(Long id) {
        ordersDetailsRepository.deleteById(id);
        return "Detail deleted successfully";
    }

    @Override
    public Optional<OrdersDetails> findById(Long id) {
        return ordersDetailsRepository.findById(id);
    }

}
