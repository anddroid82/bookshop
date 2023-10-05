package hu.webuni.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.webuni.bookshop.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
	
	
}
