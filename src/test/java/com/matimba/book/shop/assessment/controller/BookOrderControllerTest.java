package com.matimba.book.shop.assessment.controller;

import com.matimba.book.shop.assessment.entity.Customer;
import com.matimba.book.shop.assessment.service.BookOrderService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;
import java.util.HashSet;

public class BookOrderControllerTest
{
  String expectedJson = "{\"customerId\":\1000000,\"fullName\":\"Joe Doe\",\"emailAddress\":\"jdoe@mymail.com\",\"dateOfBirth\":\"2000-01-01\",\"steps\":[]}";
  @Autowired
  private MockMvc mockMvc;
  @MockBean
  private BookOrderService bookOrderService;
  private Customer mockOrder = Customer.builder()
          .customerId(new Long(1000000))
          .fullName("Joe Doe")
          .dateOfBirth(LocalDate.of(2000, 01, 01))
          .emailAddress("jdoe@mymail.com")
          .orders(new HashSet<>())
          .build();

  @Test
  public void getCustomersOrders() throws Exception
  {
    Mockito.when(
            bookOrderService.getCustomersOrder(Mockito.anyLong()
                                              )).thenReturn(mockOrder);

    RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
            "/book/getCustomerOrders/1000000").accept(
            MediaType.APPLICATION_JSON);

    MvcResult result = mockMvc.perform(requestBuilder).andReturn();

    System.out.println(result.getResponse());
    String expected = "";

    JSONAssert.assertEquals(expected, result.getResponse()
            .getContentAsString(), false);
  }
}
