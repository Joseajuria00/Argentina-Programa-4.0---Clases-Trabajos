//Dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado.
public class Main {
    public static void main(String[] args) {
        int vector [] = {1,2,3,4,5,6,7,8,9,10};
        int X = 5;
        int resultado = sumarNumsMayorX (vector, vector.length, X);
        System.out.println(resultado);
    }
    private static int sumarNumsMayorX (int vector[], int tam, int X){
        int resultado=0;
        for (int i=0; i<tam; i++){
            if (vector[i]>X){
                resultado+=vector[i];
            }
        }
        return resultado;
    }
}