package com.example.realestate.service;

import com.example.realestate.dto.UsersDTO;
import com.example.realestate.entity.Users;
import com.example.realestate.repository.UsersRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersDTO create(UsersDTO dto) {
        Users users = new Users();

        users = usersRepository.save(users);

        return UsersDTO.fromEntity(users);
    }

    public UsersDTO findById(Long id) {
        Users users = usersRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with id: +id"));

        return UsersDTO.fromEntity(users);
    }

    public UsersDTO update(Long id, UsersDTO dto) {
        Users users = usersRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with id: +id"));
        //update
        users = usersRepository.save(users);

        return UsersDTO.fromEntity(users);
    }

    public void delete(Long id) {
        Users users = usersRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with id: +id"));
        usersRepository.delete(users);
    }
}
