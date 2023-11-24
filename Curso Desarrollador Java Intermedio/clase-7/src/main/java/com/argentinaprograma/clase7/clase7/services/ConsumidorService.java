package com.argentinaprograma.clase7.clase7.services;

import com.argentinaprograma.clase7.clase7.model.Consumidor;
import com.argentinaprograma.clase7.clase7.repositories.ConsumidorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsumidorService {
    ConsumidorRepository consumidorRepository;

    @Autowired
    public ConsumidorService(ConsumidorRepository consumidorRepository) {
        this.consumidorRepository = consumidorRepository;
    }

    public Consumidor guardar(Consumidor c){
        return consumidorRepository.save(c);
    }
}
