
package guiaejercicios1;


public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public double aplicarDescuento(double porcentaje){
        double descuento = precio * porcentaje / 100;
        double precioConDescuento = precio - descuento;
        return precioConDescuento;
    }
    
    public void realizarVenta(int cantidad){
        if(cantidad <= stock){
            stock -= cantidad;
            System.out.println("Luego de la venta quedan " + stock + " unidades");
            }
        else{
            System.out.println("No hay suficiente stock. Quedan " + stock + " unidades");
        }
       
    }
} 
    

