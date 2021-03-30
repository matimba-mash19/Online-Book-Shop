package com.matimba.book.shop.assessment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
import java.util.List;
import java.util.Set;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Customer
{
  @Id
  /*@SequenceGenerator(
          name = "customer_seq",
          sequenceName = "customer_seq",
          allocationSize = 1
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "customer_seq"
  )*/
  private Long customerId;
  private String fullName;
  private String emailAddress;
  private LocalDate dateOfBirth;

  @OneToMany(targetEntity=Orders.class, cascade= CascadeType.ALL)
  @JoinColumn(name = "customer_fk", referencedColumnName = "customerId", nullable = false)
  private Set<Orders> orders;
}
