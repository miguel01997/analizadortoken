/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
  * @author movs_666 karys
 */
public class AFD_Parentesi1 extends AFD {
  public static  TOKEN parenteis (String palabra){
        TOKEN t2= TOKEN.ERROR;

        if (palabra.equals("(")){
              t2=TOKEN.PARENTESIS_1;

        }
        return t2;
    }
}
