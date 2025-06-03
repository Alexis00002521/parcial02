package com.ncapas.parcial.Services.ServiceImplementation;

import com.ncapas.parcial.Domain.DTO.BookDTO;
import com.ncapas.parcial.Domain.Entitie.Book;
import com.ncapas.parcial.Repositories.iBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookServiceImpl {

    private final iBookRepository bookRepository;


    @Override
    public BookDTO updateLanguage(UUID id, String language) {
        Book book = (Book) bookRepository.findByLanguage(language);
        book.setLanguage(book.getLanguage());

        bookRepository.save(book);


        return mapBook(book);
    }

    private BookDTO mapBook(Book book) {
        return new BookDTO(
                book.getId().toString(),
                book.getTitle(),
                book.getAuthor(),
                book.getIsbn(),
                book.getPublicationYear(),
                book.getLanguage(),
                book.getPages(),
                book.getGenre()
        );
    }
}
