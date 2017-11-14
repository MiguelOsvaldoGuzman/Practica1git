/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1git;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Practica1GIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double radio, area;         
         System.out.println("HALLA EL AREA DE UN CIRCULO");
         System.out.print("Ingresar el radio r = ");
         Scanner scanner = new Scanner(System.in);
         radio = scanner.nextFloat();
         area = (3.1416*radio*radio);            
         System.out.println("Area = " + area);   
    }
    
}
