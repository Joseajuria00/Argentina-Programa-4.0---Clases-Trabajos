package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Cancion theScientist = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the Head", 2002,0,0,0);

        //TEST 1: “The Scientist” recién se lanza (tiene popularidad normal).
        theScientist.setReproducciones(1000);
        theScientist.setLikes(500);
        theScientist.setDislikes(250);
        theScientist.obtenerDetalle();

        //TEST 2: “The Scientist” está en auge por superar el mínimo de reproducciones esperadas
        theScientist.setReproducciones(1001);
        theScientist.setLikes(250);
        theScientist.setDislikes(250);
        theScientist.obtenerDetalle();

        //TEST 3: “The Scientist” baja del auge por tener muchos dislikes.
        theScientist.setReproducciones(10000);
        theScientist.setLikes(3000);
        theScientist.setDislikes(5000);
        theScientist.obtenerDetalle();

        //TEST 4: “The Scientist” es tendencia por récord de reproducciones y cantidad de personas que le gusta
        //el tema.
        theScientist.setReproducciones(50001);
        theScientist.setLikes(20001);
        theScientist.setDislikes(1000);
        theScientist.obtenerDetalle();

        //TEST 5: “The Scientist” era tendencia pero vuelve a ser normal por no ser escuchada en las últimas
        //horas.
        theScientist.setUltimaReproduccion(LocalDateTime.of(2023,11,12,12,30));
        theScientist.obtenerDetalle();
    }
}