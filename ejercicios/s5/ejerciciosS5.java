import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Semana 5: Programación Orientada a Objetos Intermedia
 * 
 * Este archivo contiene la estructura para los ejercicios de la semana 5.
 * Incluye las explicaciones completas del archivo Markdown y los esqueletos de
 * las clases.
 */
public class ejerciciosS5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==========================================");
            System.out.println("   EJERCICIOS SEMANA 5 - POO INTERMEDIA  ");
            System.out.println("==========================================");
            System.out.println("1. Ejercicio 1: Sistema de Gestión de Veterinaria");
            System.out.println("2. Ejercicio 2: Sistema de Gimnasio");
            System.out.println("0. Salir");
            System.out.print("Seleccione un ejercicio: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingrese un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ejercicio1(scanner);
                    break;
                case 2:
                    ejercicio2(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    // =========================================================================
    // ## Ejercicio 1: Sistema de Gestión de Veterinaria
    // =========================================================================
    /*
     * ### Enunciado del Problema
     * Una veterinaria necesita un programa para gestionar las mascotas que
     * atienden,
     * los servicios que ofrecen y los veterinarios que trabajan ahí.
     * La información que se registra es la siguiente:
     * 
     * Mascotas: Nombre, especie (perro, gato, etc.), edad y peso. Cada mascota
     * tiene un dueño asociado.
     * Dueños: Nombre, RFC y teléfono. Un dueño puede tener varias mascotas.
     * Veterinarios: Nombre, número de empleado, especialidad y años de experiencia.
     * Servicios: Nombre del servicio, precio y duración en minutos.
     * Consultas: Cada consulta es realizada por un veterinario a una mascota,
     * utilizando un servicio específico. Cada consulta tiene una fecha y un costo
     * total.
     * 
     * ### Requisitos del Ejercicio
     * 1. Modela las clases necesarias con sus atributos y relaciones:
     * - Una Mascota pertenece a un Dueño (asociación)
     * - Un Veterinario realiza Consultas (asociación)
     * - Una Mascota recibe Consultas (asociación)
     * - Una Consulta incluye un Servicio (dependencia)
     * 
     * 2. Identifica el tipo de relación entre cada par de clases y justifícalo.
     * 3. Crea el diagrama de secuencia que muestre cómo se crea una consulta. (En
     * el MD)
     * 4. Implementa las clases en Java con:
     * - Constructor por defecto
     * - Constructor con parámetros
     * - Constructor de copia
     * - Getters y setters
     * - Métodos funcionales necesarios
     * 
     * 5. Crea un programa donde se demuestre la creación de objetos.
     */
    public static void ejercicio1(Scanner scanner) {
        System.out.println("\n--- EJERCICIO 1: SISTEMA VETERINARIA ---");
        // TODO: Implementar demostración de creación de objetos y relaciones
        // Ejemplo de flujo:
        // Dueño d = new Dueño(...);
        // Mascota m = new Mascota(...);
        // Veterinario v = new Veterinario(...);
        // Servicio s = new Servicio(...);
        // Consulta c = new Consulta(m, v, s, "2024-01-15");
        // c.mostrarConsulta();
    }

    // --- Clases para Ejercicio 1 ---

    static class Dueño {
        private String nombre;
        private String rfc;
        private String telefono;

        // TODO: Constructor por defecto
        // TODO: Constructor con parámetros
        // TODO: Constructor de copia
        // TODO: Getters y Setters
    }

    static class Mascota {
        private String nombre;
        private String especie;
        private int edad;
        private double peso;
        private Dueño dueño;

        // TODO: Constructor por defecto
        // TODO: Constructor con parámetros
        // TODO: Constructor de copia
        // TODO: Getters y Setters
    }

    static class Veterinario {
        private String nombre;
        private String numeroEmpleado;
        private String especialidad;
        private int añosExperiencia;

        // TODO: Constructor por defecto
        // TODO: Constructor con parámetros
        // TODO: Constructor de copia
        // TODO: Getters y Setters
    }

    static class Servicio {
        private String nombre;
        private double precio;
        private int duracionMinutos;

        // TODO: Constructor por defecto
        // TODO: Constructor con parámetros
        // TODO: Constructor de copia
        // TODO: Getters y Setters
    }

    static class Consulta {
        private String fecha;
        private Mascota mascota;
        private Veterinario veterinario;
        private Servicio servicio;
        private double costoTotal;

        // TODO: Constructor por defecto
        // TODO: Constructor con parámetros (debe asignar mascota, vet, servicio y
        // calcular costoTotal)
        // TODO: Constructor de copia
        // TODO: Getters y Setters
        // TODO: Método mostrarConsulta()
    }

    // =========================================================================
    // ## Ejercicio 2: Sistema de Gimnasio (Código Incompleto)
    // =========================================================================
    /*
     * ### Enunciado del Problema
     * Un gimnasio necesita un sistema para administrar sus instalaciones,
     * entrenadores y miembros.
     * Los requisitos son:
     * 
     * Miembros: Nombre, edad, membresía (básica, premium) y el plan de
     * entrenamiento que siguen.
     * Entrenadores: Nombre, especialidad y certificación. Un entrenador puede
     * atender a varios miembros.
     * Planes de Entrenamiento: Nombre del plan, objetivo y ejercicios asignados.
     * Cada plan tiene exactamente 5 ejercicios.
     * Ejercicios: Nombre, series, repeticiones y duración en minutos.
     * 
     * ### Instrucciones
     * Completa el código base que se proporciona a continuación. Debes:
     * - Completar los constructores faltantes
     * - Implementar los getters y setters
     * - Completar los métodos funcionales
     * - Añadir validación en los setters
     * - Crear el menú interactivo
     */
    public static void ejercicio2(Scanner scanner) {
        System.out.println("\n--- EJERCICIO 2: SISTEMA GIMNASIO ---");
        // Aquí se llama a la lógica del menú del gimnasio (MenuGimnasio.main similar)
        // En este esqueleto, lo manejamos como una función.

        int opcion;
        do {
            System.out.println("\n=== MENÚ GIMNASIO ===");
            System.out.println("1. Crear miembro");
            System.out.println("2. Crear ejercicio");
            System.out.println("3. Crear plan de entrenamiento");
            System.out.println("4. Crear entrenador");
            System.out.println("5. Volver al menú principal");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // TODO: Crear y mostrar un miembro
                    break;
                case 2:
                    // TODO: Crear y mostrar un ejercicio
                    break;
                case 3:
                    // TODO: Crear un plan y agregar ejercicios
                    break;
                case 4:
                    // TODO: Crear un entrenador
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }

    // --- Clases para Ejercicio 2 (Esqueleto del MD) ---

    /**
     * Clase Ejercicio - Representa un ejercicio físico
     */
    static class Ejercicio {
        private String nombre;
        private int series;
        private int repeticiones;
        private int duracionMinutos;

        // CONSTRUCTOR POR DEFECTO
        public Ejercicio() {
            // TODO: Inicializar atributos con valores por defecto
        }

        // CONSTRUCTOR CON PARÁMETROS
        public Ejercicio(String nombre, int series, int repeticiones, int duracionMinutos) {
            // TODO: Asignar parámetros a atributos usando this
        }

        // CONSTRUCTOR DE COPIA
        public Ejercicio(Ejercicio otro) {
            // TODO: Copiar los valores del objeto otro
        }

        // GETTERS Y SETTERS (CON VALIDACIONES)
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            // TODO: Validación (no null, no vacío)
        }

        public int getSeries() {
            return series;
        }

        public void setSeries(int series) {
            // TODO: Validación (mayor a 0)
        }

        public int getRepeticiones() {
            return repeticiones;
        }

        public void setRepeticiones(int repeticiones) {
            // TODO: Validación (mayor a 0)
        }

        public int getDuracionMinutos() {
            return duracionMinutos;
        }

        public void setDuracionMinutos(int duracionMinutos) {
            // TODO: Validación (mayor a 0)
        }

        // MÉTODO FUNCIONAL: Calcula la duración total (series * repeticiones o según
        // lógica MD)
        public int getDuracionTotal() {
            // TODO: Calcular duración total
            return 0;
        }

        public void mostrarInfo() {
            // TODO: Imprimir información del ejercicio formateada
        }
    }

    /**
     * Clase PlanEntrenamiento - Representa un plan de entrenamiento
     */
    static class PlanEntrenamiento {
        private String nombrePlan;
        private String objetivo;
        private List<Ejercicio> ejercicios; // Exactly 5 ejercicios
        private Miembro miembro; // ASOCIACIÓN

        public PlanEntrenamiento() {
            // TODO: Inicializar
        }

        public PlanEntrenamiento(String nombrePlan, String objetivo, Miembro miembro) {
            // TODO: Asignar
        }

        public PlanEntrenamiento(PlanEntrenamiento otro) {
            // TODO: Copiar (Deep copy de ejercicios)
        }

        public void agregarEjercicio(Ejercicio e) {
            // TODO: Agregar ejercicio a la lista si hay menos de 5
        }

        public int getDuracionTotalPlan() {
            // TODO: Sumar duraciones
            return 0;
        }

        // TODO: Getters y Setters

        public void mostrarInfoPlan() {
            // TODO: Mostrar info completa
        }
    }

    /**
     * Clase Miembro - Representa un miembro del gimnasio
     */
    static class Miembro {
        private String nombre;
        private int edad;
        private String tipoMembresia; // "básica" o "premium"
        private PlanEntrenamiento plan;

        public Miembro() {
            // TODO: Inicializar
        }

        public Miembro(String nombre, int edad, String tipoMembresia) {
            // TODO: Asignar
        }

        public Miembro(Miembro otro) {
            // TODO: Copiar
        }

        // TODO: Getters y Setters (Con validaciones de edad y tipo)

        public boolean tienePlanActivo() {
            return plan != null;
        }

        public void mostrarInfo() {
            // TODO: Mostrar info
        }
    }

    /**
     * Clase Entrenador - Representa un entrenador del gimnasio
     */
    static class Entrenador {
        private String nombre;
        private String especialidad;
        private String certificacion;

        public Entrenador() {
            // TODO: Inicializar
        }

        public Entrenador(String nombre, String especialidad, String certificacion) {
            // TODO: Asignar
        }

        public Entrenador(Entrenador otro) {
            // TODO: Copiar
        }

        // TODO: Getters y Setters

        public void mostrarInfo() {
            // TODO: Mostrar info
        }
    }
}
