package com.argentinaprograma.clase6.clase6.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fecha;
    private String lugar;
    private String rangHorario;
    private EstadoTrabajoEnum estadoTrabajo;
    @ManyToMany
    @JoinTable(
            name = "contrato_tarea",
            joinColumns = @JoinColumn(name = "id_contrato"),
            inverseJoinColumns = @JoinColumn(name = "id_tarea"))
    private List<Tarea> tareaList;
    @ManyToMany
    @JoinTable(
            name = "contrato_prestador",
            joinColumns = @JoinColumn(name = "id_contrato"),
            inverseJoinColumns = @JoinColumn(name = "id_prestador"))
    private List<Prestador> prestadorList;
    @ManyToOne
    @JoinColumn(name = "id_consumidor", referencedColumnName = "id")
    private Consumidor consumidor;
}
