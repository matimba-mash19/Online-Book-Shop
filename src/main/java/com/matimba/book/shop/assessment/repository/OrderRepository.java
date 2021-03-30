package com.matimba.book.shop.assessment.repository;

import com.matimba.book.shop.assessment.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long>
{
}
