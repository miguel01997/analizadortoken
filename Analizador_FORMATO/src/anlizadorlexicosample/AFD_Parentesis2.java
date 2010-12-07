/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
 * @author movs_666 karys
 */
public class AFD_Parentesis2 extends AFD{

    public static  TOKEN parentesis2 (String palabra){
        TOKEN t2= TOKEN.ERROR;

        if (palabra.equals(")")){
              t2=TOKEN.PARENTESIS_2;
        }
        return t2;
    }
}
