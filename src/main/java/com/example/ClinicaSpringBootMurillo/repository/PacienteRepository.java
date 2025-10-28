package com.example.ClinicaSpringBootMurillo.repository;

import com.example.ClinicaSpringBootMurillo.modelos.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PacienteRepository extends JpaRepository<Paciente, Long> {}
