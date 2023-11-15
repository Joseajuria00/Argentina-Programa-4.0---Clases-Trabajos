package org.example.Estados;

import org.example.CancionEstadoI;
import org.example.Icono;

public class CancionStateTendencia implements CancionEstadoI {
    private final String icon = Icono.FIRE.texto();

    @Override
    public void obtenerDetalle(String artista, String album, String titulo, Integer anioAlbum) {
        System.out.println(icon + " - " + titulo + " - " + artista + " (" + album + " - " + anioAlbum + ")");;
    }
}
