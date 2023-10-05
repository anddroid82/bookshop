package hu.webuni.bookshop.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorDto {
	private int id;
	private String name;
	private LocalDate birthDate;
}
