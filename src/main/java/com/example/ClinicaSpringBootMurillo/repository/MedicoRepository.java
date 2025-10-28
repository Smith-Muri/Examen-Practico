package com.example.ClinicaSpringBootMurillo.repository;

import com.example.ClinicaSpringBootMurillo.modelos.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MedicoRepository extends JpaRepository<Medico, Long> {}
