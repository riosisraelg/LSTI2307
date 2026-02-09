# Ejercicios Prácticos - POO Intermedia

Estos ejercicios te permitirán practicar los conceptos de Programación Orientada a Objetos: constructores, encapsulación, relaciones entre clases y flujos de llamadas.

---

## Ejercicio 1: Sistema de Gestión de Veterinaria

### Enunciado del Problema

Una veterinaria necesita un programa para gestionar las mascotas que atienden, los servicios que ofrecen y los veterinarios que trabajan ahí. La información que se registra es la siguiente:

**Mascotas:** Nombre, especie (perro, gato, etc.), edad y peso. Cada mascota tiene un dueño asociado.

**Dueños:** Nombre, RFC y teléfono. Un dueño puede tener varias mascotas.

**Veterinarios:** Nombre, número de empleado, especialidad y años de experiencia.

**Servicios:** Nombre del servicio, precio y duración en minutos.

**Consultas:** Cada consulta es realizada por un veterinario a una mascota, utilizando un servicio específico. Cada consulta tiene una fecha y un costo total.

### Requisitos del Ejercicio

1. **Modela las clases** necesarias con sus atributos y relaciones:
   - Una Mascota **pertenece a** un Dueño (asociación)
   - Un Veterinario **realiza** Consultas (asociación)
   - Una Mascota **recibe** Consultas (asociación)
   - Una Consulta **incluye** un Servicio (dependencia)

2. **Identifica el tipo de relación** entre cada par de clases y justifícalo.

3. **Crea el diagrama de secuencia** que muestre cómo se crea una consulta.

4. **Implementa las clases** en Java con:
   - Constructor por defecto
   - Constructor con parámetros
   - Constructor de copia
   - Getters y setters
   - Métodos funcionales necesarios

5. **Crea un programa** donde se demuestre la creación de objetos.

### Ejemplo de Salida Esperada

```
=== Datos de la Mascota ===
Nombre: Max
Especie: Perro
Edad: 3 años
Peso: 15.5 kg
Dueño: Juan Pérez

=== Datos del Veterinario ===
Nombre: Dra. García
Especialidad: Medicina General
Experiencia: 5 años

=== Consulta Realizada ===
Fecha: 2024-01-15
Servicio: Vacunación
Costo: $350.00
```

---

## Ejercicio 2: Sistema de Gimnasio (Código Incompleto)

### Enunciado del Problema

Un gimnasio necesita un sistema para administrar sus instalaciones, entrenadores y miembros. Los requisitos son:

**Miembros:** Nombre, edad, membresía (básica, premium) y el plan de entrenamiento que siguen.

**Entrenadores:** Nombre, especialidad y certificación. Un entrenador puede atender a varios miembros.

**Planes de Entrenamiento:** Nombre del plan, objetivo (pérdida de peso, musculación, etc.) y ejercicios asignados. Cada plan tiene exactamente 5 ejercicios.

**Ejercicios:** Nombre, series, repeticiones y duración en minutos.

### Instrucciones

Completa el código base que se proporciona a continuación. Debes:
- Completar los constructores faltantes
- Implementar los getters y setters
- Completar los métodos funcionales
- Añadir validación en los setters
- Crear el menú interactivo

**Código Base (COMPLETAR):**

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase Ejercicio - Representa un ejercicio físico
 * 
 * COMPLETA:
 * - Constructor por defecto
 * - Constructor con parámetros
 * - Constructor de copia
 * - Getters y setters
 * - Método para mostrar información
 */
public class Ejercicio {
    private String nombre;
    private int series;
    private int repeticiones;
    private int duracionMinutos;
    
    // =====================================================
    // CONSTRUCTOR POR DEFECTO (COMPLETAR)
    // Inicializa con valores predeterminados
    // =====================================================
    public Ejercicio() {
        // TODO: Inicializar atributos con valores por defecto
        // nombre = "Sin nombre"
        // series = 0
        // repeticiones = 0
        // duracionMinutos = 0
    }
    
