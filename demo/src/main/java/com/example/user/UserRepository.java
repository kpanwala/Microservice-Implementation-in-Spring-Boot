package com.example.user;

import org.springframework.data.repository.CrudRepository;

import com.example.user.entity.User;

public interface UserRepository extends CrudRepository<User, String> {

}
