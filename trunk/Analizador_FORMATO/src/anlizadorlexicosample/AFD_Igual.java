/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
 * @author movs_666 karys
 */
public class AFD_Igual extends AFD {
    public static  TOKEN valida_Oper_Igual (String palabra){
        TOKEN t2= TOKEN.ERROR;
       
        if (palabra.equals("=")){
              t2=TOKEN.OPERADOR_iGUAL;
         
        }else if (palabra.equals("==")){
              t2=TOKEN.OPERADOR;
        }
        return t2;
    }


}
