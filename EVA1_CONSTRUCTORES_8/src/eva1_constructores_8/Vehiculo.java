/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_constructores_8;

/**
 *
 * @author Edith Esmeralda
 */
public class Vehiculo {
    
    //ATRIBUTOS - privados
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    //CONSTRUCTORES - METODOS
    //MÉTODOS: NO TIENEN VALOR DE RETORNO
    //MODIFICADOR DE ACCESO NOMBRE DE LA CLASE(LISTA DE PARÁMETROS);
    //CONSTRUCTOR DEFAULT: CONSTRUCTOR SIN PARÁMETROS
    public Vehiculo(){
        System.out.println("CREANDO OBJETO VEHICULO");
        //inicializar atributos:
        marca = "SIN MARCA";
        modelo = "SIN MODELO";
        year = 0;
        precio = 0;
        color = "SIN COLOR";
    }
    public Vehiculo(String mar, String mod, int y, double pre, String col){
        marca = mar;
        modelo = mod;
        year = y;
        precio = pre;
        color = col;
    }
    
    //MÉTODOS - COMPORTAMIENTO
    //GET Y SET
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int valor){
        year = valor;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String valor){
        color = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Datos del vehiculo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }
    
}

