package org.example;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        String salir = "no";
        while(salir.equals("no")){
            Persona per = new Persona();
            per.setNombre(metodoEntradaString());
            per.setApellido(metodoEntradaString());
            per.setFechaNacimiento(metodoEntradaString());
            listaPersonas.add(per);
            System.out.print("Quiere mostrar la lista de personas?(si/no): ");
            if (metodoEntradaString().equals("si")){
                mostrarLista(listaPersonas);
            }
            System.out.print("Quiere salir?(si/no): ");
            salir = metodoEntradaString();
        }
        System.out.print("Quiere mostrar la lista final de personas?(si/no): ");
        if (metodoEntradaString().equals("si")){
            mostrarLista(listaPersonas);
        }
    }

    public static String metodoEntradaString(){
        String entradaTeclado;
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.next();
        return entradaTeclado;
    }

    public static void mostrarLista(ArrayList <Persona> listaPersonas){
        for(Persona persona : listaPersonas){
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " " + persona.getFechaNacimiento());
        }
    }
}