
package Libreria;

import java.util.ArrayList;

public class CarritoCompras {
    
    private ArrayList<Productos> productosEnCarrito = new ArrayList<Productos>();   // El carrito debe poder albergar tanto libros como revistas

    public void agregarProducto(Productos producto) {
        productosEnCarrito.add(producto);
    }

    public void eliminarProducto(Productos producto) {
        productosEnCarrito.remove(producto);
    }
    
     public void mostrarCarrito() {
        System.out.println("Productos en el carrito:");
        for (Productos producto : productosEnCarrito) {
            if (producto instanceof Libros) {
                Libros libro = (Libros) producto;
                System.out.println("Libro: " + libro.getTitulo());
            } else if (producto instanceof Revistas) {
                Revistas revista = (Revistas) producto;
                System.out.println("Revista: " + revista.getNombre());
            }
        }
    }
     
     public double calcularTotalAbonar() {
        double total = 0;
        for (Productos producto : productosEnCarrito) {
            if (producto instanceof Libros) {
                Libros libro = (Libros) producto;
                total += libro.calcularPrecioVenta();
            } else if (producto instanceof Revistas) {
                Revistas revista = (Revistas) producto;
                total += revista.calcularPrecioVenta();
            }
        }
        
        return total;
        
     }
    
    
    /*
     private ArrayList<Libros> librosEnCarrito = new ArrayList<Libros>();

    public void agregarLibro(Libros libro) {
        librosEnCarrito.add(libro);
    }

    public void eliminarLibro(Libros libro) {
        librosEnCarrito.remove(libro);
    }

    public void mostrarCarrito() {
        System.out.println("Libros en el carrito:");
        for (Libros libro : librosEnCarrito) {
            System.out.println(libro.getTitulo());
        }
    }
    
    // CALCULAR EL MONTO A ABONAR
    
     public double calcularTotalAbonar() {
        double total = 0;
        for (Libros libro : librosEnCarrito) {
            total += libro.calcularPrecioVenta();
        }
        return total;
    }

*/
    
    
}
