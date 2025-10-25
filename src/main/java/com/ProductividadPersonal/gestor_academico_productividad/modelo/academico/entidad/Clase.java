package com.ProductividadPersonal.gestor_academico_productividad.modelo.academico.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String hora;
    private String dias;

    public Clase() {}

    public Clase(String nombre, String hora, String dias) {
        this.nombre = nombre;
        this.hora = hora;
        this.dias = dias;
    }
}