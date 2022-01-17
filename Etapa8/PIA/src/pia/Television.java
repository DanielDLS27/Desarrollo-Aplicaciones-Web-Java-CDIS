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
//CLASE TELEVISION   (CLASE HIJA)
public class Television extends Electrodomestico {
    
    //ATRIBUTOS
    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    //CONSTRUCTOR POR DEFECTO
    public Television() {
    }

    //CONSTRUCTOR CON ATRIBUTOS
    public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);//HEREDA LOS ATRIBUTOS DE LA CLASE PADRE
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //GETTERS
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //SETTERS
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    //METODO IMPRIMIR SOBREESCRITO
    @Override
    public void imprimir(){
        System.out.println("TELEVISION");
        super.imprimir();
        System.out.println("Resolucion: "+this.resolucion+" Pulgadas");
        if(this.sintonizadorTDT){
            System.out.println("Sintonizador TDT: SI incorporado");
        }else{
            System.out.println("Sintonizador TDT: NO incorporado");
        }
    }
    
    //METODO PARA OBTENER EL PRECIO FINAL SOBREESCRITO
    @Override
    public void precioFinal(){
        if(this.resolucion > 40){
            double aux2;
            aux2 = this.getPrecioBase()*0.3;
            int aux3 = (int) aux2;
            this.setPrecioBase(this.getPrecioBase() + aux3);
        }
        super.precioFinal();//HEREDA EL METODO DE LA CLASE PADRE
        if(this.sintonizadorTDT == true){
            int aux4;
            aux4 = this.getPrecioBase();
            this.setPrecioBase(aux4 + 500);
        }
    }
    
}
