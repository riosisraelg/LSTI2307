import java.util.Scanner;

public class Motor extends Coche {
    // atributos
    public String tipo;
    public int cilindros;
    public int numeroSerie;
    public double potencia;
    public int nivelAceite;
    public int saludMotor;
    public String estadoCalentamiento;

    // metodos
    Scanner sc = new Scanner(System.in);

    public void summaryMotor(Coche coche) {
        System.out.println("\n========================================");
        System.out.println("           DETALLES DEL MOTOR           ");
        System.out.println("========================================");
        System.out.println(" Marca y modelo: " + coche.marca + " " + coche.modelo);
        System.out.printf("  Nº de Serie:   %d%n", numeroSerie);
        System.out.printf("  Tipo:          %s%n", tipo);
        System.out.printf("  Cilindros:     %d%n", cilindros);
        System.out.printf("  Potencia:      %.2f HP%n", potencia);
        System.out.printf("  Nivel Aceite:  %d%%%n", nivelAceite);
        System.out.printf("  Salud Motor:   %d%%%n", saludMotor);
        System.out.printf("  Estado:        %s%n", estadoCalentamiento);
        System.out.println("========================================\n");
    }

    public void cambiarAceite() {
        System.out.println("Esta por modifcar el nivel de aceite, ¿a cual lo desea cambiar?");
        int nivelAceiteAntiguo = nivelAceite;
        nivelAceite = sc.nextInt();
        System.out.printf("El nivel anterior de aceite es %d al realizar el cambio el nivel actual de aceite es %d%n",
                nivelAceiteAntiguo, nivelAceite);

    }

    public void reparar() {
        int saludMotorAntigua = saludMotor;
        System.out.println("Esta por modificar la salud del motor, ¿a cual la desea cambiar?");
        saludMotor = sc.nextInt();
        System.out.printf("La salud anterior del motor es %d al realizar el cambio la salud del motor es %d%n",
                saludMotorAntigua, saludMotor);
    }

    public void calentar(Coche coche) {
        if (coche.estadoEncendido.equals("encendido")) {
            estadoCalentamiento = "caliente";
            System.out.println("El motor se ha calentado por 3 minutos. tu coche te lo agradece al cuidarlo.");
        } else {
            System.out.println("El motor esta apagado, no puede calentarse");
        }
    }

    public void tunear() {
        if (tipo.equals("electrico")) {
            System.out.println(
                    "El motor es electrico, no puede ser tuneado, vaya con su mecanico y consulte las posibles soluciones");
        } else {
            System.out.println("Esta por modificar la potencia del motor de su coche, ¿a cual la desea cambiar?");
            double potenciaAntigua = potencia;
            potencia = sc.nextDouble();
            System.out.printf(
                    "La potencia anterior del motor es %.2f HP al realizar el cambio la potencia del motor es %.2f HP%n",
                    potenciaAntigua, potencia);
        }
    }
}
