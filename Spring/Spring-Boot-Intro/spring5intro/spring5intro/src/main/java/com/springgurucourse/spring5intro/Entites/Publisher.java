package com.springgurucourse.spring5intro.Entites;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
 * Usually JPAs go in a Model, Domain or Entities package
 * @Entity: lets JPA know this is an Entity
 * */
@Entity
public class Publisher {
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

    private String name;
    private String addressline1;
    private String city;
    private String state;
    private String zip;

    /*
     * meaning the publisher is one and it has many books
     */
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher() {
        // JPA does require a zero args constructor as well
    }

    public Publisher(Long id, String name, String addressline1, String city, String state, String zip, Set<Book> books) {
        this.id = id;
        this.name = name;
        this.addressline1 = addressline1;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.id) : publisher.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressline1='" + addressline1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", books=" + books +
                '}';
    }
}
