package com.ProductividadPersonal.gestor_academico_productividad.modelo.academico.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    private String enlace;

    public Recurso() {}

    public Recurso(String nombre, String tipo, String enlace) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.enlace = enlace;
    }
}
