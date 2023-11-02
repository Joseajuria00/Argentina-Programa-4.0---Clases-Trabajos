package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class InscripcionTest extends TestCase {
    public void testAprobadaMateriaSinCorrelativas() {
        Materia materia = new Materia("Probabilidad");
        Alumno alumno = new Alumno("JOSE", "123");
        Inscripcion inscripcion = new Inscripcion(alumno, materia);
        assertEquals("APROBADO", inscripcion.aprobada());
    }
    public void testMateriaConCorrelativasAprobada() {
        Materia mat1 = new Materia("Probabilidad 1");
        Materia mat2 = new Materia("Probabilidad 2", Arrays.asList(mat1) );
        Materia mat3 = new Materia("Probabilidad 3", Arrays.asList(mat1, mat2));
        Alumno alumno = new Alumno("JOSE", "123", Arrays.asList(mat1, mat2) );
        Inscripcion inscripcion = new Inscripcion(alumno, mat3);
        assertEquals("APROBADO", inscripcion.aprobada());
    }
    public void testMateriaConCorrelativasDesaprobadas() {
        Materia mat1 = new Materia("Probabilidad 1");
        Materia mat2 = new Materia("Probabilidad 2", Arrays.asList(mat1) );
        Materia mat3 = new Materia("Probabilidad 3", Arrays.asList(mat1, mat2));
        Alumno alumno = new Alumno("JOSE", "123");
        Inscripcion inscripcion = new Inscripcion(alumno, mat3);
        assertEquals("APROBADO", inscripcion.aprobada());
    }
}