package com.proyecto.historialclinico.dto;

import java.time.LocalDateTime;
import java.util.List;
import com.proyecto.historialclinico.entidades.Historialclinico;
import lombok.Data;

@Data
public class HistorialclinicoDTO {

    private int idhistorial;
    private String dnipaciente;
    private String dniodontologo;
    private int idturno;
    private List<Integer> idtratamientos; // ahora es lista de IDs
    private String motivodeconsulta;
    private LocalDateTime fechadeconsulta;
    private String diagnostico;
    private String observaciones;
    private String alergias;
    private String antecedentesmedicos;

    public Historialclinico toEntity() {
        return new Historialclinico(
            this.dnipaciente,
            this.dniodontologo,
            this.idturno,
            this.idtratamientos,
            this.motivodeconsulta,
            this.fechadeconsulta,
            this.diagnostico,
            this.observaciones,
            this.alergias,
            this.antecedentesmedicos
        );
    }

    public HistorialclinicoDTO() {}

    public HistorialclinicoDTO(String dnipaciente, String dniodontologo, int idturno, List<Integer> idtratamientos,
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
