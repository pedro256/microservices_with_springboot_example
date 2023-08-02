package com.pedro936.bookservice.proxys;

import com.pedro936.bookservice.responses.CambioResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="cambio-service")
public interface CambioProxi {

    @GetMapping(value = "/cambio-service/{amount}/{from}/{to}")
    public CambioResponse get(
            @PathVariable("amount") Double amount,
            @PathVariable("from") String from,
            @PathVariable("to") String to
    );
}