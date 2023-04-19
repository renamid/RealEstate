package com.example.realestate.controller;

import com.example.realestate.dto.AgentsDTO;
import com.example.realestate.dto.ListingDTO;
import com.example.realestate.service.ListingsService;
import org.springframework.web.bind.annotation.*;

public class ListingController {
    private final ListingsService listingsService;

    public ListingController(ListingsService listingsService) {
        this.listingsService = listingsService;
    }
    @GetMapping("/{id}")
    public ListingDTO findById(@PathVariable long id) {
        return listingsService.findById(id);
    }
    @PostMapping
    public ListingDTO createListing(@RequestBody ListingDTO listingDTO) {
        return listingsService.create(listingDTO);
    }
    @PutMapping("/{id}")
    public ListingDTO updateListing(@PathVariable long id, @RequestBody ListingDTO listingDTO) {
        return listingsService.update(id, listingDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        listingsService.delete(id);
    }
}
