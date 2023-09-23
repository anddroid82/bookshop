package hu.webuni.bookshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
		return ResponseEntity.ok(this.bookMapper.booksToBookDtos(this.bookService.findAll()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<BookDto> getById(@PathVariable int id) {
		Optional<Book> book = this.bookService.findById(id);
		return ResponseEntity.ok(this.bookMapper.bookToBookDto(book.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND))));
	}

}
