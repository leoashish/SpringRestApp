package com.github.leoashish.restApp.controller;

import com.github.leoashish.restApp.models.User;
import com.github.leoashish.restApp.services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {
    private UsersService userService;

    public UsersController(UsersService usersService) {
        this.userService = usersService;
    }

    @GetMapping("/{id}")
    public User getAUser(@PathVariable int id){
        return this.userService.getUser(id);
    }

    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userService.getUsers();
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        this.userService.deleteUser(id);
    }
}
