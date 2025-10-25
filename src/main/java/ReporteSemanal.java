import java.util.List;
public class ReporteSemanal {
    private List<Evaluacion> evaluaciones;
    private double promedio;

    public ReporteSemanal(List<Evaluacion> evaluaciones, double promedio) {
        this.evaluaciones = evaluaciones;
        this.promedio = promedio;
    }

    public List<Evaluacion> getEvaluaciones() { return evaluaciones; }
    public void setEvaluaciones(List<Evaluacion> evaluaciones) { this.evaluaciones = evaluaciones; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }
}
