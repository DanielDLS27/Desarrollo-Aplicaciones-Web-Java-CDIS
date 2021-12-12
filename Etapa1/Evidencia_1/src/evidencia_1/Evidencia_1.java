/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_1;

// LIBRERIAS UTILIZADAS
import java.util.Scanner;

/**
 *
 * @author 1083802401
 */
public class Evidencia_1 {

    /**
     * @param args the command line arguments
     */
    
    // MÉTODO MAIN
    public static void main(String[] args) {
        
        // VARIABLES UTILIZADAS
        String nombre = "";
        int numEntero = 0;
        double numDecimal = 0.0;
        double total = 0.0;
        
        Scanner lector = new Scanner(System.in);
        
        // ESPACIO PARA INGRESAR EL NOMBRE
        System.out.println("Ingresa tu nombre: ");
        nombre = lector.nextLine();
        
        // ESPACIO PARA INGRESAR EL NUMERO ENTERO
        System.out.println("Ingresa un numero entero: ");
        numEntero = lector.nextInt();
        
        // ESPACIO PARA INGRESAR EL NUMERO DECIMAL
        System.out.println("Ingresa un numero decimal: ");
        numDecimal = lector.nextDouble();
        
        total = numEntero + numDecimal;
        
        System.out.println("Hola "+nombre+", el resultado de la suma entre "+numEntero+" y "+numDecimal+" es "+total);
        
    }
    
}
