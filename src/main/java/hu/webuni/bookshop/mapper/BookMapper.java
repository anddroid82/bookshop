package hu.webuni.bookshop.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import hu.webuni.bookshop.dto.BookDto;
import hu.webuni.bookshop.model.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {

	BookDto bookToDto(Book b);
	Book dtoToBook(BookDto b);
	
	List<BookDto> booksToDtos(List<Book> books);
	List<BookDto> booksIterableToDtos(Iterable<Book> books);
	
}
