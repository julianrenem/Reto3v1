package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Box")
public class BoxController {

    @Autowired
    private BoxService boxService;

    @GetMapping("/all")
    public List<Box> getAll() {
        return boxService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATE)
    public Box save (@RequestBody Box c){
            return boxService.save(c)
        }

}