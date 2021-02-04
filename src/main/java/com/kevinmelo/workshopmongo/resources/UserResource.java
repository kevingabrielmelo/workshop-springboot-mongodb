package com.kevinmelo.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevinmelo.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User kevin = new User();
		kevin.setName("Kevin");
		kevin.setId("1");
		kevin.setEmail("kevinalvesmelo@gmail.com");
		
		User renata = new User("2", "Renata", "renataduwe@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(kevin, renata));
		return ResponseEntity.ok().body(list);
	}
}
