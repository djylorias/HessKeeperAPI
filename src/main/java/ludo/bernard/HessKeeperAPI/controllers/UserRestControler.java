package ludo.bernard.HessKeeperAPI.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ludo.bernard.HessKeeperAPI.dto.User;
import ludo.bernard.HessKeeperAPI.repositories.UserRepository;

@RestController
public class UserRestControler {
    
    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<User> selectAll(){
        return (ArrayList<User>) repository.findAll();
    }

    @PostMapping("/users/createUser")
    public User creatreMember(@RequestBody User m){
        System.out.println(m);
        return repository.save(m);
    }

}
