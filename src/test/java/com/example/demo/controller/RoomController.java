package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/all")
    public List<Room> getAll() {
        return roomService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATE)
    public Room save (@RequestBody Room c){
            return roomService.save(c);
        }

}