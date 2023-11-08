import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //RESUELTO DE 2 FORMAS DIFERENTES
        //EN LA PRIMERA LA INTERFAZ TRABAJA CON UN STRING
        //EN LA SEGUNDA LA INTERFAZ TRABAJA CON UNA LISTA DE STRINGS

        List<String> strings = Arrays.asList("Hola", "chau", "Java", "MAYUS");

        // En esta forma la interfaz trabaja con un String
        List<String> toUpperCase = transformarStrings(strings, str -> str.toUpperCase());
        System.out.println(toUpperCase);

        // En esta forma la interfaz trabaja con una lista de Strings
        List<String> toUpperCase2 = transformarStrings2(strings, strs ->{
            List<String> stringsTransform = new ArrayList<>();
            for(String string : strs){
                stringsTransform.add(string.toUpperCase());
            }
            return stringsTransform;
        });
        System.out.println(toUpperCase2);
    }

    @FunctionalInterface
    public interface Operacion {
        String aplicar(String str);
    }
    public static List<String> transformarStrings(List<String> strings, Operacion operacion){
        List<String> stringsTranform = new ArrayList<>();
        for(String string : strings){
            stringsTranform.add(operacion.aplicar(string));
        }
        return stringsTranform;
    }

    @FunctionalInterface
    public interface Operacion2 {
        List<String> aplicar(List<String> strs);
    }
    public static List<String> transformarStrings2(List<String> strings, Operacion2 operacion){
        return operacion.aplicar(strings);
    }
}