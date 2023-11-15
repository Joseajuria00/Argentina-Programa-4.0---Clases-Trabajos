package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Estados.CancionStateAuge;
import org.example.Estados.CancionStateNormal;
import org.example.Estados.CancionStateTendencia;

import java.time.Duration;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
public class Cancion {
    @Getter
    @Setter
    private String titulo;
    @Getter
    @Setter
    private String artista;
    @Getter
    @Setter
    private String album;
    @Getter
    @Setter
    private int anioAlbum;
    @Getter
    @Setter
    private int reproducciones;
    @Getter
    @Setter
    private int likes;
    @Getter
    @Setter
    private int dislikes;
    @Getter
    @Setter
    private LocalDateTime ultimaReproduccion;
    @Getter
    @Setter
    private CancionEstadoI estado;
    public Cancion(String titulo, String artista, String album, int anioAlbum, int reproducciones, int likes, int dislikes) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.anioAlbum = anioAlbum;
        this.reproducciones = reproducciones;
        this.likes = likes;
        this.dislikes = dislikes;
        this.ultimaReproduccion = LocalDateTime.now();
        this.estado = new CancionStateNormal();
    }
    public void obtenerDetalle() {
        if(this.reproducciones <= 1000 || fueReproducidaEnUltimas24Horas() == false) {
            this.estado = new CancionStateNormal();
        } else if (reproducciones <= 50000 || likes <= 20000) {
            if(this.dislikes >= 5000){
                this.estado = new CancionStateNormal();
            } else {
                this.estado = new CancionStateAuge();
            }
        } else {
            this.estado = new CancionStateTendencia();
        }
        this.estado.obtenerDetalle(this.artista, this.album, this.titulo, this.anioAlbum);
    }
    public boolean fueReproducidaEnUltimas24Horas() {
            return (this.ultimaReproduccion != null) && (Duration.between(this.ultimaReproduccion, LocalDateTime.now()).toHours() <= 24);
    }
}