    // =====================================================
    // CONSTRUCTOR CON PARÁMETROS (COMPLETAR)
    // Inicializa con valores específicos
    // =====================================================
    public Ejercicio(String nombre, int series, int repeticiones, int duracionMinutos) {
        // TODO: Asignar parámetros a atributos usando this
    }
    
    // =====================================================
    // CONSTRUCTOR DE COPIA (COMPLETAR)
    // Crea una copia de otro objeto Ejercicio
    // =====================================================
    public Ejercicio(Ejercicio otro) {
        // TODO: Copiar los valores del objeto otro
    }
    
    // =====================================================
    // GETTERS Y SETTERS (COMPLETAR)
    // =====================================================
    public String getNombre() {
        // TODO: Retornar nombre
    }
    
    public void setNombre(String nombre) {
        // TODO: Asignar nombre con validación (no null, no vacío)
    }
    
    public int getSeries() {
        // TODO: Retornar series
    }
    
    public void setSeries(int series) {
        // TODO: Asignar series con validación (debe ser mayor a 0)
    }
    
    public int getRepeticiones() {
        // TODO: Retornar repeticiones
    }
    
    public void setRepeticiones(int repeticiones) {
        // TODO: Asignar repeticiones con validación (debe ser mayor a 0)
    }
    
    public int getDuracionMinutos() {
        // TODO: Retornar duracionMinutos
    }
    
    public void setDuracionMinutos(int duracionMinutos) {
        // TODO: Asignar duracionMinutos con validación (debe ser mayor a 0)
    }
    
    // =====================================================
    // MÉTODO FUNCIONAL (COMPLETAR)
    // Calcula la duración total del ejercicio (series * repeticiones * 1 min)
    // =====================================================
    public int getDuracionTotal() {
        // TODO: Calcular duración total
        return 0; // Modificar
    }
    
    // =====================================================
    // MÉTODO PARA MOSTRAR INFORMACIÓN (COMPLETAR)
    // =====================================================
    public void mostrarInfo() {
        // TODO: Imprimir información del ejercicio formateada
    }
}

/**
 * Clase PlanEntrenamiento - Representa un plan de entrenamiento
 * 
 * Características:
 * - Tiene exactamente 5 ejercicios (COMPOSICIÓN)
 * - Un Plan pertenece a un Miembro
 */
class PlanEntrenamiento {
    private String nombrePlan;
    private String objetivo;
    private List<Ejercicio> ejercicios;  // Exactly 5 ejercicios
    private Miembro miembro;  // ASOCIACIÓN: Plan pertenece a un Miembro
    
    // =====================================================
    // CONSTRUCTORES (COMPLETAR)
    // =====================================================
    
    public PlanEntrenamiento() {
        // TODO: Inicializar lista vacía, nombre y objetivo por defecto
    }
    
    public PlanEntrenamiento(String nombrePlan, String objetivo, Miembro miembro) {
        // TODO: Asignar parámetros e inicializar lista con capacidad para 5
    }
    
    public PlanEntrenamiento(PlanEntrenamiento otro) {
        // TODO: Copiar todos los atributos (incluir copiar cada ejercicio)
    }
    
    // =====================================================
    // MÉTODO PARA AGREGAR EJERCICIO (COMPLETAR)
    // Agrega un ejercicio a la lista (máximo 5)
    // =====================================================
    public void agregarEjercicio(Ejercicio e) {
        // TODO: Agregar ejercicio a la lista si hay menos de 5
    }
    
    // =====================================================
    // MÉTODO FUNCIONAL (COMPLETAR)
    // Calcula la duración total de todos los ejercicios
    // =====================================================
    public int getDuracionTotalPlan() {
        // TODO: Sumar duraciones de todos los ejercicios
        return 0; // Modificar
    }
    
    // =====================================================
    // GETTERS Y SETTERS (COMPLETAR)
    // =====================================================
    public String getNombrePlan() {
        // TODO
    }
    
    public void setNombrePlan(String nombrePlan) {
        // TODO
    }
    
    public String getObjetivo() {
        // TODO
    }
    
    public void setObjetivo(String objetivo) {
        // TODO
    }
    
    public List<Ejercicio> getEjercicios() {
        // TODO
    }
    
    public Miembro getMiembro() {
        // TODO
    }
    
