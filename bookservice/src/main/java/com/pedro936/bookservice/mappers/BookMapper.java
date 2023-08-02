package com.pedro936.bookservice.mappers;

import com.pedro936.bookservice.dto.BookDto;
import com.pedro936.bookservice.models.BookModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    public BookModel toEntity(BookDto dto);

    public BookDto toDto(BookModel model);
}
