package com.pedroh936.cambioservice.controllers;


import com.pedroh936.cambioservice.dtos.CambioDto;
import com.pedroh936.cambioservice.models.CambioModel;
import com.pedroh936.cambioservice.services.CambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("cambio-service")
public class CambioController {
    @Autowired
    private CambioService cambioService;

    @GetMapping(value = "/{amount}/{from}/{to}")
    public ResponseEntity<CambioDto> get(
            @PathVariable("amount") BigDecimal amount,
            @PathVariable("from")String from,
            @PathVariable("to") String to
    ){
        CambioDto cambio = cambioService.findByFromAndTo(from,to,amount);
        return ResponseEntity.ok(cambio);
    }
}
