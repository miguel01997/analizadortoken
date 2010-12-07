/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
 * @author movs_666 karys
 */
public class AFD_validatokenReservada extends AFD{

    public static TOKEN validaPalabraReservada (String palabra){
        TOKEN t1= TOKEN.ERROR;
        int estado1=0;
        while (estado1!=-1){
            switch (estado1){
            case 0: if (palabra.equals("if")){
                        t1=TOKEN.RESERVADA;
                        estado1=-1;
                    }else{
                        t1=TOKEN.ERROR;
                        estado1=1;
                    }
            break;
            case 1:if (palabra.equals("else")){
                        t1=TOKEN.RESERVADA;
                        estado1=-1;
                    }else{
                        t1=TOKEN.ERROR;
                        estado1=2;
                    }
            break;
            case 2: if (palabra.equals("then")) {
                        t1=TOKEN.RESERVADA;
                        estado1=-1;
                    }else{
                        t1=TOKEN.ERROR;
                        estado1=3;
                    }
            break;
            case 3: if (palabra.equals("sumar")) {
                        t1=TOKEN.RESERVADA;
                        estado1=-1;
                    }else{
                        t1=TOKEN.ERROR;
                        estado1=4;
                    }
            break;
            case 4: if (palabra.equals("restar")) {
                        t1=TOKEN.RESERVADA;
                        estado1=-1;
                    }else{
                        t1=TOKEN.ERROR;
                        estado1=5;
                    }
            break;
            case 5: if (palabra.equals("multiplicar")) {
                        t1=TOKEN.RESERVADA;
                        estado1=-1;
                    }else{
                        t1=TOKEN.ERROR;
                        estado1=6;
                    }
            break;
            case 6: if (palabra.equals("dividir")) {
                        t1=TOKEN.RESERVADA;
                        estado1=-1;
                    }else{
                        t1=TOKEN.ERROR;
                        estado1=7;
                    }
            break;
            case 7: if (palabra.equals("potencia")) {
                        t1=TOKEN.RESERVADA;
                        estado1=-1;
                    }else{
                        t1=TOKEN.ERROR;
                        estado1=-1;
                    }
            break;
            default:
                    t1=TOKEN.ERROR;
                    estado1=-1;
            }
        }

        return t1;
    }

}
