package hu.webuni.bookshop.dto;

public class BookDto {	
	private int id;
	private String title;
	private String isbn;
	
	public BookDto() {
		super();
	}
	
	public BookDto(int id, String title, String isbn) {
		super();
		this.id = id;
		this.title = title;
		this.isbn = isbn;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
}

