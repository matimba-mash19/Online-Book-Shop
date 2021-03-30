package com.matimba.book.shop.assessment.controller;

import com.matimba.book.shop.assessment.entity.Book;
import com.matimba.book.shop.assessment.entity.Customer;
import com.matimba.book.shop.assessment.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookOrderController
{
  @Autowired
  private BookOrderService bookOrderService;

  @PostMapping("/placeOrders")
  public void placeCustomersOrder(@RequestBody Customer customer)
  {
    bookOrderService.processCustomersOrder(customer);
  }

  @GetMapping("/getOrders")
  public List<Customer> getOrders(){
    return bookOrderService.getOrders();
  }

  @GetMapping("/getCustomerOrders/{customerId}")
  public Customer getCustomerOrders(@PathVariable("customerId") Long id){
    return bookOrderService.getCustomersOrder(id);
  }
}
