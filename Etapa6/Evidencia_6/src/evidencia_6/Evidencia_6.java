/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia_6;

//LIBRERIAS UTILIZADAS
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 1083802401
 */
public class Evidencia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        FileWriter archivo;
        PrintWriter archivoEscribir = null;
        
        try{
            archivo = new FileWriter("DDLS.txt");//SE CREA EL OBJETO PARA CREAR EL ARCHIVO
            archivoEscribir = new PrintWriter(archivo);//SE CREA EL OBJETO PARA ESCRIBIR EN EL ARCHIVO
            String linea = "Daniel De León Salinas";
            archivoEscribir.println(linea);//SE AGREGA EL TEXTO DENTRO DEL ARCHIVO
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            archivoEscribir.close();
        }
        
        File archive = null;
        FileReader archiveOpener = null;
        BufferedReader archiveLector = null;
        
        try{
             archive = new File("C:\\Users\\1083802401\\Desktop\\Desarrollo-Aplicaciones-Web-Java-CDIS\\Etapa6\\Evidencia_6\\DDLS.txt");
             archiveOpener = new FileReader(archive);//SE CREA EL OBJETO PARA ABRIR EL ARCHIVO
             archiveLector = new BufferedReader(archiveOpener);//SE CREA EL OBJETO PARA LEER EL ARCHIVO
             String linea2 = "";
             //CICLO PARA IMPRIMIR EN CONSOLA EL CONTENIDO DEL ARCHIVO
             while((linea2 = archiveLector.readLine()) != null){
                System.out.println(linea2);
             }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }finally{
            try{
                archiveOpener.close();
            }catch(IOException exc){
                System.out.println(exc.toString());
            }
        }
       
        
    }
    
}
