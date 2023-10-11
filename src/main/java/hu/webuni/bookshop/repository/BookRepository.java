package hu.webuni.bookshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import hu.webuni.bookshop.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	@EntityGraph(attributePaths = "authors")
	//@Query("select b from Book b")
	List<Book> findAll();
	
	@EntityGraph(attributePaths = "authors")
	Optional<Book> findById(Integer id);
}
