package ludo.bernard.HessKeeperAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ludo.bernard.HessKeeperAPI.repositories.MemberRepository;

@RestController
public class MemberRestControler {
    
    @Autowired
    private MemberRepository repository;

}
