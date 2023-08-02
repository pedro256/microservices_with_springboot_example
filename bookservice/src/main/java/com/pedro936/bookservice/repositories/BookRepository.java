package com.pedro936.bookservice.repositories;

import com.pedro936.bookservice.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel,Long> {
}
