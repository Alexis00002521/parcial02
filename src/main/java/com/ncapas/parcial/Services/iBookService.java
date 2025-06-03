package com.ncapas.parcial.Services;

import com.ncapas.parcial.Domain.DTO.BookDTO;
import jakarta.validation.Valid;

import java.util.UUID;

public interface iBookService {


    BookDTO createBook(BookDTO bookDTO);

    void deleteBook(UUID id);

    BookDTO updateTitle(UUID id, String title) ;
    BookDTO updateLanguage(UUID id, String language) ;

    BookDTO getBookByAuthor(UUID id, String author) ;
    BookDTO getBookByLanguage(UUID id, String language) ;
    BookDTO getBookByGenre(UUID id, String genre) ;
    BookDTO getBookByIsbn(UUID id, String isbn) ;
    BookDTO getBookByPages(UUID id, Integer pages) ;


    BookDTO updateLanguage(@Valid BookDTO object);

}




