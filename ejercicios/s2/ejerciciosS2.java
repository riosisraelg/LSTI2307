import java.util.Scanner;

public class ejerciciosS2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Descomenta los métodos para probarlos

        // --- Ejercicios Básicos ---
        basicoEjercicio1();
        // basicoEjercicio2(scanner);
        // basicoEjercicio3(scanner);
        basicoEjercicio4(scanner);

        scanner.close();
    }

    // ========================================================================
    // EJERCICIOS BÁSICOS
    // ========================================================================
    /*
     * # Ejercicios básicos Java: tipos, Scanner, Strings y selección
     * 
     * Cada ejercicio debe resolverse en un programa Java independiente (puedes usar
     * un solo `main` y modificarlo entre ejercicios). Usa `Scanner` para las
     * entradas por teclado cuando aplique.
     */

    /*
     * ## Ejercicio 1: Saludo simple
     ** 
     * Enunciado**
     * Escribe un programa que guarde tu nombre en una variable `String` y lo
     * muestre en pantalla con el mensaje: `Hola, <nombre>`.
     ** 
     * Entrada**
     * Sin entrada por teclado. El nombre va “implícito” en el código.
     ** 
     * Salida esperada (ejemplo)**
     * `Hola, Ricardo`
     */
    public static void basicoEjercicio1() {
        String name = "israel";
        System.out.println("Hola" + name);
    }

    /*
     * ## Ejercicio 2: Suma de dos enteros
     ** 
     * Enunciado**
     * Escribe un programa que pida por teclado dos números enteros y muestre la
     * suma de ambos.
     ** 
     * Entrada (ejemplo)**
     * - Primer número: `5`
     * - Segundo número: `7`
     ** 
     * Salida esperada**
     * `La suma es: 12`
     */
    public static void basicoEjercicio2(Scanner scanner) {
        System.out.println("Ingresa un numero: ");
        int number1 = scanner.nextInt();
        System.out.println("Ingresa un numero: ");
        int number2 = scanner.nextInt();

        // Operation
        int suma = number1 + number2;

        System.out.println("La suma es: " + suma);
    }

    /*
     * ## Ejercicio 3: Conversión de double a int (casting)
     ** 
     * Enunciado**
     * Escribe un programa que pida un número decimal (double), lo convierta a
     * entero usando casting y muestre ambos valores.
     ** 
     * Entrada (ejemplo)**
     * - Número decimal: `10.75`
     ** 
     * Salida esperada**
     * - `Número original (double): 10.75`
     * - `Número convertido (int): 10`
     */
    public static void basicoEjercicio3(Scanner scanner) {
        double doubleNum = scanner.nextDouble();
        int integerNum = (int) doubleNum;
        System.out.println("Numero original (doubel): " + doubleNum);
        System.out.println("Numero convertido (int): " + integerNum);
    }

    /*
     * ## Ejercicio 4: Calculadora básica con operadores
     ** 
     * Enunciado**
     * Escribe un programa que pida dos enteros e imprima: suma, resta,
     * multiplicación, división entera y el residuo (módulo) de la división.
     ** 
     * Entrada (ejemplo)**
     * - Primer número: `10`
     * - Segundo número: `3`
     ** 
     * Salida esperada**
     * - `Suma: 13`
     * - `Resta: 7`
     * - `Multiplicación: 30`
     * - `División entera: 3`
     * - `Módulo: 1`
     */
    public static void basicoEjercicio4(Scanner scanner) {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División entera: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));
    }

    /*
     * ## Ejercicio 5: Mayor de edad (if-else)
     ** 
     * Enunciado**
     * Escribe un programa que pida la edad del usuario y muestre si es mayor o
     * menor de edad usando `if-else`.
     ** 
     * Entrada (ejemplo)**
     * - Edad: `20`
     ** 
     * Salida esperada**
     * `Eres mayor de edad.`
     * 
     * (Si la edad fuera 15, la salida sería: `Eres menor de edad.`)*
     */
    public static void basicoEjercicio5(Scanner scanner) {
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }

    /*
     * ## Ejercicio 6: Clasificación por rango de edad (if-else if)
     ** 
     * Enunciado**
     * Escribe un programa que pida la edad y muestre un mensaje según el rango:
     * - Menor de 13: “Eres un niño.”
     * - De 13 a 17: “Eres un adolescente.”
     * - De 18 a 64: “Eres un adulto.”
     * - 65 o más: “Eres un adulto mayor.”
     ** 
     * Entrada (ejemplo)**
     * - Edad: `30`
     ** 
     * Salida esperada**
     * `Eres un adulto.`
     */
    public static void basicoEjercicio6(Scanner scanner) {
        int age = scanner.nextInt();
        if (age < 13) {
            System.out.pirntln("Kid");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Adolecente");
        } else if (age > 18 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Elder");
        }
    }

    /*
     * ## Ejercicio 7: Día de la semana (switch)
     ** 
     * Enunciado**
     * Escribe un programa que pida un número del 1 al 7 y muestre el día de la
     * semana correspondiente usando `switch`.
     * - 1: Lunes
     * - 2: Martes
     * - 3: Miércoles
     * - 4: Jueves
     * - 5: Viernes
     * - 6: Sábado
     * - 7: Domingo
     ** 
     * Entrada (ejemplo)**
     * - Número: `5`
     ** 
     * Salida esperada**
     * `Viernes`
     * 
     * (Si el número no está entre 1 y 7, muestra: `Opción no válida`.)*
     */
    public static void basicoEjercicio7(Scanner scanner) {
        date = scanner.nextInt();

        switch (date) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    /*
     * ## Ejercicio 8: Comparación de nombres con equalsIgnoreCase
     ** 
     * Enunciado**
     * Escribe un programa que pida al usuario su nombre y lo compare con un nombre
     * definido en el código (por ejemplo, `"Ricardo"`).
     * - Si coincide (ignorando mayúsculas/minúsculas) muestra: `Hola <nombre>,
     * bienvenido.`
     * - Si no coincide, muestra: `Hola <nombre>, tu nombre no coincide.`
     * Este ejercicio se parece a la **Parte 1 de la Actividad 2** de tu curso.
     ** 
     * Entrada (ejemplo)**
     * - Nombre ingresado: `ricardo`
     ** 
     * Salida esperada**
     * `Hola ricardo, bienvenido.`
     * 
     * (Si el usuario ingresa `Ana`, la salida sería: `Hola Ana, tu nombre no
     * coincide.`)*
     */
    public static void basicoEjercicio8(Scanner scanner) {
        String name = scanner.next();

        if (name.equalsIgnoreCase("Ricardo")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Hola " + name + ", tu name no coincide.");
        }
    }

    /*
     * ## Ejercicio 9: Clasificación de calificación (if-else y operadores lógicos)
     ** 
     * Enunciado**
     * Escribe un programa que pida una calificación entera de 0 a 100 y muestre:
     * - 90 a 100: “Excelente”
     * - 80 a 89: “Muy bien”
     * - 70 a 79: “Aprobado”
     * - 0 a 69: “Reprobado”
     * Si la calificación está fuera de ese rango, muestra: “Calificación inválida”.
     ** 
     * Entrada (ejemplo)**
     * - Calificación: `85`
     ** 
     * Salida esperada**
     * `Muy bien`
     */
    public static void basicoEjercicio9(Scanner scanner) {
        int calificacion = scanner.nextInt();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Calificación inválida");
        } else if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) {
            System.out.println("Muy bien");
        } else if (calificacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    /*
     * ## Ejercicio 10: Números pares en un rango (for + arreglo pequeño)
     ** 
     * Enunciado**
     * Escribe un programa que:
     * 1. Pida un número entero **positivo** `n` (por ejemplo, máximo 10 para que
     * sea sencillo).
     * 2. Genere los primeros `n` números pares empezando desde 2.
     * 3. Guarde esos números en un arreglo.
     * 4. Recorra el arreglo y muestre los números en una sola línea separados por
     * espacio.
     * Este ejercicio es una versión pequeña de la **Parte 2 de la Actividad 2**
     * (pares y arreglos).
     ** 
     * Entrada (ejemplo)**
     * - `n`: `5`
     ** 
     * Salida esperada**
     * `2 4 6 8 10`
     */
    public static void basicoEjercicio10(Scanner scanner) {
        // TODO: Implementar solución
    }

    // ========================================================================
    // EJERCICIOS MEDIOS
    // ========================================================================
    /*
     * # Ejercicios Java: comparación y operadores lógicos
     * 
     * Todos los ejercicios deben resolverse usando **estructuras de selección**
     * (`if`, `if-else`, `if-else if`, `switch`) y **operadores lógicos** (`&&`,
     * `||`, `!`, relacionales). No uses estructuras repetitivas todavía.
     */

    /*
     * ## Ejercicio 1: Número positivo o negativo
     ** 
     * Enunciado**
     * Escribe un programa que pida un número entero y muestre si es positivo,
     * negativo o cero usando `if-else if-else`.
     ** 
     * Entrada (ejemplo)**
     * `-3`
     ** 
     * Salida esperada**
     * `El número es negativo.`
     */
    public static void medioEjercicio1(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 2: Par y dentro de rango
     ** 
     * Enunciado**
     * Escribe un programa que pida un número entero y verifique **dos
     * condiciones**:
     * - Que sea par.
     * - Que esté entre 1 y 100 (inclusive).
     * Si se cumplen ambas, muestra: `El número es par y está entre 1 y 100.`
     * En otro caso, muestra: `El número NO cumple las condiciones.`
     * Usa operadores lógicos (`&&`).
     ** 
     * Entrada (ejemplo)**
     * `24`
     ** 
     * Salida esperada**
     * `El número es par y está entre 1 y 100.`
     */
    public static void medioEjercicio2(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 3: Edad válida y mayor de edad
     ** 
     * Enunciado**
     * Escribe un programa que pida una edad entera y verifique:
     * 1. Que la edad esté en el rango 0 a 120.
     * 2. Que sea mayor o igual a 18.
     * Si la edad es inválida (fuera de 0 a 120) muestra: `Edad inválida.`
     * Si es válida y mayor o igual a 18, muestra: `Edad válida y eres mayor de
     * edad.`
     * Si es válida y menor a 18, muestra: `Edad válida y eres menor de edad.`
     ** 
     * Entrada (ejemplo)**
     * `20`
     ** 
     * Salida esperada**
     * `Edad válida y eres mayor de edad.`
     */
    public static void medioEjercicio3(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 4: Acceso a sala por edad y credencial
     ** 
     * Enunciado**
     * Una sala de cine solo permite acceso si:
     * - La edad es mayor o igual a 15 **y**
     * - La persona tiene credencial de estudiante (`true` / `false`).
     * Pide la edad y luego pide si tiene credencial (puedes leer `"si"` o `"no"` y
     * convertir a un `boolean`).
     * Usa `&&` para decidir si puede pasar.
     ** 
     * Entrada (ejemplo)**
     * - Edad: `16`
     * - Tiene credencial (si/no): `si`
     ** 
     * Salida esperada**
     * `Acceso permitido.`
     * 
     * (Si la entrada es: edad 14, credencial "si", salida: `Acceso denegado.`)*
     */
    public static void medioEjercicio4(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 5: Usuario y contraseña correctos
     ** 
     * Enunciado**
     * En el código define dos `String` con usuario y contraseña correctos, por
     * ejemplo:
     * - Usuario correcto: `"admin"`
     * - Contraseña correcta: `"1234"`
     * Pide al usuario que ingrese usuario y contraseña.
     * Usa operadores lógicos y comparación de cadenas (`equals`) para mostrar:
     * - `Acceso concedido.` si **ambos** coinciden.
     * - `Acceso denegado.` en cualquier otro caso.
     ** 
     * Entrada (ejemplo)**
     * - Usuario ingresado: `admin`
     * - Contraseña ingresada: `1234`
     ** 
     * Salida esperada**
     * `Acceso concedido.`
     */
    public static void medioEjercicio5(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 6: Múltiplo de 3 o de 5
     ** 
     * Enunciado**
     * Escribe un programa que pida un número entero y determine:
     * - Si es múltiplo de 3 **o** de 5.
     * Si se cumple alguna de las dos condiciones, muestra: `Es múltiplo de 3 o de
     * 5.`
     * En caso contrario, muestra: `No es múltiplo de 3 ni de 5.`
     * Usa el operador `||`.
     ** 
     * Entrada (ejemplo)**
     * `9`
     ** 
     * Salida esperada**
     * `Es múltiplo de 3 o de 5.`
     * 
     * (Si la entrada fuera 7, la salida sería: `No es múltiplo de 3 ni de 5.`)*
     */
    public static void medioEjercicio6(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 7: Dentro de intervalo cerrado o abierto
     ** 
     * Enunciado**
     * Escribe un programa que pida un número decimal y determine si:
     * - Está en el intervalo **cerrado** [10, 20] (incluye 10 y 20).
     * - O está en el intervalo **abierto** (30, 40) (no incluye 30 ni 40).
     * Si está en alguno de los dos intervalos, muestra:
     * `El número está en uno de los intervalos válidos.`
     * Si no, muestra:
     * `El número está fuera de los intervalos.`
     * Usa operadores relacionales y `||`.
     ** 
     * Entrada (ejemplo)**
     * `35`
     ** 
     * Salida esperada**
     * `El número está en uno de los intervalos válidos.`
     */
    public static void medioEjercicio7(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 8: Clasificación de carácter
     ** 
     * Enunciado**
     * Escribe un programa que pida un solo carácter (puedes leer un `String` y
     * tomar `charAt(0)`) y determine si es:
     * - Una letra mayúscula (`'A'` a `'Z'`)
     * - Una letra minúscula (`'a'` a `'z'`)
     * - Un dígito (`'0'` a `'9'`)
     * - Otro símbolo cualquiera
     * Usa comparaciones de rangos con operadores lógicos (`&&`, `||`) y muestra
     * solo uno de los siguientes mensajes:
     * - `Es una letra mayúscula.`
     * - `Es una letra minúscula.`
     * - `Es un dígito.`
     * - `Es otro tipo de carácter.`
     ** 
     * Entrada (ejemplo)**
     * `F`
     ** 
     * Salida esperada**
     * `Es una letra mayúscula.`
     */
    public static void medioEjercicio8(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 9: Aprobado, extraordinario o reprobado
     ** 
     * Enunciado**
     * Escribe un programa que pida una calificación entera de 0 a 100 y muestre:
     * - Si es menor a 0 o mayor a 100: `Calificación inválida.`
     * - Si está entre 70 y 100 (inclusive): `Aprobado.`
     * - Si está entre 60 y 69 (inclusive): `Extraordinario.`
     * - Si está entre 0 y 59 (inclusive): `Reprobado.`
     * Usa `if`, `else if` y operadores lógicos para los rangos.
     ** 
     * Entrada (ejemplo)**
     * `65`
     ** 
     * Salida esperada**
     * `Extraordinario.`
     */
    public static void medioEjercicio9(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 10: Elegible para beca
     ** 
     * Enunciado**
     * Una universidad otorga beca si se cumplen las siguientes condiciones:
     * - Promedio mayor o igual a 85.
     * - Ingreso familiar mensual menor a 20,000.
     * - Y **no** tiene materias reprobadas (`true` / `false`).
     * Escribe un programa que pida promedio (double), ingreso (double) y si tiene
     * materias reprobadas (puedes leer `"si"`/`"no"` y convertirlo a `boolean`).
     * Usa operadores lógicos `&&` y `!` para mostrar:
     * - `Eres elegible para beca.` si se cumplen todas las condiciones.
     * - `No eres elegible para beca.` en caso contrario.
     ** 
     * Entrada (ejemplo)**
     * - Promedio: `90`
     * - Ingreso familiar: `15000`
     * - ¿Tiene materias reprobadas? `no`
     ** 
     * Salida esperada**
     * `Eres elegible para beca.`
     */
    public static void medioEjercicio10(Scanner scanner) {
        // TODO: Implementar solución
    }

    // ========================================================================
    // EJERCICIOS DIFÍCILES
    // ========================================================================
    /*
     * # Ejercicios Java difíciles: lógica sin ciclos
     * 
     * Usa todo lo visto: tipos de datos, casting, operadores aritméticos,
     * relacionales y lógicos, `String`, `if / if-else / if-else if` y `switch`. No
     * uses estructuras repetitivas.
     */

    /*
     * ## Ejercicio 1: Ordenar tres números (solo condiciones)
     ** 
     * Enunciado**
     * Escribe un programa que pida tres números enteros distintos y muestre el
     * mayor, el del medio y el menor, usando solo `if-else if-else` y operadores
     * lógicos. No puedes usar ciclos ni arreglos.
     ** 
     * Entrada (ejemplo)**
     * - `a = 5`
     * - `b = 2`
     * - `c = 9`
     ** 
     * Salida esperada**
     * `Mayor: 9, Medio: 5, Menor: 2`
     */
    public static void dificilEjercicio1(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 2: Tipo de triángulo
     ** 
     * Enunciado**
     * Escribe un programa que pida tres lados de un triángulo (double) y determine
     * si:
     * - Forman un triángulo válido (cada lado menor que la suma de los otros dos)
     * - Y, si es válido, si es: equilátero, isósceles o escaleno.
     * Usa combinaciones de `&&` y `||` para las comparaciones.
     ** 
     * Entrada (ejemplo)**
     * - Lado1: `3`
     * - Lado2: `3`
     * - Lado3: `3`
     ** 
     * Salida esperada**
     * `Triángulo válido: equilátero.`
     * 
     * (Si los lados fueran 1, 2, 10 la salida sería: `No forman un triángulo
     * válido.`)*
     */
    public static void dificilEjercicio2(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 3: Validador de fecha simple
     ** 
     * Enunciado**
     * Escribe un programa que pida día, mes y año (enteros) y determine si la fecha
     * es válida considerando:
     * - Mes entre 1 y 12.
     * - Día entre 1 y 31.
     * - Para meses 4, 6, 9 y 11 el día máximo es 30.
     * - Para febrero (2) el día máximo es 28 (ignora años bisiestos para
     * simplificar).
     * Usa `if-else if` y operadores lógicos anidados.
     ** 
     * Entrada (ejemplo)**
     * - Día: `31`
     * - Mes: `4`
     * - Año: `2024`
     ** 
     * Salida esperada**
     * `Fecha inválida.`
     * 
     * (Porque abril solo tiene 30 días.)*
     */
    public static void dificilEjercicio3(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 4: Calculadora de tarifa de luz
     ** 
     * Enunciado**
     * Una compañía de luz cobra según el consumo en kWh con las siguientes reglas:
     * - Menos de 100 kWh: tarifa baja.
     * - De 100 a 299 kWh: tarifa media.
     * - De 300 a 499 kWh: tarifa alta.
     * - 500 kWh o más: tarifa muy alta.
     * Pide el consumo (entero) y muestra el tipo de tarifa. Luego, según la tarifa,
     * calcula el monto aproximado usando estos costos:
     * - Baja: 2.0 por kWh
     * - Media: 2.5 por kWh
     * - Alta: 3.0 por kWh
     * - Muy alta: 3.5 por kWh
     * Usa `if-else if` y operadores lógicos, más operadores aritméticos.
     ** 
     * Entrada (ejemplo)**
     * - Consumo: `120`
     ** 
     * Salida esperada (ejemplo)**
     * - `Tarifa: media`
     * - `Monto a pagar: 300.0`
     */
    public static void dificilEjercicio4(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 5: Clasificación de punto en el plano
     ** 
     * Enunciado**
     * Escribe un programa que pida las coordenadas `x` y `y` (double) de un punto y
     * determine:
     * - Si está en el origen (0,0).
     * - Si está sobre el eje X (y = 0, pero x != 0).
     * - Si está sobre el eje Y (x = 0, pero y != 0).
     * - Si está en el primer, segundo, tercer o cuarto cuadrante.
     * Usa operadores relacionales y lógicos para todas las condiciones.
     ** 
     * Entrada (ejemplo)**
     * - x: `-3`
     * - y: `4`
     ** 
     * Salida esperada**
     * `El punto está en el segundo cuadrante.`
     */
    public static void dificilEjercicio5(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 6: Conversor de calificación numérica a letra con validación
     * compleja
     ** 
     * Enunciado**
     * Convierte una calificación numérica (0 a 100) a calificación en letra con la
     * siguiente tabla:
     * - 90–100: A
     * - 80–89: B
     * - 70–79: C
     * - 60–69: D
     * - 0–59: F
     * Además:
     * - Si la calificación está fuera de 0 a 100, muestra: `Calificación inválida.`
     * - Si es menor de 70 pero mayor o igual a 60, agrega un mensaje extra: `Tienes
     * derecho a extraordinario.`
     * Usa `if-else if`, operadores lógicos y concatenación de `String`.
     ** 
     * Entrada (ejemplo)**
     * `65`
     ** 
     * Salida esperada**
     * `Calificación: D. Tienes derecho a extraordinario.`
     */
    public static void dificilEjercicio6(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 7: Validador de contraseña fuerte
     ** 
     * Enunciado**
     * Pide una contraseña (`String`) y evalúa si es “fuerte” con reglas
     * simplificadas:
     * - Longitud mínima: 8 caracteres.
     * - Debe contener al menos una letra mayúscula.
     * - Debe contener al menos una letra minúscula.
     * - Debe contener al menos un dígito.
     * No puedes usar ciclos, así que asume que el usuario solo usará contraseñas de
     * máximo 4 caracteres distintos repetidos varias veces y haz comprobaciones
     * manuales sobre los primeros caracteres con `charAt` y operadores lógicos (la
     * idea es forzarte a pensar la lógica sin for).
     * Si cumple las reglas (según tu lógica limitada), muestra: `Contraseña fuerte
     * (según las reglas simplificadas).`
     * Si no, muestra: `Contraseña débil.`
     ** 
     * Entrada (ejemplo)**
     * `Abcde123`
     ** 
     * Salida esperada (con tu lógica simplificada)**
     * `Contraseña fuerte (según las reglas simplificadas).`
     */
    public static void dificilEjercicio7(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 8: Simulador de atención médica
     ** 
     * Enunciado**
     * En una clínica se decide la prioridad de atención de un paciente según estos
     * datos:
     * - Edad (entero).
     * - ¿Es emergencia? (`true` o `false`, puedes leer `"si"`/`"no"`).
     * - ¿Tiene enfermedad crónica? (`true` o `false`).
     * 
     * Reglas:
     * - Si es emergencia, siempre es “Prioridad máxima”.
     * - Si no es emergencia pero la edad es mayor o igual a 65 **o** tiene
     * enfermedad crónica, es “Prioridad alta”.
     * - En otro caso, “Prioridad normal”.
     * 
     * Usa `if-else` y operadores lógicos `||` y `&&`.
     ** 
     * Entrada (ejemplo)**
     * - Edad: `70`
     * - Emergencia: `no`
     * - Enfermedad crónica: `si`
     ** 
     * Salida esperada**
     * `Prioridad alta.`
     */
    public static void dificilEjercicio8(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 9: Cálculo de pago con múltiples descuentos
     ** 
     * Enunciado**
     * Una tienda ofrece los siguientes descuentos en la compra de un producto:
     * - Si el precio base es mayor o igual a 1000, aplica 10% de descuento.
     * - Si el cliente tiene membresía (`true`/`false`), aplica 5% adicional.
     * - Si es día especial (por ejemplo `"LUNES"` o `"VIERNES"`), aplica 3%
     * adicional.
     * 
     * Las condiciones se pueden combinar (el descuento total es la suma de los
     * porcentajes).
     * Pide: precio base (double), si tiene membresía (`"si"`/`"no"`), y el día de
     * la semana (`String` en mayúsculas).
     * Calcula y muestra el **porcentaje total de descuento** y el **precio final a
     * pagar**.
     ** 
     * Entrada (ejemplo)**
     * - Precio base: `1500`
     * - Membresía: `si`
     * - Día: `LUNES`
     ** 
     * Salida esperada**
     * - `Descuento total: 18%`
     * - `Precio final: 1230.0`
     */
    public static void dificilEjercicio9(Scanner scanner) {
        // TODO: Implementar solución
    }

    /*
     * ## Ejercicio 10: Elegible para crédito bancario
     ** 
     * Enunciado**
     * Un banco decide si una persona es elegible para un crédito según estas reglas
     * complejas:
     * Pide:
     * - Edad (entero)
     * - Ingreso mensual (double)
     * - Historial crediticio bueno (`true`/`false`)
     * - ¿Tiene otras deudas grandes? (`true`/`false`)
     * 
     * Es elegible si:
     * 1. La edad está entre 18 y 65 inclusive.
     * 2. El ingreso mensual es mayor o igual a 15,000.
     * 3. Tiene historial crediticio bueno.
     * 4. Y **no** tiene otras deudas grandes.
     * 
     * Extra: si no cumple pero se queda **cerca** (por ejemplo ingreso entre 12,000
     * y 14,999 y sin deudas grandes, con historial bueno y edad válida), muestra:
     * `Puedes aplicar a revisión manual.`
     * En cualquier otro caso, muestra: `Crédito rechazado.`
     * 
     * Usa combinaciones de `&&`, `||` y `!` en una o varias estructuras `if-else`.
     ** 
     * Entrada (ejemplo)**
     * - Edad: `30`
     * - Ingreso: `14000`
     * - Historial bueno: `si`
     * - Otras deudas grandes: `no`
     ** 
     * Salida esperada**
     * `Puedes aplicar a revisión manual.`
     */
    public static void dificilEjercicio10(Scanner scanner) {
        // TODO: Implementar solución
    }
}
