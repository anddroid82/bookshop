package hu.webuni.bookshop.model;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class BookshopUser {

	@Id
	private String username;
	private String password;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> roles;
	
	
}
