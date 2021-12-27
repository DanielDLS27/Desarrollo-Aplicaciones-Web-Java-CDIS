/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_5;

//LIBRERIAS UTILIZADAS
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1083802401
 */
public class Evidencia_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EdadException{
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
            //VALIDAMOS LA EDAD
            try{
                edad = lector.nextInt();
                EdadException EdadEx = new EdadException();//OBJETO DE LA CLASE EdadException
                EdadEx.verificarEdad(edad);//SE UTILIZA EL METODO DEL OBJETO PARA VERIFICAR LA EDAD
            }catch(EdadException e){
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Edad: ");
                edad = lector.nextInt();
            }catch(InputMismatchException ex){
                System.out.println("Error, tipo de dato invalido");
            }
            lector.nextLine();
            System.out.println("Estado Civil: ");
            estadoCivil = lector.nextLine();
            System.out.println("Salario: ");
            //VALIDAMOS EL SALARIO
            try{
                salario = lector.nextDouble();
            }catch(InputMismatchException exc){
                System.out.println("Error, tipo de dato invalido");
            }
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
