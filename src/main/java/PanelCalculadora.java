import   javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelCalculadora extends JPanel {
    private JTextArea areaResultados;
    private CalculadoraService calculadoraService;

    public PanelCalculadora(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
        setLayout(new BorderLayout());

        areaResultados = new JTextArea();
        add(new JScrollPane(areaResultados), BorderLayout.CENTER);
    }

    public void mostrarPromedio(List<Evaluacion> evaluaciones) {
        double promedio = calculadoraService.calcularPromedio(evaluaciones);
        areaResultados.setText("Promedio calculado: " + promedio);
    }
}
