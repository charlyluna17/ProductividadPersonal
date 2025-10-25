import java.util.List;
public class ReporteService {
    private CalculadoraService calculadoraService = new CalculadoraService();

    public ReporteSemanal generarReporte(List<Evaluacion> evaluaciones) {
        double promedio = calculadoraService.calcularPromedio(evaluaciones);
        return new ReporteSemanal(evaluaciones, promedio);
    }
}
