package com.example.realestate.controller;

import com.example.realestate.dto.ListingDTO;
import com.example.realestate.dto.ObjectsDTO;
import com.example.realestate.dto.PurchasesDTO;
import com.example.realestate.service.PurchasesService;
import org.springframework.web.bind.annotation.*;

public class PurchasesController {
    private final PurchasesService purchasesService;

    public PurchasesController(PurchasesService purchasesService) {
        this.purchasesService = purchasesService;
    }
    @GetMapping("/{id}")
    public PurchasesDTO findById(@PathVariable long id) {
        return purchasesService.findById(id);
    }
    @PostMapping
    public PurchasesDTO createPurchases(@RequestBody PurchasesDTO purchasesDTO) {
        return purchasesService.create(purchasesDTO);
    }
    @PutMapping("/{id}")
    public PurchasesDTO updatePurchases(@PathVariable long id, @RequestBody PurchasesDTO purchasesDTO) {
        return purchasesService.update(id, purchasesDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        purchasesService.delete(id);
    }
}
