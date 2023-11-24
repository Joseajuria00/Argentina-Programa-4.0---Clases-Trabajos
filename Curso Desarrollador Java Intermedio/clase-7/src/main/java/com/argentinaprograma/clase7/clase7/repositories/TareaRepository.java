package com.argentinaprograma.clase7.clase7.repositories;

import com.argentinaprograma.clase7.clase7.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
}
