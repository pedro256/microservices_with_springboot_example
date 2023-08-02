package com.pedroh936.cambioservice.mappers;

import com.pedroh936.cambioservice.dtos.CambioDto;
import com.pedroh936.cambioservice.models.CambioModel;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CambioMapper {

    public CambioModel toEntity(CambioDto dto);

    public CambioDto toDto(CambioModel model);
}


