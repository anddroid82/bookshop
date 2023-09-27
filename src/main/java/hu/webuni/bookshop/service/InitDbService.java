package hu.webuni.bookshop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import hu.webuni.bookshop.model.Author;
import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.repository.AuthorRepository;
import hu.webuni.bookshop.repository.BookRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InitDbService {

	private BookRepository bookRepository;
	private AuthorRepository authoRepository;
	
	@Transactional
	public void init() {
		
		Author a1 = new Author(1,"Teszt Elek",LocalDate.of(1983, 3, 12),new ArrayList<>());
		Author a2 = new Author(2,"Tra Pista",LocalDate.of(1982, 5, 25),new ArrayList<>());
		
		Book b1 = new Book(0, "cim1", "isbn1","összegzés1",new ArrayList<>());
		Book b2 = new Book(0, "cim2", "isbn2","összegzés2",new ArrayList<>());
		Book b3 = new Book(0, "cim3", "isbn3","összegzés3",new ArrayList<>());
		
		this.authoRepository.save(a1);this.authoRepository.save(a2);
		this.bookRepository.save(b1);this.bookRepository.save(b2);this.bookRepository.save(b3);
		
		b1.addAuthor(a1);
		b2.addAuthor(a2);
		b3.addAuthor(a1);b3.addAuthor(a2);
		
	}
	
}
