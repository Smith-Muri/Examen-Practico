package com.example.ClinicaSpringBootMurillo.modelos;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull @Size(min = 2, max = 100)
    private String nombres;

    @NotNull @Size(min = 2, max = 100)
    private String apellidos;

    @NotNull @Email
    private String email;

    @NotNull
    private String telefono;

    private LocalDate fechaNacimiento;

    private String genero;

    private String direccion;

    private boolean activo;

    private BigDecimal saldoPendiente;

    private String tipoSangre;

    private int numeroHijos;

    // Dueño de la relación: Paciente contiene la FK de HistoriaClinica
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "historia_clinica_id", referencedColumnName = "id")
    private HistoriaClinica historiaClinica;

    public Paciente() {}

    public Long getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isActivo() {
        return activo;
    }

    public BigDecimal getSaldoPendiente() {
        return saldoPendiente;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setSaldoPendiente(BigDecimal saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
