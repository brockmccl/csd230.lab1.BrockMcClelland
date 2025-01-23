package csd230.lab1.repositories;

import csd230.lab1.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
    Publication findPublicationByPriceLessThan(int price_limit);
    List<Publication> findPublicationsByCopiesGreaterThan(int num_of_copies);
}