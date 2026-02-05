import java.util.Scanner;

public class Coche {
    // atributos
    public String marca;
    public String modelo;
    public String color;
    public int velocidad;
    public String estadoEncendido;
    public String estatusCoche;

    // metodos
    Scanner sc = new Scanner(System.in);

    public void summaryCoche() {
        System.out.println("\n========================================");
        System.out.println("           DETALLES DEL COCHE           ");
        System.out.println("========================================");
        System.out.printf("  Marca:         %s%n", marca);
        System.out.printf("  Modelo:        %s%n", modelo);
        System.out.printf("  Color:         %s%n", color);
        System.out.printf("  Velocidad:     %d km/h%n", velocidad);
        System.out.printf("  Estado:        %s%n", estadoEncendido);
        System.out.println("========================================\n");
    }

    public void encender() {
        if (estadoEncendido.equals("apagado")) {
            estadoEncendido = "encendido";
            System.out.println("El coche se ha encendido");
        } else {
            System.out.println("El coche ya esta encendido");
        }
    }

    public void apagar() {
        if (estadoEncendido.equals("encendido")) {
            estadoEncendido = "apagado";
            System.out.println("El coche se ha apagado");
        } else {
            System.out.println("El coche ya esta apagado");
        }
    }

    public void acelerar() {
        if (estadoEncendido.equals("encendido")) {
            int velocidadAntigua = velocidad;
            velocidad += 10;
            System.out.printf(
                    "Acelerando el coche... La velocidad anterior del coche es: %d al realizar el cambio la velocidad actual del coche es: %d",
                    velocidadAntigua, velocidad);
        } else {
            System.out.println("El coche esta apagado, no puede acelerar");
        }
    }

    public void frenar() {
        if (estadoEncendido.equals("encendido")) {
            int velocidadAntigua = velocidad;
            velocidad -= 10;
            System.out.printf(
                    "Frenando el coche...La velocidad anterior del coche es: %d al realizar el cambio la velocidad actual del coche es: %d%n",
                    velocidadAntigua, velocidad);
        } else {
            System.out.println("El coche esta apagado, no puede frenar");
        }
    }

    public void cambiarColor() {
        String colorAntiguo = color;
        System.out.println("Esta por modificar el color de su coche, ¿a cual lo desea cambiar?");
        color = sc.nextLine();
        System.out.printf("El anterior color del coche es: %s al realizar el cambio el color actual del coche es: %s%n",
                colorAntiguo, color);
    }
}
