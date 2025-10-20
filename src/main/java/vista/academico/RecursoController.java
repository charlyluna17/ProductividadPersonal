package vista.academico;

import modelo.academico.Recurso;
import servicio.academico.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recursos")
public class RecursoController {

    private final RecursoService recursoService;

    @Autowired
    public RecursoController(RecursoService recursoService) {
        this.recursoService = recursoService;
    }

    @GetMapping("/listar")
    public List<Recurso> listarRecursos() {
        return recursoService.listarRecursos();
    }

    @PostMapping("/agregar")
    public String agregarRecurso(@RequestBody Recurso recurso) {
        recursoService.agregarRecurso(recurso);
        return "Recurso agregado correctamente.";
    }

    @DeleteMapping("/eliminar/{nombre}")
    public String eliminarRecurso(@PathVariable String nombre) {
        boolean eliminado = recursoService.eliminarRecurso(nombre);
        return eliminado ? "Recurso eliminado." : "No se encontró el recurso.";
    }

    @GetMapping("/buscar/{nombre}")
    public Recurso buscarRecurso(@PathVariable String nombre) {
        return recursoService.buscarRecurso(nombre);
    }
}
