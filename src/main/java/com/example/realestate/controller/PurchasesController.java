package com.example.realestate.controller;

import com.example.realestate.dto.ListingDTO;
import com.example.realestate.dto.PurchasesDTO;
import com.example.realestate.service.PurchasesService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PurchasesController {
    private final PurchasesService purchasesService;

    public PurchasesController(PurchasesService purchasesService) {
        this.purchasesService = purchasesService;
    }
    @GetMapping("/{id}")
    public PurchasesDTO findById(@PathVariable long id) {
        return purchasesService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        purchasesService.delete(id);
    }
}
