package ca.vanier.BookStoreApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.vanier.BookStoreApi.entity.Orders;
import ca.vanier.BookStoreApi.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping("/save")
    public Orders save(@RequestBody Orders order) {
        System.out.println("Order saved successfully");
        return ordersService.save(order);

    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id) {
        return ordersService.delete(id);
    }

    @GetMapping("/findById")
    public Optional<Orders> findById(@RequestParam Long id) {
        System.out.println("Order found successfully");
        return ordersService.findById(id);
    }
}
