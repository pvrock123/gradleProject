package com.example.gradleProject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public ResponseEntity<String> welcomeUser(){
        return new ResponseEntity<String>("welcome",HttpStatus.OK);
    }
    @GetMapping("/user")
    public ResponseEntity<String> User(){
        return new ResponseEntity<String>("welcome user",HttpStatus.OK);
    }
}
