package com.springgurucourse.spring5intro.BootStrap;

import com.springgurucourse.spring5intro.Entites.Author;
import com.springgurucourse.spring5intro.Entites.Book;
import com.springgurucourse.spring5intro.Entites.Publisher;
import com.springgurucourse.spring5intro.Repositories.AuthorRepository;
import com.springgurucourse.spring5intro.Repositories.BookRepository;
import com.springgurucourse.spring5intro.Repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
 * @Component: tells spring this is a spring component, basically get spring to load it in*/
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evens");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthor().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book neEJB = new Book("J2EE Development without EJ8", "345345");
        rod.getBooks().add(neEJB);
        neEJB.getAuthor().add(rod);
        authorRepository.save(rod);
        bookRepository.save(neEJB);

        Publisher publisher = new Publisher();
        publisher.setName("Barns and Noble");
        publisher.setAddress("1234 Barns and Noble Ave, Book City, MS, 12345");
        publisherRepository.save(publisher);


        System.out.println("Started in BootStrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());

    }
}
