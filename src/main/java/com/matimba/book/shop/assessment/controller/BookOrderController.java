package com.matimba.book.shop.assessment.controller;

import com.matimba.book.shop.assessment.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookOrderController
{
  private final BookOrderService bookOrderService;

  @Autowired
  public BookOrderController(BookOrderService bookOrderService)
  {
    this.bookOrderService = bookOrderService;
  }

  @GetMapping("/hello")
  public List<Order> getHello(){
    return bookOrderService.getBookOrders();
  }

  @PostMapping("/placeOrder")
  public void placeOrder(Order order)
  {

  }
}
