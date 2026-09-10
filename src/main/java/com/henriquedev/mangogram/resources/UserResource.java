package com.henriquedev.mangogram.resources;

import com.henriquedev.mangogram.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    private List<User> listUsers = Arrays.asList(new User("ABCD123", "Henrique Rest Client", "henri@gmail.com"), new User("BCGS143", "Irineu Da Silva", "iri@gmail.com"));

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        return ResponseEntity.ok().body(listUsers);
    }
}
