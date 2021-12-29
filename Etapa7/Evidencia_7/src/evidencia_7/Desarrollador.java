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
//CLASE DESARROLLADOR
public class Desarrollador implements Interfaz {//SE IMPLEMENTA LA INTERFAZ
    
    //ATRIBUTOS
    private String nombre;
    private String lineasDeCodigo;
    
    public Desarrollador(){
        
    }

    //CONSTRUCTOR
    public Desarrollador(String nombre, String lineasDeCodigo) {
        this.nombre = nombre;
        this.lineasDeCodigo = lineasDeCodigo;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getLineasDeCodigo() {
        return lineasDeCodigo;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLineasDeCodigo(String lineasDeCodigo) {
        this.lineasDeCodigo = lineasDeCodigo;
    }

    //METODOS IMPLEMENTADOS POR MEDIO DE LA INTERFAZ
    @Override
    public String encenderObjeto() {
        return "Soy el desarrollador " + this.nombre + ", encendí mi computadora";
    }

    @Override
    public String maniobrarObjeto() {
        return "Soy el desarrollador " + this.nombre + ", y llevo más de " + this.lineasDeCodigo + " líneas codificadas";
    }

    @Override
    public String apagarObjeto() {
        return "Soy el desarrollador " + this.nombre + ", apagué mi computadora";
    }
    
    
    
}
