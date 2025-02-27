package com.example.dio.controller;

import com.example.dio.model.User;
import com.example.dio.service.UserService;
import com.example.dio.util.ResponseBuilder;
import com.example.dio.util.ResponseStructure;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @PostMapping ("/register")
    public ResponseEntity<ResponseStructure<String>> registerUser(@RequestBody User user)
    {
        user =userService.registerUser(user);
        return ResponseBuilder.success(HttpStatus.CREATED, "User Created","user");
    }

//    @GetMapping("/users/{userId}")
//    public ResponseEntity<ResponseStructure<String>> findById()

}
