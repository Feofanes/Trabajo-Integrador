
package Libreria;

public class Principal {
     public static void main(String[] args) {
        // Crear libros
        
        Libros libro1 = new Libros("El origen de las especies", "Darwin", "Corpus", 
                false, 10, 1859, 11, 03, 01, 15.99);
        Libros libro2 = new Libros("Genes", "Lewin", "Panamericana", 
                true, 5, 2010, 10,03, 02, 50.99);
  
        // Crear revistas
        
        Revistas revista1 = new Revistas("Genios", "Edisur", true, 2003, 03, 02, 03, 10.99);
        Revistas revista2 = new Revistas("Billiken", "Edisur", false, 2001, 02, 03, 04, 9.99);
        
        
        // Crear carrito de compras
        CarritoCompras carrito = new CarritoCompras();

        // Agregar libros al carrito
        carrito.agregarProducto(libro1);
        carrito.agregarProducto(libro2);
        
        
        carrito.agregarProducto(revista2);

        // Mostrar contenido del carrito
        carrito.mostrarCarrito();
        
        // Calcular total a abonar
        double total = carrito.calcularTotalAbonar();
        System.out.println("Total a abonar: $" + total);
    }
}

