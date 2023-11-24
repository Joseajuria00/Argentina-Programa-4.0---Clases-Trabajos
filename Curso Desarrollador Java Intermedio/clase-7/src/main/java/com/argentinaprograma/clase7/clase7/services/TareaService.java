package com.argentinaprograma.clase7.clase7.services;

import com.argentinaprograma.clase7.clase7.model.Administrador;
import com.argentinaprograma.clase7.clase7.model.Tarea;
import com.argentinaprograma.clase7.clase7.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {
    TareaRepository tareaRepository;

    @Autowired
    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }
    public Tarea guardar(Tarea t){
        return this.tareaRepository.save(t);
    }
    public Tarea obtenerTareaPorId(Integer id){
        return this.tareaRepository.findById(id).get();
    }
}
