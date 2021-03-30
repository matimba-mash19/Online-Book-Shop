package com.matimba.book.shop.assessment;

import com.matimba.book.shop.assessment.controller.BookOrderController;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.logging.Logger;

@SpringBootApplication
@EnableSwagger2
public class BookShopAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookShopAssessmentApplication.class, args);
	}

}
