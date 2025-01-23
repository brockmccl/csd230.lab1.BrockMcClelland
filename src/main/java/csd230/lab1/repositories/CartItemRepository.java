package csd230.lab1.repositories;

import csd230.lab1.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByPrice(double price);
    List<CartItem> findByPriceGreaterThan(double minPrice);

}