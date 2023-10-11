package hu.webuni.bookshop.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hu.webuni.bookshop.model.Author;
import hu.webuni.bookshop.model.Book;
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

}
