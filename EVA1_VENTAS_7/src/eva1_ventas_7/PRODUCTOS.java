/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_ventas_7;

/**
 *
 * @author Edith Esmeralda
 */
public class PRODUCTOS {
    private String nombre;
    private String marca; 
    private double precio;
    private int clave;
    private int inventario;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;   
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio=valor;
    }
    public int getClave(int valor){
        return clave;
    }
    public void setClave(int valor){
        clave = valor;
    }
    public int getInventario(){
        return inventario;
    }
    public void setInventario(int valor){
        inventario = valor;
    }
    public void mostrarAlmacen(){
        System.out.println("Datos del producto:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Clave: " + clave);
        System.out.println("Precio: " + precio);
        System.out.println("Inventario: " + inventario);
    }
}
