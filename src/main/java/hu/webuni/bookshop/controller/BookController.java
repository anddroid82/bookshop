package hu.webuni.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.service.BookService;

@RestController
@RequestMapping("/shop/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<Book> getAll(){
		return this.bookService.findAll();
	}
	
	
}
