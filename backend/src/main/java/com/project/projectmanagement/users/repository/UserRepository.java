package com.project.projectmanagement.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.projectmanagement.users.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
