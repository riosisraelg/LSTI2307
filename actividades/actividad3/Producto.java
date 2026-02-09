/**
 * Actividad 3: Clase Producto
 * 
 * Esta clase representa un producto con sus atributos básicos,
 * métodos de acceso y métodos funcionales requeridos.
 */
public class Producto {
    // Atributos privados
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;

    /**
     * Constructor por defecto
     */
    public Producto() {
    }

    // Getters

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    // Setters

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public void muestraProducto() {
        System.out.printf("Código: %s | Descripción: %s | Tipo: %s | Costo: %.2f | Impuesto: %.2f%%%n",
                this.codigo, this.descripcion, this.tipo, this.costo, this.impuesto);
    }

    public double calcularPrecio(double utilidad) {
        double ganancia = this.costo * (utilidad / 100);
        double precioBase = this.costo + ganancia;
        double montoImpuesto = precioBase * (this.impuesto / 100);
        return precioBase + montoImpuesto;
    }
}
