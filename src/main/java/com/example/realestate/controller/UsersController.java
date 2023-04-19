package com.example.realestate.controller;

import com.example.realestate.dto.ListingDTO;
import com.example.realestate.dto.PurchasesDTO;
import com.example.realestate.dto.UsersDTO;
import com.example.realestate.service.UsersService;
import org.springframework.web.bind.annotation.*;

public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }
    @GetMapping("/{id}")
    public UsersDTO findById(@PathVariable long id) {
        return usersService.findById(id);
    }
    @PostMapping
    public UsersDTO createUsers(@RequestBody UsersDTO usersDTO) {
        return usersService.create(usersDTO);
    }
    @PutMapping("/{id}")
    public UsersDTO updateUsers(@PathVariable long id, @RequestBody UsersDTO usersDTO) {
        return usersService.update(id, usersDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        usersService.delete(id);
    }
}