    public void setMiembro(Miembro miembro) {
        // TODO
    }
    
    public void mostrarInfoPlan() {
        // TODO: Mostrar información completa del plan
    }
}

/**
 * Clase Miembro - Representa un miembro del gimnasio
 */
class Miembro {
    private String nombre;
    private int edad;
    private String tipoMembresia;  // "básica" o "premium"
    private PlanEntrenamiento plan;  // ASOCIACIÓN: Miembro tiene un Plan
    
    // Constructores
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
        // No copiamos el plan (cada miembro tiene su propio plan)
    }
    
    // Getters y setters
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
    
    // Método funcional
    public boolean tienePlanActivo() {
        return plan != null;
    }
    
    public void mostrarInfo() {
        System.out.println("=== Datos del Miembro ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Membresía: " + tipoMembresia);
        if (plan != null) {
            System.out.println("Plan: " + plan.getNombrePlan());
        }
    }
}

/**
 * Clase Entrenador - Representa un entrenador del gimnasio
 */
class Entrenador {
    private String nombre;
    private String especialidad;
    private String certificacion;
    
    // Constructores
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
    
    // Getters y setters
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
        System.out.println("=== Datos del Entrenador ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Certificación: " + certificacion);
    }
}

/**
 * Menú Interactivo - Completa este método
 */
class MenuGimnasio {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar buffer
            
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
}
```

### Menú del Programa Esperado

```
=== MENÚ GIMNASIO ===
1. Crear miembro
2. Crear ejercicio
3. Crear plan de entrenamiento
4. Crear entrenador
5. Salir
Elige una opción: 1

=== CREAR MIEMBRO ===
Nombre: Ana García
Edad: 25
Tipo de membresía (básica/premium): premium

Miembro creado exitosamente:
=== Datos del Miembro ===
Nombre: Ana García
Edad: 25
Membresía: premium
Plan: Sin asignar
```

### Ejemplo de Ejecución Completa

```
=== MENÚ GIMNASIO ===
1. Crear miembro
2. Crear ejercicio
3. Crear plan de entrenamiento
4. Crear entrenador
5. Salir
Elige una opción: 1

=== CREAR MIEMBRO ===
Nombre: Carlos Ruiz
Edad: 30
Tipo de membresía (básica/premium): premium
Miembro creado exitosamente.

=== MENÚ GIMNASIO ===
1. Crear miembro
2. Crear ejercicio
3. Crear plan de entrenamiento
4. Crear entrenador
5. Salir
Elige una opción: 2

=== CREAR EJERCICIO ===
Nombre del ejercicio: Sentadillas
Número de series: 4
Número de repeticiones: 12
Duración por serie (min): 2
Ejercicio creado exitosamente.

=== MENÚ GIMNASIO ===
1. Crear miembro
2. Crear ejercicio
3. Crear plan de entrenamiento
4. Crear entrenador
5. Salir
Elige una opción: 3

=== CREAR PLAN DE ENTRENAMIENTO ===
Nombre del plan: Plan de Fuerza
Objetivo: Musculación
=== AGREGAR EJERCICIOS (máx 5) ===

Ejercicio 1:
Nombre: Press Banca
Series: 4
Repeticiones: 10
Duración: 2

Ejercicio 2:
Nombre: Sentadillas
Series: 4
Repeticiones: 12
Duración: 2

... (agregar hasta 5 ejercicios)

Plan creado exitosamente:
=== Plan de Fuerza ===
Objetivo: Musculación
Duración total: XX minutos
Ejercicios:
1. Press Banca - 4x10 (XX min)
2. Sentadillas - 4x12 (XX min)
...

=== MENÚ GIMNASIO ===
1. Crear miembro
2. Crear ejercicio
3. Crear plan de entrenamiento
4. Crear entrenador
5. Salir
Elige una opción: 5

Saliendo del programa...
```

### Ayuda para Completar el Ejercicio

**Pistas para los constructores:**

```java
// Constructor por defecto de Ejercicio
public Ejercicio() {
    this.nombre = "Sin nombre";
    this.series = 0;
    this.repeticiones = 0;
    this.duracionMinutos = 0;
}

