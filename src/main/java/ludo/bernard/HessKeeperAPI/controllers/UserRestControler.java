package ludo.bernard.HessKeeperAPI.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ludo.bernard.HessKeeperAPI.dto.User;
import ludo.bernard.HessKeeperAPI.repositories.UserRepository;

@RestController
public class UserRestControler {
    
    @Autowired
    private UserRepository repository;

    @GetMapping("/members")
    public List<User> selectAll(){
        return (ArrayList<User>) repository.findAll();
    }

    @PostMapping("/members/createMember")
    public User creatreMember(User m){
        return repository.save(m);
    }

}
