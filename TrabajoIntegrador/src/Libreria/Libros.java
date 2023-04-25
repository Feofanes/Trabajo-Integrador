
package Libreria;

import java.util.Date;

public class Libros extends Productos {
    
    private String titulo;
    private String autor_principal;
    private String editorial;
    private boolean es_digital;
    private int stock;
    
    // CONSTRUCTOR

    public Libros(String titulo, String autor_principal, String editorial, boolean es_digital, int stock, int anio, int mes, int dia, int codigo, double precio_compra) {
        super(anio, mes, dia, codigo, precio_compra);
        this.titulo = titulo;
        this.autor_principal = autor_principal;
        this.editorial = editorial;
        this.es_digital = es_digital;
        this.stock = stock;
    }
    

    public Libros(){};
    
    // GETTERS    
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor_principal() {
        return autor_principal;
    }

    public String getEditorial() {
        return editorial;
    }

    public boolean isEs_digital() {
        return es_digital;
    }

    public int getStock() {
        return stock;
    }
    
    // SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor_principal(String autor_principal) {
        this.autor_principal = autor_principal;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setEs_digital(boolean es_digital) {
        this.es_digital = es_digital;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Métodos para calcular el precio de venta y actualizar el stock
    public double calcularPrecioVenta() {
double porcentajeGanancia = es_digital ? 0.08 : 0.18;
return getPrecio_compra() * (1 + porcentajeGanancia);
    }

    public void actualizarStock(int cantidad) {
        stock += cantidad;
    }
    
}

