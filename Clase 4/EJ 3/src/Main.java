import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String abc = "abcdefghijklmnopqrstuvwxyz ";
        String archivoE = "Datos de entrada (EJ 3).txt", archivoS = "Datos de salida (EJ 3).txt";
        String texto = Files.readString(Paths.get(archivoE));
        String codODecod = args[0]; //c para codificar o d para decodificar
        int desplazamiento = Integer.parseInt(args[1]);
        String textoDesplazado;
        if (codODecod.equals("c")) {
            Files.writeString(Paths.get(archivoS), codificacionx(texto, abc, desplazamiento));
        } else {
            Files.writeString(Paths.get(archivoS), decodificacionx(texto, abc, desplazamiento));
        }
    }

    public static String codificacionx(String texto, String abc, int desplazamiento) {
        for (int i = 0; i < texto.length(); i++) {
            int pos = abc.indexOf(texto.charAt(i)) + desplazamiento;
            if (pos > 26) {
                pos -= 27;
            }
            StringBuilder auxTexto = new StringBuilder(texto);
            auxTexto.setCharAt(i, abc.charAt(pos));
            texto = auxTexto.toString();
        }
        return texto;
    }
    public static String decodificacionx(String texto, String abc, int desplazamiento) {
        for (int i = 0; i < texto.length(); i++) {
            int pos = abc.indexOf(texto.charAt(i)) - desplazamiento;
            while (pos < 0) {
                pos += 27;
            }
            StringBuilder auxTexto = new StringBuilder(texto);
            auxTexto.setCharAt(i, abc.charAt(pos));
            texto = auxTexto.toString();
        }
        return texto;
    }
}