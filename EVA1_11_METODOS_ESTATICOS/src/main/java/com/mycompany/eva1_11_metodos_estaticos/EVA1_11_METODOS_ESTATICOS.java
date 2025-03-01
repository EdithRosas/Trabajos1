/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_metodos_estaticos;

/**
 *
 * @author Edith Esmeralda
 */
public class EVA1_11_METODOS_ESTATICOS {

    public static void main(String[] args) {
        double valorAleatorio = Math.random();
        int valor = (int)(valorAleatorio * 1000);
        System.out.println(valorAleatorio);
        System.out.println(valor);
        //
      
        System.out.println(Temperatura.convertirFaC(100));
        System.out.println(Temperatura.convertirCaF(100));
        System.out.println(Temperatura.convertirCaK(100));
        System.out.println(Temperatura.convertirKaC(100));
        System.out.println(Temperatura.convertirFaK(100));
        System.out.println(Temperatura.convertirKaF(100));
    }
 
}

