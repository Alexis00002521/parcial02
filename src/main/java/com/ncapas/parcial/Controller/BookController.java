package com.ncapas.parcial.Controller;


import com.ncapas.parcial.Domain.DTO.BookDTO;
import com.ncapas.parcial.Services.iBookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ncapas.parcial.Util.Constants.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API + BOOK_CONTROLLER)

public class BookController {

    private final iBookService bookService;

    @PostMapping(UPDATE)
    public ResponseEntity<BookDTO> updateLanguage(@RequestBody @Valid BookDTO object) throws Exception {

        BookDTO data = bookService.updateLanguage(object);

        return BookDTO.builder().message("LanguageUpdate").data(data).status(HttpStatus.OK).build().buildResponse();

    }
}
