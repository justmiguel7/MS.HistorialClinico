package com.proyecto.historialclinico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.proyecto.historialclinico.entidades.Historialclinico;
import com.proyecto.historialclinico.dto.HistorialclinicoDTO;
import com.proyecto.historialclinico.service.HistorialclinicoService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/historialclinico")
public class HistorialclinicoController {

    @Autowired
    private HistorialclinicoService historialService;

    @PostMapping("/agregar")
    public ResponseEntity<HistorialclinicoDTO> persistirhistorialclinico(
            @Valid @RequestBody HistorialclinicoDTO historialclinicoDTO) throws Exception {
        historialService.agregarhistorial(historialclinicoDTO);
        return new ResponseEntity<>(historialclinicoDTO, HttpStatus.CREATED);
    }


    @GetMapping("/buscar/{dnipaciente}")
    public ResponseEntity<Historialclinico> buscarPorPaciente(@PathVariable String dnipaciente) throws Exception {
        return new ResponseEntity<>(historialService.buscarPorDnipaciente(dnipaciente), HttpStatus.OK);
    }

    @GetMapping("/buscarPorOdontologo/{dnipaciente}/{dniodontologo}")
    public ResponseEntity<Historialclinico> buscarPorPacienteYOdontologo(
            @PathVariable String dnipaciente, @PathVariable String dniodontologo) throws Exception {
        return new ResponseEntity<>(historialService.buscarPorDnipacienteYdniodontologo(dnipaciente, dniodontologo), HttpStatus.OK);
    }

    @GetMapping("/listado")
    public ResponseEntity<List<Historialclinico>> listado() throws Exception {
        return new ResponseEntity<>(historialService.listado(), HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{idhistorial}")
    public ResponseEntity<Void> eliminar(@PathVariable int idhistorial) throws Exception {
        historialService.eliminar(idhistorial);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
