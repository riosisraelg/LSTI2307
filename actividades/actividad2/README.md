# Actividad 2

Este repositorio contiene el codigo de la activdad 2 de la asignatura LSTI2307 del segundo semestre de la carrera de Universidad Tecmilenio. Presentado el 22 de enero del 2026.

---

# Instrucciones

Las instrcciones de la activdad se encuentral dando [click](https://utm-cdn-labcontenidos-htfaarehf2gcfycs.a01.azurefd.net/contenido/profesional/ltbi2507/entregables-v1/actividad-02.html?version=1).

# Codigo 

```java
/*
 * @(#)Main.java        2026/01/21
 * java version "25" (build 25+35-2776)
 * javac src/Main.java
 * java -cp src Main
 */

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        parte1(sc);
        parte2(sc);
    }

    public static void parte1(Scanner sc) {
        System.out.println("Ingresa un nombre");
        String nombre = sc.nextLine();
        if (nombre == "Silvano") {
            System.out.println("Que tranza Silvano");
        } else {
            System.out.println("Que onda");
        }
    }

    public static void parte2(Scanner sc) {
        int array[] = new int[50];
        int index = 0;

        for (int i = 2; i <= 100; i += 2) {
            array[index] = i;
            index++;
        }

        System.out.println("Lista de números pares:");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
```

# Output

```console
Ingresa un nombre
a
Que onda
Lista de números pares:
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100
```