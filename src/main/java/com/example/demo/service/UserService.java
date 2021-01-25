package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.transfer.UserTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDAO {

    @Autowired
    private UserRepository userRepository;

    private UserTransfer userTransfer;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findUserbyId(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void insertUser(UserDTO userDTO) {
        if (userDTO == null){
            return;
        }
        User user = userTransfer.DTOtoEntity(userDTO);
        userRepository.save(user);
    }
}
