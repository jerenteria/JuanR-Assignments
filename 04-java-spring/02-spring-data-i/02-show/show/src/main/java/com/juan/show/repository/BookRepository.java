package com.juan.show.repository;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface BookRepository extends CrudRepository <Book, Long> {
	List<Book> findAll();
}
