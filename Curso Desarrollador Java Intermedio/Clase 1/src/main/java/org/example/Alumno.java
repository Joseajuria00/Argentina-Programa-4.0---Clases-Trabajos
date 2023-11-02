package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Alumno {
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private int legajo;
    @Getter
    @Setter
    private List<Materia> materiasAprobadas = new ArrayList<>();

    public Alumno(String nom, int legajo, List<Materia> matAprobadas) {
        this.nombre = nom;
        this.legajo = legajo;
        this.materiasAprobadas = matAprobadas;
    }
    public Alumno(String nom, int legajo) {
        this.nombre = nom;
        this.legajo = legajo;
    }

    private boolean agregarAprobada(Materia materia){
        if(materia.getId()!=0){
            if(materiasAprobadas.containsAll(materia.getCorrelativas())){
                materiasAprobadas.add(materia);
                return true;
            }
        }
        return false;
    }
}
