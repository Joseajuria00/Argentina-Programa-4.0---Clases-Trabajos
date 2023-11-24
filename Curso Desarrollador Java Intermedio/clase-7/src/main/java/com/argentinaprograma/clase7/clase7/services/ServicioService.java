package com.argentinaprograma.clase7.clase7.services;

import com.argentinaprograma.clase7.clase7.model.Servicio;
import com.argentinaprograma.clase7.clase7.repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService {
    ServicioRepository servicioRepository;

    @Autowired
    public ServicioService(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    public Servicio guardar(Servicio s){
        return servicioRepository.save(s);
    }
    public Servicio obtenerServicioPorId(Integer id){
        return this.servicioRepository.findById(id).get();
    }

    public List<Servicio> buscarTodos(){
        return servicioRepository.findAll();
    }
}
