package com.pedro936.bookservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "book")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="author",nullable = false,length = 200)
    private String author;
    @Column(name="title",nullable = false,length = 200)
    private String title;
    @Column(name="price",nullable = false)
    private Double price;
    @Column(name = "launch_date",nullable = false)
    private Date launchDate;

}
