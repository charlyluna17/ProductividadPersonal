import java.util.List;

public class CalculadoraService {

    // Calcula el promedio ponderado de las evaluaciones
    public double calcularPromedio(List<Evaluacion> evaluaciones) {
        double suma = 0;
        double totalPesos = 0;

        for (Evaluacion e : evaluaciones) {
            suma += e.getCalificacion() * e.getValor();
            totalPesos += e.getValor();
        }

        return totalPesos > 0 ? suma / totalPesos : 0;
    }
}
