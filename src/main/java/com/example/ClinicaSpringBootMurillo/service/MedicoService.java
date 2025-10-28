package com.example.ClinicaSpringBootMurillo.service;

import com.example.ClinicaSpringBootMurillo.modelos.Medico;
import com.example.ClinicaSpringBootMurillo.repository.MedicoRepository;
import com.example.clinica.service.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicoService {

    private final MedicoRepository repo;

    public MedicoService(MedicoRepository repo) {
        this.repo = repo;
    }

    public List<Medico> findAll() { return repo.findAll(); }

    public Medico findById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Medico no encontrado con id " + id));
    }

    public Medico save(Medico m) { return repo.save(m); }

    public Medico update(Long id, Medico medicoDetails) {
        Medico medico = findById(id);
        medico.setNombres(medicoDetails.getNombres());
        medico.setApellidos(medicoDetails.getApellidos());
        medico.setEmail(medicoDetails.getEmail());
        medico.setTelefono(medicoDetails.getTelefono());
        medico.setEspecialidad(medicoDetails.getEspecialidad());
        medico.setAniosExperiencia(medicoDetails.getAniosExperiencia());
        medico.setDisponible(medicoDetails.isDisponible());
        medico.setFechaIngreso(medicoDetails.getFechaIngreso());
        medico.setSalario(medicoDetails.getSalario());
        medico.setHorario(medicoDetails.getHorario());
        medico.setCampus(medicoDetails.getCampus());
        if (medicoDetails.getTarjetaProfesional() != null) {
            medico.setTarjetaProfesional(medicoDetails.getTarjetaProfesional());
        }
        return repo.save(medico);
    }

    public void delete(Long id) {
        Medico medico = findById(id);
        repo.delete(medico);
    }
}
