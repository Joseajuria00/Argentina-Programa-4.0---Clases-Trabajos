package org.example.Estados;

import org.example.CancionEstadoI;
import org.example.Icono;

public class CancionStateAuge implements CancionEstadoI {
    private final String icon = Icono.ROCKET.texto();
    @Override
    public void obtenerDetalle(String artista, String album, String titulo, Integer anioAlbum) {
        System.out.println(icon + " - " + artista + " - " + titulo + " (" + album + " - " + anioAlbum + ")");;
    }
}
