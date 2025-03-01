/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_sobrecarga_de_metodos_13;

/**
 *
 * @author Edith Esmeralda
 */
public class EVA1_SOBRECARGA_DE_METODOS_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo!!");
        System.out.println(100);
        System.out.println(100.10);
        System.out.println(1>8);
        System.out.println('l');
        System.out.println(new EVA1_SOBRECARGA_DE_METODOS_13());
        System.out.println(sumar(13,7));
        System.out.println(sumar("Hola","Mundo"));
        sumar();
    }
    public static int sumar(int val1, int val2){
    return val1 + val2;
    }
    public static String sumar(String val1, String val2){
    return val1 + val2;
    }
    public static void sumar(){
    System.out.println("NADA TIENE SENTIDO");
    }    
}
