import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B, C;
        String orden;
        if (args.length == 4) {
            A = Integer.parseInt(args[0]);
            B = Integer.parseInt(args[1]);
            C = Integer.parseInt(args[2]);
            orden = args[3]; // ascendente o decreciente
        } else {
            System.out.println("Ingrese 3 numeros seprarados por enter:");
            A = metodoEntrada();
            B = metodoEntrada();
            C = metodoEntrada();
            System.out.println("\"a\" para ascendente y \"d\" para decreciente");
            orden = metodoEntradaString(); // ascendente o decreciente
        }
        int vector[] = ordenarEnVector(A, B, C, orden);
        System.out.println(Arrays.toString(vector));
    }
    public static int[] ordenarEnVector(int A, int B, int C, String orden) {
        int pos1, pos2, pos3;
        if (A >= B && B >= C) {
            pos1 = A;
            pos2 = B;
            pos3 = C;
        } else if (A >= C && C >= B) {
            pos1 = A;
            pos2 = C;
            pos3 = B;
        } else if (B >= A && A >= C) {
            pos1 = B;
            pos2 = A;
            pos3 = C;
        } else if (B >= C && C >= A) {
            pos1 = B;
            pos2 = C;
            pos3 = A;
        } else if (C >= A && A >= B) {
            pos1 = C;
            pos2 = A;
            pos3 = B;
        } else {
            pos1 = C;
            pos2 = B;
            pos3 = A;
        }
        if (orden.equals("a")) {
            int aux = pos1;
            pos1 = pos3;
            pos3 = aux;
        }
        int vector[] = {pos1, pos2, pos3};
        return vector;
    }
    public static int metodoEntrada() {
        int entradaTeclado;
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextInt();
        return entradaTeclado;
    }
    public static String metodoEntradaString() {
        String entradaTeclado;
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.next();
        return entradaTeclado;
    }
}