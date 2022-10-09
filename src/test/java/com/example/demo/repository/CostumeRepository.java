package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CostumeRepository {

    @Autowired

    public List<Costume> getAll() {
        return (list<Costume>) costumeCrudRepository.findAll();
    }

    public Costume save(Costume c) {
        return costumeCrudRepository.save(c);
    }

    public void delete(Costume c) {
        costumeCrudRepository.delete(c);
    }

    public Optional<Costume> getCostume(int id) {
        return costumeCrudRepository.findById(id);
    }
}
