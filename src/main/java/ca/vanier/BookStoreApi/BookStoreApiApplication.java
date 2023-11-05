package ca.vanier.BookStoreApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BookStoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApiApplication.class, args);
	}

}
