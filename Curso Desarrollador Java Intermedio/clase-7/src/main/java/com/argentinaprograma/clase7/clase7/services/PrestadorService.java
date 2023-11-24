package com.argentinaprograma.clase7.clase7.services;

import com.argentinaprograma.clase7.clase7.model.Prestador;
import com.argentinaprograma.clase7.clase7.repositories.PrestadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestadorService {
    PrestadorRepository prestadorRepository;

    @Autowired
    public PrestadorService(PrestadorRepository prestadorRepository) {
        this.prestadorRepository = prestadorRepository;
    }

    public Prestador guardar(Prestador p){
        return this.prestadorRepository.save(p);
    }
    public Prestador obtenerPrestadorPorId(Integer id){
        return this.prestadorRepository.findById(id).get();
    }
}
