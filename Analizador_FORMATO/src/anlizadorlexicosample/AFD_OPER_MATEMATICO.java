/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
 * @author movs_666 karys
 */
public class AFD_OPER_MATEMATICO extends AFD {
      public static  TOKEN validaOperMate (String palabra){
        TOKEN t2= TOKEN.ERROR;

        if (palabra.equals("+")){
              t2=TOKEN.OPERADOR_MATEMATICO;
        }else if (palabra.equals("-")){
              t2=TOKEN.OPERADOR_MATEMATICO;
        }else if(palabra.equals("*")){
              t2=TOKEN.OPERADOR_MATEMATICO;
        }else if (palabra.equals("/")){
              t2=TOKEN.OPERADOR_MATEMATICO;
        }else if (palabra.equals("^")){
              t2=TOKEN.OPERADOR_MATEMATICO;
        }
        return t2;
    }

}
