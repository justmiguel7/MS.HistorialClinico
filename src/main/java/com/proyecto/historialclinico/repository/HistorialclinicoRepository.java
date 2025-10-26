package com.proyecto.historialclinico.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.historialclinico.entidades.Historialclinico;

public interface HistorialclinicoRepository extends JpaRepository<Historialclinico, Integer> {

	Optional<Historialclinico> findByDnipaciente(String dnipaciente);
	Optional<Historialclinico> findByDnipacienteAndDniodontologo(String dnipaciente, String dniodontologo);

}
