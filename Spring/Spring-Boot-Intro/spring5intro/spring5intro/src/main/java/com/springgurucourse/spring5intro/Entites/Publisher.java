package com.springgurucourse.spring5intro.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private String address;

    public Publisher() {
        // JPA does require a zero args constructor as well
    }

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                ", address='" + address + '\'' +
                '}';
    }
}
