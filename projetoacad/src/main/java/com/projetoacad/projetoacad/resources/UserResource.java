/**
 * 
 */
package com.projetoacad.projetoacad.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoacad.projetoacad.entities.User;

/**
 * @author purpl
 *
 */

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findALL(){
		User u = new User(1L, "Pedro", "pedrobrioso27@gmail.com", "9999999", "senha123");
				return ResponseEntity.ok().body(u);
	}
}


