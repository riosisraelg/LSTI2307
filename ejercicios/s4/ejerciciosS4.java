import java.util.Scanner;

public class ejerciciosS4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Descomenta los métodos para probarlos

        // ejercicio1(scanner);
        // ejercicio2(scanner);
        // ejercicio3(scanner);
        // ejercicio4(scanner);
        // ejercicio5(scanner);
        // ejercicio6(scanner);
        // ejercicio7(scanner);
        // ejercicio8(scanner);
        // ejercicio9(scanner);
        // ejercicio10(scanner);
        // ejercicio11(scanner);
        // ejercicio12(scanner);
        // ejercicio13(scanner);
        // ejercicio14(scanner);
        // ejercicio15(scanner);

        scanner.close();
    }

    // --- 1. Suma simple con validación de entrada (fácil) ---
    /*
     * Enunciado
     * Escribe un programa que pida al usuario dos números enteros, valide que
     * realmente sean enteros usando manejo de errores,
     * y luego muestre la suma de ambos.
     */
    public static void ejercicio1(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 2. Clasificación de edad con mensaje personalizado (fácil) ---
    /*
     * Enunciado
     * Pide el nombre y la edad del usuario.
     * Usa condicionales para mostrar:
     * - Menos de 13: "Hola <nombre>, eres un niño."
     * - 13 a 17: "Hola <nombre>, eres un adolescente."
     * - 18 a 64: "Hola <nombre>, eres un adulto."
     * - 65 o más: "Hola <nombre>, eres un adulto mayor."
     */
    public static void ejercicio2(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 3. Tabla de multiplicar con for (fácil) ---
    /*
     * Enunciado
     * Pide un número entero entre 1 y 10.
     * Muestra su tabla de multiplicar del 1 al 10 usando un ciclo for.
     * Si el usuario ingresa algo no entero, usa manejo de errores para pedir el
     * dato de nuevo.
     */
    public static void ejercicio3(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 4. Arreglo de calificaciones y promedio (fácil–medio) ---
    /*
     * Enunciado
     * Pide al usuario cuántas calificaciones desea capturar (máximo 10).
     * Luego pide cada calificación (double) y guárdalas en un arreglo.
     * Calcula y muestra:
     * - El promedio.
     * - Cuántas calificaciones son mayores o iguales a 70 (aprobadas).
     * - Cuántas son menores a 70 (reprobadas).
     */
    public static void ejercicio4(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 5. Contador de vocales y consonantes en una palabra (medio) ---
    /*
     * Enunciado
     * Pide al usuario una palabra (sin espacios).
     * Convierte la palabra a minúsculas y recórrela carácter por carácter.
     * Cuenta cuántas vocales (a, e, i, o, u) y cuántas consonantes (letras que no
     * son vocales).
     * Ignora caracteres que no sean letras.
     */
    public static void ejercicio5(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 6. Verificar si un arreglo está ordenado (medio) ---
    /*
     * Enunciado
     * Pide n números enteros y guárdalos en un arreglo.
     * Escribe un método estático que reciba el arreglo y regrese true si está
     * ordenado de forma ascendente (cada elemento >= anterior),
     * o false en caso contrario.
     * Desde main, muestra un mensaje indicando si el arreglo está ordenado.
     */
    public static void ejercicio6(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 7. Clase Rectangulo con métodos de área y perímetro (medio) ---
    /*
     * Enunciado
     * Crea una clase Rectangulo con atributos privados ancho y alto (double).
     * Incluye:
     * - Constructor que reciba ancho y alto.
     * - Getters y setters.
     * - Método calcularArea() que regrese el área.
     * - Método calcularPerimetro() que regrese el perímetro.
     * En main:
     * - Pide al usuario ancho y alto (con manejo de errores).
     * - Crea un objeto Rectangulo.
     * - Muestra su área y perímetro.
     */
    public static void ejercicio7(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 8. Buscar un número en un arreglo (medio) ---
    /*
     * Enunciado
     * Pide n enteros y guárdalos en un arreglo.
     * Luego pide un número x a buscar.
     * Usa un método estático buscarElemento(int[] arr, int x) que regrese el índice
     * donde se encuentra la primera ocurrencia de x, o -1 si no existe.
     * En main, muestra un mensaje adecuado.
     */
    public static void ejercicio8(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 9. Sistema simple de biblioteca con clase Libro (medio–alto) ---
    /*
     * Enunciado
     * Crea una clase Libro con:
     * Atributos privados: titulo (String), autor (String), totalEjemplares (int),
     * ejemplaresPrestados (int).
     * Getters y setters.
     * Método prestar() que:
     * Si hay ejemplares disponibles (totalEjemplares - ejemplaresPrestados > 0),
     * aumente ejemplaresPrestados y regrese true.
     * En otro caso regrese false.
     * Método devolver() que:
     * Si ejemplaresPrestados > 0, lo disminuye y regresa true.
     * En otro caso regresa false.
     * Método mostrarInfo() que muestre todos los datos.
     * En main:
     * Crea un objeto Libro con datos fijos.
     * Muestra un menú con while o do-while para:
     * - Ver información del libro.
     * - Prestar un ejemplar.
     * - Devolver un ejemplar.
     * - Salir.
     */
    public static void ejercicio9(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 10. Calculadora con menú usando switch (medio) ---
    /*
     * Enunciado
     * Crea un programa que muestre un menú:
     * - Sumar
     * - Restar
     * - Multiplicar
     * - Dividir
     * - Salir
     * Cada opción pide dos números y muestra el resultado.
     * En la opción de división, valida que el divisor no sea 0 y maneja el error
     * (mensaje y volver a pedir divisor válido).
     * Usa do-while para repetir el menú hasta que el usuario elija salir.
     */
    public static void ejercicio10(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 11. Arreglo de productos con precio final (medio–alto) ---
    /*
     * Enunciado
     * Crea una clase Producto con atributos privados: nombre (String), costo
     * (double), impuesto (double, %).
     * Incluye getters, setters y un método calcularPrecio(double utilidad) que
     * regrese el precio final (costo + utilidad + impuesto).
     * En main:
     * Pide al usuario cuántos productos va a capturar (máximo 5).
     * Usa un arreglo de Producto para almacenarlos.
     * Para cada producto, pide nombre, costo, impuesto, con manejo de errores en
     * los números.
     * Luego pide un porcentaje de utilidad general para todos.
     * Muestra una tabla con: nombre, costo, impuesto, precio final.
     */
    public static void ejercicio11(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 12. Verificar si una frase es palíndromo (medio–alto) ---
    /*
     * Enunciado
     * Pide una frase al usuario.
     * Remueve espacios y conviértela a minúsculas.
     * Luego, verifica si se lee igual de izquierda a derecha y de derecha a
     * izquierda (palíndromo).
     * No uses métodos de librerías que ya lo hagan directo: trabaja con índices o
     * un arreglo de caracteres y un ciclo for o while.
     */
    public static void ejercicio12(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 13. Matriz de notas (medio–alto) ---
    /*
     * Enunciado
     * Un grupo tiene f estudiantes y cada uno tiene c materias.
     * Pide f y c (por ejemplo máximo 5x5).
     * Crea una matriz double[f][c] with las calificaciones.
     * Luego:
     * Calcula y muestra el promedio de cada estudiante.
     * Calcula y muestra el promedio de cada materia.
     */
    public static void ejercicio13(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 14. Sistema simple de login con intentos limitados (medio–alto) ---
    /*
     * Enunciado
     * Define, en el código, un usuario y contraseña correctos (por ejemplo, "admin"
     * y "1234").
     * Pide al usuario que ingrese usuario y contraseña, y valida con equals.
     * Permite máximo 3 intentos.
     * Si los datos son correctos, muestra "Acceso concedido" y termina.
     * Si se alcanzan 3 intentos fallidos, muestra "Cuenta bloqueada" y termina.
     * Usa un ciclo while o for para contar intentos.
     */
    public static void ejercicio14(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 15. Gestión de inventario con clase y menú (difícil) ---
    /*
     * Enunciado
     * Crea una clase Articulo con:
     * Atributos privados: codigo (String), descripcion (String), precio (double),
     * existencia (int).
     * Getters y setters.
     * Método mostrar() que imprima todos los datos.
     * Método actualizarExistencia(int cantidad) que sume la cantidad a existencia
     * (puede ser negativa para "vender").
     * Si la operación dejaría existencia negativa, no la hagas y avisa con un
     * mensaje.
     * En main:
     * Define un arreglo de Articulo de tamaño fijo (por ejemplo 5).
     * Crea un menú con do-while y switch:
     * - Agregar artículo (en la primera posición libre del arreglo).
     * - Mostrar todos los artículos (solo los no nulos).
     * - Vender artículo: pide código y cantidad, busca el artículo en el arreglo, y
     * usa actualizarExistencia(-cantidad) validando que haya suficiente.
     * - Reabastecer artículo: similar a vender, pero suma existencias.
     * - Salir.
     */
    public static void ejercicio15(Scanner scanner) {
        // TODO: Implementar solución
    }
}
