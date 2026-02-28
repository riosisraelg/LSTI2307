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