package com.ProductividadPersonal.gestor_academico_productividad.servicio.academico;

import com.ProductividadPersonal.gestor_academico_productividad.modelo.academico.entidad.Recurso;
import com.ProductividadPersonal.gestor_academico_productividad.modelo.academico.repositorio.RecursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class recursoservice {

    private final RecursoRepository recursoRepository;

    public recursoservice(RecursoRepository recursoRepository) {
        this.recursoRepository = recursoRepository;
    }

    public List<Recurso> listarRecursos() {
        return recursoRepository.findAll();
    }

    public Recurso guardarRecurso(Recurso recurso) {
        return recursoRepository.save(recurso);
    }

    public Optional<Recurso> obtenerRecursoPorId(Long id) {
        return recursoRepository.findById(id);
    }

    public void eliminarRecurso(Long id) {
        recursoRepository.deleteById(id);
    }
}