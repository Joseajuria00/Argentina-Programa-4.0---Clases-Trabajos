import java.util.Arrays;

//Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3.
public class Main {
    public static void main(String[] args) {
        int A = 8, B = 3, C = 11;
        String orden = "decreciente"; // ascendente o decreciente
        int vector[] = ordenarEnVector(A, B, C, orden);
        System.out.println(Arrays.toString(vector));
    }
    public static int[] ordenarEnVector(int A, int B, int C, String orden){
        int pos1, pos2, pos3;
        if (A>=B && B>=C) {
            pos1 = A;
            pos2 = B;
            pos3 = C;
        } else if (A>=C && C>=B) {
            pos1 = A;
            pos2 = C;
            pos3 = B;
        } else if (B>=A && A>=C) {
            pos1 = B;
            pos2 = A;
            pos3 = C;
        } else if (B>=C && C>=A) {
            pos1 = B;
            pos2 = C;
            pos3 = A;
        } else if (C>=A && A>=B) {
            pos1 = C;
            pos2 = A;
            pos3 = B;
        } else {
            pos1 = C;
            pos2 = B;
            pos3 = A;
        }
        if (orden.equals("ascendente")) {
            int aux = pos1;
            pos1=pos3;
            pos3=aux;
        }
        int vector[] = {pos1, pos2, pos3};
        return vector;
    }
}