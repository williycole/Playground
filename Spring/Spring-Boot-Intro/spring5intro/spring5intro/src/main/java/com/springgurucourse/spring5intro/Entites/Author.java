package com.springgurucourse.spring5intro.Entites;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


/*
 * NOTE: Persistence annotations not spring annotations
 * Usually JPAs go in a Model, Domain or Entities package
 * @Entity: lets JPA know this is an Entity
 * */
@Entity
public class Author {
    /*
     * NOTE: Persistence annotations not spring annotations
     * @Id: Entities need to have an Id and Hibernate needs to know how it is getting generated
     *
     * @GeneratedValue: this makes the underling database provide the generation of the ids
     *
     * @ManyToMany: A relationship is a connection between two types of entities.
     *              In the case of a many-to-many relationship, both sides can
     *              relate to multiple instances of the other side.
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();

    public Author() {
        // JPA does require a zero args constructor as well
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    /*
    * Override Equals and Hash Code methods to identify it with a database record
    * ie two objects with the same Id will have equality
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
