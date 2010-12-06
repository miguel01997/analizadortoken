/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Karina
 */
public class Clase_Guardar_CMP  {
    
    public void guardar_Archivo (String nombre,File f){
    try {
        BufferedWriter archivo= new BufferedWriter(new FileWriter(f) );
        archivo.write(nombre);
        archivo.close();
        JOptionPane.showConfirmDialog(null,"EL ARCHIVO SE GUARDO CON EXITO" );    
    }catch(IOException ve){
    
    }
    
    }
    public void guardar_Archivo_Como (String nombre,String direccion) throws IOException{
      File archivo_direccion= new File(direccion);
      BufferedWriter archivo= new BufferedWriter(new FileWriter(archivo_direccion));
      archivo.write(nombre);
      archivo.close();
    }

}
