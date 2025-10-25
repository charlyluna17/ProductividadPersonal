package com.ProductividadPersonal.gestor_academico_productividad.vista.academico;

import com.ProductividadPersonal.gestor_academico_productividad.modelo.academico.entidad.Recurso;
import com.ProductividadPersonal.gestor_academico_productividad.servicio.academico.recursoservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos")
public class recursocontroller {

    private final recursoservice recursoservice;

    public recursocontroller(recursoservice recursoservice) {
        this.recursoservice = recursoservice;
    }

    @GetMapping
    public List<Recurso> listarRecursos() {
        return recursoservice.listarRecursos();
    }

    @PostMapping
    public Recurso guardarRecurso(@RequestBody Recurso recurso) {
        return recursoservice.guardarRecurso(recurso);
    }

    @DeleteMapping("/{id}")
    public void eliminarRecurso(@PathVariable Long id) {
        recursoservice.eliminarRecurso(id);
    }
}