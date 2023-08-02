package com.pedro936.bookservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookDto {

    private Long id;
    private String author;
    private String title;
    private Double price;
    private String currency;
    private Date launchDate;
    private String environment;

}
