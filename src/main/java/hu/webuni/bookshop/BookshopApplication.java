package hu.webuni.bookshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hu.webuni.bookshop.service.InitDbService;
import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class BookshopApplication implements CommandLineRunner {
	
	private InitDbService initDbService;
	
	public static void main(String[] args) {
		SpringApplication.run(BookshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.initDbService.init();
	}
	
}
