package com.pedro936.bookservice.service;

import com.pedro936.bookservice.dto.BookDto;
import com.pedro936.bookservice.mappers.BookMapper;
import com.pedro936.bookservice.models.BookModel;
import com.pedro936.bookservice.proxys.CambioProxi;
import com.pedro936.bookservice.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private CambioProxi cambioProxi;


    public BookDto getBook(Long id,String currency){
        BookDto dto ;

        Optional<BookModel> op = bookRepository.findById(id);
        if(op.isEmpty()){
            throw new RuntimeException("book not found !");
        }

        dto = bookMapper.toDto(op.get());
        dto.setCurrency(currency);

        var cambio = cambioProxi.get(dto.getPrice(),"USD",currency);


        dto.setPrice(cambio.getConvertedValue().doubleValue());

        return  dto;
    }
}
