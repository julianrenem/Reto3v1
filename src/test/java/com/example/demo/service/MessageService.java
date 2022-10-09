package com.example.demo.service;

import com.example.demo.entities.Costume;
import com.example.demo.repository.CostumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();
    }

    public Optional<Message> getMessage(int id){
        return messageRepository.getMessage(id);
    }

    public Message save(Message message){
        if(message.getId()==null){
            return messageRepository.save(message);
        }else {
            Optional<Message> e = messageRepository.getMessage(message.getId());
            if (e.isPresent()){
                return message;
            }else {
                return messageRepository.save(message);
            }
        }
    }

    public boolean delete(int id){
        boolean flag = false;
        Optional<Message> e = messageRepository.getMessage(id);
        if (e.isPresent()){
            messageRepository.delete(e.get());
            flag = true;
        }
        return flag;
    }

}
