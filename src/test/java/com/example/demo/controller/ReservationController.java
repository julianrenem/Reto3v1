package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll() {
        return reservationService.getAll();
    }

            @PostMapping("/save")
            @ResponseStatus(HttpStatus.CREATE)
            public Reservation save (@RequestBody Reservation c){
            return reservationService.save(c);
        }

}