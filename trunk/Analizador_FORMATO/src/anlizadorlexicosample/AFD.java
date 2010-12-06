/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

import java.util.StringTokenizer;

/**
 *Created on 20 de noviembre de 2010, 19:44
 * @author karys
 */
public class AFD {

    public enum TOKEN {NUMERO, ERROR,RESERVADA,OPERADOR,VARIABLE};

    public void verificaTexto(String texto, AnalizadorLexico lex){
        lex.getLexicos().clear();
        for (StringTokenizer stringTokenizer = new StringTokenizer(texto); stringTokenizer.hasMoreTokens();) {
            String token = stringTokenizer.nextToken();
            if (validatokenReservada(token)!=TOKEN.ERROR){//reservada
               lex.addLexico(new Lexico(validatokenReservada(token), token));
            }else if (validaToken(token)!=TOKEN.ERROR){//numero
               lex.addLexico(new Lexico(validaToken(token), token));
            }else if (validatokenOperador(token)!=TOKEN.ERROR){//operador
               lex.addLexico(new Lexico(validatokenOperador(token), token));
            }else if (validaVariable(token)!=TOKEN.ERROR){//varaibles.
               lex.addLexico(new Lexico(validaVariable(token), token));
            }else {
                lex.addLexico(new Lexico(validaVariable(token), token));
            }


             
        }

    }
    private TOKEN validaVariable (String palabra){
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
    private TOKEN validatokenOperador (String palabra){
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
                    }else if(c.equals('=')){
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

    private TOKEN validatokenReservada (String palabra){
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

    private TOKEN validaToken(String palabra){
        TOKEN token = TOKEN.ERROR;
        //int cont=0;
        int estado=0;
        for (int i = 0; i < palabra.length(); i++) {
            Character c = palabra.charAt(i);
            switch (estado) {
                case 0:
                    if(Character.isDigit(c)){
                        estado = 3;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 1;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=2;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }
                    break;
                case 1:
                    if(Character.isDigit(c)){
                        estado = 3;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=2;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                case 2:
                    if(Character.isDigit(c)){
                        estado = 4;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=5;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                case 3:
                    if(Character.isDigit(c)){
                        estado = 3;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=2;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                case 4:
                    if(Character.isDigit(c)){
                        estado = 4;
                        token = TOKEN.NUMERO;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=5;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                case 5:
                    if(Character.isDigit(c)){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('-')){
                        estado = 5;
                        token = TOKEN.ERROR;
                    }else if(c.equals('.')){
                        estado=5;
                        token = TOKEN.ERROR;
                    }else{
                        estado = -1;
                        token = TOKEN.ERROR;
                    }

                    break;
                default:
                    token = TOKEN.ERROR;
            }


        }
        return token;

    }
}
