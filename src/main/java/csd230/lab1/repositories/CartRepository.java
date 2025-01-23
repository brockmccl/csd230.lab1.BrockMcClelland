package csd230.lab1.repositories;

import csd230.lab1.entities.Cart;
import csd230.lab1.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findCartById(long id);
    Cart findCartByItemsIsContaining(CartItem item);
}