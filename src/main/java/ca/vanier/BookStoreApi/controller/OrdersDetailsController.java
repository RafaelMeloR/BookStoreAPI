package ca.vanier.BookStoreApi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.vanier.BookStoreApi.entity.OrdersDetails;
import ca.vanier.BookStoreApi.service.OrdersDetailsService;

@RestController
@RequestMapping("/ordersDetails")
public class OrdersDetailsController {

    @Autowired
    private OrdersDetailsService ordersDetailsService;

    @PostMapping("/save")
    public OrdersDetails save(@RequestBody OrdersDetails orderDetails) {
        System.out.println("Order details saved successfully");
        return ordersDetailsService.save(orderDetails);
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id) {
        return ordersDetailsService.delete(id);
    }

    @GetMapping("/findById")
    public Optional<OrdersDetails> findById(@RequestParam Long id) {
        System.out.println("Order details found successfully");
        return ordersDetailsService.findById(id);

    }

}
