package hu.webuni.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.repository.BookRepository;

/**
 * 
 * @author andro
 * 
 * @version 1.0
 * {@summary Ennek a feladata a /shop/book REST végponton szolgáltatni az adatokat.}
 */
@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public void init() {
		bookRepository.save(new Book(1, "cim1", "isbn1"));
		bookRepository.save(new Book(2, "cim2", "isbn2"));
	}

	public List<Book> findAll() {
		return this.bookRepository.findAll();
	}
	
}
