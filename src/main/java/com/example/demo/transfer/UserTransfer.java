package com.example.demo.transfer;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;

public class UserTransfer {

    public UserDTO EntitytoDTO(User user){
        UserDTO userDTO = new UserDTO();
        if (user == null){
            return null;
        }
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setAvatar(user.getAvatar());
        userDTO.setFullname(user.getFullname());

        return userDTO;
    }

    public User DTOtoEntity(UserDTO userDTO){
        User user = new User();
        if (userDTO == null){
            return null;
        }
        user.setId(userDTO.getId());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setAvatar(userDTO.getAvatar());
        user.setFullname(userDTO.getFullname());
        return user;
    }
}
