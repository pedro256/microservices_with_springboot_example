package com.pedro936.bookservice.controllers;

import com.pedro936.bookservice.dto.BookDto;
import com.pedro936.bookservice.models.BookModel;
import com.pedro936.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book-service/book")
public class BookController {


    @Autowired
    private BookService bookService;

    @GetMapping(value = "/{id}/{currency}")
    public BookDto get(
            @PathVariable("id") Long id,
            @PathVariable("currency") String currency
    ){
        return  bookService.getBook(id,currency);
    }


}
