/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_4;

//LIBRERIAS UTILIZADAS
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1083802401
 */
public class Evidencia_4 {

    /**
     * @param args the command line arguments
     */
    
    
    //METODO MAIN
    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();//ARRAYLIST CREADO
        Scanner lector = new Scanner(System.in);//SCANNER CREADO
        
        //VARIABLES A UTILIZAR
        int decision = 0;
        
        String nombre = "";
        String cedula = "";
        int edad = 0;
        String estadoCivil = "";
        double salario = 0;
        int lineasDeCodigoPorHora = 0;
        String lenguajeDominante = "";
        
        //CICLO PARA INGRESAR LOS DATOS DE LOS EMPLEADOS
        for(int i = 0; i < 2; i++){
            System.out.println("Empleado "+(i+1));
            System.out.println("Nombre Completo: ");
            nombre = lector.nextLine();
            System.out.println("Cedula: ");
            cedula = lector.nextLine();
            System.out.println("Edad: ");
            edad = lector.nextInt();
            //AQUI VALIDAMOS LA EDAD
            while(edad < 18 || edad > 45){
                System.out.println("Error, ingrese edad dentro del rango adecuado (18 a 45 años)");
                edad = lector.nextInt();
            }
            lector.nextLine();
            System.out.println("Estado Civil: ");
            estadoCivil = lector.nextLine();
            System.out.println("Salario: ");
            salario = lector.nextDouble();
            lector.nextLine();
            
            System.out.println("Eres programador?   si(1)   no(otro numero)");
            decision = lector.nextInt();
            lector.nextLine();
            if(decision == 1){
                System.out.println("Lineas de Codigo por Hora: ");
                lineasDeCodigoPorHora = lector.nextInt();
                lector.nextLine();
                System.out.println("Lenguaje Dominante: ");
                lenguajeDominante = lector.nextLine();
                
                //SE CREA EL OBJETO TIPO PROGRAMADOR
                Programador aux1 = new Programador(nombre, cedula, edad, estadoCivil, salario, lineasDeCodigoPorHora, lenguajeDominante);
                //SE AÑADE EL OBJETO AL ARRAYLIST
                empleados.add(aux1);
            }
            else{
                // SE CREA EL OBJETO TIPO EMPLEADO
               Empleado aux = new Empleado(nombre, cedula, edad, estadoCivil, salario);
               //SE AÑADE EL OBJETO AL ARRAYLIST
               empleados.add(aux);
            }
        }
        
        //CICLO PARA IMPRIMIR LOS DATOS DE LOS EMPLEADOS GUARDADOS EN EL ARRAYLIST
        for(int i = 0; i < 2; i++){
            System.out.println("Empleado #"+(i+1));
            empleados.get(i).imprimir();
        }
    }
    
}
