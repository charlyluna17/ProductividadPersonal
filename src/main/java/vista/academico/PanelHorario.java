package vista.academico;

import modelo.academico.Clase;
import servicio.academico.HorarioService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class PanelHorario extends JPanel {

    private final JTable tablaHorario;
    private final HorarioService horarioService;
    private final String[] columnas = {"Hora", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
    private final String[] horas = {"08:00-09:00","09:00-10:00","10:00-11:00","11:00-12:00","12:00-13:00"};

    public PanelHorario(HorarioService horarioService) {
        this.horarioService = horarioService;
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 400));

        // Tabla inicial vacía
        tablaHorario = new JTable(new String[5][6], columnas);
        JScrollPane scrollPane = new JScrollPane(tablaHorario);
        add(scrollPane, BorderLayout.CENTER);

        // Botón para agregar clase
        JButton btnAgregar = new JButton("Agregar Clase");
        btnAgregar.addActionListener(this::agregarClase);
        add(btnAgregar, BorderLayout.SOUTH);

        actualizarHorario();
    }

    private void agregarClase(ActionEvent e) {
        // Pedir datos al usuario
        String nombre = JOptionPane.showInputDialog(this, "Nombre de la clase:");
        String hora = (String) JOptionPane.showInputDialog(this, "Hora:", "Selecciona hora",
                JOptionPane.PLAIN_MESSAGE, null, horas, horas[0]);
        String dia = (String) JOptionPane.showInputDialog(this, "Día:", "Selecciona día",
                JOptionPane.PLAIN_MESSAGE, null, new String[]{"Lunes","Martes","Miércoles","Jueves","Viernes"}, "Lunes");

        if (nombre != null && hora != null && dia != null) {
            horarioService.agregarClase(new Clase(nombre, hora, dia));
            actualizarHorario();
        }
    }

    public void actualizarHorario() {
        String[][] datos = new String[horas.length][columnas.length];
        for (int i = 0; i < horas.length; i++) {
            datos[i][0] = horas[i];
        }

        List<Clase> clases = horarioService.obtenerHorario();
        for (Clase c : clases) {
            int fila = -1;
            for (int i = 0; i < horas.length; i++) {
                if (horas[i].equals(c.getHora())) fila = i;
            }
            int columna = switch (c.getDia()) {
                case "Lunes" -> 1;
                case "Martes" -> 2;
                case "Miércoles" -> 3;
                case "Jueves" -> 4;
                case "Viernes" -> 5;
                default -> -1;
            };
            if (fila != -1 && columna != -1) {
                datos[fila][columna] = c.getNombre();
            }
        }

        tablaHorario.setModel(new DefaultTableModel(datos, columnas));
    }
}
