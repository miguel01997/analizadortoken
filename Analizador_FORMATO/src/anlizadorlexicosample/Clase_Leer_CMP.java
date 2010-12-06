/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Karina
 */
public class Clase_Leer_CMP {

    public String  leerArchivo(File archivo) throws FileNotFoundException, IOException{
    String archi="";
    String archi2="";

                FileReader leer= new FileReader(archivo);
                BufferedReader l = new BufferedReader(leer);
                archi2 = l.readLine();
                while (archi2!=null){
                    System.out.println(""+archi);
                    if (archi2!=null){
                        archi = archi+archi2 ;
                    }
                    archi2= l.readLine();
                }
    return archi;
    }

}
