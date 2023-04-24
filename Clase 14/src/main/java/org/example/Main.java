package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        /*final String regex = ".* (([a-z]|[0-9])+@[a-z]+\\.[a-z]+).* ([0-9]+)$";
        final String string = "Maria es docente, su email es maria123@gmail.com y su DNI es  31605906";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }*/

        Path ruta = Paths.get("expresiones.txt");
        final Pattern pattern = Pattern.compile(".* (([a-z]|[0-9])+@[a-z]+\\.[a-z]+).* ([0-9]+)$",  Pattern.MULTILINE);
        try (BufferedReader reader = Files.newBufferedReader(ruta, StandardCharsets.UTF_8)) {
            int cont=0;
            String linea;
            while ((linea = reader.readLine()) != null) {
                final Matcher matcher = pattern.matcher(linea);
                cont++;
                System.out.print("Linea " + cont + ": ");
                System.out.println(pattern.matcher(linea).matches());
                while (matcher.find()) {
                    System.out.println("\tFull match: " + matcher.group(0));
                    for (int i = 1; i <= matcher.groupCount(); i++) {
                        System.out.println("\tGroup " + i + ": " + matcher.group(i));
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}