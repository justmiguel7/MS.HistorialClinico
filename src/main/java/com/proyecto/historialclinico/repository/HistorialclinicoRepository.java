package com.proyecto.historialclinico.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.historialclinico.entidades.Historialclinico;

public interface HistorialclinicoRepository extends JpaRepository<Historialclinico, Integer> {

    Optional<Historialclinico> findByIdpaciente(int idpaciente) throws Exception; 

    Optional<Historialclinico> findByIdpacienteAndIdodontologo(int idpaciente, int idodontologo) throws Exception; 
}
