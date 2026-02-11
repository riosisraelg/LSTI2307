package actividades.actividad4;

public class Main {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // HEADER PRINCIPAL
        // ---------------------------------------------------------
        System.out.println("----------------------------------------------------");
        System.out.println("   DEMOSTRACIÓN DE FLUJO CRUD - SISTEMA ESCOLAR");
        System.out.println("----------------------------------------------------");

        // ---------------------------------------------------------
        // 1. CREATE (Creación de objetos iniciales)
        // ---------------------------------------------------------
        System.out.println("\n[CRUD: CREATE] -------------------------------------");
        System.out.println("Creando registros iniciales...");

        Materia materia1 = new Materia("Programación Java", "JAVA101", 8, 4);
        Materia materia2 = new Materia("Cálculo Diferencial", "MAT201", 6, 3);
        Materia materia3 = new Materia("Ética Profesional", "HUM301", 4, 2);

        Curso curso1 = new Curso("Tecnologías de Información", materia1, materia2, materia3);
        Profesor profesor1 = new Profesor("Ing. Juan Pérez", "EMP001", 300.0, materia1);
        Alumno alumno1 = new Alumno("A2024-001", "Andrés Rivera", 19, curso1);

        // ---------------------------------------------------------
        // 2. READ (Lectura y visualización)
        // ---------------------------------------------------------
        System.out.println("\n[CRUD: READ] ---------------------------------------");
        System.out.println("Verificando registros creados:");
        profesor1.mostrarPerfil();
        alumno1.mostrarKardex();

        // ---------------------------------------------------------
        // 3. UPDATE (Actualización de atributos y relaciones)
        // ---------------------------------------------------------
        System.out.println("\n[CRUD: UPDATE] -------------------------------------");
        System.out.println("Actualizando datos del sistema...");

        System.out.println("-> Modificando sueldo y materia del profesor...");
        profesor1.setSueldoPorHora(350.0);
        profesor1.asignarMateria(materia2);

        System.out.println("-> Corrigiendo nombre del alumno y cambiando curso...");
        alumno1.setNombre("Andrés Rivera Sánchez");
        Curso curso2 = new Curso("Gestión de Proyectos", materia3, materia1, materia2);
        alumno1.inscribirCurso(curso2);

        System.out.println("\n--- Verificación post-UPDATE ---");
        profesor1.mostrarPerfil();
        alumno1.mostrarKardex();

        // ---------------------------------------------------------
        // 4. DELETE (Eliminación/Desasignación de datos)
        // ---------------------------------------------------------
        System.out.println("\n[CRUD: DELETE] -------------------------------------");
        System.out.println("Eliminando vinculaciones (Bajas)...");

        System.out.println("-> Desasignando materia al profesor...");
        profesor1.setMateriaAsignada(null);

        System.out.println("-> Desasignando curso al alumno...");
        alumno1.setCursoInscrito(null);

        System.out.println("\n--- Estado final (Registros Vacíos) ---");
        profesor1.mostrarPerfil();
        alumno1.mostrarKardex();

        // ---------------------------------------------------------
        // FOOTER
        // ---------------------------------------------------------
        System.out.println("\n----------------------------------------------------");
        System.out.println("        FIN DE LA DEMOSTRACIÓN CRUD");
        System.out.println("----------------------------------------------------");
    }
}
