package actividades.actividad4;

public class Alumno {
    private String matricula;
    private String nombre;
    private int edad;
    private Curso cursoInscrito;

    // Constructores
    public Alumno() {
    }

    public Alumno(String matricula, String nombre, int edad, Curso cursoInscrito) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.cursoInscrito = cursoInscrito;
    }

    public Alumno(Alumno a) {
        this.matricula = a.matricula;
        this.nombre = a.nombre;
        this.edad = a.edad;
        this.cursoInscrito = a.cursoInscrito;
    }

    // Getters
    public String getMatricula() {
        return this.matricula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public Curso getCursoInscrito() {
        return this.cursoInscrito;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCursoInscrito(Curso cursoInscrito) {
        this.cursoInscrito = cursoInscrito;
    }

    // Métodos
    public void inscribirCurso(Curso c) {
        this.cursoInscrito = c;
    }

    @Override
    public String toString() {
        String nombreCurso = (cursoInscrito != null) ? cursoInscrito.getNombre() : "Pendiente de inscribir";
        return "Alumno [" +
                "Nombre: " + nombre +
                ", Matrícula: " + matricula +
                ", Edad: " + edad +
                ", Curso: " + nombreCurso +
                "]";
    }

    public void mostrarKardex() {
        System.out.println("---------- Kardex del Alumno ----------");
        System.out.println(this.toString());
        if (cursoInscrito != null) {
            System.out.println("Materias del curso:");
            System.out.println("- " + cursoInscrito.getMateria1().getNombre());
            System.out.println("- " + cursoInscrito.getMateria2().getNombre());
            System.out.println("- " + cursoInscrito.getMateria3().getNombre());
        } else {
            System.out.println("El alumno no tiene un curso asignado todavía.");
        }
        System.out.println("---------------------------------------");
    }
}
