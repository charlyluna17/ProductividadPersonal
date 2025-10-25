package com.ProductividadPersonal.gestor_academico_productividad.servicio.academico;

import com.ProductividadPersonal.gestor_academico_productividad.modelo.academico.entidad.Clase;
import com.ProductividadPersonal.gestor_academico_productividad.modelo.academico.repositorio.ClaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class horarioservice {

    private final ClaseRepository claseRepository;

    public horarioservice(ClaseRepository claseRepository) {
        this.claseRepository = claseRepository;
    }

    public List<Clase> listarClases() {
        return claseRepository.findAll();
    }

    public Clase guardarClase(Clase clase) {
        return claseRepository.save(clase);
    }

    public Optional<Clase> obtenerClasePorId(Long id) {
        return claseRepository.findById(id);
    }

    public void eliminarClase(Long id) {
        claseRepository.deleteById(id);
    }
}