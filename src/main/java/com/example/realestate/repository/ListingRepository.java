package com.example.realestate.repository;
import com.example.realestate.entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {
    List<Listing> findAll();

    Optional<Listing> findById(Long id);

    Listing save(Listing listing);

    void deleteById(Long id);
}

