package hu.webuni.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.webuni.bookshop.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	
	
}
