package servicio.academico;

import modelo.academico.Clase;
import java.util.ArrayList;
import java.util.List;

public class HorarioService {

    private List<Clase> clases;

    public HorarioService() {
        clases = new ArrayList<>();
    }

    public List<Clase> obtenerHorario() {
        return clases;
    }

    public void agregarClase(Clase c) {
        clases.add(c);
    }

    public void eliminarClase(Clase c) {
        clases.remove(c);
    }

    public void actualizarClase(Clase original, Clase actualizada) {
        int index = clases.indexOf(original);
        if (index != -1) {
            clases.set(index, actualizada);
        }
    }
}
