package com.example.ClinicaSpringBootMurillo.modelos;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull @Size(min=2, max=100)
    private String nombres;

    @NotNull @Size(min=2, max=100)
    private String apellidos;

    @NotNull @Email
    private String email;

    private String telefono;

    private String especialidad;

    private int añosExperiencia;

    private boolean disponible;

    private LocalDate fechaIngreso;

    private BigDecimal salario;

    private String horario;

    private String campus;

    // Medico es dueño de la relación con TarjetaProfesional
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tarjeta_profesional_id", referencedColumnName = "id")
    private TarjetaProfesional tarjetaProfesional;

    public Medico() {}

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

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosExperiencia() {
        return añosExperiencia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getHorario() {
        return horario;
    }

    public String getCampus() {
        return campus;
    }

    public TarjetaProfesional getTarjetaProfesional() {
        return tarjetaProfesional;
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

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAniosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setTarjetaProfesional(TarjetaProfesional tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
}
