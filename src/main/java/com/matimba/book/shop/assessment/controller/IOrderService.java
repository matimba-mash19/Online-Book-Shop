package com.matimba.book.shop.assessment.controller;

import com.matimba.book.shop.assessment.entity.Customer;

import java.util.List;

public interface IOrderService
{
  List<Customer> getOrders();
  Customer getCustomersOrder(Long id);
  void processCustomersOrder(Customer customer);
}
