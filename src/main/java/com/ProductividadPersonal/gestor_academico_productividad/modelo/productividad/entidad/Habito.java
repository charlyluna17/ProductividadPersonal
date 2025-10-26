// Le dice a Java que esta clase vive en el mismo paquete que CategoriaHabito
package com.ProductividadPersonal.gestor_academico_productividad.modelo.productividad.entidad;

/**
 * Esta clase representa un Hábito específico.
 * Ejemplo: "Estudiar POO", "Tomar 2L de agua".
 * Pertenece a una CategoriaHabito.
 */
public class Habito {

    // --- 1. Atributos ---
    private int id_habito;
    private String nombre;
    private String descripcion;

    // Este atributo es la "Llave Foránea" (Foreign Key)
    // Nos dice a qué categoría pertenece este hábito.
    private int id_categoria;

    // --- 2. Constructores ---
    public Habito() {
    }

    /**
     * Constructor con parámetros.
     */
    public Habito(int id_habito, String nombre, String descripcion, int id_categoria) {
        this.id_habito = id_habito;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_categoria = id_categoria;
    }

    // --- 3. Getters y Setters ---
    // Métodos de acceso para todos los atributos privados.

    public int getId_habito() {
        return id_habito;
    }

    public void setId_habito(int id_habito) {
        this.id_habito = id_habito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * EXTRA: Método toString()
     * Es muy útil para mostrar el nombre del hábito en
     * JComboBox (listas desplegables) o para depurar.
     */
    @Override
    public String toString() {
        return this.nombre; // Muestra solo el nombre
    }
}