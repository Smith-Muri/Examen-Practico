package com.example.ClinicaSpringBootMurillo.controller;

import com.example.ClinicaSpringBootMurillo.modelos.Paciente;
import com.example.ClinicaSpringBootMurillo.dto.PacienteDTO;
import com.example.ClinicaSpringBootMurillo.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pacientes")
@CrossOrigin // habilita CORS para este controlador (también haremos global)
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    // GET /api/pacientes
    @GetMapping
    public List<PacienteDTO> getAll() {
        return service.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    // GET /api/pacientes/{id}
    @GetMapping("/{id}")
    public ResponseEntity<PacienteDTO> getById(@PathVariable Long id) {
        Paciente p = service.findById(id);
        return ResponseEntity.ok(toDTO(p));
    }

    // POST /api/pacientes
    @PostMapping
    public ResponseEntity<PacienteDTO> create(@RequestBody Paciente paciente) {
        Paciente saved = service.save(paciente);
        return ResponseEntity.status(201).body(toDTO(saved));
    }

    // PUT /api/pacientes/{id}
    @PutMapping("/{id}")
    public ResponseEntity<PacienteDTO> update(@PathVariable Long id, @RequestBody Paciente paciente) {
        Paciente updated = service.update(id, paciente);
        return ResponseEntity.ok(toDTO(updated));
    }

    // DELETE /api/pacientes/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Mapper simple
    private PacienteDTO toDTO(Paciente p) {
        PacienteDTO dto = new PacienteDTO();
        dto.setId(p.getId());
        dto.setNombres(p.getNombres());
        dto.setApellidos(p.getApellidos());
        dto.setEmail(p.getEmail());
        dto.setTelefono(p.getTelefono());
        dto.setFechaNacimiento(p.getFechaNacimiento());
        dto.setActivo(p.isActivo());
        dto.setSaldoPendiente(p.getSaldoPendiente());
        return dto;
    }
}
