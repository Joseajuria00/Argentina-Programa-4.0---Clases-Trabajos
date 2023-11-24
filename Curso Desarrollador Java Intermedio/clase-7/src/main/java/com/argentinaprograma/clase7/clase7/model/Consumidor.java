package com.argentinaprograma.clase7.clase7.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "consumidor")
public class Consumidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String email;

}
