/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
 * @author movs_666 karys
 */
public class AFD_Punto_Coma extends AFD {

      public static  TOKEN punto_Coma (String palabra){
        TOKEN t2= TOKEN.ERROR;

        if (palabra.equals(";")){
              t2=TOKEN.PUNTO_COMA;
        }
        return t2;
      }

}
