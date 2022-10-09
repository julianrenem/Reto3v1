package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Costume")
public class CostumeController {

    @Autowired
    private CostumerService costumeService;

    @GetMapping("/all")
    public List<Costume> getAll() {
        return costumeService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATE)
    public Costume save (@RequestBody Costume c){
            return costumeService.save(c);
        }

}