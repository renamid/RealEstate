package com.example.realestate.controller;

import com.example.realestate.dto.AgentsDTO;
import com.example.realestate.dto.ListingDTO;
import com.example.realestate.service.ListingsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ListingController {
    private final ListingsService listingsService;

    public ListingController(ListingsService listingsService) {
        this.listingsService = listingsService;
    }
    @GetMapping("/{id}")
    public ListingDTO findById(@PathVariable long id) {
        return listingsService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        listingsService.delete(id);
    }
}
