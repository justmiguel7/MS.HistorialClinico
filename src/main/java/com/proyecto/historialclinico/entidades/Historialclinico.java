package com.proyecto.historialclinico.entidades;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Historialclinico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idhistorial;

    @Column(nullable = false)
    private String dnipaciente;

    @Column(nullable = false)
    private String dniodontologo;

    @Column(name = "Idturno")
    private int idturno;

    @ElementCollection
    @Column(name = "id_tratamientos")
    private List<Integer> idtratamientos;

    private String motivodeconsulta;
    private LocalDateTime fechadeconsulta;
    private String diagnostico;
    private String observaciones;
    private String alergias;
    private String antecedentesmedicos;

    public Historialclinico() {}

    public Historialclinico(String dnipaciente, String dniodontologo, int idturno, List<Integer> idtratamientos,
                            String motivodeconsulta, LocalDateTime fechadeconsulta, String diagnostico,
                            String observaciones, String alergias, String antecedentesmedicos) {
        this.dnipaciente = dnipaciente;
        this.dniodontologo = dniodontologo;
        this.idturno = idturno;
        this.idtratamientos = idtratamientos;
        this.motivodeconsulta = motivodeconsulta;
        this.fechadeconsulta = fechadeconsulta;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.alergias = alergias;
        this.antecedentesmedicos = antecedentesmedicos;
    }
}
