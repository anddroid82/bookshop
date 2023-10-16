package hu.webuni.bookshop.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;

import hu.webuni.bookshop.model.Author;
import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.model.QBook;
import hu.webuni.bookshop.repository.AuthorRepository;
import hu.webuni.bookshop.repository.BookRepository;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author andro
 * 
 * @version 1.0 {@summary Ennek a feladata a /shop/book REST végponton
 *          szolgáltatni az adatokat.}
 */
@Service
@RequiredArgsConstructor
public class BookService {

	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;

	@Value("${images.baseurl}")
	private String imagesBaseUrl;

	public List<Book> findAll() {
		return this.bookRepository.findAll();
	}

	public Optional<Book> findById(int id) {
		return this.bookRepository.findById(id);
	}

	public String uploadFile(MultipartFile file, int bookId) {
		// TODO: kiterjesztést meghatározni
		String fileName = file.getOriginalFilename();
		String extension = fileName.substring(fileName.lastIndexOf("."));
		String newFileName = bookId + extension;
		Path fileNameAndPath = Paths.get("images", newFileName);
		System.out.println("Path:" + fileNameAndPath.toAbsolutePath());
		try {
			// Files.write(file.getBytes(), new File());
			Files.write(fileNameAndPath, file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.imagesBaseUrl + "/" + newFileName;
	}

	@Transactional
	public Book modifiyBook(int bid, String title, String summary, String isbn, int price, int[] authors,
			MultipartFile file) {
		if (bookRepository.existsById(bid)) {
			Book b = this.findById(bid).get();
			b.setTitle(title);
			b.setSummary(summary);
			b.setIsbn(isbn);
			b.setPrice(price);
			this.addAuthorsByIntArray(b, authors);
			if (file != null) {
				String uploadFile = this.uploadFile(file, b.getId()); 
				if (uploadFile != "") b.setImage(uploadFile);
			}
			return bookRepository.save(b);
		}
		return null;
	}

	@Transactional
	public Book addAuthorsByIntArray(Book b, int[] authors) {
		b.removeAllAuthor();
		for (int aId : authors) {
			Author author = authorRepository.findById(aId).orElse(null);
			if (author != null) {
				b.addAuthor(author);
			}
		}
		return b;
	}
	
	@Transactional
	public List<Book> getBookListByBookSearch(String isbn,List<Integer> price) {
		
		QBook book = QBook.book;
		List<Predicate> predicates = new ArrayList<>();
		
		if (isbn != null) {
			predicates.add(book.isbn.eq(isbn));
		}
		
		if (price.size()==1) {
			predicates.add(book.price.gt(price.get(0)));
		}else if (price.size()==2) {
			predicates.add(book.price.between(price.get(0), price.get(1)));
		}
		
		Iterator<Book> iterator = bookRepository.findAll(ExpressionUtils.allOf(predicates)).iterator();
		List<Book> booksResult = new ArrayList<>();
		while (iterator.hasNext()) {
			Book btemp = iterator.next();
			btemp.getAuthors().iterator();
			booksResult.add(btemp);
		}
		return booksResult;
	}

}
