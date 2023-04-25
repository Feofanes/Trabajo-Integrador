
package Libreria;

public class Revistas extends Productos {
    
    private String nombre;
    private String editor;
    private boolean es_digital;
    
    // CONSTRUCTOR

    public Revistas(String nombre, String editor, boolean es_digital, int anio, int mes, int dia, int codigo, double precio_compra) {
        super(anio, mes, dia, codigo, precio_compra);
        this.nombre = nombre;
        this.editor = editor;
        this.es_digital = es_digital;
    }
    
    

    public Revistas() {
    }
    
    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getEditor() {
        return editor;
    }

    public boolean isEs_digital() {
        return es_digital;
    }
    
    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setEs_digital(boolean es_digital) {
        this.es_digital = es_digital;
    }
    
    // Método para calcular el precio de venta
    public double calcularPrecioVenta() {
        double porcentajeGanancia = es_digital ? 0.12 : 0.22;
        return getPrecio_compra() * (1 + porcentajeGanancia);
    }

}

