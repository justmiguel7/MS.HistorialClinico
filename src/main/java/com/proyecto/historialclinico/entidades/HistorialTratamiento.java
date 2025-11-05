package com.proyecto.historialclinico.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "historial_tratamiento")
@Data
@NoArgsConstructor
public class HistorialTratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int idhistorial;
    private int idtratamiento;

    public HistorialTratamiento(int idhistorial, int idtratamiento) {
        this.idhistorial = idhistorial;
        this.idtratamiento = idtratamiento;
    }
}
