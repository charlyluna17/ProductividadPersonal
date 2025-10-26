package com.ProductividadPersonal.gestor_academico_productividad.servicio;

import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase es el "cerebro" del Pomodoro.
 * Maneja la lógica de la cuenta regresiva usando un Timer de Swing.
 */
public class PomodoroServicio {

    private Timer timer;          // El objeto que hace la cuenta regresiva
    private int minutosRestantes;
    private int segundosRestantes;

    private boolean enDescanso = false; // Para saber si estamos en tiempo de enfoque o descanso

    // Referencia a la etiqueta (JLabel) de la Vista que vamos a actualizar
    private JLabel lblTiempo;

    /**
     * Constructor. Recibe el JLabel de la Vista para poder
     * actualizarlo directamente.
     */
    public PomodoroServicio(JLabel lblTiempo) {
        this.lblTiempo = lblTiempo;

        // Inicializamos el temporizador para que se "dispare" cada 1000ms (1 segundo)
        this.timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Esta función se llamará automáticamente CADA SEGUNDO
                actualizarReloj();
            }
        });
    }

    /**
     * Inicia la cuenta regresiva.
     */
    public void iniciar() {
        if (!timer.isRunning()) {
            if (!enDescanso) {
                // Empezar tiempo de Enfoque
                minutosRestantes = 25;
                segundosRestantes = 0;
            } else {
                // Empezar tiempo de Descanso
                minutosRestantes = 5;
                segundosRestantes = 0;
            }
            // Actualiza la etiqueta inmediatamente antes de empezar
            actualizarLabelTiempo();
            timer.start(); // ¡Arranca el reloj!
        }
    }

    /**
     * Detiene la cuenta regresiva.
     */
    public void detener() {
        timer.stop(); // Detiene el reloj
    }

    /**
     * Lógica principal que se ejecuta cada segundo.
     */
    private void actualizarReloj() {
        if (segundosRestantes == 0) {
            // Si los segundos llegan a 0...
            if (minutosRestantes == 0) {
                // Si los minutos TAMBIÉN llegan a 0...
                timer.stop(); // El tiempo terminó

                if (!enDescanso) {
                    // Terminó el tiempo de Enfoque
                    enDescanso = true;
                    JOptionPane.showMessageDialog(null, "¡Tiempo de Enfoque terminado! Toma un descanso de 5 minutos.");
                    iniciar(); // Inicia el descanso automáticamente
                } else {
                    // Terminó el tiempo de Descanso
                    enDescanso = false;
                    JOptionPane.showMessageDialog(null, "¡Descanso terminado! Es hora de volver a enfocarse (25 min).");
                    iniciar(); // Inicia el enfoque automáticamente
                }

            } else {
                // Si los segundos son 0 pero los minutos no, restamos un minuto
                minutosRestantes--;
                segundosRestantes = 59; // y reiniciamos segundos
            }
        } else {
            // Si los segundos no son 0, solo restamos un segundo
            segundosRestantes--;
        }

        // Actualizamos la etiqueta (JLabel) en la pantalla
        actualizarLabelTiempo();
    }

    /**
     * Método privado para formatear y actualizar el texto del JLabel
     */
    private void actualizarLabelTiempo() {
        // Formateamos el texto para que se vea "25:05" (dos dígitos) y no "25:5"
        String textoTiempo = String.format("%02d:%02d", minutosRestantes, segundosRestantes);

        // Actualizamos la etiqueta (JLabel) en la pantalla
        this.lblTiempo.setText(textoTiempo);
    }
}