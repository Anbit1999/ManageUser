package com.example.demo.dao;

import com.example.demo.dto.RoleDTO;
import com.example.demo.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleDAO {

    List<Role> findAll();

    Role findRolebyId(int id);

    void insertRole(RoleDTO roleDTO);
}
