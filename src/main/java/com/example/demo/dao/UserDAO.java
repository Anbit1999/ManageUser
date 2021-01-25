package com.example.demo.dao;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDAO {

    List<User> findAll();

    User findUserbyId(int id);

    void insertUser(UserDTO userDTO);
}
