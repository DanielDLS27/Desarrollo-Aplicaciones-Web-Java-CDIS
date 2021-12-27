/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_5;


/**
 *
 * @author 1083802401
 */
//CLASE DE LA EXCEPCION PERSONALIZADA
public class EdadException extends Exception{
    
    public static final long serialVersionUID = 700L;
    
    public EdadException(){
        
    }
    
    public EdadException(String mensaje){
        super(mensaje);
    }
    
    public EdadException(int edad) throws EdadException{
       this.verificarEdad(edad);
    }
    //METODO PARA VERIFICAR LA EDAD
    public void verificarEdad(int edad) throws EdadException{
        while(!(edad >= 18 && edad <= 45)){
            System.out.println("La edad capturada no pertenece al rango permitido (18 a 45 años), favor de capturar nuevamente");
            throw new EdadException("Error de edad");
        }
    }
}
