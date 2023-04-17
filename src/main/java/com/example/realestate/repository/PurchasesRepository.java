package com.example.realestate.repository;

import com.example.realestate.entity.Purchases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PurchasesRepository extends JpaRepository<Purchases, Long> {
    List<Purchases> findByUserId(Long userId);

    List<Purchases> findByAgentId(Long agentId);

    List<Purchases> findByObjectId(Long objectId);

    List<Purchases> findByDateBetween(LocalDate startDate, LocalDate endDate);
}

