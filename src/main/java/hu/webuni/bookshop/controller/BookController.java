package hu.webuni.bookshop.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import com.querydsl.core.types.Predicate;
import hu.webuni.bookshop.dto.BookDto;
import hu.webuni.bookshop.mapper.BookMapper;
import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.service.BookService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/shop/book")
public class BookController {

	private BookService bookService;
	private BookMapper bookMapper;
	
	@GetMapping
	
	public ResponseEntity<List<BookDto>> getAll() {
		return ResponseEntity.ok(this.bookMapper.booksToDtos(this.bookService.findAll()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<BookDto> getById(@PathVariable int id) {
		Optional<Book> book = this.bookService.findById(id);
		return ResponseEntity.ok(this.bookMapper.bookToDto(book.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND))));
	}
	
	@PostMapping("/{id}/mod")
	@PreAuthorize("hasAuthority('admin')")
	public ResponseEntity<BookDto> modPrice(
			@PathVariable int id,
			@RequestParam String title,
			@RequestParam String summary,
			@RequestParam String isbn,
			@RequestParam int price,
			@RequestParam int[] authors,
			@RequestParam(required = false) MultipartFile image) {
		return ResponseEntity.ok(bookMapper.bookToDto(bookService.modifiyBook(id,title,summary,isbn,price,authors,image)));
	}
	
	@PostMapping("/{id}/mod1")
	@PreAuthorize("hasAuthority('admin')")
	public ResponseEntity<BookDto> modBook(
			@RequestBody BookDto book,
			@RequestParam(required = false) MultipartFile image) {
		return ResponseEntity.ok(bookMapper.bookToDto(bookService.modifiyBook(bookMapper.dtoToBook(book),image)));
	}
	
	
	/*@GetMapping("/search")
	public ResponseEntity<List<BookDto>> searchBook(@RequestParam(required = false) String isbn,@RequestParam List<Integer> price) {
		return ResponseEntity.ok(bookMapper.booksToDtos(bookService.getBookListByBookSearch(isbn,price)));
	}*/
	
	
	@GetMapping("/search")
	public ResponseEntity<List<BookDto>> searchBook(@QuerydslPredicate(root = Book.class) Predicate predicate) {
		return ResponseEntity.ok(bookMapper.booksIterableToDtos(bookService.search(predicate)));
	}
}
