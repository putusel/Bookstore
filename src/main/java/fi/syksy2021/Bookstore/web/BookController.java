package fi.syksy2021.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.syksy2021.Bookstore.domain.Book;
import fi.syksy2021.Bookstore.domain.BookRepository;
import fi.syksy2021.Bookstore.domain.CategoryRepository;


@Controller
public class BookController {
	
	@Autowired
	private BookRepository repository; 
	
	@Autowired
	private CategoryRepository crepository;
	
    @RequestMapping(value= "/index", method = RequestMethod.GET)
    @ResponseBody
    public String bookExample() {
        return "XXXX";
     
    }
    @RequestMapping(value= "/booklist")
    public String bookList(Model model) {
    	model.addAttribute("books", repository.findAll());
    	return "booklist";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("id") Long bookId, Model model) {
    	repository.deleteById(bookId);
        return "redirect:../booklist";
    }
    @RequestMapping(value = "/add")
    public String addBook(Model model){
    	model.addAttribute("book", new Book());
    	model.addAttribute("categories", crepository.findAll());
        return "addbook";
    }
    @RequestMapping(value = "/edit/{id}")
    public String addBook(@PathVariable("id") Long bookId, Model model){
    	model.addAttribute("book", repository.findById(bookId));
    	model.addAttribute("categories", crepository.findAll());
    	return "editbook";
    }
    @PostMapping("saveBook")
    public String saveBook(Book book, Model model) {
    	repository.save(book);
    	return "redirect:/booklist";
    }
}
