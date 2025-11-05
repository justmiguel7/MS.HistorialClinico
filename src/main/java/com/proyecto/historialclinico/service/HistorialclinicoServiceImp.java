package com.proyecto.historialclinico.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.historialclinico.entidades.Historialclinico;
import com.proyecto.historialclinico.repository.HistorialclinicoRepository;
import com.proyecto.historialclinico.dto.HistorialclinicoDTO;

@Service
public class HistorialclinicoServiceImp implements HistorialclinicoService {

    @Autowired
    private HistorialclinicoRepository historialRepo;

    @Override
    public Historialclinico agregarhistorial(HistorialclinicoDTO dto) throws Exception {
        return historialRepo.save(dto.toEntity());
    }

    @Override
    public List<Historialclinico> buscarPorDnipaciente(String dnipaciente) throws Exception {
        List<Historialclinico> historiales = historialRepo.findByDnipaciente(dnipaciente);
        if (historiales.isEmpty()) {
            throw new Exception("No se encontró historial del paciente con DNI: " + dnipaciente);
        }
        return historiales;
    }

    @Override
    public List<Historialclinico> buscarPorDnipacienteYdniodontologo(String dnipaciente, String dniodontologo) throws Exception {
        List<Historialclinico> historiales = historialRepo.findByDnipacienteAndDniodontologo(dnipaciente, dniodontologo);
        if (historiales.isEmpty()) {
            throw new Exception("No se encontró historial del paciente " + dnipaciente + " con odontólogo " + dniodontologo);
        }
        return historiales;
    }

    @Override
    public List<Historialclinico> listado() throws Exception {
        return historialRepo.findAll();
    }

    @Override
    public void eliminar(int idhistorial) throws Exception {
        Optional<Historialclinico> historial = historialRepo.findById(idhistorial);
        if (historial.isEmpty()) {
            throw new Exception("Historial no encontrado con ID: " + idhistorial);
        }
        historialRepo.delete(historial.get());
    }
    
    @Override
    public Historialclinico buscarPorId(int id) throws Exception {
        return historialRepo.findById(id)
            .orElseThrow(() -> new Exception("No se encontró el historial clínico con id: " + id));
    }

}
