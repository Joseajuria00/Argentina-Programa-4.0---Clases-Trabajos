package com.argentinaprograma.clase6.clase6.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tarea")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcion;
    private double precio;
}
