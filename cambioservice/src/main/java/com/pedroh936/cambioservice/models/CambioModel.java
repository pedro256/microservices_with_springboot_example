package com.pedroh936.cambioservice.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity(name="cambio")
public class CambioModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="from_currency",length = 3,nullable = false)
    private String from;
    @Column(name="to_currency",length = 3,nullable = false)
    private String to;
    @Column(name="conversion_factor")
    private BigDecimal conversionFactor;

}
