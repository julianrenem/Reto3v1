package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    private CategoryService clientService;

    @GetMapping("/all")
    public List<Client> getAll() {
        return clientService.getAll();
    }

            @PostMapping("/save")
            @ResponseStatus(HttpStatus.CREATE)
            public Client save (@RequestBody Client c){
            return clientyService.save(c);
        }

}