package modelo.academico;

public class Clase {
    private String nombre;
    private String hora;
    private String dia;

    public Clase(String nombre, String hora, String dia) {
        this.nombre = nombre;
        this.hora = hora;
        this.dia = dia;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getDia() { return dia; }
    public void setDia(String dia) { this.dia = dia; }
}
