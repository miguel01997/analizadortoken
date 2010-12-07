/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
 * @author movs_666 karys
 */
public class AFD_Variable extends AFD {
    public static TOKEN validaVariable (String palabra){
            TOKEN t3= TOKEN.ERROR;
            int estado3 =0;
            for (int i =0;i<palabra.length();i++){
                Character c=palabra.charAt(i);
                switch (estado3){
                    case 0:
                            if (Character.isLetter(c)){
                                t3=TOKEN.ERROR;
                                estado3 = 1;
                            }else{
                                t3=TOKEN.ERROR;
                                estado3=2;
                            }
                    break;
                    case 1:
                            if (Character.isLetterOrDigit(c)){
                                t3=TOKEN.VARIABLE;
                                estado3 = 1;
                            }else{
                                t3=TOKEN.ERROR;
                                estado3=2;
                            }
                    break;

                    case 2:
                            if (Character.isDigit(c)){
                                t3=TOKEN.ERROR;
                                estado3 =-1 ;
                            }
                    break;
                            default:
                               t3=TOKEN.ERROR;
                               estado3 =-1 ;
                }

            }


        return t3;
    }

}
