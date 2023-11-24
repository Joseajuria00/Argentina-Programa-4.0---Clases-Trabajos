package com.argentinaprograma.clase7.clase7.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "prestador")
@AllArgsConstructor
@NoArgsConstructor
public class Prestador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String disponibilidad;
    private String radioCobertura;
    private LocalDate fechaNacimiento;
    private String tipoDoc;
    private long nroDoc;
    private long cuit;
    private String telefono;
    private String horario;
}
