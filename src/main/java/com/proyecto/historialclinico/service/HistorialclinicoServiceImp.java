package com.proyecto.historialclinico.service;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  // <-- IMPORTANTE

import com.proyecto.historialclinico.entidades.Historialclinico;
import com.proyecto.historialclinico.repository.HistorialclinicoRepository;
import com.proyecto.historialclinico.service.HistorialclinicoService;
import com.proyecto.historialclinico.dto.HistorialclinicoDTO;


@Service
public class HistorialclinicoServiceImp implements HistorialclinicoService {

	
	 @Autowired
	    private HistorialclinicoRepository historialclinicorepository;
	@Override
	public Historialclinico agregarhistorial(HistorialclinicoDTO historialclinicoDTO) throws Exception {
	    String codigo = UUID.randomUUID().toString();
        return historialclinicorepository.save(historialclinicoDTO.toEntity(codigo));
    }

    @Override
    public Historialclinico buscarPoridpaciente(int idpaciente) throws Exception {
        Optional<Historialclinico> optHistorial = historialclinicorepository.findByIdpaciente(idpaciente);
        return optHistorial.orElseThrow(() -> new Exception("Paciente no encontrado con nombre: " + idpaciente));
    }

    @Override  
    public Historialclinico buscarPoridpacienteYidodontologo(int idpaciente, int idodontologo) throws Exception {
        Optional<Historialclinico> optHistorial = historialclinicorepository.findByIdpacienteAndIdodontologo(idpaciente, idodontologo);
        return optHistorial.orElseThrow(() -> new Exception("Paciente no encontrado con nombre y apellido: " + idpaciente + " " + idodontologo));
    }

    @Override
    public List<Historialclinico> listado() throws Exception {
        return historialclinicorepository.findAll();
    }

    @Override
    public void eliminar(int idhistorial) throws Exception {
        Optional<Historialclinico> optHistorial = historialclinicorepository.findById(idhistorial);
        Historialclinico historial = optHistorial.orElseThrow(() -> new Exception("Historial no encontrado con el ID: " + idhistorial));
        historialclinicorepository.delete(historial);
    }



  
	
    	

	
	}


