/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_tv;

/**
 *
 * @author Edith Esmeralda
 */
public class Television {
    private boolean encendido;
    private int volumen;
    private int canal;
    
    public void encenderApagar(){
        if(encendido == true)
            encendido = false;
        else
            encendido = true;
    }
    public void imprimirDatos(){
        if(encendido == true)
            System.out.println("TV Encendida");
        else
            System.out.println("Tv Apagada");
        
        System.out.println("volumen: " + volumen);
        System.out.println("Canal:" + canal);
    }
    
    public void subirVolumen(){
        if (volumen < 100)
        if (encendido == true)
            System.out.println("TV Encendida");
        else
            System.out.println("TV Apagada");
        
         System.out.println("Volumen: " + volumen);
            volumen += 1;  //Acumulador -> Volumen = Volumen +1;        
    }
    public void bajarVolumen(){
        if(volumen>0)
            volumen-=1;
        if(encendido == true)
            System.out.println("TV Encendida");
        else 
            System.out.println("TV Apagada");
        System.out.println("Volumen: "+ volumen);
        
    }
    //Subir, bajar y asignar canal
    public void masCanal(){
        if (encendido==true)
            if(canal==10)
                canal=0;
            else 
                canal+=1;
    }
    public void setCanal(int valor){
        canal=valor;
    }
    
}
