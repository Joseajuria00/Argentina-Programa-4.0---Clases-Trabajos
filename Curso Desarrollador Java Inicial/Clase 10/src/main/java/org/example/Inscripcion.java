package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@NoArgsConstructor
public class Inscripcion {
    @Getter
    @Setter
    private Alumno alumno;
    @Getter
    @Setter
    private Materia materia;
    @Getter
    @Setter
    private LocalDateTime fecha;

    public Inscripcion(Alumno alum, Materia mate) {
        this.alumno = alum;
        this.materia = mate;
    }

    public String aprobada(){
        if(alumno.getLegajo().equals("0")){
            return "No existe el/la alumno/a";
        }
        return this.materia.puedeCursar(this.alumno);
    }
}
