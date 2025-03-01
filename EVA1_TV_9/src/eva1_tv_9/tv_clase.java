/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_tv_9;

/**
 *
 * @author Edith Esmeralda
 */
public class tv_clase {
    private boolean encendido;
    private int volumen;
    private int canal;

public tv_clase(){
        encendido = true;
        volumen = 10;
        canal = 7;
}
public tv_clase(boolean prender, int vol, int chanel){
    encendido = prender;
    volumen = vol;
    canal = chanel;
}
    
    public void encenderApagar(){
        encendido = encendido != true; 
    }
    
    public void imprimirDatos(){
        if(encendido == true)
            System.out.println("TV Encendida");
        else
            System.out.println("Tv Apagada");
        
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
    }
    public void subirVolumen() {
    if (encendido) { 
        if (volumen < 100) { 
            volumen++;
        }
        imprimirDatos();
    }
}

    public void bajarVolumen(){
        if (volumen > 0)
            volumen -= 1;
        
        if(encendido == true)
            System.out.println("TV Encendida");
        else
            System.out.println("Tv Apagada");
        
        System.out.println("Volumen: " + volumen);
    }

    public void masCanal() {
        if (encendido == true)
            if(canal == 10)
                canal = 0;
            else 
                canal += 1;
            
    }
    
    public void menosCanal() {
        if (encendido == true) 
            if(canal == 0)
                canal = 10;
            else
                canal -= 1;
            
    } 
        
    public void setCanal(int valor){
        canal = valor;
    }
    
    
}