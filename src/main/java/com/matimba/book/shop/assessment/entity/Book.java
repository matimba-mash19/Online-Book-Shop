package com.matimba.book.shop.assessment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book
{
  @Id
  private Long ISBN;
  private String title;
  private String author;
  private String publisher;
  private LocalDate publishedDate;
  private Float price;
}
