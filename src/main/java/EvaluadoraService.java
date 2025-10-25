import java.util.ArrayList;
import java.util.List;
public class EvaluadoraService {
    private List<Evaluacion> evaluaciones = new ArrayList<>();

    public void agregarEvaluacion(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion);
    }

    public List<Evaluacion> listarEvaluaciones() {
        return evaluaciones;
    }
}
