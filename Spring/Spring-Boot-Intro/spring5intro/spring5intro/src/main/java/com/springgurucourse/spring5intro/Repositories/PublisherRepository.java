package com.springgurucourse.spring5intro.Repositories;

import com.springgurucourse.spring5intro.Entites.Publisher;
import org.springframework.data.repository.CrudRepository;

/*
 * Takes to Generics, type and id value
 * */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
