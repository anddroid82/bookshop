package hu.webuni.bookshop.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String isbn;
	private String summary;
	private int price;
	@ManyToMany
	private List<Author> authors;
	
	private String image;
	private int version;
	private LocalDate bookdate;
	
	public void addAuthor(Author a) {
		this.authors.add(a);
		a.addBook(this);
	}
	
	public void removeAllAuthor() {
		for (Author a:this.authors) {
			a.removeBook(this);
		}
		this.authors=new ArrayList<>();
	}
}
