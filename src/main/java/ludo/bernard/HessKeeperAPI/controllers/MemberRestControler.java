package ludo.bernard.HessKeeperAPI.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ludo.bernard.HessKeeperAPI.dto.user.Member;
import ludo.bernard.HessKeeperAPI.repositories.MemberRepository;

@RestController
public class MemberRestControler {
    
    @Autowired
    private MemberRepository repository;

    @GetMapping("/members")
    public List<Member> selectAll(){
        return (ArrayList<Member>) repository.findAll();
    }

}
