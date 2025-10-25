package com.proyecto.historialclinico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.historialclinico.entidades.Historialclinico;
import com.proyecto.historialclinico.dto.HistorialclinicoDTO;
import com.proyecto.historialclinico.service.HistorialclinicoService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", allowCredentials = "false")
@RequestMapping("/historialclinico")
public class HistorialclinicoController {

	@Autowired
	private HistorialclinicoService historialclinicoService;
		
	@RequestMapping(value="/agregar", method={RequestMethod.POST})
	public ResponseEntity<HistorialclinicoDTO> persistirhistorialclinico (@Valid @RequestBody  HistorialclinicoDTO historialclinicoDTO ) throws Exception{
	  historialclinicoService.agregarhistorial(historialclinicoDTO);
	  	return new ResponseEntity<HistorialclinicoDTO>(historialclinicoDTO, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/buscarPaciente/{dnipaciente}", method={RequestMethod.GET})
	public ResponseEntity<Historialclinico> busarPorDniPaciente ( @PathVariable("dnipaciente") String dnipaciente) throws Exception{
		Historialclinico historial = historialclinicoService.buscarPorDnipaciente(dnipaciente);
		  return new ResponseEntity<>(historial,HttpStatus.OK);
	}
	
	@RequestMapping(value="/buscarOdontologo/{dniodontologo}", method={RequestMethod.GET})
	public ResponseEntity<Historialclinico> busarPorDniOdontologo ( @PathVariable("dniodontologo") String dniodontologo) throws Exception{
		Historialclinico historial = historialclinicoService.buscarPorDniodontologo(dniodontologo);
		  return new ResponseEntity<>(historial,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/buscarPacienteYOdontologo/{dnipaciente}/{dniodontologo}", method={RequestMethod.GET})
	public ResponseEntity<Historialclinico> buscarPorDniPacienteYDniOdontologo ( @PathVariable("dnipaciente") String dnipaciente, @PathVariable("dniodontologo") String dniodontologo) throws Exception{
		Historialclinico historial = historialclinicoService.buscarPorDnipacienteyDniodontologo(dnipaciente, dniodontologo);
		  return new ResponseEntity<>(historial,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/listado", method={RequestMethod.GET})
	public ResponseEntity<List<Historialclinico>> listado() throws Exception{
		  return new ResponseEntity<>(historialclinicoService.listado(),HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/eliminar/{id}", method={RequestMethod.GET})
	public ResponseEntity<Historialclinico> eliminarhistorial(@PathVariable("idhistorial") int idhistorial) throws Exception{
		historialclinicoService.eliminar(idhistorial);
		  return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
}

