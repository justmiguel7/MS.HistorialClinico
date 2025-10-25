package com.proyecto.historialclinico.service;

import java.util.List;
import com.proyecto.historialclinico.entidades.Historialclinico;
import com.proyecto.historialclinico.dto.HistorialclinicoDTO;

public interface HistorialclinicoService {
	public Historialclinico agregarhistorial(HistorialclinicoDTO historialclinicoDTO ) throws Exception;

	public Historialclinico buscarPorDnipaciente (String dnipaciente) throws Exception;
	
	public Historialclinico buscarPorDniodontologo (String dniodontologo) throws Exception;

	public Historialclinico buscarPorDnipacienteyDniodontologo (String dnipaciente, String dniodontologo) throws Exception;

	public List<Historialclinico> listado () throws Exception;

	public void eliminar (int idhistorial) throws Exception;

}
