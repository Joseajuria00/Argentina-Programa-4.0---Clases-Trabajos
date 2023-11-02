package org.example;

public class Main {
    public static void main(String[] args) {
        boolean salir=false;
        String usuario = ingresarUsuario();//Si el ejercicio pedía el nombre cada vez que se ejecutan las opciones, bajando esto 1 líneas funciona de esa manera.
        while(!salir){
            Programa programa = new Programa(usuario);
            salir = programa.salida();
        }
    }
    public static String ingresarUsuario(){ //No me quedo claro si el nombre se debe volver a ingresar cada vez que se ejecutan las opciones o si al principio del proceso está bien. Así que lo deje solo al principio.
        FuncionesAux.limpiarConsola();
        System.out.println("Bienvenido!!");
        System.out.print("Ingrese su nombre y apellido: ");
        String usuario = FuncionesAux.metodoEntradaString();
        while (usuario.length() == 0) {
            System.out.println("Los datos no son válidos, por favor ingrese su nombre y apellido: ");
            usuario = FuncionesAux.metodoEntradaString();
        }
        return usuario;
    }
}