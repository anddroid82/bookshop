package hu.webuni.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.webuni.bookshop.model.BookshopUser;

public interface BookshopUserRepository extends JpaRepository<BookshopUser, String> {

	
	
}
