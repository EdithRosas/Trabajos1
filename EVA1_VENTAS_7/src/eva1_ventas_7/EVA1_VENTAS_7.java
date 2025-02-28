/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_ventas_7;
/**
 *
 * @author Edith Esmeralda
 */
public class EVA1_VENTAS_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 

        PRODUCTOS productos = new PRODUCTOS();
        CLIENTE cliente = new CLIENTE();

        System.out.println("Datos del inventario:");
        productos.setNombre("Pera");
        productos.setMarca("Del Valle");
        productos.setPrecio(45.99);
        productos.setClave(987654321);
        productos.setInventario(200);
        productos.mostrarAlmacen();

        System.out.println();

        cliente.setNombre("Pedro");
        cliente.setApellido("Lopez");
        cliente.setRFC("ABC123456XYZ");
        cliente.setEdad(35);
        cliente.setTelefono(555123456);
        cliente.datosCliente(); 
    }
}