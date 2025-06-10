package com.hiricus.spring_test_ci_cd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/greet/{name}")
    public ResponseEntity<String> greet(@PathVariable String name) {
        return new ResponseEntity<>("Hello, " + name, HttpStatus.OK);
    }
}
