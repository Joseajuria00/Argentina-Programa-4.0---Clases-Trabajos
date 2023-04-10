package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private List<Materia> correlativas;
    private boolean noExiste=false;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }
    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }
    public Materia(String nombre, boolean noExiste) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
        this.noExiste = noExiste;
    }

    public String puedeCursar(Alumno alumno) {
        if (noExiste==true){
            return "No existe la materia";
        }
        if (correlativas.isEmpty()) {
            return "APROBADO";
        } else {
            List<Materia> aprobadas = alumno.getMateriasAprobadas();
            if(aprobadas.containsAll(correlativas)){
                return "APROBADO";
            } else {
                return "RECHAZADO";
            }
        }
    }
}
