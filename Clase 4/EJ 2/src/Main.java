import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String archivo = args[0];
        String [] contenido = Files.readString(Paths.get(archivo)).split(" |\\r?\\n|\\r");
        String operacion = args[1]; //s para suma o x para multiplicacion
        int i = 0;
        if(operacion.equals("x")) {
            i = 1;
        }
        for (String num : contenido){
            if (operacion.equals("s")) {
                i += Integer.parseInt(num);
            } else {
                i *= Integer.parseInt(num);
            }
        }
        System.out.println(i);
    }
}