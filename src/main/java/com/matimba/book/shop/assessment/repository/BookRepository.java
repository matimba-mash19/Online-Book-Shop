package com.matimba.book.shop.assessment.repository;

import com.matimba.book.shop.assessment.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>
{
}
