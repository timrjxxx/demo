package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {


    @GetMapping(value = "/app")
    public ResponseEntity<String> back(){
        String s ="TEST";
        return ResponseEntity.ok(s);

    }
}
