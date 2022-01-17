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
//CLASE ELECTRODOMESTICO (SUPER CLASE)
public class Electrodomestico {
    
    //ATRIBUTOS
    private int precioBase = 1000;
    private String color = "Blanco";
    private char consumoEnergetico = 'F';
    private int peso = 5;
    
    //CONSTRUCTOR POR DEFECTO
    public Electrodomestico(){
       
    }

    //CONSTRUCTOR CON ATRIBUTOS
    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor(this.color);//SE EJECUTA EL METODO COMPROBARCOLOR DENTRO DEL CONSTRUCTOR
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(this.consumoEnergetico);//SE EJECUTA EL METODO COMPROBARCONSUMOENERGETICO DENTRO DEL CONSTRUCTOR
        this.peso = peso;
    }

    //GETTERS
    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    //SETTERS
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    // METODO PARA COMPROBAR EL RANGO VALIDO DEL CONSUMO DE ENERGIA
    public void comprobarConsumoEnergetico(char letra){
        
        if(letra != 'A'&& letra != 'B' && letra != 'C'&& letra != 'D'&& letra != 'E'&& letra != 'F'&& letra != 'a'&& letra != 'b'&& letra != 'c'&& letra != 'd'&& letra != 'e'&& letra != 'f'){
            this.consumoEnergetico = 'F';
        }
        
    }
    
    // METODO PARA COMPROBAR LOS COLORES VALIDOS
    public void comprobarColor(String color){
        
        if(!(color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris"))){
            this.color = "Blanco";
        }
        
    }
    
    // METODO PARA IMPRIMIR LOS DATOS
    public void imprimir(){
        System.out.println("Precio Final: "+this.precioBase);
        System.out.println("Color: "+this.color);
        System.out.println("Consumo Energetico: "+this.consumoEnergetico);
        System.out.println("Peso: "+this.peso+" kg");
    }
    
    //METODO PARA OBTENER EL PRECIO FINAL
    public void precioFinal(){
        switch(this.consumoEnergetico){
            
            case 'A':
                this.precioBase = this.precioBase + 1000;
                break;
            
            case 'a':
                this.precioBase = this.precioBase + 1000;
                break;    
                
            case 'B':
                this.precioBase = this.precioBase + 800;
                break;
                
            case 'b':
                this.precioBase = this.precioBase + 800;
                break;    
                
            case 'C':
                this.precioBase = this.precioBase + 600;
                break;
                
            case 'c':
                this.precioBase = this.precioBase + 600;
                break;    
                
            case 'D':
                this.precioBase = this.precioBase + 500;
                break;
                
            case 'd':
                this.precioBase = this.precioBase + 500;
                break;    
                
            case 'E':
                this.precioBase = this.precioBase + 300;
                break;
                
            case 'e':
                this.precioBase = this.precioBase + 300;
                break;    
                
            case 'F':
                this.precioBase = this.precioBase + 100;
                break;
                
            case 'f':
                this.precioBase = this.precioBase + 100;
                break;    
           
        }

        
        if(this.peso >= 0 && this.peso <= 19){
            this.precioBase = this.precioBase + 100;
        }
        
        if(this.peso >= 20 && this.peso <= 49){
            this.precioBase = this.precioBase + 500;
        }
        
        if(this.peso >= 50 && this.peso <= 79){
            this.precioBase = this.precioBase + 800;
        }
        
        if(this.peso >= 80){
            this.precioBase = this.precioBase + 1000;
        }
        

        
    }
    
}
