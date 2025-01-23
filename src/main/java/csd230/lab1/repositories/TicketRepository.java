package csd230.lab1.repositories;

import csd230.lab1.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Ticket findTicketById(long id);

    List<Ticket> findTicketsByPrice(int price);
}