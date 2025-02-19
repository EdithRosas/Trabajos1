/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_modificadores_3;

/**
 *
 * @author Edith Esmeralda
 */
public class EVA1_MODIFICADORES_3 {

    public static void main(String[] args) {
        //TODO CODEAPPLICATION LOGIC HERE
        //INSTANCIAR UN OBJETO 
        //Clase identificador = new CONSTRUCTOR (PARAMETROS);
        Persona perso = new Persona();
        perso.setNombre("Edith");
        perso.setApellidos("Rosas Flores");
        perso.setEdad(18);
        perso.setGenero("Femenino");
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellios: " + perso.getApellidos());
        System.out.println("Edad: " + perso.getEdad());
        System.out.println("Genero: " + perso.getGenero());
        
        
    }
}