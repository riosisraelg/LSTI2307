package actividades.actividad4;

public class Curso {
    private String nombre;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    // Constructores
    public Curso() {
    }

    public Curso(String nombre, Materia m1, Materia m2, Materia m3) {
        this.nombre = nombre;
        this.materia1 = m1;
        this.materia2 = m2;
        this.materia3 = m3;
    }

    public Curso(Curso c) {
        this.nombre = c.nombre;
        this.materia1 = c.materia1;
        this.materia2 = c.materia2;
        this.materia3 = c.materia3;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public Materia getMateria1() {
        return this.materia1;
    }

    public Materia getMateria2() {
        return this.materia2;
    }

    public Materia getMateria3() {
        return this.materia3;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria1(Materia m1) {
        this.materia1 = m1;
    }

    public void setMateria2(Materia m2) {
        this.materia2 = m2;
    }

    public void setMateria3(Materia m3) {
        this.materia3 = m3;
    }

    // Métodos
    public int calcularTotalCreditos() {
        int total = 0;
        total += materia1.getCreditos();
        total += materia2.getCreditos();
        total += materia3.getCreditos();
        return total;
    }

    public int calcularTotalHoras() {
        int total = 0;
        total += materia1.getHorasSemanales();
        total += materia2.getHorasSemanales();
        total += materia3.getHorasSemanales();
        return total;
    }

    @Override
    public String toString() {
        return "Curso: " + nombre + " [Mat1: " + materia1.getNombre() +
                ", Mat2: " + materia2.getNombre() +
                ", Mat3: " + materia3.getNombre() + "]";
    }

    public void mostrarResumenCurso() {
        System.out.println("---------- Resumen del Curso ----------");
        System.out.println(this.toString());
        System.out.println("Total de Créditos: " + this.calcularTotalCreditos());
        System.out.println("Total de Horas Semanales: " + this.calcularTotalHoras());
        System.out.println("---------------------------------------");
    }
}
