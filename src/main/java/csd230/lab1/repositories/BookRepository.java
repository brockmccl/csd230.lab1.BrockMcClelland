package csd230.lab1.repositories;

import csd230.lab1.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByISBN(String isbn);
    Book findById(long id);
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    @Query("SELECT b FROM Book b WHERE b.copies > 0")
    List<Book> findAvailableBooks();
}