package org.example;

import java.util.Scanner;

public class FuncionesAux {
    public static int metodoEntrada(){
        int entradaTeclado;
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextInt();
        return entradaTeclado;
    }
    public static String metodoEntradaString(){
        String entradaTeclado;
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine().trim();
        return entradaTeclado;
    }
    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) System.out.println();
    }
}
