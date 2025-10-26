// Esta línea es crucial, le dice a Java dónde vive esta clase
package com.ProductividadPersonal.gestor_academico_productividad.modelo.productividad.entidad;

/**
 * Esta clase representa una categoría para agrupar hábitos.
 * Ejemplo: "Estudio", "Salud", "Ejercicio".
 * Es nuestra "Entidad" (el Modelo POO).
 */
public class CategoriaHabito {

    // --- 1. Atributos ---
    private int id_categoria;
    private String nombre;

    // --- 2. Constructores ---

    /**
     * Constructor vacío.
     */
    public CategoriaHabito() {
    }

    /**
     * Constructor con parámetros.
     */
    public CategoriaHabito(int id_categoria, String nombre) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
    }

    // --- 3. Getters y Setters ---

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}