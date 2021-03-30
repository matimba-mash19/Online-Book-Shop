package com.matimba.book.shop.assessment.repository;

import com.matimba.book.shop.assessment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>
{
}
