package hu.webuni.bookshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.model.QBook;

public interface BookRepository extends JpaRepository<Book, Integer>, QuerydslPredicateExecutor<Book>, QuerydslBinderCustomizer<QBook> {

	@EntityGraph(attributePaths = "authors")
	//@Query("select b from Book b")
	List<Book> findAll();
	
	@EntityGraph(attributePaths = "authors")
	Optional<Book> findById(Integer id);

	@Override
	default void customize(QuerydslBindings bindings, QBook root) {
		
	}
	
}
