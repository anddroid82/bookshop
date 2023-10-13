package hu.webuni.bookshop.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.webuni.bookshop.dto.LoginDto;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/shop/login")
@AllArgsConstructor
public class JwtLoginController {
	
	private JwtService jwtService;
	private AuthenticationManager authenticationManager;
	
	@PostMapping
	public String login(@RequestBody LoginDto login) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword())
		);
		return "\""+ jwtService.creatJwtToken((UserDetails)authentication.getPrincipal()) + "\"";
	}
	
	
}
