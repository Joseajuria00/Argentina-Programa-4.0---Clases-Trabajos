package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private List<Materia> correlativas = new ArrayList<>();

    public Materia(int id, String nombre, List<Materia> correlativas) {
        this.id = id;
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public boolean agregarCorrelativa(Materia materia){
        if(materia.getId() != 0){
            this.correlativas.add(materia);
            return true;
        }
        return false;
    }
}
