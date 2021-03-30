package com.matimba.book.shop.assessment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "order_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Orders
{
  @Id
  @SequenceGenerator(
          name = "order_seq",
          sequenceName = "order_seq",
          allocationSize = 1
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "order_seq"
  )
  private Long orderId;

  @OneToMany(targetEntity = Book.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "order_fk", referencedColumnName = "orderId")
  private Set<Book> books;

  private LocalDate orderDate;

}
