package com.example.demo.controller;

import com.example.demo.dto.RoleDTO;
import com.example.demo.model.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAllRole(){
        return roleService.findAll();
    }

    @PostMapping
    public void insertRole(@RequestAttribute RoleDTO roleDTO){
        roleService.insertRole(roleDTO);
    }
}
