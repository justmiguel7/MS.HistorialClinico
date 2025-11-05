package com.proyecto.historialclinico.controller;

import com.proyecto.historialclinico.dto.HistorialTratamientoDTO;
import com.proyecto.historialclinico.entidades.HistorialTratamiento;
import com.proyecto.historialclinico.service.HistorialTratamientoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/historial-tratamiento")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class HistorialTratamientoController {

    private final HistorialTratamientoService historialTratamientoService;

    @PostMapping
    public ResponseEntity<HistorialTratamiento> guardar(@RequestBody HistorialTratamientoDTO dto) {
        return ResponseEntity.ok(historialTratamientoService.guardar(dto));
    }

    @GetMapping("/{idhistorial}")
    public ResponseEntity<List<HistorialTratamiento>> listarPorHistorial(@PathVariable int idhistorial) {
        return ResponseEntity.ok(historialTratamientoService.listarPorHistorial(idhistorial));
    }
}
