package com.example.realestate.repository;

import com.example.realestate.entity.Agents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AgentsRepository extends JpaRepository<Agents, Long> {
    Optional<Agents> findByEmail(String email);

    Optional<Agents> findById(Long Id);

    List<Agents> findAllByExperienceGreaterThanEqual(Integer experience);
}