// Constructor con parámetros
public Ejercicio(String nombre, int series, int repeticiones, int duracionMinutos) {
    this.nombre = nombre;
    this.series = series;
    this.repeticiones = repeticiones;
    this.duracionMinutos = duracionMinutos;
}

// Constructor de copia
public Ejercicio(Ejercicio otro) {
    this.nombre = otro.nombre;
    this.series = otro.series;
    this.repeticiones = otro.repeticiones;
    this.duracionMinutos = otro.duracionMinutos;
}
```

**Pistas para validación de setters:**

```java
public void setNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede estar vacío");
    }
    this.nombre = nombre;
}

public void setSeries(int series) {
    if (series <= 0) {
        throw new IllegalArgumentException("Las series deben ser mayor a 0");
    }
    this.series = series;
}
```

**Pista para duración total:**

```java
public int getDuracionTotal() {
    // Cada repetición toma aproximadamente 1 minuto
    return series * repeticiones;
}
```

---

## Solución del Ejercicio 1 (Referencia)

### Diagrama de Clases

```
┌───────────────┐         ┌───────────────┐
│    Dueño      │    1    │    Mascota    │
├───────────────┤◄───────┤├───────────────┤
│ - nombre      │    *    │ - nombre      │
│ - rfc         │         │ - especie     │
│ - telefono    │         │ - edad        │
└───────────────┘         │ - peso        │
                          │ - dueño       │────► Dueño
                          └───────────────┘
                                 │
                                 │ realiza
                                 ▼
                          ┌───────────────┐
                          │   Consulta    │
                          ├───────────────┤
                          │ - fecha       │
                          │ - costoTotal  │
                          │ - mascota     │
                          │ - veterinario │
                          │ - servicio    │
                          └───────────────┘
                                 │
          ┌──────────────────────┼──────────────────────┐
          │                      │                      │
          ▼                      ▼                      ▼
   ┌───────────────┐    ┌───────────────┐    ┌───────────────┐
   │  Veterinario  │    │    Servicio   │    │    Mascota    │
   ├───────────────┤    ├───────────────┤    ├───────────────┤
   │ - nombre      │    │ - nombre      │    │ (ya definido) │
   │ - numEmpleado │    │ - precio      │    │               │
   │ - especialidad│    │ - duracion    │    │               │
   │ - experiencia │    └───────────────┘    └───────────────┘
   └───────────────┘
```

### Tipo de Relaciones

| Relación | Tipo | Justificación |
|----------|------|---------------|
| Mascota-Dueño | Asociación | La Mascota conoce a su Dueño, pero pueden existir independientemente |
| Consulta-Mascota | Asociación | Una Consulta es de una Mascota específica |
| Consulta-Veterinario | Asociación | Un Veterinario realiza varias Consultas |
| Consulta-Servicio | Dependencia | El Servicio se pasa como parámetro, no se guarda |

### Diagrama de Secuencia (Crear Consulta)

```
┌───────────────┐  ┌────────┐  ┌─────────┐  ┌───────────┐ ┌─────────┐
│    main()     │  │Dueño   │  │Mascota  │  │Veterinario│ │Servicio │
├───────────────┤  ├────────┤  ├─────────┤  ├───────────┤ ├─────────┤
│               │  │        │  │         │  │           │ │         │
│ new Dueño()   │─►│        │  │         │  │           │ │         │
│               │  │        │  │         │  │           │ │         │
│ new Mascota() │──────────►│  |         │  │           │ │         │
│               │  │        │  │         │  │           │ │         │
│ new Vet()     │──────────────────────────►│           │ │         │
│               │  │        │  │         │  │           │ │         │
│ new Servicio()│────────────────────────────────────────►│         │
│               │  │        │  │         │  │           │ │         │
│ new Consulta()│──────────────────────────────────────────────────►│
│  (masc,v,ser)││           │  │         │  │           │ │         │
│               │  │        │  │         │  │           │ │         │
│ consul.mostrar│──────────────────────────────────────────────────►│
└───────────────┘  └────────┘  └─────────┘  └───────────┘ └─────────┘
```

