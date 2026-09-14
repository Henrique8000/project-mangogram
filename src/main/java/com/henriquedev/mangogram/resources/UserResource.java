package com.henriquedev.mangogram.resources;

import com.henriquedev.mangogram.domain.User;
import com.henriquedev.mangogram.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> listUsers = userService.findAll();
        return ResponseEntity.ok().body(listUsers);
    }
}
