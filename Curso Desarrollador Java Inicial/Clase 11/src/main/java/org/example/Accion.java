package org.example;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Accion{
    @SneakyThrows
    public void leerMensaje(){
        FuncionesAux.limpiarConsola();
        System.out.println(Files.readString(Paths.get("mensajes.txt")));
        FuncionesAux.metodoEntradaString();
    }
    @SneakyThrows
    public void escribirMensaje(String usuario){
        String mensaje = FuncionesAux.metodoEntradaString();
        if (mensaje.length() > 0){
            Path path = Paths.get("mensajes.txt");
            if(Files.readAllLines(path).size()==0){
                Files.writeString(path,usuario + " > " + mensaje, StandardOpenOption.APPEND);
            } else {
                Files.writeString(path,"\n" + usuario + " > " + mensaje, StandardOpenOption.APPEND);
            }
        } else {
            FuncionesAux.limpiarConsola();
            System.out.print("Ingresaste un mensaje vacío. Vuelve a ingresar el mensaje: ");
            escribirMensaje(usuario);
        }
    }
}
