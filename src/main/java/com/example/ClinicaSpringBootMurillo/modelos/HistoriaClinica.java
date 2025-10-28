package com.example.ClinicaSpringBootMurillo.modelos;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "historia_clinica")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroHistoria;

    private LocalDate fechaApertura;

    private String antecedentesPersonales;

    private String antecedentesFamiliares;

    private String alergias;

    private String inmunizaciones;

    private String tratamientosActuales;

    private String diagnosticosPrevios;

    private BigDecimal pesoKg;

    private BigDecimal estaturaM;

    private String observaciones;

    // No ponemos mappedBy porque Paciente es el dueño (FK en paciente)
    public HistoriaClinica() {}

    public Long getId() {
        return id;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public String getAntecedentesPersonales() {
        return antecedentesPersonales;
    }

    public String getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getInmunizaciones() {
        return inmunizaciones;
    }

    public String getTratamientosActuales() {
        return tratamientosActuales;
    }

    public String getDiagnosticosPrevios() {
        return diagnosticosPrevios;
    }

    public BigDecimal getPesoKg() {
        return pesoKg;
    }

    public BigDecimal getEstaturaM() {
        return estaturaM;
    }

    public String getObservaciones() {
        return observaciones;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void setAntecedentesPersonales(String antecedentesPersonales) {
        this.antecedentesPersonales = antecedentesPersonales;
    }

    public void setAntecedentesFamiliares(String antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setInmunizaciones(String inmunizaciones) {
        this.inmunizaciones = inmunizaciones;
    }

    public void setTratamientosActuales(String tratamientosActuales) {
        this.tratamientosActuales = tratamientosActuales;
    }

    public void setDiagnosticosPrevios(String diagnosticosPrevios) {
        this.diagnosticosPrevios = diagnosticosPrevios;
    }

    public void setPesoKg(BigDecimal pesoKg) {
        this.pesoKg = pesoKg;
    }

    public void setEstaturaM(BigDecimal estaturaM) {
        this.estaturaM = estaturaM;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
