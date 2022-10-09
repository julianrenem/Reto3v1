package com.example.demo.service;

import com.example.demo.entities.Costume;
import com.example.demo.repository.CostumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AdminService {

    @Autowired
    private AdminRepository AdminRepository;

    public List<Admin> getAll(){
        return adminRepository.getAll();
    }

    public Optional<Admin> getAdmin(int id){
        return adminRepository.getAdmin(id);
    }

    public Admin save(Admin admin){
        if(admin.getId()==null){
            return adminRepository.save(admin);
        }else {
            Optional<Admin> e = adminRepository.getAdmin(admin.getId());
            if (e.isPresent()){
                return admin;
            }else {
                return adminRepository.save(admin);
            }
        }
    }

    public boolean delete(int id){
        boolean flag = false;
        Optional<Admin> e = adminRepository.getAdmin(id);
        if (e.isPresent()){
            adminRepository.delete(e.get());
            flag = true;
        }
        return flag;
    }

}
