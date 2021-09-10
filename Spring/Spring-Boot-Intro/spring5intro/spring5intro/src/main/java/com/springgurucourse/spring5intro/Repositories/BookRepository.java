package com.springgurucourse.spring5intro.Repositories;

import com.springgurucourse.spring5intro.Entites.Book;
import org.springframework.data.repository.CrudRepository;

/*
 * Takes to Generics, type and id value
 * */
public interface BookRepository extends CrudRepository<Book, Long> {
}
