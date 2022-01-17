/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pia;

/**
 *
 * @author 1083802401
 */
// CLASE LAVADORA  (CLASE HIJA)
public class Lavadora extends Electrodomestico {
    
    //ATRIBUTOS
    private int carga = 5;

    //CONSTRUCTOR POR DEFECTO
    public Lavadora() {
    }

    //CONSTRUCTOR CON ATRIBUTOS
    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);//SE HEREDAN LOS ATRIBUTOS DE LA CLASE PADRE
        this.carga = carga;
    }

    //GETTERS
    public int getCarga() {
        return carga;
    }

    //SETTERS
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    //METODO IMPRIMIR SOBREESCRITO
    @Override
    public void imprimir(){
        System.out.println("LAVADORA");
        super.imprimir();
        System.out.println("Carga: "+this.carga+" kg");
    }
    
    //METODO PARA OBTENER EL PRECIO FINAL SOBREESCRITO
    @Override
    public void precioFinal(){
        super.precioFinal();//HEREDA EL METODO DE LA CLASE PADRE
        if(this.carga > 30){
            int aux;
            aux = this.getPrecioBase();
            this.setPrecioBase(aux + 500);
        }
    }
    
}
