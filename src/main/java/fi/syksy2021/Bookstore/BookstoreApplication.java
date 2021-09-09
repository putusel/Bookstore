package fi.syksy2021.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.syksy2021.Bookstore.domain.Book;
import fi.syksy2021.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookStore(BookRepository bookRepository) {
		return (args) -> {
			bookRepository.save(new Book("Uuni", "Antti Tuuri", 2010, "abc12345676", 10.00));
			for (Book book: bookRepository.findAll()) {
				System.out.println(book.toString());
			}
		};
	}

}
