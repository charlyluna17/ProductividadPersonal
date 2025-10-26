package com.ProductividadPersonal.gestor_academico_productividad.vista;

import javax.swing.*;

public class VistaPomodoro {
    private JPanel panel1; // Esta la crea IntelliJ, no la usamos
    private JPanel panelPrincipal; // Este es tu panel principal, ¡correcto!
    private JLabel lblTiempo;
    private JButton btnIniciar;
    private JButton btnDetener;

    // Variable para nuestro "cerebro"
    private com.ProductividadPersonal.gestor_academico_productividad.servicio.PomodoroServicio miServicioPomodoro;


    // --- 1. CONSTRUCTOR ---
    public VistaPomodoro() {

        // 1a. Creamos el objeto del servicio (el "cerebro")
        // y le pasamos el JLabel (lblTiempo) para que lo controle.
        this.miServicioPomodoro = new com.ProductividadPersonal.gestor_academico_productividad.servicio.PomodoroServicio(this.lblTiempo);

        // 1b. Conectamos el botón "Iniciar"
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miServicioPomodoro.iniciar();
            }
        });

        // 1c. Conectamos el botón "Detener"
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miServicioPomodoro.detener();
            }
        });
    }

    // --- 2. MÉTODO MAIN (PARA PROBAR) ---
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temporizador Pomodoro");
        // Usamos 'panelPrincipal', que es el nombre correcto que tú le diste
        frame.setContentPane(new VistaPomodoro().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}