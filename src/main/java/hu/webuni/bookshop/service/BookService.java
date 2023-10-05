package hu.webuni.bookshop.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hu.webuni.bookshop.model.Author;
import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.repository.AuthorRepository;
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
	private AuthorRepository authorRepository;

	public List<Book> findAll() {
		return this.bookRepository.findAll();
	}

	public Optional<Book> findById(int id) {
		return this.bookRepository.findById(id);
	}
	
	@Transactional
	public Book modifiyBook(int bid,String title,String summary,String isbn,int price,int[] authors) {
		if (bookRepository.existsById(bid)) {
			Book b = this.findById(bid).get();
			b.setTitle(title);b.setSummary(summary);b.setIsbn(isbn);b.setPrice(price);
			this.addAuthorsByIntArray(b,authors);
			return bookRepository.save(b);
		}
		return null;
	}
	
	@Transactional
	public Book addAuthorsByIntArray(Book b, int[] authors) {
		b.removeAllAuthor();
		for (int aId:authors) {
			Author author = authorRepository.findById(aId).orElse(null);
			if (author!=null) {
				b.addAuthor(author);
			}
		}
		return b;
	}
	
}
