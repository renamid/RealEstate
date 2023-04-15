package com.example.realestate.repository;

import com.example.realestate.entity.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface DealRepository extends JpaRepository<Deal, Long> {
    List<Deal> findByUserId(Long userId);

    List<Deal> findByAgentId(Long agentId);

    List<Deal> findByObjectId(Long objectId);

    List<Deal> findByDateBetween(LocalDate startDate, LocalDate endDate);
}

