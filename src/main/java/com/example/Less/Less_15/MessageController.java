package com.example.Less.Less_15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
public class MessageController {

    @Autowired
    private MessageRepository repository;

    @GetMapping("/messages")
    public Iterable<Message> getMessages() {
        return repository.findAll();
    }

    @GetMapping("/messages/{id}")
    public Optional<Message> findMessageById(@PathVariable int id) {
        return repository.findById(id);
    }

    @PostMapping("/messages")
    public Message addMessage(@RequestBody Message message) {
        repository.save(message);
        return message;
    }

    @PutMapping("/messages/{id}")
    public ResponseEntity<Message> updateMessage(@PathVariable int id, @RequestBody Message message) {
        HttpStatus status = repository.existsById(id) ? HttpStatus.OK : HttpStatus.CREATED;
        if (status == HttpStatus.OK){
            message.setId(id); // сохраняем существующий id
            return new ResponseEntity(repository.save(message), status);
        }
        else
            return new ResponseEntity(repository.save(message), status);
    }

    @DeleteMapping("/messages/{id}")
    public void deleteMessage(@PathVariable int id) {
        repository.deleteById(id);
    }

    @DeleteMapping("/messages")
    public void deleteMessageAll() {
        repository.deleteAll();
    }
}
