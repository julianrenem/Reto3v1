package com.example.demo.service;

import com.example.demo.entities.Costume;
import com.example.demo.repository.CostumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CostumeService {

    @Autowired
    private CostumeRepository costumeRepository;

    public List<Costume> getAll(){
        return costumeRepository.getAll();
    }

    public Optional<Costume> getCostume(int id){
        return costumeRepository.getCostume(id);
    }

    public Costume save(Costume costume){
        if(costume.getId()==null){
            return costumeRepository.save(costume);
        }else {
            Optional<Costume> e = costumeRepository.getCostume(costume.getId());
            if (e.isPresent()){
                return costume;
            }else {
                return costumeRepository.save(costume);
            }
        }
    }

    public boolean delete(int id){
        boolean flag = false;
        Optional<Costume> e = costumeRepository.getCostume(id);
        if (e.isPresent()){
            costumeRepository.delete(e.get());
            flag = true;
        }
        return flag;
    }

}
