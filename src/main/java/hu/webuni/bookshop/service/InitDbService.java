package hu.webuni.bookshop.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.repository.BookRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InitDbService {

	private BookRepository bookRepository;
	
	@Transactional
	public void init() {
		
		bookRepository.save(new Book(0, "cim1", "isbn1"));
		bookRepository.save(new Book(0, "cim2", "isbn2"));
		
	}
	
}
