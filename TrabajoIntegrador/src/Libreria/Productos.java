
package Libreria;

import java.util.Date;
import java.util.GregorianCalendar;

public class Productos {
    
    private Date fecha_publicacion;
    private int codigo;
    private double precio_compra;
    
    // CONSTRUCTOR

    public Productos(int anio, int mes, int dia, int codigo, double precio_compra) {
        
        this.codigo = codigo;
        this.precio_compra = precio_compra;
        
        GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
        
        fecha_publicacion = calendario.getTime();
    }
    
    public Productos(){};
    
    // GETTERS

    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }
    
    // SETTERS

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

}
