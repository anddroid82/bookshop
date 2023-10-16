package hu.webuni.bookshop.dto;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDto {	
	private int id;
	private String title;
	private String isbn;	
	private String summary;
	private List<AuthorDto> authors;
	private int price;
	private String image;
	private int version;
	private LocalDate bookdate;
}

