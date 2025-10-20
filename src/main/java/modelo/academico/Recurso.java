package modelo.academico;

public class Recurso {
    private String nombre;
    private String tipo;
    private String enlace;

    public Recurso(String nombre, String tipo, String enlace) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.enlace = enlace;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEnlace() { return enlace; }
    public void setEnlace(String enlace) { this.enlace = enlace; }

    @Override
    public String toString() {
        return "Recurso: " + nombre + " (" + tipo + ") - " + enlace;
    }
}