package actividades.actividad4;

public class Profesor {
    private String nombre;
    private String nomina;
    private double sueldoPorHora;
    private Materia materiaAsignada;

    // Constructores
    public Profesor() {
    }

    public Profesor(String nombre, String nomina, double sueldoPorHora, Materia materiaAsignada) {
        this.nombre = nombre;
        this.nomina = nomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materiaAsignada = materiaAsignada;
    }

    public Profesor(Profesor p) {
        this.nombre = p.nombre;
        this.nomina = p.nomina;
        this.sueldoPorHora = p.sueldoPorHora;
        this.materiaAsignada = p.materiaAsignada;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getNomina() {
        return this.nomina;
    }

    public double getSueldoPorHora() {
        return this.sueldoPorHora;
    }

    public Materia getMateriaAsignada() {
        return this.materiaAsignada;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNomina(String nomina) {
        this.nomina = nomina;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public void setMateriaAsignada(Materia materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
    }

    // Métodos
    public double calcularSueldoSemanal(Materia horasMateria) {
        if (this.materiaAsignada != null) {
            return this.materiaAsignada.getHorasSemanales() * this.sueldoPorHora;
        }
        return 0.0;
    }

    public void asignarMateria(Materia m) {
        this.materiaAsignada = m;
    }

    @Override
    public String toString() {
        String infoMateria = (materiaAsignada != null) ? materiaAsignada.getNombre() : "Ninguna";
        return "Profesor [" +
                "Nombre: " + nombre +
                ", Nómina: " + nomina +
                ", Sueldo/Hora: $" + sueldoPorHora +
                ", Materia: " + infoMateria +
                "]";
    }

    public void mostrarPerfil() {
        System.out.println("--------- Perfil del Profesor ---------");
        System.out.println(this.toString());
        if (materiaAsignada != null) {
            System.out.println("Sueldo Semanal Estimado: $" + this.calcularSueldoSemanal(materiaAsignada));
        }
        System.out.println("---------------------------------------");
    }
}
