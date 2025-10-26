package com.proyecto.historialclinico.service;

import java.util.List;
import com.proyecto.historialclinico.entidades.Historialclinico;
import com.proyecto.historialclinico.dto.HistorialclinicoDTO;

public interface HistorialclinicoService {
    Historialclinico agregarhistorial(HistorialclinicoDTO historialclinicoDTO) throws Exception;
    Historialclinico buscarPorDnipaciente(String dnipaciente) throws Exception;
    Historialclinico buscarPorDnipacienteYdniodontologo(String dnipaciente, String dniodontologo) throws Exception;
    List<Historialclinico> listado() throws Exception;
    void eliminar(int idhistorial) throws Exception;
}
