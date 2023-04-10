package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Inicializar materias: crear 3 o 4 materias, con y sin correlativas entre ellas
        List <Materia> materias = new ArrayList<>();
        materias.add(new Materia("Programacion 1"));
        materias.add( new Materia("Programacion 2", Arrays.asList(materias.get(0)) ) );
        materias.add( new Materia("Programacion 3", Arrays.asList(materias.get(0), materias.get(1)) ) );
        materias.add( new Materia("Bases de datos") );

        // Inicializar los alumnos, crear 2 o 3 alumnos, con y sin materias aprobadas.
        // Usar para las materias los MISMOS objetos de la colección de más arriba
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add( new Alumno("Jose Silva", "1") );
        alumnos.add( new Alumno("Vanesa Sosa", "2", Arrays.asList(materias.get(0), materias.get(1))) );
        alumnos.add( new Alumno("Lucia Perez", "3", Arrays.asList(materias.get(0), materias.get(1))) );

        // Leer el archivo parado por parámetros de args y por cada línea
        String[] lineas = Files.readAllLines(Paths.get("inscripciones.csv")).toArray(new String [Files.readAllLines(Paths.get("inscripciones.csv")).size()]);

        // instanciar un objeto Inscripción, pero para llenar las materias y
        // alumnos DEBE usar los objetos que creo más arriba
        List<Inscripcion> inscripciones = cargarInscripciones(lineas, materias, alumnos);

        // Imprimir la línea, con el resultado si la inscripción está o no ok
        leerInscripciones(inscripciones);
    }


    public static void leerInscripciones(List<Inscripcion> inscripciones){
        for(int i=0; i<inscripciones.size(); i++){
                System.out.println(inscripciones.get(i).getAlumno().getNombre() + "\t\t\t" + inscripciones.get(i).getMateria().getNombre() + "\t\t\t" + inscripciones.get(i).aprobada());
        }
    }

    private static List<Inscripcion> cargarInscripciones(String[] alumnosYMaterias, List<Materia> materias, List<Alumno> alumnos) throws IOException{
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
        for(int i=0; i<alumnos.size(); i++){
            if(nombre.equals(alumnos.get(i).getNombre())){
                return alumnos.get(i);
            }
        }
        return new Alumno(nombre, "0");
    }
    private static Materia encontrarMateria(String nombre, List<Materia> materias){
        for(int i=0; i<materias.size(); i++){
            if(nombre.equals(materias.get(i).getNombre())){
                return materias.get(i);
            }
        }
        return new Materia(nombre, true);
    }
}