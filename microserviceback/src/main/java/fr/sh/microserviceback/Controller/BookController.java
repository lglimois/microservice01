package fr.sh.microserviceback.Controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sh.microserviceback.dto.Book;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookController {

	@RequestMapping("/api/books")
	public List getBooks() {

		List list = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			Book book = new Book("author" + i, "title" + i);
			list.add(book);
		}
		return list;
	}

	//@CrossOrigin(origins = "http://localhost:4200")
//	@RequestMapping("/book")
//	public Map<String,Object> getBook() {
//		Map<String,Object> model = new HashMap<String,Object>();
//	    model.put("id", "john");
//	    model.put("content", "doe");
//		return model;
//	}

	@RequestMapping("/api/book")
	public Book getBook() {

		Book book = new Book("john" , "doe" );
		return book;
	}

	@RequestMapping("/api/user")
	  public Principal user(Principal user) {
	    return user;
	  }
}
