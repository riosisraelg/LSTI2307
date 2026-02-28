package actividades.actividad4;

public class Materia {
    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;

    // Constructores
    public Materia() {
    }

    public Materia(String nombre, String clave, int creditos, int horasSemanales) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

    public Materia(Materia m) {
        this.nombre = m.nombre;
        this.clave = m.clave;
        this.creditos = m.creditos;
        this.horasSemanales = m.horasSemanales;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    // Métodos
    @Override
    public String toString() {
        return "Materia [" +
                "Nombre: " + nombre +
                ", Clave: " + clave +
                ", Créditos: " + creditos +
                ", Horas/Semana: " + horasSemanales +
                "]";
    }

    public void mostrarInformacion() {
        System.out.println("--------- Detalle de Materia ---------");
        System.out.println(this.toString());
        System.out.println("--------------------------------------");
    }
}
