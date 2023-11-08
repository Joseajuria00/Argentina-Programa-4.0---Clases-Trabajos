import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //---------- EJERCICIO 1 ----------
        System.out.println("---------- EJERCICIO 1 ----------");
        List<String> strings = Arrays.asList("yo", "pan", "Hola", "chau", "JAVA", "maYus", "Pasto", "Ejercicio");
        System.out.println(convertirMayusculas(strings));
        //---------- EJERCICIO 2 ----------
        System.out.println("---------- EJERCICIO 2 ----------");
        System.out.println(concatenarPalabrasTamaño(strings, 4));
    }
    public static List<String> convertirMayusculas(List<String> strings){
        List<String> stringsToUpper = new ArrayList<>();
        strings.stream().forEach(string -> stringsToUpper.add(string.toUpperCase()));
        return stringsToUpper;
    }

    public static String concatenarPalabrasTamaño(List<String> strings, int n){
        return strings.stream().filter(palabra -> palabra.length() > n).collect(Collectors.joining(", "));
    }
}