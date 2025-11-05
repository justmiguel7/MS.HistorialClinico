package com.proyecto.historialclinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.historialclinico.entidades.HistorialTratamiento;
import java.util.List;

public interface HistorialTratamientoRepository extends JpaRepository<HistorialTratamiento, Integer> {

    List<HistorialTratamiento> findByIdhistorial(int idhistorial);
}
