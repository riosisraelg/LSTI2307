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

    /**
     * Limpia la consola según el sistema operativo.
     */
    public static void limpiarPantalla() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Si falla, al menos imprimimos varias líneas vacías
            for (int i = 0; i < 50; i++)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            limpiarPantalla();
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
        limpiarPantalla();
        System.out.println("\n--- EJERCICIO 1: FLUJO CRUD VETERINARIA ---");

        // 1. CREATE (Creación de objetos)
        System.out.println("\n[1. CREATE] Creando registros iniciales...");
        Dueño d1 = new Dueño("Juan Pérez", "PERJ800101ABC", "555-123-4567");
        Mascota m1 = new Mascota("Max", "Perro", 3, 15.5, d1);
        Veterinario v1 = new Veterinario("Dra. García", "VET-001", "Cirugía", 8);
        Servicio s1 = new Servicio("Vacunación", 450.0, 20);

        // 2. READ (Lectura/Visualización inicial)
        System.out.println("\n[2. READ] Consultando datos registrados:");
        m1.mostrarInfo();
        v1.mostrarInfo();

        // Creamos una consulta usando los objetos anteriores
        Consulta c1 = new Consulta("2024-02-11", m1, v1, s1);
        c1.mostrarConsulta();

        // 3. UPDATE (Actualización de datos)
        System.out.println("\n[3. UPDATE] Modificando registros existentes...");
        System.out.println("- Actualizando peso de Max a 16.2 kg...");
        m1.setPeso(16.2);

        System.out.println("- Cambiando teléfono del dueño...");
        d1.setTelefono("555-999-8888");

        System.out.println("- Actualizando precio del servicio de vacunación a $500...");
        s1.setPrecio(500.0);
        // Nota: El costo de la consulta debe actualizarse si el servicio cambia
        c1.setServicio(s1);

        System.out.println("\nVerificando cambios (READ post-update):");
        m1.mostrarInfo();
        c1.mostrarConsulta();

        // 4. DELETE (Borrado/Eliminación lógica o de referencia)
        System.out.println("\n[4. DELETE] Eliminando referencias...");
        System.out.println("- Cancelando la consulta (eliminando objeto)...");
        c1 = null;

        if (c1 == null) {
            System.out.println("La consulta ha sido eliminada exitosamente del sistema.");
        }

        System.out.println("\n--- FIN FLUJO VETERINARIA ---");
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();
    }

    // --- Clases para Ejercicio 1 ---

    static class Dueño {
        private String nombre;
        private String rfc;
        private String telefono;

        // Constructor por defecto con valores iniciales
        public Dueño() {
            this.nombre = "Sin nombre";
            this.rfc = "N/A";
            this.telefono = "0000000000";
        }

        public Dueño(String nombre, String rfc, String telefono) {
            this.nombre = nombre;
            this.rfc = rfc;
            this.telefono = telefono;
        }

        public Dueño(Dueño a) {
            this.nombre = a.nombre;
            this.rfc = a.rfc;
            this.telefono = a.telefono;
        }

        // Getters
        public String getNombre() {
            return this.nombre;
        }

        public String getRfc() {
            return this.rfc;
        }

        public String getTelefono() {
            return this.telefono;
        }

        // Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setRfc(String rfc) {
            this.rfc = rfc;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        // Método de visualización
        public void mostrarInfo() {
            System.out.println("--- Detalle del Dueño ---");
            System.out.println("Nombre:   " + (nombre != null ? nombre : "N/A"));
            System.out.println("RFC:      " + (rfc != null ? rfc : "N/A"));
            System.out.println("Teléfono: " + (telefono != null ? telefono : "N/A"));
            System.out.println("-------------------------");
        }
    }

    // Metodos

    static class Mascota {
        private String nombre;
        private String especie;
        private int edad;
        private double peso;
        private Dueño dueño;

        // Constructor por defecto
        public Mascota() {
            this.nombre = "Sin nombre";
            this.especie = "Desconocida";
            this.edad = 0;
            this.peso = 0.0;
            this.dueño = null;
        }

        // Constructor con parámetros
        public Mascota(String nombre, String especie, int edad, double peso, Dueño dueño) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
            this.peso = peso;
            this.dueño = dueño;
        }

        // Constructor de copia
        public Mascota(Mascota m) {
            this.nombre = m.nombre;
            this.especie = m.especie;
            this.edad = m.edad;
            this.peso = m.peso;
            this.dueño = m.dueño;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public String getEspecie() {
            return especie;
        }

        public int getEdad() {
            return edad;
        }

        public double getPeso() {
            return peso;
        }

        public Dueño getDueño() {
            return dueño;
        }

        // Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public void setDueño(Dueño dueño) {
            this.dueño = dueño;
        }

        // Método de visualización
        public void mostrarInfo() {
            System.out.println("--- Detalle de la Mascota ---");
            System.out.println("Nombre:  " + nombre);
            System.out.println("Especie: " + especie);
            System.out.println("Edad:    " + edad + " años");
            System.out.println("Peso:    " + peso + " kg");
            System.out.println("Dueño:   " + (dueño != null ? dueño.getNombre() : "Sin asignar"));
            System.out.println("-----------------------------");
        }
    }

    static class Veterinario {
        private String nombre;
        private String numeroEmpleado;
        private String especialidad;
        private int añosExperiencia;

        // Constructor por defecto
        public Veterinario() {
            this.nombre = "Sin nombre";
            this.numeroEmpleado = "0000";
            this.especialidad = "General";
            this.añosExperiencia = 0;
        }

        // Constructor con parámetros
        public Veterinario(String nombre, String numeroEmpleado, String especialidad, int añosExperiencia) {
            this.nombre = nombre;
            this.numeroEmpleado = numeroEmpleado;
            this.especialidad = especialidad;
            this.añosExperiencia = añosExperiencia;
        }

        // Constructor de copia
        public Veterinario(Veterinario v) {
            this.nombre = v.nombre;
            this.numeroEmpleado = v.numeroEmpleado;
            this.especialidad = v.especialidad;
            this.añosExperiencia = v.añosExperiencia;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public String getNumeroEmpleado() {
            return numeroEmpleado;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public int getAñosExperiencia() {
            return añosExperiencia;
        }

        // Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setNumeroEmpleado(String numeroEmpleado) {
            this.numeroEmpleado = numeroEmpleado;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        public void setAñosExperiencia(int añosExperiencia) {
            this.añosExperiencia = añosExperiencia;
        }

        // Método de visualización
        public void mostrarInfo() {
            System.out.println("--- Detalle del Veterinario ---");
            System.out.println("Nombre:       " + nombre);
            System.out.println("Empleado No:  " + numeroEmpleado);
            System.out.println("Especialidad: " + especialidad);
            System.out.println("Experiencia:  " + añosExperiencia + " años");
            System.out.println("-------------------------------");
        }
    }

    static class Servicio {
        private String nombre;
        private double precio;
        private int duracionMinutos;

        // Constructor por defecto
        public Servicio() {
            this.nombre = "Sin servicio";
            this.precio = 0.0;
            this.duracionMinutos = 0;
        }

        // Constructor con parámetros
        public Servicio(String nombre, double precio, int duracionMinutos) {
            this.nombre = nombre;
            this.precio = precio;
            this.duracionMinutos = duracionMinutos;
        }

        // Constructor de copia
        public Servicio(Servicio s) {
            this.nombre = s.nombre;
            this.precio = s.precio;
            this.duracionMinutos = s.duracionMinutos;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public int getDuracionMinutos() {
            return duracionMinutos;
        }

        // Setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void setDuracionMinutos(int duracionMinutos) {
            this.duracionMinutos = duracionMinutos;
        }

        // Método de visualización
        public void mostrarInfo() {
            System.out.println("--- Detalle del Servicio ---");
            System.out.println("Servicio: " + nombre);
            System.out.println("Precio:   $" + precio);
            System.out.println("Duración: " + duracionMinutos + " min");
            System.out.println("----------------------------");
        }
    }

    static class Consulta {
        private String fecha;
        private Mascota mascota;
        private Veterinario veterinario;
        private Servicio servicio;
        private double costoTotal;

        // Constructor por defecto
        public Consulta() {
            this.fecha = "AAAA-DD-MM";
            this.mascota = null;
            this.veterinario = null;
            this.servicio = null;
            this.costoTotal = 0.0;
        }

        // Constructor con parámetros
        public Consulta(String fecha, Mascota mascota, Veterinario veterinario, Servicio servicio) {
            this.fecha = fecha;
            this.mascota = mascota;
            this.veterinario = veterinario;
            this.servicio = servicio;
            this.costoTotal = (servicio != null) ? servicio.getPrecio() : 0.0;
        }

        // Constructor de copia
        public Consulta(Consulta c) {
            this.fecha = c.fecha;
            this.mascota = c.mascota;
            this.veterinario = c.veterinario;
            this.servicio = c.servicio;
            this.costoTotal = c.costoTotal;
        }

        // Getters
        public String getFecha() {
            return fecha;
        }

        public Mascota getMascota() {
            return mascota;
        }

        public Veterinario getVeterinario() {
            return veterinario;
        }

        public Servicio getServicio() {
            return servicio;
        }

        public double getCostoTotal() {
            return costoTotal;
        }

        // Setters
        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public void setMascota(Mascota mascota) {
            this.mascota = mascota;
        }

        public void setVeterinario(Veterinario veterinario) {
            this.veterinario = veterinario;
        }

        public void setServicio(Servicio servicio) {
            this.servicio = servicio;
            this.costoTotal = (servicio != null) ? servicio.getPrecio() : 0.0;
        }

        // Método de visualización
        public void mostrarConsulta() {
            System.out.println("--- DETALLE DE CONSULTA ---");
            System.out.println("Fecha:       " + fecha);
            System.out.println("Mascota:     " + (mascota != null ? mascota.getNombre() : "N/A"));
            System.out.println("Veterinario: " + (veterinario != null ? veterinario.getNombre() : "N/A"));
            System.out.println("Servicio:    " + (servicio != null ? servicio.getNombre() : "N/A"));
            System.out.println("Costo Total: $" + costoTotal);
            System.out.println("---------------------------");
        }
    }

    // =========================================================================
    // ## Ejercicio 2: Sistema de Gimnasio
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
        // Listas para almacenar los objetos
        List<Miembro> miembros = new ArrayList<>();
        List<Ejercicio> ejercicios = new ArrayList<>();
        List<PlanEntrenamiento> planes = new ArrayList<>();
        List<Entrenador> entrenadores = new ArrayList<>();

        int opcion;
        do {
            limpiarPantalla();
            mostrarMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Por favor, ingrese un número entero válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Registrar Nuevo Miembro ---");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Membresía (básica/premium): ");
                    String membresia = scanner.nextLine();
                    try {
                        Miembro nuevoMiembro = new Miembro(nombre, edad, membresia);
                        miembros.add(nuevoMiembro);
                        System.out.println("Miembro registrado exitosamente.");
                        System.out.println("\nPresione Enter para continuar...");
                        scanner.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error al crear miembro: " + e.getMessage());
                        System.out.println("\nPresione Enter para continuar...");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("\n--- Registrar Nuevo Ejercicio ---");
                    System.out.print("Nombre del ejercicio: ");
                    String nomEj = scanner.nextLine();
                    System.out.print("Series: ");
                    int series = scanner.nextInt();
                    System.out.print("Repeticiones: ");
                    int reps = scanner.nextInt();
                    System.out.print("Duración (minutos): ");
                    int duracion = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        Ejercicio nuevoEj = new Ejercicio(nomEj, series, reps, duracion);
                        ejercicios.add(nuevoEj);
                        System.out.println("Ejercicio registrado exitosamente.");
                        System.out.println("\nPresione Enter para continuar...");
                        scanner.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("\nPresione Enter para continuar...");
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("\n--- Crear Plan de Entrenamiento ---");
                    if (miembros.isEmpty()) {
                        System.out.println("Primero debe registrar al menos un miembro.");
                        break;
                    }
                    System.out.println("Seleccione un miembro para asignar el plan:");
                    for (int i = 0; i < miembros.size(); i++) {
                        System.out.println((i + 1) + ". " + miembros.get(i).getNombre());
                    }
                    int idxMiembro = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (idxMiembro >= 0 && idxMiembro < miembros.size()) {
                        System.out.print("Nombre del plan: ");
                        String nomPlan = scanner.nextLine();
                        System.out.print("Objetivo: ");
                        String obj = scanner.nextLine();

                        PlanEntrenamiento nuevoPlan = new PlanEntrenamiento(nomPlan, obj, miembros.get(idxMiembro));

                        System.out.println("Seleccione hasta 5 ejercicios para el plan (ingrese 0 para terminar):");
                        for (int i = 0; i < ejercicios.size(); i++) {
                            System.out.println((i + 1) + ". " + ejercicios.get(i).getNombre());
                        }

                        while (nuevoPlan.getEjercicios().size() < 5) {
                            System.out.print("Seleccione ejercicio #" + (nuevoPlan.getEjercicios().size() + 1) + ": ");
                            int idxEj = scanner.nextInt() - 1;
                            if (idxEj == -1)
                                break;
                            if (idxEj >= 0 && idxEj < ejercicios.size()) {
                                nuevoPlan.agregarEjercicio(ejercicios.get(idxEj));
                            } else {
                                System.out.println("Selección inválida.");
                            }
                        }
                        scanner.nextLine();
                        planes.add(nuevoPlan);
                        miembros.get(idxMiembro).setPlan(nuevoPlan);
                        System.out.println("Plan creado y asignado exitosamente.");
                        System.out.println("\nPresione Enter para continuar...");
                        scanner.nextLine();
                    } else {
                        System.out.println("Miembro no válido.");
                        System.out.println("\nPresione Enter para continuar...");
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    System.out.println("\n--- Registrar Entrenador ---");
                    System.out.print("Nombre: ");
                    String nomEnt = scanner.nextLine();
                    System.out.print("Especialidad: ");
                    String esp = scanner.nextLine();
                    System.out.print("Certificación: ");
                    String cert = scanner.nextLine();
                    entrenadores.add(new Entrenador(nomEnt, esp, cert));
                    System.out.println("Entrenador registrado exitosamente.");
                    System.out.println("\nPresione Enter para continuar...");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ GIMNASIO ===");
        System.out.println("1. Crear miembro");
        System.out.println("2. Crear ejercicio");
        System.out.println("3. Crear plan de entrenamiento");
        System.out.println("4. Crear entrenador");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
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
            this.nombre = "Sin nombre";
            this.series = 0;
            this.repeticiones = 0;
            this.duracionMinutos = 0;
        }

        // CONSTRUCTOR CON PARÁMETROS
        public Ejercicio(String nombre, int series, int repeticiones, int duracionMinutos) {
            this.nombre = nombre;
            this.series = series;
            this.repeticiones = repeticiones;
            this.duracionMinutos = duracionMinutos;
        }

        // CONSTRUCTOR DE COPIA
        public Ejercicio(Ejercicio otro) {
            this.nombre = otro.nombre;
            this.series = otro.series;
            this.repeticiones = otro.repeticiones;
            this.duracionMinutos = otro.duracionMinutos;
        }

        // GETTERS Y SETTERS
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }
            this.nombre = nombre;
        }

        public int getSeries() {
            return series;
        }

        public void setSeries(int series) {
            if (series <= 0) {
                throw new IllegalArgumentException("Las series deben ser mayor a 0");
            }
            this.series = series;
        }

        public int getRepeticiones() {
            return repeticiones;
        }

        public void setRepeticiones(int repeticiones) {
            if (repeticiones <= 0) {
                throw new IllegalArgumentException("Las repeticiones deben ser mayor a 0");
            }
            this.repeticiones = repeticiones;
        }

        public int getDuracionMinutos() {
            return duracionMinutos;
        }

        public void setDuracionMinutos(int duracionMinutos) {
            if (duracionMinutos <= 0) {
                throw new IllegalArgumentException("La duración debe ser mayor a 0");
            }
            this.duracionMinutos = duracionMinutos;
        }

        // MÉTODO FUNCIONAL: Calcula la duración total (cada repetición toma 1 min según
        // pista)
        public int getDuracionTotal() {
            return series * repeticiones;
        }

        public void mostrarInfo() {
            System.out.println("--- Ejercicio: " + nombre + " ---");
            System.out.println("Series: " + series + " | Reps: " + repeticiones);
            System.out.println("Duración estimada: " + getDuracionTotal() + " min");
            System.out.println("-------------------------");
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
            this.nombrePlan = "Nuevo Plan";
            this.objetivo = "General";
            this.ejercicios = new ArrayList<>(5);
        }

        public PlanEntrenamiento(String nombrePlan, String objetivo, Miembro miembro) {
            this.nombrePlan = nombrePlan;
            this.objetivo = objetivo;
            this.miembro = miembro;
            this.ejercicios = new ArrayList<>(5);
        }

        public PlanEntrenamiento(PlanEntrenamiento otro) {
            this.nombrePlan = otro.nombrePlan;
            this.objetivo = otro.objetivo;
            this.miembro = otro.miembro;
            this.ejercicios = new ArrayList<>();
            for (Ejercicio e : otro.ejercicios) {
                this.ejercicios.add(new Ejercicio(e)); // Deep copy
            }
        }

        public void agregarEjercicio(Ejercicio e) {
            if (ejercicios.size() < 5) {
                ejercicios.add(e);
            } else {
                System.out.println("Error: El plan ya tiene el máximo de 5 ejercicios.");
            }
        }

        public int getDuracionTotalPlan() {
            int total = 0;
            for (Ejercicio e : ejercicios) {
                total += e.getDuracionTotal();
            }
            return total;
        }

        // Getters y Setters
        public String getNombrePlan() {
            return nombrePlan;
        }

        public void setNombrePlan(String nombrePlan) {
            this.nombrePlan = nombrePlan;
        }

        public String getObjetivo() {
            return objetivo;
        }

        public void setObjetivo(String objetivo) {
            this.objetivo = objetivo;
        }

        public List<Ejercicio> getEjercicios() {
            return ejercicios;
        }

        public Miembro getMiembro() {
            return miembro;
        }

        public void setMiembro(Miembro miembro) {
            this.miembro = miembro;
        }

        public void mostrarInfoPlan() {
            System.out.println("--- Plan: " + nombrePlan + " ---");
            System.out.println("Objetivo: " + objetivo);
            System.out.println("Duración total: " + getDuracionTotalPlan() + " min");
            System.out.println("Ejercicios:");
            for (int i = 0; i < ejercicios.size(); i++) {
                System.out.print((i + 1) + ". ");
                ejercicios.get(i).mostrarInfo();
            }
            System.out.println("--------------------------------");
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
            this.nombre = "Sin nombre";
            this.edad = 0;
            this.tipoMembresia = "básica";
        }

        public Miembro(String nombre, int edad, String tipoMembresia) {
            this.nombre = nombre;
            this.edad = edad;
            this.tipoMembresia = tipoMembresia;
        }

        public Miembro(Miembro otro) {
            this.nombre = otro.nombre;
            this.edad = otro.edad;
            this.tipoMembresia = otro.tipoMembresia;
            this.plan = otro.plan;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            if (edad < 0 || edad > 120) {
                throw new IllegalArgumentException("Edad no válida");
            }
            this.edad = edad;
        }

        public String getTipoMembresia() {
            return tipoMembresia;
        }

        public void setTipoMembresia(String tipoMembresia) {
            if (!tipoMembresia.equals("básica") && !tipoMembresia.equals("premium")) {
                throw new IllegalArgumentException("Tipo de membresía inválido");
            }
            this.tipoMembresia = tipoMembresia;
        }

        public PlanEntrenamiento getPlan() {
            return plan;
        }

        public void setPlan(PlanEntrenamiento plan) {
            this.plan = plan;
        }

        public boolean tienePlanActivo() {
            return plan != null;
        }

        public void mostrarInfo() {
            System.out.println("--- Ficha de Miembro ---");
            System.out.println("Nombre:    " + nombre);
            System.out.println("Edad:      " + edad);
            System.out.println("Membresía: " + tipoMembresia);
            System.out.println("Plan:      " + (plan != null ? plan.getNombrePlan() : "Sin asignar"));
            System.out.println("------------------------");
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
            this.nombre = "Sin nombre";
            this.especialidad = "General";
            this.certificacion = "Ninguna";
        }

        public Entrenador(String nombre, String especialidad, String certificacion) {
            this.nombre = nombre;
            this.especialidad = especialidad;
            this.certificacion = certificacion;
        }

        public Entrenador(Entrenador otro) {
            this.nombre = otro.nombre;
            this.especialidad = otro.especialidad;
            this.certificacion = otro.certificacion;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        public String getCertificacion() {
            return certificacion;
        }

        public void setCertificacion(String certificacion) {
            this.certificacion = certificacion;
        }

        public void mostrarInfo() {
            System.out.println("--- Ficha de Entrenador ---");
            System.out.println("Nombre:        " + nombre);
            System.out.println("Especialidad:  " + especialidad);
            System.out.println("Certificación: " + certificacion);
            System.out.println("---------------------------");
        }
    }
}
