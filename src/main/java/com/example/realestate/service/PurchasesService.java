package com.example.realestate.service;

import com.example.realestate.dto.PurchasesDTO;
import com.example.realestate.entity.Purchases;
import com.example.realestate.repository.PurchasesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PurchasesService {
    private final PurchasesRepository purchasesRepository;

    public PurchasesService(PurchasesRepository purchasesRepository) {
        this.purchasesRepository = purchasesRepository;
    }

    public PurchasesDTO create(PurchasesDTO dto){
        Purchases purchases = new Purchases();
        //создание агента по параметрам
        purchases = purchasesRepository.save(purchases);

        return PurchasesDTO.fromEntity(purchases);
    }

    public PurchasesDTO findById(Long id){
        Purchases purchases = purchasesRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Purchas not found with id:" + id));

        return  PurchasesDTO.fromEntity(purchases);
    }

    public PurchasesDTO update(Long id, PurchasesDTO dto){
        Purchases purchases = purchasesRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Purchas not found with id:" + id));
        //new parametres of column
        purchases = purchasesRepository.save(purchases);

        return PurchasesDTO.fromEntity(purchases);
    }

    public void delete(Long id){
        Purchases purchases = purchasesRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Purchas not found with id:" + id));
        purchasesRepository.delete(purchases);
    }
}
