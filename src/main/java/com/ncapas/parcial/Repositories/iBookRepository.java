package com.ncapas.parcial.Repositories;

import com.ncapas.parcial.Domain.Entitie.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface iBookRepository extends iGenericRepository<Book, UUID>{

    List<Book> findAll(Book book);
    List<Book> findByAuthor(String author);
    List<Book> findByLanguage(String language);
    List<Book> findByGenre(String genre);
    List<Book> findByIsbn(String isbn);

    @Query("SELECT b FROM Book b WHERE b.pages BETWEEN :min AND :max")
    List<Book> findByPages(@Param("min") Integer min, @Param("max") Integer max);
}
