package com.project.projectmanagement.users.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.projectmanagement.users.entity.Users;

@Service
public interface UserService {

    List<Users> getAllUsers();

    Users createUsers(Users user);

    Users findById(Long userId);

    Users updateUser();

    void deleteUser();
}
