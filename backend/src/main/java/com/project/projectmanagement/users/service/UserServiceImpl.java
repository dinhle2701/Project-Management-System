package com.project.projectmanagement.users.service;

import com.project.projectmanagement.users.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.projectmanagement.users.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllUsers() {
        List<Users> list = userRepository.findAll();
        return list;
    }

    @Override
    public Users createUsers(Users user) {
        Users newUser = new Users();
        newUser.setUsername(user.getUsername());
        newUser.setEmail(user.getEmail());
        return userRepository.save(newUser);
    }

    @Override
    public Users findById(Long userId) {
        return null;
    }

    @Override
    public Users updateUser() {
        return null;
    }

    @Override
    public void deleteUser() {

    }
}
