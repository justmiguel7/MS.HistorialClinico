package com.proyecto.historialclinico.dto;

import java.time.LocalDateTime;
import com.proyecto.historialclinico.entidades.Historialclinico;
import lombok.Data;

@Data
public class HistorialclinicoDTO {

    private int idhistorial;
    private String dnipaciente;
    private String dniodontologo;
    private int idturno;
    private int idtratamiento;
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
            this.idtratamiento,
            this.motivodeconsulta,
            this.fechadeconsulta,
            this.diagnostico,
            this.observaciones,
            this.alergias,
            this.antecedentesmedicos
        );
    }

    public HistorialclinicoDTO() {}

    public HistorialclinicoDTO(String dnipaciente, String dniodontologo, int idturno, int idtratamiento,
                               String motivodeconsulta, LocalDateTime fechadeconsulta, String diagnostico,
                               String observaciones, String alergias, String antecedentesmedicos) {
        this.dnipaciente = dnipaciente;
        this.dniodontologo = dniodontologo;
        this.idturno = idturno;
        this.idtratamiento = idtratamiento;
        this.motivodeconsulta = motivodeconsulta;
        this.fechadeconsulta = fechadeconsulta;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
        this.alergias = alergias;
        this.antecedentesmedicos = antecedentesmedicos;
    }
}
