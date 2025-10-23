package com.proyecto.historialclinico.service;

import java.util.List;


import com.proyecto.historialclinico.entidades.Historialclinico;
import com.proyecto.historialclinico.dto.HistorialclinicoDTO;
import com.proyecto.historialclinico.dto.HistorialclinicoDTO;

public interface HistorialclinicoService {
	public Historialclinico agregarhistorial(HistorialclinicoDTO historialclinicoDTO ) throws Exception;

	public Historialclinico buscarPoridpaciente (int idpaciente) throws Exception;

	public Historialclinico buscarPoridpacienteYidodontologo (int idpaciente, int idodontologo) throws Exception;

	public List<Historialclinico> listado () throws Exception;

	public void eliminar (int idhistorial) throws Exception;



}
