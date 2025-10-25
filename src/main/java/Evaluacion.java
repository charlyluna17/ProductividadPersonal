public class Evaluacion {
    private String nombre;
    private double valor;        // porcentaje o peso
    private double calificacion; // nota obtenida
    private String modulo;       // módulo al que pertenece

    public Evaluacion(String nombre, double valor, double calificacion, String modulo) {
        this.nombre = nombre;
        this.valor = valor;
        this.calificacion = calificacion;
        this.modulo = modulo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }

    public String getModulo() { return modulo; }
    public void setModulo(String modulo) { this.modulo = modulo; }
}

