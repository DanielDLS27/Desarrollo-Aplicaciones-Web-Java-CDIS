/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_3;

//LIBRERIAS UTILIZADAS
import java.util.Scanner;

/**
 *
 * @author 1083802401
 */
public class Evidencia_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        //VARIABLES UTILIZADAS
        int aux1 = 0;
        int aux2 = 0;
        int dec = 0;
        double cont1 = 0;
        double contS = 0;
        double contC = 0;
        double contM = 0;
        double contF = 0;
        double acum1 = 0;
        
        //ARREGLO BIDIMENSIONAL A UTILIZAR
        String [][] arregloBidimensional = new String[100][4]; 
       
        //CICLO A UTILIZAR PARA CAPTURAR LOS DATOS
      while(aux2 == 0){
          System.out.println("Ingresa la información de la persona #"+(aux1 + 1));
          System.out.println("Nombre: ");
          arregloBidimensional[aux1][0] = lector.nextLine();
          cont1 = cont1 + 1;
          System.out.println("Edad: ");
          arregloBidimensional[aux1][1] = lector.nextLine();
          acum1 = acum1 + Double.parseDouble(arregloBidimensional[aux1][1]);//CONVIERTE EL ARREGLO DE STRINGS EN UN DOUBLE
          System.out.println("Estado Civil:  Soltero(s)  Casado(c)");
          arregloBidimensional[aux1][2] = lector.nextLine();
          if(arregloBidimensional[aux1][2].equals("s")){
              contS = contS + 1;
          }
          else{
              contC = contC + 1;
          }
          System.out.println("Sexo:   Masculino(m)   Femenino(f)");
          arregloBidimensional[aux1][3] = lector.nextLine();
          if(arregloBidimensional[aux1][3].equals("m")){
              contM = contM + 1;
          }
          else{
              contF = contF + 1;
          }
          System.out.println("¿Desea capturar otra persona?   Si(1)  No(otro numero)");
          dec = lector.nextInt();
          lector.nextLine();
          if(dec == 1){
              aux1 = aux1 + 1;
          }
          else{
              aux2 = 1;
          }
      }
      
      //MAS VARIABLES UTILIZADAS
        double promEdad = 0;
        promEdad = acum1 / cont1;//PROMEDIO DE EDADES
        
        double porcH = 0;
        porcH = (contM / cont1) * 100;//PORCENTAJE DE HOMBRES
        
        double porcM = 0;
        porcM = (contF / cont1) * 100;//PORCENTAJE DE MUJERES
        
        double porcS = 0;
        porcS = (contS / cont1) * 100;//PORCENTAJE DE SOLTERO(A)S
        
        double porcC = 0;
        porcC = (contC / cont1) * 100;//PORCENTAJE DE CASADO(A)S
      
        //IMPRESION EN PANTALLA DE LOS RESULTADOS FINALES
        System.out.println("Total de personas capturadas: "+cont1);
        System.out.println("Promedio de edad de las personas capturadas: "+promEdad);
        System.out.println("Porcentaje de Hombres: "+porcH);
        System.out.println("Porcentaje de Mujeres: "+porcM);
        System.out.println("Porcentaje de Hombres y Mujeres Soltero(a)s: "+porcS);
        System.out.println("Porcentaje de Hombres y Mujeres Casado(a)s: "+porcC);
        
    }
    
}
