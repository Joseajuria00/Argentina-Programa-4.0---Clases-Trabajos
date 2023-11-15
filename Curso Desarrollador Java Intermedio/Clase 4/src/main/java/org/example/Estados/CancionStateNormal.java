package org.example.Estados;

import org.example.CancionEstadoI;
import org.example.Icono;

public class CancionStateNormal implements CancionEstadoI {
    private final String icon = Icono.MUSICAL_NOTE.texto();
    @Override
    public void obtenerDetalle(String artista, String album, String titulo, Integer anioAlbum) {
        System.out.println(icon + " - " + artista + " - " + album + " - " + titulo);
    }
}
