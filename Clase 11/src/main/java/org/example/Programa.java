package org.example;

public class Programa {
    private String usuario;
    private final Accion accion = new Accion();
    private Boolean salir=false;
    public Programa(String usuario){
        this.usuario=usuario;
        menu();
    }
    public void menu(){
        FuncionesAux.limpiarConsola();
        System.out.println("1 - Leer mensajes");
        System.out.println("2 - Enviar mensaje");
        System.out.println("3 - Salir");
        setAccion();
    }
    public void setAccion(){
        System.out.print("Ingrese una acción: ");
        boolean ingresoCorrecto;
        do {
            ingresoCorrecto=true;
            int opcion = FuncionesAux.metodoEntrada();
            switch (opcion) {
                case 1 -> accion.leerMensaje();
                case 2 -> {
                    FuncionesAux.limpiarConsola();
                    System.out.print("Escribir mensaje: ");
                    accion.escribirMensaje(this.usuario);
                }
                case 3 -> this.salir = true;
                default -> ingresoCorrecto = false;
            }
        } while (!ingresoCorrecto);
    }
    public boolean salida(){
        return this.salir;
    }

}
