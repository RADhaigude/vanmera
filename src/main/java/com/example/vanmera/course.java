package com.example.vanmera;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class course {
    public course(){

    }

    @GetMapping({"/mycourse"})
    public String getData() { return "Please select your course"; }
    }

