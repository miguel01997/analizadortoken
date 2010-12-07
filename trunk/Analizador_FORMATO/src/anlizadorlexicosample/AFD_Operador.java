/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
 * @author movs_666 karys
 */
public class AFD_Operador extends AFD{
    public static  TOKEN validatokenOperador (String palabra){
        TOKEN t2= TOKEN.ERROR;
        int estado2=0;
        for (int i = 0;i<palabra.length();i++){
            Character c = palabra.charAt(i);

            switch (estado2){
            case 0: if (c.equals('>')){
                        t2=TOKEN.OPERADOR;
                        estado2=1;
                    }else if(c.equals('<')) {
                        t2=TOKEN.OPERADOR;
                        estado2=1;
                    }else if(c.equals('!')){
                        t2=TOKEN.ERROR;
                        estado2=4;
                    }
            break;
            case 1:
                    if(c.equals('=')){
                        t2=TOKEN.OPERADOR;
                        estado2=2;
                    }else if (c.equals(' ')){
                        t2=TOKEN.OPERADOR;
                        estado2=-1;
                    }else{
                        t2=TOKEN.ERROR;
                        estado2=3;
                    }
            break;
            case 2: if (c.equals(' ')) {
                        t2=TOKEN.OPERADOR;
                        estado2=-1;
                    }else{
                        t2=TOKEN.ERROR;
                        estado2=-1;
                    }
            break;
            case 3:     t2=TOKEN.ERROR;
                        estado2=-1;

            break;
            case 4: if (c.equals('=')) {
                        t2=TOKEN.OPERADOR;
                        estado2=2;
                    }else{
                        t2=TOKEN.ERROR;
                        estado2=3;
                    }
            break;
            default:
                    t2=TOKEN.ERROR;
                    estado2=-1;
            }
        }

        return t2;
    }

}
