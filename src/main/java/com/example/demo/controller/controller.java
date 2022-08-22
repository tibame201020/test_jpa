package com.example.demo.controller;

import com.example.demo.model.BaseUser;
import com.example.demo.repo.BaseUserRepo;
import com.example.demo.repo.ProUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.demo.config.Constant.FRONT_END_URL;

@CrossOrigin(value = FRONT_END_URL)
@RestController
@RequestMapping("/test")
public class controller {

    @Autowired
    private BaseUserRepo baseUserRepo;
    @Autowired
    private ProUserRepo proUserRepo;

    @RequestMapping("/getAll")
    public List<BaseUser> getAllShow() {
        return baseUserRepo.findAll();
    }

    @RequestMapping("findById")
    public BaseUser findById(@RequestBody Long id) {
        System.out.println(id);

        return baseUserRepo.findById(id).get();
    }
}
