package hu.webuni.bookshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hu.webuni.bookshop.model.Author;
import hu.webuni.bookshop.repository.AuthorRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthorService {

	private AuthorRepository authorRepository;
	
	public List<Author> findAll(){
		return this.authorRepository.findAll();
	}
	
}
