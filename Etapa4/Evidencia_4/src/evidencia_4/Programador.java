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
public class Programador extends Empleado {
    
    //ATRIBUTOS
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    //CONSTRUCTOR
    public Programador(String nombre, String cedula, int edad, String estadoCivil, double salario, int lineasDeCodigoPorHora, String lenguajeDominante){
        super(nombre, cedula, edad, estadoCivil, salario);//DE AQUI HEREDAMOS LOS ATRIBUTOS DE LA CLASE EMPLEADO
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    //SETTERS Y GETTERS
    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    //SE HEREDA EL METODO IMPRIMIR DE LA CLASE EMPLEADO
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Lineas de Codigo por Horas: "+this.lineasDeCodigoPorHora);
        System.out.println("Lenguaje Dominante: "+this.lenguajeDominante);
    }
    
    
}
