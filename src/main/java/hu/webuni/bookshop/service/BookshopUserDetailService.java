package hu.webuni.bookshop.service;

import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hu.webuni.bookshop.model.BookshopUser;
import hu.webuni.bookshop.repository.BookshopUserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookshopUserDetailService implements UserDetailsService {

	private BookshopUserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		BookshopUser bookshopUser = userRepository.findById(username)
				.orElseThrow(()-> new UsernameNotFoundException(username));
		
		return new User(username, bookshopUser.getPassword(),
				bookshopUser.getRoles().stream().map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList()));
	}

}
