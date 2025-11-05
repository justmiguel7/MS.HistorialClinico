package com.proyecto.historialclinico.service;

import com.proyecto.historialclinico.dto.HistorialTratamientoDTO;
import com.proyecto.historialclinico.entidades.HistorialTratamiento;
import com.proyecto.historialclinico.repository.HistorialTratamientoRepository;
import com.proyecto.historialclinico.service.HistorialTratamientoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistorialTratamientoServiceImp implements HistorialTratamientoService {

    private final HistorialTratamientoRepository historialTratamientoRepository;

    @Override
    public HistorialTratamiento guardar(HistorialTratamientoDTO dto) {
        HistorialTratamiento historialTratamiento = new HistorialTratamiento(dto.getIdhistorial(), dto.getIdtratamiento());
        return historialTratamientoRepository.save(historialTratamiento);
    }

    @Override
    public List<HistorialTratamiento> listarPorHistorial(int idhistorial) {
        return historialTratamientoRepository.findByIdhistorial(idhistorial);
    }
}
