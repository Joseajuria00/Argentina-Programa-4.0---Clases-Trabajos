package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Inscripcion {
    @Getter
    @Setter
    private Alumno alumno;
    @Getter
    @Setter
    private Materia materia;

    public Inscripcion(Alumno alum, Materia mate) {
        this.alumno = alum;
        this.materia = mate;
    }

    public boolean aprobada(){
        if(alumno.getLegajo() != 0 && materia.getId() != 0){
            if(materia.getCorrelativas().isEmpty() || alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas())){
                return true;
            }
        }
        return false;
    }
}
