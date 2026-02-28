import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        // Crear instancias
        Coche coche1 = new Coche();
        Motor motor1 = new Motor();

        // Asignar valores a los atributos de las intancias
        // Coche
        coche1.color = "Rojo";
        coche1.marca = "Toyota";
        coche1.modelo = "Corolla";
        coche1.velocidad = 0;
        coche1.estadoEncendido = "encendido";
        // Motor
        motor1.tipo = "Electrico";
        motor1.cilindros = 4;
        motor1.numeroSerie = 123456;
        motor1.potencia = 120;
        motor1.nivelAceite = 10;
        motor1.saludMotor = 10;
        motor1.estadoCalentamiento = "caliente";

        // Usar los metodos
        coche1.summaryCoche();
        Thread.sleep(3000);
        clearScreen();
        motor1.summaryMotor(coche1);
        Thread.sleep(3000);
        clearScreen();
        coche1.encender();
        Thread.sleep(3000);
        clearScreen();
        motor1.calentar(coche1);
        Thread.sleep(3000);
        clearScreen();
        coche1.acelerar();
        Thread.sleep(3000);
        clearScreen();
        coche1.frenar();
        Thread.sleep(3000);
        clearScreen();
        coche1.apagar();
        Thread.sleep(3000);
        clearScreen();
        coche1.cambiarColor();
        Thread.sleep(3000);
        clearScreen();
        motor1.cambiarAceite();
        Thread.sleep(3000);
        clearScreen();
        motor1.reparar();
        Thread.sleep(3000);
        clearScreen();
        motor1.tunear();
        Thread.sleep(3000);
    }
}
