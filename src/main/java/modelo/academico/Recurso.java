package modelo.academico;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Recurso {
    private String nombre;
    private String tipo;
    private String enlace;

    public Recurso(String nombre, String tipo, String enlace) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Recurso: " + nombre + " (" + tipo + ") - " + enlace;
    }
}