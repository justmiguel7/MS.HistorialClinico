package com.proyecto.historialclinico.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.historialclinico.entidades.Historialclinico;

public interface HistorialclinicoRepository extends JpaRepository<Historialclinico, Integer> {

    Optional<Historialclinico> findByDnipaciente(String dnipaciente) throws Exception; 
    
    Optional<Historialclinico> findByDniodontologo(String dniodontologo) throws Exception; 

    Optional<Historialclinico> findByDnipacienteAndDniodontologo(String dnipaciente, String dniodontologo) throws Exception; 
}
