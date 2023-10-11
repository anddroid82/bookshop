package hu.webuni.bookshop.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/shop/login")
@AllArgsConstructor
public class JwtLoginController {
	
	private JwtService jwtService;
	private AuthenticationManager authenticationManager;
	
	@PostMapping
	public String login(@RequestParam String username,@RequestParam String password) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(username, password)
		);
		return "\""+ jwtService.creatJwtToken((UserDetails)authentication.getPrincipal()) + "\"";
	}
	
	
}
