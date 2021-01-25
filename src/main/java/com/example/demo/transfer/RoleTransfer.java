package com.example.demo.transfer;

import com.example.demo.dto.RoleDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.model.Role;
import com.example.demo.model.User;

public class RoleTransfer {

    public RoleDTO EntitytoDTO(Role role){
        RoleDTO roleDTO = new RoleDTO();
        if (role == null){
            return null;
        }
        roleDTO.setId(role.getId());
        roleDTO.setName(role.getName());
        roleDTO.setDescription(role.getDescription());
        return roleDTO;
    }

    public Role DTOtoEntity(RoleDTO roleDTO){
        Role role = new Role();
        if (roleDTO == null){
            return null;
        }
        role.setId(roleDTO.getId());
        role.setName(roleDTO.getName());
        role.setDescription(roleDTO.getDescription());
        return role;
    }
}
