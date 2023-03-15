//Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String.
public class Main {
    public static void main(String[] args) {
        String texto = "aHolA caomo estaaaa";
        char letra = 'a';
        int contador = cantidadApariciones(texto, letra);
        System.out.println("El texto contiene " + contador + " veces la letra " + letra + ".");
    }
    public static int cantidadApariciones (String texto, char letra){
        int contador = 0;
        for (int i=0; i < texto.length(); i++){
            if (texto.charAt(i) == letra){
                contador++;
            }
        }
        return contador;
    }
}