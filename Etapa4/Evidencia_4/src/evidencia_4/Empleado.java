/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_4;

/**
 *
 * @author 1083802401
 */
public class Empleado {
    
    //ATRIBUTOS
    private String nombre;
    private String cedula;
    private int edad;
    private String estadoCivil;
    private double salario;

    //CONSTRUCTOR
    public Empleado(String nombre, String cedula, int edad, String estadoCivil, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.salario = salario;
    }

    //SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //METODO PARA ASIGNAR LA CLASIFICACION
    public String asignarClasificacion(int edad){
        if(edad <= 21){
            return "Clasificacion: Principiante";
        }
        if(edad >= 22 && edad <= 35){
            return "Clasificacion: Intermedio";
        }
        if(edad > 35){
            return  "Clasificacion: Senior";
        }
        return null;
    }

   
    //METODO PARA IMPRIMIR LOS DATOS DEL EMPLEADO
    public void imprimir(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cedula: "+this.cedula);
        System.out.println("Edad: "+this.edad);
        System.out.println("Estado Civil: "+this.estadoCivil);
        System.out.println("Salario: "+this.salario);
        System.out.println(this.asignarClasificacion(this.edad));//IMPRIME LA CLASIFICACION
    }
    
    
    
}
