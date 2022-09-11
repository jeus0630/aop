package com.example.aop.controller;

import com.example.aop.annotation.Timer;
import com.example.aop.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestAPIController {

    @GetMapping("/get/{id}")
    public void get(@PathVariable Long id, @RequestParam String name){

    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {
        Thread.sleep(1000 * 2);
    }
}
