package fi.syksy2021.Bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.syksy2021.Bookstore.domain.BookRepository;


	@Controller
	public class BookController {
	
	@Autowired
	private BookRepository repository; 
	
    @RequestMapping(value= "/index", method = RequestMethod.GET)
    @ResponseBody
    public String bookExample() {
        return "XXXX";
    
    }
    @RequestMapping(value= {"/", "/booklist"})
    public String bookList(Model model) {
    	model.addAttribute("books", repository.findAll());
    	return "booklist";
    }
    
}
