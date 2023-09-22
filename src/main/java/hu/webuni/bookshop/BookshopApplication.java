package hu.webuni.bookshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.webuni.bookshop.service.BookService;

@SpringBootApplication
public class BookshopApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(BookshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.bookService.init();
		System.out.println("hello, futok");
		
	}
	
}
