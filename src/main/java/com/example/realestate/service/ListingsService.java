package com.example.realestate.service;

import com.example.realestate.dto.ListingDTO;
import com.example.realestate.entity.Listing;
import com.example.realestate.repository.ListingRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ListingsService {
    private final ListingRepository listingRepository;

    public ListingsService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    public ListingDTO create(Listing dto){
        Listing listing = new Listing();
        //создание агента по параметрам
        listing = listingRepository.save(listing);

        return ListingDTO.fromEntity(listing);
    }

    public ListingDTO findById(Long id){
        Listing listing = listingRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Listing not found with id:" + id));

        return ListingDTO.fromEntity(listing);
    }

    public ListingDTO update(Long id, ListingDTO dto){
        Listing listing = listingRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Listing not found with id:" + id));
        //внос новых данных listing.set***(dto.get***());
        listing = listingRepository.save(listing);//save in BD

        return ListingDTO.fromEntity(listing);
    }

    public void delete(Long id){
        Listing listing = listingRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Listing not found with id:" + id));
        listingRepository.delete(listing);
    }

}
