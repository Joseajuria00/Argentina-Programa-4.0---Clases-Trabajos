package com.argentinaprograma.clase7.clase7.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contrato_prestador")
public class ContratoPrestador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "id_contrato", referencedColumnName = "id")
    private Contrato contrato;
    @OneToOne
    @JoinColumn(name = "id_prestador", referencedColumnName = "id")
    private Prestador prestador;
    private int estrellas;
    private String opinion;
}
