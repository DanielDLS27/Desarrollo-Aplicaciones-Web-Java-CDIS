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
//CLASE COCINERO
public class Cocinero implements Interfaz {//SE IMPLEMENTA LA INTERFAZ
    
    //ATRIBUTOS
    private String nombre;
    private String horasEnEstufa;
    
    public Cocinero(){
        
    }

    //CONSTRUCTOR
    public Cocinero(String nombre, String horasEnEstufa) {
        this.nombre = nombre;
        this.horasEnEstufa = horasEnEstufa;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getHorasEnEstufa() {
        return horasEnEstufa;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasEnEstufa(String horasEnEstufa) {
        this.horasEnEstufa = horasEnEstufa;
    }

    //METODOS IMPLEMENTADOS POR MEDIO DE LA INTERFAZ
    @Override
    public String encenderObjeto() {
        return "Soy el cocinero " + this.nombre + ", encendí mi estufa";
    }

    @Override
    public String maniobrarObjeto() {
        return "Soy el cocinero " + this.nombre + ", y llevo más de " + this.horasEnEstufa + " horas en la estufa";
    }

    @Override
    public String apagarObjeto() {
        return "Soy el cocinero " + this.nombre + ", apagué mi estufa";
    }
    
    
    
}
