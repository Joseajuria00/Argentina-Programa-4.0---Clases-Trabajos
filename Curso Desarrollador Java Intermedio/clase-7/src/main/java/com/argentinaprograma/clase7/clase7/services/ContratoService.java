package com.argentinaprograma.clase7.clase7.services;

import com.argentinaprograma.clase7.clase7.model.Contrato;
import com.argentinaprograma.clase7.clase7.repositories.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ContratoService {
    ContratoRepository contratoRepository;

    @Autowired
    public ContratoService(ContratoRepository contratoRepository) {
        this.contratoRepository = contratoRepository;
    }

    public Contrato guardar(Contrato s){
        return contratoRepository.save(s);
    }
}
