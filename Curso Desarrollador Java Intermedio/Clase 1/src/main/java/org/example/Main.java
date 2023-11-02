package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Alumno> alumnos = new ArrayList<>();
        // Inicializar materias
        Materia prog1 = new Materia(1, "Programación 1");
        Materia prog2 = new Materia(2, "Programación 2");
        prog2.agregarCorrelativa(prog1);
        Materia prog3 = new Materia(3, "Programación 3", Arrays.asList(prog1, prog2));
        Materia algoritmos = new Materia(4, "Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia(5, "Paradigmas de Programación", Arrays.asList(algoritmos));
        Materia disenioSistemas = new Materia(6, "Diseño de Sistemas", Arrays.asList(algoritmos, paradigmas));
        Materia baseDatos = new Materia(7, "Bases de Datos");
        List<Materia> materias = new ArrayList<>(Arrays.asList(prog1, prog2, prog3, algoritmos, paradigmas, disenioSistemas, baseDatos));

        // Inicializar los alumnos
        alumnos.add( new Alumno("Jose Silva", 1) );
        alumnos.add( new Alumno("Vanesa Sosa", 2, Arrays.asList(prog1, prog2, algoritmos, paradigmas)));
        alumnos.add( new Alumno("Lucia Perez", 3, Arrays.asList(algoritmos, paradigmas)));
        alumnos.add( new Alumno("Felipe Vasquez", 4, Arrays.asList(prog1)));

        //Leer archivo con las inscripciones
        String[] lineas = Files.readAllLines(Paths.get("inscripciones.csv")).toArray(new String [Files.readAllLines(Paths.get("inscripciones.csv")).size()]);

        List<Inscripcion> inscripciones = cargarInscripciones(lineas, materias, alumnos);

        leerInscripciones(inscripciones);
    }

    public static void leerInscripciones(List<Inscripcion> inscripciones){
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println("Alumno: " + inscripcion.getAlumno().getNombre());
            System.out.println("Materia: " + inscripcion.getMateria().getNombre());
            if(inscripcion.aprobada()){
                System.out.println("Inscripción: Aprobada");
            } else {
                System.out.println("Inscripción: Desaprobada");
                if(inscripcion.getAlumno().getLegajo() == 0){
                    System.out.println("No existe el/la alumno/a");
                    if (inscripcion.getMateria().getId() == 0) {
                        System.out.println("No existe la materia");
                    }
                } else if (inscripcion.getMateria().getId() == 0) {
                    System.out.println("No existe la materia");
                } else {
                    System.out.println("Le faltan aprobar correlativas");
                }
            }
            System.out.println();
        }
    }
    private static List<Inscripcion> cargarInscripciones(String[] alumnosYMaterias, List<Materia> materias, List<Alumno> alumnos) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        for (int i=1; i<alumnosYMaterias.length; i++){
            String[]  alumnoYMateria = alumnosYMaterias[i].split(";");
            Alumno alumno = encontrarAlumno(alumnoYMateria[0], alumnos);
            Materia materia = encontrarMateria(alumnoYMateria[1], materias);
            inscripciones.add(new Inscripcion(alumno, materia));
        }
        return inscripciones;
    }
    private static Alumno encontrarAlumno(String nombre, List<Alumno> alumnos){
        for (Alumno alumno : alumnos) {
            if (nombre.equals(alumno.getNombre())) {
                return alumno;
            }
        }
        return new Alumno(nombre, 0);
    }
    private static Materia encontrarMateria(String nombre, List<Materia> materias){
        for (Materia materia : materias) {
            if (nombre.equals(materia.getNombre())) {
                return materia;
            }
        }
        return new Materia(0, nombre);
    }
}