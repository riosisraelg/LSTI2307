
/**
 * Actividad 3: Clase Principal (Main)
 * 
 * Instrucciones:
 * 1. Crea dos objetos de la clase Producto.
 * 2. Pide al usuario el valor de todos los atributos y asígnalos mediante los métodos establecedores (set).
 * 3. Incluye sentencias try-catch para captar excepciones.
 * 4. Muestra en pantalla los valores de los atributos a través de mostrarProducto().
 * 5. Crea un método estático llamado compararProductos.
 * 6. Invoca compararProductos y muestra el resultado.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto p1 = new Producto();
        Producto p2 = new Producto();

        // Producto 1
        System.out.println("\n--- Captura de datos: Producto 1 ---");
        capturarDatos(scanner, p1);

        // Producto 2
        System.out.println("\n--- Captura de datos: Producto 2 ---");
        capturarDatos(scanner, p2);

        // Mostrar productos
        System.out.println("\n--- Detalle de Productos ---");
        p1.muestraProducto();
        p2.muestraProducto();

        // Comparar productos
        String mayor = compararProductos(p1, p2);
        System.out.println("\nEl producto con el mayor precio de venta es: " + mayor);

        scanner.close();
    }

    private static void capturarDatos(Scanner scanner, Producto p) {
        while (true) {
            try {
                System.out.print("Descripción: ");
                p.setDescripcion(scanner.next());
                System.out.print("Código: ");
                p.setCodigo(scanner.next());
                System.out.print("Tipo: ");
                p.setTipo(scanner.next());
                System.out.print("Costo: ");
                p.setCosto(scanner.nextDouble());
                System.out.print("Impuesto (en decimal, ej. 0.16 para 16%): ");
                p.setImpuesto(scanner.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("Error en la entrada de datos. Intente de nuevo.");
                scanner.nextLine();
            }
        }
    }

    public static String compararProductos(Producto p1, Producto p2) {
        double utilidad = 10.0;
        double precio1 = p1.calcularPrecio(utilidad), precio2 = p2.calcularPrecio(utilidad);

        if (precio1 > precio2) {
            return p1.getDescripcion();
        } else {
            return p2.getDescripcion();
        }
    }
}
