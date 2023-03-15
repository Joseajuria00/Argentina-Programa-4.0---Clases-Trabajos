import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        float ingresos = 489083;
        int vehiculos = 3;
        int inmuebles = 3;
        boolean poseer = true;
        boolean pertenece = false;
        if (ingresos>=489083 && vehiculos>=3 && inmuebles >=3 && poseer == true){
            pertenece = true;
        }
        if (pertenece == true){
            System.out.println("Pertenece al segmento de ingresos altos");
        }
        else{
            System.out.println("No pertenece al segmento de ingresos altos");
        }
         */
        boolean pertenece = false;
        if(ingresos() && vehiculos() && inmuebles() && lujo()){
            pertenece = true;
        }
        if (pertenece == true){
            System.out.println("Pertenece al segmento de ingresos altos");
        }
        else{
            System.out.println("No pertenece al segmento de ingresos altos");
        }
    }
    public static boolean ingresos(){
        System.out.print("Ingresos mensuales totales del hogar: ");
        if (metodoEntrada() >= 489083){
            return true;
        } else {
            return false;
        }
    }
    public static boolean vehiculos(){
        System.out.print("Cantidad de vehículos con antigüedad menor a 5 años: ");
        if (metodoEntrada() >= 3){
            return true;
        } else {
            return false;
        }
    }
    public static boolean inmuebles(){
        System.out.print("Cantidad de inmuebles: ");
        if (metodoEntrada() >= 3){
            return true;
        } else {
            return false;
        }
    }
    public static boolean lujo(){
        System.out.print("Posee una embarcación, una aeronave de lujo o es " +
                "titular de activos societarios que demuestren capacidad económica plena: ");
        String respuesta = metodoEntradaString();
        if (respuesta.equals("si")){
            return true;
        } else if (respuesta.equals("no")) {
            return false;
        } else {
            return lujo();
        }
    }
    public static int metodoEntrada(){
        int entradaTeclado;
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextInt();
        return entradaTeclado;
    }
    public static String metodoEntradaString(){
        String entradaTeclado;
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.next();
        return entradaTeclado;
    }
}