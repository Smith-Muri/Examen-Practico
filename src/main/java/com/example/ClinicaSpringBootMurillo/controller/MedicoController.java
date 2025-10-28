package com.example.ClinicaSpringBootMurillo.controller;

import com.example.ClinicaSpringBootMurillo.modelos.Medico;
import com.example.ClinicaSpringBootMurillo.service.MedicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/medicos")
@CrossOrigin
public class MedicoController {

    private final MedicoService service;

    public MedicoController(MedicoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Medico> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Medico> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Medico> create(@RequestBody Medico medico) {
        Medico saved = service.save(medico);
        return ResponseEntity.status(201).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medico> update(@PathVariable Long id, @RequestBody Medico medico) {
        return ResponseEntity.ok(service.update(id, medico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
