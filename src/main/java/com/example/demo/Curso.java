package com.example.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="tbl_curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Integer credito;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCredito() {
        return credito;
    }
    public void setCredito(Integer credito) {
        this.credito = credito;
    }
    public Carrera getCarrera() {
        return carrera;
    }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    

    
    
}
