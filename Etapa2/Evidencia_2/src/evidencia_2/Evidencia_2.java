/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_2;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author 1083802401
 */
public class Evidencia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int radio = 0;
        
        System.out.println("Ingresa el valor del radio: ");
        radio = lector.nextInt();
        
        System.out.println("Circunferencia: "+calcularCircunferencia(radio));
        System.out.println("Área: "+calcularArea(radio));
        
    }
    
    public static double calcularCircunferencia(int num1){
        return 2 * Math.PI * num1;
    }
    
    public static double calcularArea(int num2){
        return Math.PI * Math.pow(num2, 2);
    }
    
}
