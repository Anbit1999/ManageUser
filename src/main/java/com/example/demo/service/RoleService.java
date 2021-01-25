package com.example.demo.service;

import com.example.demo.dao.RoleDAO;
import com.example.demo.dto.RoleDTO;
import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.transfer.RoleTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements RoleDAO {

    @Autowired
    private RoleRepository roleRepository;

    private RoleTransfer roleTransfer;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRolebyId(int id) {
        return roleRepository.findById(id).get();
    }

    @Override
    public void insertRole(RoleDTO roleDTO) {
        if (roleDTO == null){
            return;
        }
        Role role = roleTransfer.DTOtoEntity(roleDTO);
        roleRepository.save(role);
    }
}
