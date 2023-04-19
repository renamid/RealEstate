package com.example.realestate.controller;

import com.example.realestate.dto.ListingDTO;
import com.example.realestate.dto.ObjectsDTO;
import com.example.realestate.service.ObjectsService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Secured({"ROLE_ADMIN"})
@RestController
@RequestMapping("/api/objects")
public class ObjectsController {
    private final ObjectsService objectsService;

    public ObjectsController(ObjectsService objectsService) {
        this.objectsService = objectsService;
    }
//    @GetMapping
//    public List<ObjectsDTO> findAll() {
//        return objectsService.findAll(null);
//    }
    @GetMapping("/{id}")
    public ObjectsDTO findById(@PathVariable long id) {
        return objectsService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        objectsService.delete(id);
    }
}
