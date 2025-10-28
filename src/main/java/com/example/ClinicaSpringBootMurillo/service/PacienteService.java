package com.example.ClinicaSpringBootMurillo.service;

import com.example.ClinicaSpringBootMurillo.modelos.Paciente;
import com.example.ClinicaSpringBootMurillo.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository repo;

    public PacienteService(PacienteRepository repo) {
        this.repo = repo;
    }

    public List<Paciente> findAll() {
        return repo.findAll();
    }

    public Paciente findById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Paciente save(Paciente paciente) {
        return repo.save(paciente);
    }

    public Paciente update(Long id, Paciente pacienteDetails) {
        Paciente paciente = findById(id);
        // Actualiza campos básicos; también podrías mapear todo con utilitarios
        paciente.setNombres(pacienteDetails.getNombres());
        paciente.setApellidos(pacienteDetails.getApellidos());
        paciente.setEmail(pacienteDetails.getEmail());
        paciente.setTelefono(pacienteDetails.getTelefono());
        paciente.setFechaNacimiento(pacienteDetails.getFechaNacimiento());
        paciente.setGenero(pacienteDetails.getGenero());
        paciente.setDireccion(pacienteDetails.getDireccion());
        paciente.setActivo(pacienteDetails.isActivo());
        paciente.setSaldoPendiente(pacienteDetails.getSaldoPendiente());
        paciente.setTipoSangre(pacienteDetails.getTipoSangre());
        paciente.setNumeroHijos(pacienteDetails.getNumeroHijos());
        // HistoriaClinica: si viene en el request, reemplazar o crear
        if (pacienteDetails.getHistoriaClinica() != null) {
            paciente.setHistoriaClinica(pacienteDetails.getHistoriaClinica());
        }
        return repo.save(paciente);
    }

    public void delete(Long id) {
        Paciente paciente = findById(id);
        repo.delete(paciente);
    }
}
