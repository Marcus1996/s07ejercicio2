/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class S07ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear un objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Creando un valor
        final double METROS_POR_PIES = 0.305;
        
        //Mostrar el mensaje al usuario
        System.out.println("INGRESE UN VALOR EN PIES: ");
        double feet = input.nextDouble();
        
        //Convertir pies en metros
        double meters = feet * METROS_POR_PIES;
        
        //Mostrar el resultado
        System.out.println(feet + "pies son" + meters + "en metros");
        
        
        
        
        
        
        
        
    
        
    }
    
}
