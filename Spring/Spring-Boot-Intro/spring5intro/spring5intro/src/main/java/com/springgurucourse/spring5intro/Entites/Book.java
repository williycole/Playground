package com.springgurucourse.spring5intro.Entites;

import javax.persistence.*;
import java.util.Set;

/*
 * Usually JPAs go in a Model, Domain or Entities package
 * @Entity: lets JPA know this is an Entity
 * */
@Entity
public class Book {
    /*
     * NOTE: Persistence annotations not spring annotations
     * @Id: Entities need to have an Id and Hibernate needs to know how it is getting generated
     *
     * @GeneratedValue: this makes the underling database provide the generation of the ids
     *
     * @ManyToMany: A relationship is a connection between two types of entities.
     *              In the case of a many-to-many relationship, both sides can
     *              relate to multiple instances of the other side.
     *
     * @JoinTable, joinColumns, & @JoinColumn: for building tables in a database
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String isbn;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> author;

    public Book() {
        // JPA does require a zero args constructor as well
    }

    public Book(String title, String isbn, Set<Author> author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    /*
     * Override Equals and Hash Code methods to identify it with a database record
     * ie two objects with the same Id will have equality
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id != null ? id.equals(book.id) : book.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author=" + author +
                '}';
    }
}
