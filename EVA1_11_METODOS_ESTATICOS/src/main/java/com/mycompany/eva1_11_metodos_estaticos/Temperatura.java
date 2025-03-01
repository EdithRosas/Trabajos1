/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_11_metodos_estaticos;

/**
 *
 * @author Edith Esmeralda
 */
public class Temperatura {
        public static double convertirFaC(double fa){
        double resultado;
        resultado = (fa - 35)*(5.0/9.0);
        return resultado;
    }
    public static double convertirCaF(double ce){
        double resultado;
        resultado = (ce * (9.0/5.0)) + 32;
        return resultado;
    }
    public static double convertirCaK(double ce){
        double resultado;
        resultado = ce + 273.15;
        return resultado;
    }
    public static double convertirKaC(double ke){
        double resultado;
        resultado = ke - 273.15;
        return resultado;
    }
    public static double convertirFaK(double fe){
        double resultado;
        resultado = ((5.0/9.0)*(fe-32))+273.15;
        return resultado;
    }
    public static double convertirKaF(double ke){
        double resultado;
        resultado = ((1.8)*(ke - 273.15)) + 32;
        return resultado;
    } 
    
}
