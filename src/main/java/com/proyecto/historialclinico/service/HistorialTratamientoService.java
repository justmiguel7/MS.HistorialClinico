package com.proyecto.historialclinico.service;

import com.proyecto.historialclinico.dto.HistorialTratamientoDTO;
import com.proyecto.historialclinico.entidades.HistorialTratamiento;
import java.util.List;

public interface HistorialTratamientoService {

    HistorialTratamiento guardar(HistorialTratamientoDTO dto);
    List<HistorialTratamiento> listarPorHistorial(int idhistorial);
}
