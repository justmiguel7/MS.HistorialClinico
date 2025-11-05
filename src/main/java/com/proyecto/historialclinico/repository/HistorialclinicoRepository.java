package com.proyecto.historialclinico.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.historialclinico.entidades.Historialclinico;

@Repository
public interface HistorialclinicoRepository extends JpaRepository<Historialclinico, Integer> {

    List<Historialclinico> findByDnipaciente(String dnipaciente);

    List<Historialclinico> findByDnipacienteAndDniodontologo(String dnipaciente, String dniodontologo);
}
