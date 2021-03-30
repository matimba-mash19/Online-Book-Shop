package com.matimba.book.shop.assessment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer
{
  @Id
  private Long customerId;
  private String fullName;
  private String emailAddress;
  private LocalDate dateOfBirth;

  @OneToMany(targetEntity = Orders.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "customer_fk", referencedColumnName = "customerId", nullable = false)
  private Set<Orders> orders;

}
