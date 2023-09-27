package hu.webuni.bookshop.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import hu.webuni.bookshop.dto.AuthorDto;
import hu.webuni.bookshop.model.Author;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

	public AuthorDto authorToDto(Author a);
	public Author dtoToAuthor(AuthorDto a);
	
	public List<AuthorDto> authorsToDtos(List<Author> as);
	
}
