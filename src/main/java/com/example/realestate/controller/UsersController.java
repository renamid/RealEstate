package com.example.realestate.controller;

import com.example.realestate.dto.ListingDTO;
import com.example.realestate.dto.UsersDTO;
import com.example.realestate.service.UsersService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
    @GetMapping("/{id}")
    public UsersDTO findById(@PathVariable long id) {
        return usersService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        usersService.delete(id);
    }
}
