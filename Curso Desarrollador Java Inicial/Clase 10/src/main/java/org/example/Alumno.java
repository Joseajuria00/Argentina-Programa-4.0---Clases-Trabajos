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
    private String legajo;
    @Getter
    @Setter
    private List<Materia> materiasAprobadas;

    public Alumno(String nom, String legajo) {
        this.nombre = nom;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public Alumno(String nom, String legajo, List<Materia> matAprobadas) {
        this.nombre = nom;
        this.legajo = legajo;
        this.materiasAprobadas = matAprobadas;
    }
}
