package dio.projeto_web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import dio.projeto_web_api.model.User;
import dio.projeto_web_api.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<User> getUsers(){
        return repository.findAll();
    }

    @GetMapping(("/users/{username}"))
    public User getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
}
