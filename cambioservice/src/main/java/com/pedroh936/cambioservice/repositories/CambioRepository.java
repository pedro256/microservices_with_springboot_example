package com.pedroh936.cambioservice.repositories;

import com.pedroh936.cambioservice.models.CambioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository  extends JpaRepository<CambioModel,Long> {

    CambioModel findByFromAndTo(String from,String to);
}
