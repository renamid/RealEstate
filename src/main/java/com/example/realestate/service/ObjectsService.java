package com.example.realestate.service;

import com.example.realestate.dto.ObjectsDTO;
import com.example.realestate.entity.Objects;
import com.example.realestate.repository.ObjectsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ObjectsService {
    private final ObjectsRepository objectsRepository;

    public ObjectsService(ObjectsRepository objectsRepository) {
        this.objectsRepository = objectsRepository;
    }


    public ObjectsDTO create(ObjectsDTO dto) {
        Objects objects = new Objects();
        //создание агента по параметрам
        objects = objectsRepository.save(objects);

        return ObjectsDTO.fromEntity(objects);
    }

    public ObjectsDTO findById(Long id) {
        Objects objects = objectsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Object not found with id:" + id));

        return ObjectsDTO.fromEntity(objects);
    }

    public ObjectsDTO update(Long id, ObjectsDTO dto) {
        Objects objects = objectsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Object not found with id:" + id));
        //внос новых данных objects.set***(dto.get***());
        objects = objectsRepository.save(objects);//save in BD

        return ObjectsDTO.fromEntity(objects);
    }

    public void delete(Long id) {
        Objects objects = objectsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Object not found with id:" + id));
        objectsRepository.delete(objects);
    }
}
