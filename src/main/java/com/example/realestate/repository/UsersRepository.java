package com.example.realestate.repository;


import com.example.realestate.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByEmail(String email);

    List<Users> findAllByLocation(String location);

    List<Users> findAllByPreferencesContaining(String preferences);
}
