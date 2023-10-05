package hu.webuni.bookshop.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.webuni.bookshop.dto.AuthorDto;
import hu.webuni.bookshop.mapper.AuthorMapper;
import hu.webuni.bookshop.service.AuthorService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/shop/author")
@AllArgsConstructor
public class AuthorController {

	private AuthorService authorService;
	private AuthorMapper authorMapper;
	
	@GetMapping
	public ResponseEntity<List<AuthorDto>> getAll(){
		return ResponseEntity.ok(authorMapper.authorsToDtosShort(authorService.findAll()));
	}
	
}
