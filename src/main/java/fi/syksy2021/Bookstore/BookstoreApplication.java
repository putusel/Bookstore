package fi.syksy2021.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.syksy2021.Bookstore.domain.Book;
import fi.syksy2021.Bookstore.domain.BookRepository;
import fi.syksy2021.Bookstore.domain.Category;
import fi.syksy2021.Bookstore.domain.CategoryRepository;


@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner Bookstore(BookRepository brepository, CategoryRepository crepository) {
//		return (args) -> {
//			log.info("save a couple of books");
//			crepository.save(new Category("Fantasy"));
//			crepository.save(new Category("Sci-Fi"));
//			crepository.save(new Category("Romance"));
//			
//			brepository.save(new Book("Antti Tuuri", "Uuni", 2010, "123abc", crepository.findByName("Fantasy").get(0)));
//			brepository.save(new Book("Tove Jansson", "Muumit", 1975, "234bca", crepository.findByName("Fantasy").get(0)));	
//			
//			//log.info("fetch all books");
//			for (Book book : brepository.findAll()) {
//				log.info(book.toString());
//			}
//
//		};
//	}
}