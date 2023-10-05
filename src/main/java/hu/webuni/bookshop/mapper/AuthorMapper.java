package hu.webuni.bookshop.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import hu.webuni.bookshop.dto.AuthorDto;
import hu.webuni.bookshop.model.Author;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

	public AuthorDto authorToDto(Author a);
	public List<AuthorDto> authorsToDtos(List<Author> as);
	
	@Named("short")
	public AuthorDto authorToDtoShort(Author a);
	@IterableMapping(qualifiedByName = "short")
	public List<AuthorDto> authorsToDtosShort(List<Author> as);
	
}
