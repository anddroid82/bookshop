package hu.webuni.bookshop.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop/images")
public class ImageController {

	@GetMapping("{imagename}")
	public ResponseEntity<byte[]> getImage(@PathVariable String imagename) throws IOException {
		Path fileNameAndPath = Paths.get("images",imagename);
        return ResponseEntity
                .ok()
                .contentType(MediaType.valueOf(Files.probeContentType(fileNameAndPath)))
                .body(Files.readAllBytes(fileNameAndPath));
    }
	
}
