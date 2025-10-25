package com.ProductividadPersonal.gestor_academico_productividad.vista.academico;

import com.ProductividadPersonal.gestor_academico_productividad.modelo.academico.entidad.Clase;
import com.ProductividadPersonal.gestor_academico_productividad.servicio.academico.horarioservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/horarios")
public class horariocontroller {

    private final horarioservice horarioService;

    public horariocontroller(horarioservice horarioService) {
        this.horarioService = horarioService;
    }

    @GetMapping
    public List<Clase> listarClases() {
        return horarioService.listarClases();
    }

    @PostMapping
    public Clase guardarClase(@RequestBody Clase clase) {
        return horarioService.guardarClase(clase);
    }

    @DeleteMapping("/{id}")
    public void eliminarClase(@PathVariable Long id) {
        horarioService.eliminarClase(id);
    }
}