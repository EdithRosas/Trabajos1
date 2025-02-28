/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_ventas_7;

/**
 *
 * @author Edith Esmeralda
 */
public class CLIENTE {
    private String nombre;
    private String apellido;
    private String rfc;
    private boolean persona;
    private int edad;
    private int telefono;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;   
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
    public boolean getPersona(){
        return persona;
    }
    public void setPersona(boolean valor){
        persona = valor;
    }
    public String getRFC(){
        return rfc;
    }
    public void setRFC(String valor){
        rfc = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int valor){
        telefono = valor;
    }
    public void datosCliente(){  // Aquí también cambio "Datos_Cliente" a "datosCliente"
        System.out.println("Datos del cliente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("RFC: "+rfc);
        if(persona){
            System.out.println("Es persona física");}
        else {
            System.out.println("Es persona moral");}
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+telefono);
    }
}
