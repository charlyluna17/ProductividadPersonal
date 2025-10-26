// Vive en el mismo paquete que las otras entidades
package com.ProductividadPersonal.gestor_academico_productividad.modelo.productividad.entidad;

// Importamos la clase "Date" de Java para manejar fechas
import java.util.Date;

/**
 * Esta clase representa el registro de un hábito en un día específico.
 * Ejemplo: "Marcar 'Estudiar POO' como HECHO el 25-oct-2025".
 */
public class RegistroHabito {

    // --- 1. Atributos ---
    private int id_registro;
    private Date fecha; // El día en que se hizo el registro
    private boolean completado; // true si se completó, false si no

    // Llave foránea para saber a qué hábito pertenece este registro
    private int id_habito;

    // --- 2. Constructores ---
    public RegistroHabito() {
    }

    /**
     * Constructor con parámetros.
     */
    public RegistroHabito(int id_registro, Date fecha, boolean completado, int id_habito) {
        this.id_registro = id_registro;
        this.fecha = fecha;
        this.completado = completado;
        this.id_habito = id_habito;
    }

    // --- 3. Getters y Setters ---

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isCompletado() { // Para booleanos, es común usar "is" en vez de "get"
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public int getId_habito() {
        return id_habito;
    }

    public void setId_habito(int id_habito) {
        this.id_habito = id_habito;
    }
}