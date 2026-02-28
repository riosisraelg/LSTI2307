import java.util.Scanner;

public class ejerciciosS4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Descomenta los métodos para probarlos

        ejercicio1(scanner);
        ejercicio2(scanner);
        ejercicio3(scanner);
        ejercicio4(scanner);
        ejercicio5(scanner);
        ejercicio6(scanner);
        ejercicio7(scanner);
        ejercicio8(scanner);
        ejercicio9(scanner);
        ejercicio10(scanner);
        ejercicio11(scanner);
        ejercicio12(scanner);
        ejercicio13(scanner);
        ejercicio14(scanner);
        ejercicio15(scanner);

        scanner.close();
    }

    // --- 1. Suma simple con validación de entrada (fácil) ---
    /*
     * Enunciado:
     * Escribe un programa que pida al usuario dos números enteros, valide que
     * realmente sean enteros usando manejo de errores, y luego muestre la suma de
     * ambos.
     * 
     * Entrada (ejemplo):
     * - Primer número: 10
     * - Segundo número: 25
     * 
     * Salida esperada:
     * La suma de 10 y 25 es: 35
     */
    public static void ejercicio1(Scanner scanner) {
        try {
            System.out.print("Primer número: ");
            int num1 = scanner.nextInt();
            System.out.print("Segundo número: ");
            int num2 = scanner.nextInt();
            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        } catch (Exception e) {
            System.out.println("Entero invalido");
            scanner.next(); // Limpiar entrada invalida.
        }
    }

    // --- 2. Clasificación de edad con mensaje personalizado (fácil) ---
    /*
     * Enunciado:
     * Pide el nombre y la edad del usuario.
     * Usa condicionales para mostrar:
     * - Menos de 13: "Hola <nombre>, eres un niño."
     * - 13 a 17: "Hola <nombre>, eres un adolescente."
     * - 18 a 64: "Hola <nombre>, eres un adulto."
     * - 65 o más: "Hola <nombre>, eres un adulto mayor."
     * 
     * Entrada (ejemplo):
     * - Nombre: Ana
     * - Edad: 20
     * 
     * Salida esperada:
     * Hola Ana, eres un adulto.
     */
    public static void ejercicio2(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Edad: ");
        if (scanner.hasNextInt()) {
            int edad = scanner.nextInt();

            if (edad < 13) {
                System.out.println("Hola " + nombre + ", eres un niño.");
            } else if (edad >= 13 && edad <= 17) {
                System.out.println("Hola " + nombre + ", eres un adolescente.");
            } else if (edad >= 18 && edad <= 64) {
                System.out.println("Hola " + nombre + ", eres un adulto.");
            } else if (edad >= 65) {
                System.out.println("Hola " + nombre + ", eres un adulto mayor.");
            }
        } else {
            System.out.println("Edad invalida (debe ser un número)");
            scanner.next(); // Limpiar entrada
        }
    }

    // --- 3. Tabla de multiplicar con for (fácil) ---
    /*
     * Enunciado:
     * Pide un número entero entre 1 y 10.
     * Muestra su tabla de multiplicar del 1 al 10 usando un ciclo for.
     * Si el usuario ingresa algo no entero, usa manejo de errores para pedir el
     * dato de nuevo.
     * 
     * Entrada (ejemplo):
     * - Número: 7
     * 
     * Salida esperada:
     * 7 x 1 = 7
     * 7 x 2 = 14
     * ...
     * 7 x 10 = 70
     */
    public static void ejercicio3(Scanner scanner) {
        int num = 0; // Guardará el número ingresado
        boolean valid = false; // Esta es la definición del boolean
        while (!valid) {
            try {
                System.out.print("Número (1-10): ");
                num = scanner.nextInt();
                if (num >= 1 && num <= 10)
                    valid = true;
                else {
                    System.out.println("Número fuera de rango.");
                }
            } catch (Exception e) {
                System.out.println("Entero invalido");
                scanner.next();
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // --- 4. Arreglo de calificaciones y promedio (fácil–medio) ---
    /*
     * Enunciado:
     * Pide al usuario cuántas calificaciones desea capturar (máximo 10).
     * Luego pide cada calificación (double) y guárdalas en un arreglo.
     * Calcula y muestra:
     * - El promedio.
     * - Cuántas calificaciones son mayores o iguales a 70 (aprobadas).
     * - Cuántas son menores a 70 (reprobadas).
     * 
     * Entrada (ejemplo):
     * - n = 5
     * - Calificaciones: 100 80 60 70 50
     * 
     * Salida esperada:
     * Promedio: 72.0
     * Aprobadas: 3
     * Reprobadas: 2
     */
    public static void ejercicio4(Scanner scanner) {
        int n = 0;
        while (true) {
            try {
                System.out.print("Ingrese la cantidad de calificaciones (máximo 10): ");
                n = scanner.nextInt();
                if (n > 0 && n <= 10)
                    break;
                System.out.println("Por favor ingrese un número entre 1 y 10.");
            } catch (Exception e) {
                System.out.println("Entrada invalida.");
                scanner.next();
            }
        }

        double[] calificaciones = new double[n];
        double suma = 0;
        int aprobadas = 0;
        int reprobadas = 0;

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Ingrese la calificación " + (i + 1) + ": ");
                    calificaciones[i] = scanner.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Calificación invalida. Debe ser un número (puede tener decimales).");
                    scanner.next(); // Limpiar buffer
                }
            }
        }

        for (double nota : calificaciones) {
            suma += nota;
            if (nota >= 70) {
                aprobadas++;
            } else {
                reprobadas++;
            }
        }

        double promedio = suma / n;
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobadas: " + aprobadas);
        System.out.println("Reprobadas: " + reprobadas);
    }

    // --- 5. Contador de vocales y consonantes en una palabra (medio) ---
    /*
     * Enunciado:
     * Pide al usuario una palabra (sin espacios).
     * Convierte la palabra a minúsculas y recórrela carácter por carácter.
     * Cuenta cuántas vocales (a, e, i, o, u) y cuántas consonantes (letras que no
     * son vocales).
     * Ignora caracteres que no sean letras.
     * 
     * Entrada (ejemplo):
     * - Palabra: Programacion
     * 
     * Salida esperada:
     * Vocales: 5
     * Consonantes: 7
     */
    public static void ejercicio5(Scanner scanner) {
        System.out.print("Ingrese texto (frase o palabra): ");
        // Usamos esta combinación para leer la línea completa asegurando que no se
        // salte
        // si quedó un 'enter' pendiente de otro ejercicio.
        String palabra = scanner.next() + scanner.nextLine();
        palabra = palabra.toLowerCase();

        // 1. Limpiamos para dejar SOLO letras (quitamos números o símbolos si los
        // hubiera)
        String soloLetras = palabra.replaceAll("[^a-z]", "");

        // 2. Estrategia de diferencia: Quitamos las vocales para dejar solo consonantes
        String soloConsonantes = soloLetras.replaceAll("[aeiou]", "");

        int consonantes = soloConsonantes.length();
        int vocales = soloLetras.length() - consonantes;

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    // --- 6. Verificar si un arreglo está ordenado (medio) ---
    /*
     * Enunciado:
     * Pide n números enteros y guárdalos en un arreglo.
     * Escribe un método estático que reciba el arreglo y regrese true si está
     * ordenado de forma ascendente (cada elemento >= anterior), o false en caso
     * contrario.
     * Desde main, muestra un mensaje indicando si el arreglo está ordenado.
     * 
     * Entrada (ejemplo 1):
     * - Arreglo: 1 2 2 5 9
     * Salida esperada (ejemplo 1):
     * El arreglo está ordenado.
     * 
     * Entrada (ejemplo 2):
     * - Arreglo: 3 1 4 2
     * Salida esperada (ejemplo 2):
     * El arreglo NO está ordenado.
     */
    public static void ejercicio6(Scanner scanner) {
        int n = 0;
        while (true) {
            try {
                System.out.println("Ingrese la cantidad de numero (n): ");
                n = scanner.nextInt();
                if (n > 0)
                    break;
                System.out.println("El tamanao debe ser mayor a 0.");
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                scanner.next(); // Limpiar el buffer
            }
        }
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Entero invalido.");
                    scanner.next();
                }
            }
        }

        if (validarOrdenamientoArreglo(arreglo)) {
            System.out.println("El arreglo está ordenado.");
        } else {
            System.out.println("El arreglo no está ordenado.");
        }
    }

    public static boolean validarOrdenamientoArreglo(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < arreglo[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // --- 7. Clase Rectangulo con métodos de área y perímetro (medio) ---
    /*
     * Enunciado:
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
     * 
     * Entrada (ejemplo):
     * - Ancho: 5
     * - Alto: 3
     * 
     * Salida esperada:
     * Área: 15.0
     * Perímetro: 16.0
     */
    public static void ejercicio7(Scanner scanner) {
        double ancho = 0, alto = 0;
        while (true) {
            try {
                System.out.print("Ingrese el ancho: ");
                ancho = scanner.nextDouble();
                System.out.print("Ingrese el alto: ");
                alto = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Debe ser un número.");
                scanner.next(); // Limpiar el buffer
            }
        }

        Rectangulo rect = new Rectangulo(ancho, alto);
        System.out.println("Área: " + rect.calcularArea());
        System.out.println("Perímetro: " + rect.calcularPerimetro());
    }

    public static class Rectangulo {
        // atributos
        private double ancho = 0;
        private double alto = 0;

        // constructor
        public Rectangulo(double ancho, double alto) {
            this.ancho = ancho;
            this.alto = alto;
        }

        // getters
        public double getAncho() {
            return ancho;
        }

        public double getAlto() {
            return alto;
        }

        // setters
        public void setAncho(double ancho) {
            this.ancho = ancho;
        }

        public void setAlto(double alto) {
            this.alto = alto;
        }

        // métodos
        public double calcularArea() {
            return ancho * alto;
        }

        public double calcularPerimetro() {
            return 2 * (ancho + alto);
        }
    }

    // --- 8. Buscar un número en un arreglo (medio) ---
    /*
     * Enunciado:
     * Pide n enteros y guárdalos en un arreglo.
     * Luego pide un número x a buscar.
     * Usa un método estático buscarElemento(int[] arr, int x) que regrese el índice
     * donde se encuentra la primera ocurrencia de x, o -1 si no existe.
     * En main, muestra un mensaje adecuado.
     * 
     * Entrada (ejemplo):
     * - n = 6
     * - Arreglo: 4 7 2 7 9 1
     * - x = 7
     * 
     * Salida esperada:
     * El número 7 se encontró en el índice: 1
     */
    public static void ejercicio8(Scanner scanner) {
        int n = 0;
        // 1. Pedir tamaño del arreglo
        while (true) {
            try {
                System.out.print("Ingrese la cantidad de números (n): ");
                n = scanner.nextInt();
                if (n > 0)
                    break;
                System.out.println("Debe ser mayor a 0.");
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                scanner.next();
            }
        }

        // 2. Crear el arreglo AHORA que sabemos cuánto vale n
        int[] arreglo = new int[n];

        // 3. Llenar el arreglo
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Ingrese el número " + (i + 1) + ": ");
                    arreglo[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Número inválido.");
                    scanner.next();
                }
            }
        }

        // 4. Pedir número a buscar
        System.out.print("Ingrese el número a buscar (x): ");
        // Asumimos que aquí ingresa un entero válido por simplicidad, o puedes agregar
        // try-catch
        int x = scanner.nextInt();

        // 5. Llamar al método de búsqueda
        int indice = buscarElemento(arreglo, x);

        if (indice != -1) {
            System.out.println("El número " + x + " se encontró en el índice: " + indice);
        } else {
            System.out.println("El número " + x + " no existe en el arreglo.");
        }
    }

    public static int buscarElemento(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            // Si encontramos el número, retornamos la posición (i) inmediatamente
            if (arr[i] == x) {
                return i;
            }
        }
        // Si termina el ciclo y no retornó nada, es que no estaba
        return -1;
    }

    // --- 9. Sistema simple de biblioteca con clase Libro (medio–alto) ---
    /*
     * Enunciado:
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
     * 
     * Entrada (ejemplo de flujo):
     * - Ver info, Prestar, Prestar, Prestar, Prestar (cuando ya no haya), Ver info,
     * Salir
     * 
     * Salida esperada (resumen):
     * - Mensajes de préstamo exitoso hasta que se acaben los ejemplares.
     * - Mensaje "No hay ejemplares disponibles" cuando ya no queden.
     * - Información con totales y disponibles actualizados.
     */
    public static void ejercicio9(Scanner scanner) {
        // TODO: Implementar solución
    }

    // --- 10. Calculadora con menú usando switch (medio) ---
    /*
     * Enunciado:
     * Crea un programa que muestre un menú:
     * - Sumar, Restar, Multiplicar, Dividir, Salir
     * Cada opción pide dos números y muestra el resultado.
     * En la opción de división, valida que el divisor no sea 0 y maneja el error
     * (mensaje y volver a pedir divisor válido).
     * Usa do-while para repetir el menú hasta que el usuario elija salir.
     * 
     * Entrada (ejemplo):
     * - Opción 1, números: 10 y 5
     * - Opción 4, números: 8 y 0 (debe pedir otro divisor)
     * - Opción 5
     * 
     * Salida esperada (resumen):
     * Suma: 15
     * Error: no se puede dividir entre cero. Ingresa otro divisor.
     * División: 8 / 2 = 4
     */
    public static void ejercicio10(Scanner scanner) {
        int opcion = 0;
        do {
            System.out.println("\n--- Menú Calculadora ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            while (true) {
                try {
                    opcion = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Opción inválida. Debe ser un número.");
                    scanner.next(); // Limpiar buffer
                    System.out.print("Seleccione una opción: ");
                }
            }

            if (opcion >= 1 && opcion <= 4) {
                double n1 = 0, n2 = 0;
                // Pedir números con validación básica de tipo
                while (true) {
                    try {
                        System.out.print("Ingrese el primer número: ");
                        n1 = scanner.nextDouble();
                        System.out.print("Ingrese el segundo número: ");
                        n2 = scanner.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.println("Entrada inválida. Deben ser números.");
                        scanner.next();
                    }
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Suma: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Resta: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("Multiplicación: " + (n1 * n2));
                        break;
                    case 4:
                        while (n2 == 0) {
                            System.out.println("Error: no se puede dividir entre cero.");
                            System.out.print("Ingresa otro divisor válido: ");
                            try {
                                n2 = scanner.nextDouble();
                            } catch (Exception e) {
                                scanner.next();
                            }
                        }
                        System.out.println("División: " + (n1 / n2));
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
        System.out.println("Saliendo de la calculadora...");
    }

    // --- 11. Arreglo de productos con precio final (medio–alto) ---
    /*
     * Enunciado:
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
     * 
     * Entrada (ejemplo):
     * - n = 2
     * - Producto 1: "Mouse", costo 100, impuesto 16
     * - Producto 2: "Teclado", costo 200, impuesto 16
     * - utilidad = 20
     * 
     * Salida esperada (resumen):
     * Producto: Mouse | Costo: 100.0 | Impuesto: 16.0 | Precio final: 139.2
     * Producto: Teclado| Costo: 200.0 | Impuesto: 16.0 | Precio final: 278.4
     */
    public static void ejercicio11(Scanner scanner) {
        int n = 0;
        while (true) {
            try {
                System.out.print("Ingrese la cantidad de productos (máximo 5): ");
                n = scanner.nextInt();
                if (n > 0 && n <= 5)
                    break;
                System.out.println("Debe ser entre 1 y 5.");
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                scanner.next();
            }
        }

        Producto[] productos = new Producto[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Producto " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = scanner.next();

            double costo = 0, impuesto = 0;
            while (true) {
                try {
                    System.out.print("Costo: ");
                    costo = scanner.nextDouble();
                    System.out.print("Impuesto (%): ");
                    impuesto = scanner.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Error al leer números. Intente de nuevo.");
                    scanner.next();
                }
            }
            productos[i] = new Producto(nombre, costo, impuesto);
        }

        double utilidad = 0;
        while (true) {
            try {
                System.out.print("\nIngrese el porcentaje de utilidad general: ");
                utilidad = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                scanner.next();
            }
        }

        System.out.println("\n--- Tabla de Productos ---");
        for (Producto p : productos) {
            // Usamos printf para formatear a 2 decimales y que se vea mejor
            System.out.printf("Producto: %s | Costo: %.2f | Impuesto: %.2f%% | Precio Final: %.2f%n",
                    p.getNombre(), p.getCosto(), p.getImpuesto(), p.calcularPrecioFinal(utilidad));
        }
    }

    public static class Producto {
        private String nombre;
        private double costo;
        private double impuesto;

        public Producto(String nombre, double costo, double impuesto) {
            this.nombre = nombre;
            this.costo = costo;
            this.impuesto = impuesto;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getCosto() {
            return costo;
        }

        public void setCosto(double costo) {
            this.costo = costo;
        }

        public double getImpuesto() {
            return impuesto;
        }

        public void setImpuesto(double impuesto) {
            this.impuesto = impuesto;
        }

        // Métodos
        public double calcularPrecioFinal(double utilidad) {
            double ganancia = this.costo * (utilidad / 100);
            double precioBase = this.costo + ganancia;
            double montoImpuesto = precioBase * (this.impuesto / 100);
            return precioBase + montoImpuesto;
        }
    }

    // --- 12. Verificar si una frase es palíndromo (medio–alto) ---
    /*
     * Enunciado:
     * Pide una frase al usuario.
     * Remueve espacios y conviértela a minúsculas.
     * Luego, verifica si se lee igual de izquierda a derecha y de derecha a
     * izquierda (palíndromo).
     * No uses métodos de librerías que ya lo hagan directo: trabaja con índices o
     * un arreglo de caracteres y un ciclo for o while.
     * 
     * Entrada (ejemplo):
     * - Frase: Anita lava la tina
     * 
     * Salida esperada:
     * La frase es un palíndromo.
     */
    public static void ejercicio12(Scanner scanner) {
        String frase, fraseInvertida = "";

        scanner.nextLine();
        System.out.print("Ingrese la frase: ");
        frase = scanner.nextLine();

        String fraseLimpia = frase.replaceAll("\\s+", "").toLowerCase();
        int i = fraseLimpia.length() - 1;

        while (i >= 0) {
            fraseInvertida += fraseLimpia.charAt(i);
            i--;
        }

        if (fraseLimpia.equals(fraseInvertida)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }

    // --- 13. Matriz de notas (medio–alto) ---
    /*
     * Enunciado:
     * Un grupo tiene f estudiantes y cada uno tiene c materias.
     * Pide f y c (por ejemplo máximo 5x5).
     * Crea una matriz double[f][c] con las calificaciones.
     * Luego:
     * Calcula y muestra el promedio de cada estudiante.
     * Calcula y muestra el promedio de cada materia.
     * 
     * Entrada (ejemplo):
     * - f = 2, c = 3
     * - Notas: Estudiante 0 (80 90 100), Estudiante 1 (70 60 50)
     * 
     * Salida esperada:
     * Promedio estudiante 0: 90.0
     * Promedio estudiante 1: 60.0
     * Promedio materia 0: 75.0
     * Promedio materia 1: 75.0
     * Promedio materia 2: 75.0
     */
    public static void ejercicio13(Scanner scanner) {
        int f = 0, c = 0;
        double[][] notas;
        while (true) {
            try {
                System.out.print("Ingrese número de estudiantes (f): ");
                f = scanner.nextInt();
                System.out.print("Ingrese número de materias (c): ");
                c = scanner.nextInt();
                if (f > 0 && c > 0)
                    break;
                System.out.println("Las dimensiones deben ser mayores a 0.");
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                scanner.next();
            }
        }

        notas = new double[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Nota estudiante %d, materia %d: ", i, j);
                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < f; i++) {
            double suma = 0;
            for (int j = 0; j < c; j++) {
                suma += notas[i][j];
            }
            System.out.println("Promedio estudiante " + i + ": " + (suma / c));
        }

        for (int j = 0; j < c; j++) {
            double suma = 0;
            for (int i = 0; i < f; i++) {
                suma += notas[i][j];
            }
            System.out.println("Promedio materia " + j + ": " + (suma / f));
        }
    }

    // --- 14. Sistema simple de login con intentoss limitados (medio–alto) ---
    /*
     * Enunciado:
     * Define, en el código, un usuario y contraseña correctos (por ejemplo, "admin"
     * y "1234").
     * Pide al usuario que ingrese usuario y contraseña, y valida con equals.
     * Permite máximo 3 intentoss.
     * Si los datos son correctos, muestra "Acceso concedido" y termina.
     * Si se alcanzan 3 intentoss fallidos, muestra "Cuenta bloqueada" y termina.
     * Usa un ciclo while o for para contar intentoss.
     * 
     * Entrada (ejemplo):
     * - intentos 1: user admin, pass 1111
     * - intentos 2: user Admin, pass 1234
     * - intentos 3: user admin, pass 1234
     * 
     * Salida esperada:
     * Datos incorrectos. Te quedan 2 intentoss.
     * Datos incorrectos. Te quedan 1 intentoss.
     * Acceso concedido.
     */
    public static void ejercicio14(Scanner scanner) {
        String trueUser = "", truePass = "", user = "root", pass = "root";
        int intentos = 3;
        boolean acceso = false;
        for (int i = 1; i <= 3; i++) {
            System.out.println("intentos " + i);
            System.out.print("Ingrese usuario: ");
            String usuario = scanner.next();
            System.out.print("Ingrese contraseña: ");
            String password = scanner.next();

            // validar
            if (usuario.equals(user) && password.equals(pass)) {
                System.out.println("Acceso concedido.");
                acceso = true;
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Datos incorrectos. Te quedan " + intentos + " intentoss.");
                }
            }
        }
        if (!acceso) {
            System.out.println("Cuenta bloqueada.");
        }

    }

    // --- 15. Gestión de inventario con clase y menú (difícil) ---
    /*
     * Enunciado:
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
     * 
     * Entrada (ejemplo, flujo reducido):
     * - Opción 1: agregar artículo código A1, desc "Lapicero", precio 10,
     * existencia 100
     * - Opción 2: mostrar artículos
     * - Opción 3: vender código A1, cantidad 30
     * - Opción 4: vender código A1, cantidad 100 (debe decir que no hay suficiente)
     * - Opción 5: salir
     * 
     * Salida esperada (resumen):
     * Artículo agregado correctamente.
     * Código: A1, Descripción: Lapicero, Precio: 10.0, Existencia: 100
     * Venta realizada. Nueva existencia: 70
     * No hay suficiente existencia para vender esa cantidad.
     */
    public static void ejercicio15(Scanner scanner) {
        Articulo[] articulos = new Articulo[5];
        int opcion = 0;

        do {
            System.out.println("\n--- Sistema de Inventario ---");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Mostrar artículos");
            System.out.println("3. Vender artículo");
            System.out.println("4. Reabastecer");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next();
                opcion = 0;
                continue;
            }

            switch (opcion) {
                case 1:
                    boolean espacioEncontrado = false;
                    for (int i = 0; i < articulos.length; i++) {
                        if (articulos[i] == null) {
                            System.out.println("\n--- Captura de Nuevo Artículo ---");
                            System.out.print("Código: ");
                            String cod = scanner.next();
                            System.out.print("Descripción: ");
                            String desc = scanner.next() + scanner.nextLine();

                            double prec = 0;
                            while (true) {
                                try {
                                    System.out.print("Precio: ");
                                    prec = scanner.nextDouble();
                                    if (prec > 0)
                                        break;
                                    System.out.println("El precio debe ser mayor a 0.");
                                } catch (Exception e) {
                                    System.out.println("Error: Ingrese un precio válido.");
                                    scanner.next();
                                }
                            }

                            int exist = 0;
                            while (true) {
                                try {
                                    System.out.print("Existencia inicial: ");
                                    exist = scanner.nextInt();
                                    if (exist >= 0)
                                        break;
                                    System.out.println("La existencia no puede ser negativa.");
                                } catch (Exception e) {
                                    System.out.println("Error: Ingrese un número entero válido.");
                                    scanner.next();
                                }
                            }

                            articulos[i] = new Articulo(cod, desc, prec, exist);
                            System.out.println("¡Artículo agregado exitosamente!");
                            espacioEncontrado = true;
                            break;
                        }
                    }
                    if (!espacioEncontrado) {
                        System.out.println("Error: Inventario lleno (máximo 5 artículos).");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Lista de Artículos ---");
                    for (Articulo art : articulos) {
                        if (art != null) {
                            art.mostrar();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n--- Venta de Artículos ---");
                    System.out.print("Ingrese el código del artículo: ");
                    String codVenta = scanner.next();

                    int cantVenta = 0;
                    while (true) {
                        try {
                            System.out.print("Cantidad a vender: ");
                            cantVenta = scanner.nextInt();
                            if (cantVenta > 0)
                                break;
                            System.out.println("La cantidad debe ser mayor a 0.");
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un número entero.");
                            scanner.next();
                        }
                    }

                    boolean encontradoVenta = false;
                    for (Articulo art : articulos) {
                        if (art != null && art.getCodigo().equals(codVenta)) {
                            art.actualizarExistencia(-cantVenta);
                            encontradoVenta = true;
                            break;
                        }
                    }
                    if (!encontradoVenta) {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("\n--- Reabastecer Artículo ---");
                    System.out.print("Ingrese el código del artículo: ");
                    String codRe = scanner.next();

                    int cantRe = 0;
                    while (true) {
                        try {
                            System.out.print("Cantidad a reabastecer: ");
                            cantRe = scanner.nextInt();
                            if (cantRe > 0)
                                break;
                            System.out.println("La cantidad debe ser mayor a 0.");
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un número entero.");
                            scanner.next();
                        }
                    }

                    boolean encontradoRe = false;
                    for (Articulo art : articulos) {
                        if (art != null && art.getCodigo().equals(codRe)) {
                            art.actualizarExistencia(cantRe);
                            encontradoRe = true;
                            break;
                        }
                    }
                    if (!encontradoRe) {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema de inventario...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }

    public static class Articulo {
        private String codigo;
        private String descripcion;
        private double precio;
        private int existencia;

        public Articulo(String codigo, String descripcion, double precio, int existencia) {
            this.codigo = codigo;
            this.descripcion = descripcion;
            this.precio = precio;
            this.existencia = existencia;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getDescripcion() {

            return descripcion;

        }

        public void setDescripcion(String descripcion) {

            this.descripcion = descripcion;

        }

        public double getPrecio() {

            return precio;

        }

        public void setPrecio(double precio) {

            this.precio = precio;

        }

        public int getExistencia() {

            return existencia;

        }

        public void setExistencia(int existencia) {

            this.existencia = existencia;

        }

        public void mostrar() {
            System.out.printf("Código: %s | Descripción: %s | Precio: %.2f | Existencia: %d%n",
                    this.codigo, this.descripcion, this.precio, this.existencia);
        }

        public void actualizarExistencia(int cantidad) {
            if (this.existencia + cantidad < 0) {
                System.out.println("No hay suficiente existencia para vender esa cantidad.");
            } else {
                this.existencia += cantidad;
                if (cantidad < 0) {
                    System.out.println("Venta realizada. Nueva existencia: " + this.existencia);
                } else {
                    System.out.println("Reabastecimiento realizado. Nueva existencia: " + this.existencia);
                }
            }
        }
    }
}