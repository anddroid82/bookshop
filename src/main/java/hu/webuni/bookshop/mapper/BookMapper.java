package hu.webuni.bookshop.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import hu.webuni.bookshop.dto.BookDto;
import hu.webuni.bookshop.model.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {

	BookDto bookToBookDto(Book b);
	Book bookDtoToBook(BookDto b);
	
	List<BookDto> booksToBookDtos(List<Book> books);
	
}
