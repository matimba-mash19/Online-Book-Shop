package com.matimba.book.shop.assessment.controller;


import com.matimba.book.shop.assessment.entity.Customer;
import com.matimba.book.shop.assessment.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookOrderService implements IOrderService
{
  @Autowired
  CustomerRepository customerRepository;

  @Override
  public void processCustomersOrder(Customer customer)
  {
    customerRepository.save(customer);
  }

  @Override
  public List<Customer> getOrders()
  {
    return customerRepository.findAll();
  }

  @Override
  public Customer getCustomersOrder(Long id)
  {
    Customer customersOrder = customerRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException("Customer with id " + id + "does not have any orders"));

    return customersOrder;
  }

}
