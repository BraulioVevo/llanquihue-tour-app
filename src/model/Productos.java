package model;

public class Productos {
/**
 * Clase que almacenará los datos basicos de un 
 * producto a la venta en LlanquihueTour
 */ 
    
    private int id;
    private String NombreProducto;
    private int cantidad;
    private double precio;
    
    //Constructor vacío
    public Productos(){
        this.id = 1;
        this.NombreProducto = "Nombre del Producto";
        this.cantidad = 0;
        this.precio = 19990;
    }
    
    //Constructor con parámetros 
    /**
     * 
     * @param id Se refiere al numero de identificación del producto
     * @param NombreProducto Hace refenrencia al nombre asignado a cada producto
     * @param cantidad Indica la la cantidad disponible en Stock
     * @param precio Hace referencia al valor que tiene cada producto
     */
    public Productos(int id, String NombreProducto, int cantidad, double precio) {
        this.id = id;
        this.NombreProducto = NombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //Getters & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.NombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override 
        public String toString(){
            return "| ID: " + id +
            " || Producto: " + NombreProducto +
            "|| Cantidad: " + cantidad +
            "|| Precio: " + precio +
            "|"
        ;} 
    
}
