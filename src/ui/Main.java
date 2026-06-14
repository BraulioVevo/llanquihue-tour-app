package ui;

import model.*;
import data.GestorDeDatos;
import java.util.ArrayList;

/**
 * 
 * Clase principal para el proyecto Llanquihue Tour  
 * 
 */
public class Main {
    

    public static void main(String[] args) {
    System.setOut (new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));

    /** 
     * rutaArchivo sigue la ruta del archivo de texto
     */
        String rutaArchivo = "src/resources/productos.txt";
        
        GestorDeDatos gestor = new GestorDeDatos();
        
        ArrayList<Productos> producto = gestor.listaProductos(rutaArchivo);
        
        //Muestra todos los productos cargados del archivo productos.txt
        System.out.println("\t==== Catálogo completo de Llanquihue Tour ====");
        
        //Recorre lista de objetos
        for (Productos item : producto){
            System.out.println(item);
        }      
        //Filtro de items por tipo de productos(en este caso Jugo)
        System.out.println("\n\t==== Jugos Naturales ====");
        
        for(Productos item : producto){
            if(item.getNombreProducto().toLowerCase().contains("jugo")){
                System.out.println(item);
            }
        }
        //Filtro para items con baja disponibilidad (<10)
        
        System.out.println("\n\t⚠ A️lerta: PRODUCTOS CON BAJA DISPONIBILIDAD (<10) ⚠️");
        for (Productos item : producto){
            if(item.getCantidad()<10){
                System.out.println("❌ ID:"+ item.getId() + " || " + item.getNombreProducto() + " (Solo quedan: " + item.getCantidad()+ " unidades).");
            }
        }
        
    }
}
