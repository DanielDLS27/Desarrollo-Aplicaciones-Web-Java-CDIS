/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pia;
//LIBRERIAS UTILIZADAS
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1083802401
 */
public class PIA {

    /**
     * @param args the command line arguments
     */
    //CLASE MAIN
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in); //OBJETO SCANNER
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>(10); //ARRAYLIST CREADO
        
        //VARIABLES UTILIZADAS PARA ESCANEAR
        int precioBase = 0;
        String color = "";
        char consumoEnergetico = ' ';
        int peso = 0;
        int carga = 0;
        int resolucion = 0;
        boolean sintonizadorTDT = false;
        
        //VARIABLES UTILIZADAS PARA DECISIONES
        int dec1 = 0;
        int dec2 = 0;
        
        //VARRIABLE AUXILIAR PARA UN BOOLEANO
        int auxB = 0;
        
        // VARIABLES UTILIZADAS PARA ACUMULAR VALORES DE CADA TIPO DE OBJETO
        int acumE = 0;
        int acumL = 0;
        int acumT = 0;
        
        //ARREGLO PARA GUARDAR Y DESPUES IMPRIMIR EL VALOR DE LOS PRECIOS BASES
        int[] auxP = new int[10];
        
        //CICLO PARA LEER LOS DATOS
        for(int i = 0; i < 10; i++){
            
            System.out.println("Electrodomestico " + (i+1));
            System.out.println("Precio Base: ");
            precioBase = lector.nextInt();
            lector.nextLine();
            auxP [i] = precioBase;
            System.out.println("Color:   Colores disponibles(Blanco, Negro, Rojo, Azul, Gris)");
            color = lector.nextLine();
            System.out.println("Consumo Energetico:  (A, B, C, D, E, F)");
            consumoEnergetico = lector.next().charAt(0);
            System.out.println("Peso: ");
            peso = lector.nextInt();
            lector.nextLine();
            
            System.out.println("Es una Lavadora?  Si(1) No(otro numero)");
            dec1 = lector.nextInt();
            lector.nextLine();
            if(dec1 == 1){//ENTRA AL IF SI ES UNA LAVADORA
                System.out.println("Carga: ");
                carga = lector.nextInt();
                lector.nextLine();
                Lavadora auxL = new Lavadora(precioBase, color, consumoEnergetico, peso, carga);//SE CREA EL OBJETO LAVADORA
                auxL.precioFinal();//SE EJECUTA EL METODO PARA OBTENER EL PRECIO FINAL
                acumE = acumE + auxL.getPrecioBase();//SE ACUMULA EL VALOR PARA LA SUMA DE LOS ELECTRODOMESTICOS
                acumL = acumL + auxL.getPrecioBase();//SE ACUMULA EL VALOR PARA LA SUMA DE LAS LAVADORAS
                electrodomesticos.add(auxL);//SE AÑADE EL OBJETO CON TODOS SUS DATOS AL ARRAYLIST
            }else{
                System.out.println("Es una Television?  Si(1) No(otro numero)");
                dec2 = lector.nextInt();
                lector.nextLine();
                if(dec2 == 1){//ENTRA AL IF SI ES UNA TELEVISION
                    System.out.println("Resolucion: ");
                    resolucion = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Tiene sintonizador TDT?  si(1) no(otro numero)");
                    auxB = lector.nextInt();
                    lector.nextLine();
                    if(auxB == 1){
                        sintonizadorTDT = true;
                    }else{
                        sintonizadorTDT = false;
                    }
                    Television auxT = new Television(precioBase, color, consumoEnergetico, peso, resolucion, sintonizadorTDT);//SE CREA EL OBJETO TELEVISION
                    auxT.precioFinal();//SE EJECUTA EL METODO PARA OBTENER EL PRECIO FINAL
                    acumE = acumE + auxT.getPrecioBase();//SE ACUMULA EL VALOR PARA LA SUMA DE LOS ELECTRODOMESTICOS
                    acumT = acumT + auxT.getPrecioBase();//SE ACUMULA EL VALOR PARA LA SUMA DE LAS TELEVISIONES
                    electrodomesticos.add(auxT);//SE AÑADE EL OBJETO CON TODOS SUS DATOS AL ARRAYLIST
                }else{
                    Electrodomestico auxE = new Electrodomestico(precioBase, color, consumoEnergetico, peso);//SE CREA EL OBJETO ELECTRODOMESTICO
                    auxE.precioFinal();//SE EJECUTA EL METODO PARA OBTENER EL PRECIO FINAL
                    acumE = acumE + auxE.getPrecioBase();//SE ACUMULA EL VALOR PARA LA SUMA DE LOS ELECTRODOMESTICOS
                    electrodomesticos.add(auxE);//SE AÑADE EL OBJETO CON TODOS SUS DATOS AL ARRAYLIST
                }
            }
            
        }
        
        //CICLO PARA IMPRIMIR TODOS LOS OBJETOS CON SUS RESPECTIVOS DATOS
        for(int i = 0; i < 10; i++){
            System.out.println("Electrodomestico #"+(i+1));
            System.out.println("Precio Base: " + auxP [i]);
            electrodomesticos.get(i).imprimir();
            System.out.println("\n");
        }
        
        //AQUI SE IMPRIME LOS SUMATORIOS DE CADA UNA DE LAS CLASES
        System.out.println("Sumatorio total de Electrodomesticos: " + acumE);
        System.out.println("Sumatorio total de Lavadoras: " + acumL);
        System.out.println("Sumatorio total de Televisiones: " + acumT);
        
    }
    
}
