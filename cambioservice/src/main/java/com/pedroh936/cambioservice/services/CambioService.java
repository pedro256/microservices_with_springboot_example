package com.pedroh936.cambioservice.services;

import com.pedroh936.cambioservice.dtos.CambioDto;
import com.pedroh936.cambioservice.mappers.CambioMapper;
import com.pedroh936.cambioservice.models.CambioModel;
import com.pedroh936.cambioservice.repositories.CambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CambioService {

    @Autowired
    private CambioRepository repository;
    @Autowired
    private  CambioMapper mapper;


    public CambioDto findByFromAndTo(String from, String to, BigDecimal amount){
        CambioModel model = repository.findByFromAndTo(from,to);
        CambioDto dto = mapper.toDto(model);
        dto.setConvertedValue(dto.getConversionFactor().multiply(amount));
        return  dto;
    }




}
