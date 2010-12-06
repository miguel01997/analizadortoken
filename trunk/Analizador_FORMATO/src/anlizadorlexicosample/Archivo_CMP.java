/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Karina
 */
public class Archivo_CMP extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.getPath().endsWith(".cmp")){
             return true;
        }else{
           return false;
        }

    }

    @Override
    public String getDescription() {
        return "archivo.cmp";

    }
    public void setDescription (String s ){

    }




}
