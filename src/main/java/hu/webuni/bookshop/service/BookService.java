package hu.webuni.bookshop.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.repository.BookRepository;
import lombok.AllArgsConstructor;

/**
 * 
 * @author andro
 * 
 * @version 1.0
 * {@summary Ennek a feladata a /shop/book REST végponton szolgáltatni az adatokat.}
 */
@Service
@AllArgsConstructor
public class BookService {

	private BookRepository bookRepository;

	public List<Book> findAll() {
		return this.bookRepository.findAll();
	}

	public Optional<Book> findById(int id) {
		return this.bookRepository.findById(id);
	}
	
	public Book modifiyBook(Book b) {
		if (bookRepository.existsById(b.getId())) {
			return bookRepository.save(b);
		}
		return null;
	}
	
	
}
