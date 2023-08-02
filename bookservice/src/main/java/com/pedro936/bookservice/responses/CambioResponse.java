package com.pedro936.bookservice.responses;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class CambioResponse {

    private static final long serialVersionUID=1L;

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionFactor;
    private BigDecimal convertedValue;
    private String evironment;

}
