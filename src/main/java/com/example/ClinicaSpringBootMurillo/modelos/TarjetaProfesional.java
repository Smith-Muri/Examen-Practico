package com.example.ClinicaSpringBootMurillo.modelos;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "tarjeta_profesional")
public class TarjetaProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroTarjeta;

    private LocalDate fechaExpedicion;

    private LocalDate fechaVencimiento;

    private String entidadExpide;

    private String pais;

    private String estado;

    private String observaciones;

    private boolean validada;

    private String claseProfesional;

    private String categoria;

    public TarjetaProfesional() {}

    public Long getId() {
        return id;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getEntidadExpide() {
        return entidadExpide;
    }

    public String getPais() {
        return pais;
    }

    public String getEstado() {
        return estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public boolean isValidada() {
        return validada;
    }

    public String getClaseProfesional() {
        return claseProfesional;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setEntidadExpide(String entidadExpide) {
        this.entidadExpide = entidadExpide;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setValidada(boolean validada) {
        this.validada = validada;
    }

    public void setClaseProfesional(String claseProfesional) {
        this.claseProfesional = claseProfesional;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
