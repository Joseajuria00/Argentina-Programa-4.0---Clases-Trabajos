package com.argentinaprograma.clase7.clase7.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "tarea")
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcion;
    private double precio;
}
