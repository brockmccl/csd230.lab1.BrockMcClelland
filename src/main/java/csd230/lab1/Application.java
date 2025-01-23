package csd230.lab1;

import com.github.javafaker.Faker;
import csd230.lab1.entities.Book;
import csd230.lab1.entities.Cart;
import csd230.lab1.entities.CartItem;
import csd230.lab1.entities.DiscMag;
import csd230.lab1.repositories.BookRepository;
import csd230.lab1.repositories.CartItemRepository;
import csd230.lab1.repositories.CartRepository;
import csd230.lab1.repositories.DiscMagRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}