package com.example.demo.service;

import com.example.demo.entities.Costume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClientService {

    @Autowired
    private ClientRepository ClientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Optional<Cient> getCLient(int id){
        return clientRepository.getClient(id);
    }

    public Client save(Client cient){
        if(client.getId()==null){
            return clientRepository.save(client);
        }else {
            Optional<Client> e = clientRepository.getClient(client.getId());
            if (e.isPresent()){
                return client;
            }else {
                return clientRepository.save(client);
            }
        }
    }

    public boolean delete(int id){
        boolean flag = false;
        Optional<Client> e = clientRepository.getClient(id);
        if (e.isPresent()){
            clientRepository.delete(e.get());
            flag = true;
        }
        return flag;
    }

}
