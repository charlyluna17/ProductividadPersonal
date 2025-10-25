import javax.swing.*;
import java.awt.*;
public class PanelReportes extends JPanel {
    private JTextArea areaReporte;

    public PanelReportes() {
        setLayout(new BorderLayout());
        areaReporte = new JTextArea();
        add(new JScrollPane(areaReporte), BorderLayout.CENTER);
    }

    public void mostrarReporte(ReporteSemanal reporte) {
        StringBuilder sb = new StringBuilder("Reporte Semanal:\n");
        reporte.getEvaluaciones().forEach(e ->
                sb.append(e.getNombre())
                        .append(" - Nota: ").append(e.getCalificacion())
                        .append(" (Peso: ").append(e.getValor()).append(")\n")
        );
        sb.append("Promedio: ").append(reporte.getPromedio());
        areaReporte.setText(sb.toString());
    }
}
