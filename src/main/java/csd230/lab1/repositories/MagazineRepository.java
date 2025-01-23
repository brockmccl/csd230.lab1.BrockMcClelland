package csd230.lab1.repositories;

import csd230.lab1.entities.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MagazineRepository extends JpaRepository<Magazine, Long> {
    Magazine findMagazineByTitle(String title);

    List<Magazine> findMagazinesByCopiesGreaterThan(int copies);
}