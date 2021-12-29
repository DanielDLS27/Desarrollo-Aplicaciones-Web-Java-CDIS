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
//CLASE PILOTO
public class Piloto implements Interfaz {//SE IMPLEMENTA LA INTERFAZ
    
    //ATRIBUTOS 
    private String nombre;
    private String aniosVolando;

    public Piloto() {
        
    }

    //CONSTRUCTOR
    public Piloto(String nombre, String aniosVolando){
        this.nombre = nombre;
        this.aniosVolando = aniosVolando;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getAniosVolando() {
        return aniosVolando;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAniosVolando(String aniosVolando) {
        this.aniosVolando = aniosVolando;
    }

    //METODOS IMPLEMENTADOS POR MEDIO DE LA INTERFAZ
    @Override
    public String encenderObjeto() {
        return "Soy el piloto " + this.nombre + ", encendí mi nave";
    }

    @Override
    public String maniobrarObjeto() {
        return "Soy el piloto " + this.nombre + ", y llevo más de " + this.aniosVolando + " años volando";
    }

    @Override
    public String apagarObjeto() {
        return "Soy el piloto " + this.nombre + ", apagué mi nave";
    }
    
    
    
}
