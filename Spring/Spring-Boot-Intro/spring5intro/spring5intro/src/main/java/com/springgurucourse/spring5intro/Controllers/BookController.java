package com.springgurucourse.spring5intro.Controllers;

import com.springgurucourse.spring5intro.Repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @Controller: registers teh class as a Spring Bean and as a Controller in Spring MVC
 * to map method to http request paths use
 * @RequestMapping: maps to a specific url*/

@Controller
public class BookController {

    /*
     * adding the book repository here with a constructor allows us to inject the book repository
     * */
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /*
     * this gives the view a copy of the model
     * */
    @RequestMapping("/books")
    public String getBooks(Model model) {
        /*
         * at runtime when spring gets a request to the /books url
         * it will execute the get books method, provide that method
         * a model object, and for that model we are going add the
         * attribute books, and execute book repository, then it will
         * give us a list of books where finally this attribute will
         * be returned with a list of books where we can then access
         * it in our view layer
         * */
        model.addAttribute("books", bookRepository.findAll());

        /*
        * tells the app to look for the list template inside the directory of books*/
        return "books/list";
    }
}
