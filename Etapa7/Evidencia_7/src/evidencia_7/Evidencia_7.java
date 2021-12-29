/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_7;

/**
 *
 * @author 1083802401
 */
public class Evidencia_7 {

    /**
     * @param args the command line arguments
     */
    //CLASE MAIN
    public static void main(String[] args) {
        
        //SE CREAN LOS OBJETOS Y SE LES ASIGNAN DATOS PARA SUS ATRIBUTOS
        Piloto piloto = new Piloto("Martin", "10");
        Desarrollador desarrollador = new Desarrollador("Brandon", "2200");
        Cocinero cocinero = new Cocinero("Juan Manuel", "10");
        
        //SE EJECUTAN LOS METODOS DE CADA UNA DE LAS CLASES
        System.out.println(piloto.encenderObjeto());
        System.out.println(piloto.maniobrarObjeto());
        System.out.println(piloto.apagarObjeto());
        
        System.out.println(desarrollador.encenderObjeto());
        System.out.println(desarrollador.maniobrarObjeto());
        System.out.println(desarrollador.apagarObjeto());
        
        System.out.println(cocinero.encenderObjeto());
        System.out.println(cocinero.maniobrarObjeto());
        System.out.println(cocinero.apagarObjeto());
        
    }
    
}
