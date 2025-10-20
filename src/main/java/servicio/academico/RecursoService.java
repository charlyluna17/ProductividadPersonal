package servicio.academico;

import modelo.academico.Recurso;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecursoService {

    private final List<Recurso> recursos = new ArrayList<>();

    public List<Recurso> listarRecursos() {
        return recursos;
    }

    public void agregarRecurso(Recurso recurso) {
        recursos.add(recurso);
    }

    public boolean eliminarRecurso(String nombre) {
        return recursos.removeIf(r -> r.getNombre().equalsIgnoreCase(nombre));
    }

    public Recurso buscarRecurso(String nombre) {
        return recursos.stream()
                .filter(r -> r.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}
