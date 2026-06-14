package data;

import model.Productos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que se encarga de leer datos desde un archivo .txt
 */

public class GestorDeDatos {
    /**
     * Clase encargada de leer archivo de texto y procesar cada línea 
     * @param rutaArchivo String con la ubicación del archivo .txt y que debe leer
     * @return ArrayList de objetos 'Productos' con los datos del archivo
     */
    public ArrayList<Productos> listaProductos(String rutaArchivo){
        
        //Lista dinámica donde se almacenan los datos
        ArrayList<Productos> listaProductos = new ArrayList<>();
        
        try{
            //Se abre el archivo para su lectura
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            
            //Lectura de linea por linea
            String linea;
            
            while ((linea = lector.readLine()) != null){
                
                //Realiza separación de linea usando puunto y coma (";")
                String [] partes = linea.split(";");
                
                //Valida que tenga los 4 atributos
                if (partes.length == 4){
                    
                    //Conversión de datos al tipo correspondiente
                    int id = Integer.parseInt(partes[0].trim());
                    String nombreProducto = partes[1].trim();
                    int cantidad = Integer.parseInt(partes[2].trim());
                    double precio = Double.parseDouble(partes[3].trim());
                    
                    //Se crea el objeto con los datos leídos
                    Productos producto = new Productos(id, nombreProducto, cantidad, precio);
                    
                    //se agrega el objeto a la lista
                    listaProductos.add(producto);
                }
            }
            lector.close();
        
        }catch (IOException e){
            System.out.println("Error al leer archivo: " + e.getMessage());
       }
        
        return listaProductos;
    }
}