package modelo.academico;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Clase {
    private String nombre;
    private String hora;
    private String dia;

    public Clase(String nombre, String hora, String dia) {
        this.nombre = nombre;
        this.hora = hora;
        this.dia = dia;
    }

}
