package com.github.leoashish.restApp.services;

import com.github.leoashish.restApp.models.User;
import com.github.leoashish.restApp.repositories.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
    public UsersRepository users;
    UsersService(UsersRepository usersRepository){
        this.users = usersRepository;
    }

    public List<User> getUsers(){
        return this.users.findAll();
    }

    public User getUser(int id){
        return this.users.findById(id).orElse(null);
    }

    public User addUser(User user){
        this.users.save(user);
        return user;
    }

    public User updateUser(int id, String name, int age){
        var user = this.users.findById(id).orElse(null);
        if(user != null){
            user.setName(name);
            user.setAge(age);
            return user;
        }
        return null;
    }

    public void deleteUser(int id){
        this.users.deleteById(id);
    }
}
