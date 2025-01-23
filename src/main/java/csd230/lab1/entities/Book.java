package csd230.lab1.entities;

import csd230.lab1.entities.Cart;
import csd230.lab1.entities.Publication;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book extends Publication {
    @Column(name = "author")
    private String author;

    @Column(name = "isbn")
    private String ISBN;

    @Column(name = "title")
    private String title;

    @Column(name = "copies", nullable = false)
    private int copies;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

}