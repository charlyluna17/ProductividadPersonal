package vista.academico;

import modelo.academico.Clase;
import servicio.academico.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/horario")
public class HorarioController {

    private final HorarioService horarioService;

    @Autowired
    public HorarioController(HorarioService horarioService) {
        this.horarioService = horarioService;
    }

    // Listar todas las clases
    @GetMapping("/listar")
    public List<Clase> listarClases() {
        return horarioService.obtenerHorario(); // aquí se usa el método correcto
    }

    // Agregar una nueva clase
    @PostMapping("/agregar")
    public String agregarClase(@RequestBody Clase clase) {
        horarioService.agregarClase(clase);
        return "Clase agregada correctamente.";
    }

    // Eliminar clase por nombre
    @DeleteMapping("/eliminar/{nombre}")
    public String eliminarClase(@PathVariable String nombre) {
        Clase claseEncontrada = horarioService.obtenerHorario().stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);

        if (claseEncontrada != null) {
            horarioService.eliminarClase(claseEncontrada);
            return "Clase eliminada correctamente.";
        } else {
            return "Clase no encontrada.";
        }
    }

    // Buscar clase por nombre
    @GetMapping("/buscar/{nombre}")
    public Clase buscarClase(@PathVariable String nombre) {
        return horarioService.obtenerHorario().stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
}
