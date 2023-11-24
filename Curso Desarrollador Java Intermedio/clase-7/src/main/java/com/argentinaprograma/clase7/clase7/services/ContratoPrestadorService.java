package com.argentinaprograma.clase7.clase7.services;

import com.argentinaprograma.clase7.clase7.model.ContratoPrestador;
import com.argentinaprograma.clase7.clase7.repositories.ContratoPrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ContratoPrestadorService {
    ContratoPrestadorRepository contratoPrestadorRepository;

    @Autowired
    public ContratoPrestadorService(ContratoPrestadorRepository contratoPrestadorRepository) {
        this.contratoPrestadorRepository = contratoPrestadorRepository;
    }

    public ContratoPrestador guardar(ContratoPrestador s){
        return contratoPrestadorRepository.save(s);
    }
}
