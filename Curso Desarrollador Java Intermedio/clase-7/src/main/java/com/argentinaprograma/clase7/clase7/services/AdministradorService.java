package com.argentinaprograma.clase7.clase7.services;

import com.argentinaprograma.clase7.clase7.model.Administrador;
import com.argentinaprograma.clase7.clase7.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorService {
    AdministradorRepository administradorRepository;

    @Autowired
    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }

    public Administrador guardar(Administrador a){
        return this.administradorRepository.save(a);
    }

    public Administrador obtenerAdministradorPorId(Integer id){
        return this.administradorRepository.findById(id).get();
    }
}
