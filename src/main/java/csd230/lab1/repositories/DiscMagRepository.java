package csd230.lab1.repositories;

import csd230.lab1.entities.DiscMag;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DiscMagRepository extends JpaRepository<DiscMag, Long> {
    List<DiscMag> findByTitle(String title);
    List<DiscMag> findByHasDiscTrue();
}