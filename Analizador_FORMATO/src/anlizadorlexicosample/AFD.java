/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

import java.util.StringTokenizer;

/**
 *Created on 20 de noviembre de 2010, 19:44
 * @author movs_666 karys
 */
public class AFD {

    /**
     * @return the n
     */
    public static int getN() {
        return num;
    }
    public static void setN(int aN) {
        num = aN;
    }
    public static AFD_Sentencias_Permitidas af_numero= new AFD_Sentencias_Permitidas();

    private static String cadenas;

    /**
     * @return the cadena
     */
    public static String getCadena() {
        return cadenas;
    }
    public static void setCadena(String cadena) {
        cadenas  = cadena;
    }


    public enum TOKEN {NUMERO,ERROR,RESERVADA,OPERADOR,VARIABLE,FECHAVALIDA, FECHAINVALIDA,
                        OPERADOR_iGUAL,OPERADOR_MATEMATICO,PUNTO_COMA,PARENTESIS_1,PARENTESIS_2};
    private static int num;
    public void verificaTexto(String texto, AnalizadorLexico lex){
        af_numero.anularNumero();
        af_numero.anularCadena();

        lex.getLexicos().clear();
        for (StringTokenizer stringTokenizer = new StringTokenizer(texto); stringTokenizer.hasMoreTokens();) {
            String token = stringTokenizer.nextToken();
            if (new AFD_validatokenReservada().validaPalabraReservada(token)!=TOKEN.ERROR){//reservada
               lex.addLexico(new Lexico(new AFD_validatokenReservada().validaPalabraReservada(token), token));
                af_numero.setNumero(5);
                af_numero.setCadenaRegla("res");
            }else if (new AFD_Variable().validaVariable(token)!=TOKEN.ERROR){//varaibles.
               lex.addLexico(new Lexico(new AFD_Variable().validaVariable(token), token));
                af_numero.setNumero(1);
                af_numero.setCadenaRegla("var");
            }else if (new AFD_Operador().validatokenOperador(token)!=TOKEN.ERROR){//operador
               lex.addLexico(new Lexico(new AFD_Operador().validatokenOperador(token), token));
            }else if (new AFD_OPER_MATEMATICO().validaOperMate(token)!=TOKEN.ERROR){//operador
               lex.addLexico(new Lexico(new AFD_OPER_MATEMATICO().validaOperMate(token), token));
                af_numero.setNumero(4);
                af_numero.setCadenaRegla("opermat");
            }else if (new AFD_Igual().valida_Oper_Igual(token)!=TOKEN.ERROR){//operador
               lex.addLexico(new Lexico(new AFD_Igual().valida_Oper_Igual(token), token));
                af_numero.setNumero(2);
                af_numero.setCadenaRegla("igual");
            }else if (new AFD_Numero().validaNumero(token)!=TOKEN.ERROR){//numero
               lex.addLexico(new Lexico(new AFD_Numero().validaNumero(token), token));
                af_numero.setNumero(3);
                af_numero.setCadenaRegla("numero");
            }else if (new AFD_Calendario().validafecha(token)!=TOKEN.ERROR){
               lex.addLexico(new Lexico(new AFD_Calendario().validafecha(token), token));
            }else if (new AFD_Parentesi1().parenteis(token)!=TOKEN.ERROR){
               lex.addLexico(new Lexico(new AFD_Parentesi1().parenteis(token), token));
                af_numero.setNumero(6);
                af_numero.setCadenaRegla("par");
            }else if (new AFD_Parentesis2().parentesis2(token)!=TOKEN.ERROR){
               lex.addLexico(new Lexico(new AFD_Parentesis2().parentesis2(token), token));
                af_numero.setNumero(7);
                af_numero.setCadenaRegla("per");
            }else if (new AFD_Punto_Coma().punto_Coma(token)!=TOKEN.ERROR){
               lex.addLexico(new Lexico(new AFD_Punto_Coma().punto_Coma(token), token));
               af_numero.setCadenaRegla(";");

                af_numero.setNumero(30);
                setN(af_numero.getNumero());
                af_numero.anularNumero();

                
                //setCadena(af_numero.getCadenaRegla());
                //af_numero.anularCadena();
//                af_numero.anularCadena();

                 
                //sentencias();
            } else {
                lex.addLexico(new Lexico(TOKEN.ERROR, token));
            }
        }

   }
   public static String sentencias () {
            //System.out.println(af_numero.getCadenaRegla()+"       "+ af_numero.reglaCarat1()+ " \n" );
            String senten="";
            if (getN()==af_numero.getRegla1()){
                senten="SENTENCIA CORRECTA";
            }else if (getN()==af_numero.getRegla2()){
                senten="SENTENCIA CORRECTA";
            }else if (getN()==af_numero.getRegla3()){
                senten="SENTENCIA CORRECTA";
            }else if(getN()==af_numero.getRegla4()){
                senten="SENTENCIA CORRECTA";
            }else if(getN()==af_numero.getRegla5()){
                senten="SENTENCIA CORRECTA";
            }else if(getN()==af_numero.getRegla6()){
                senten="SENTENCIA CORRECTA";
            }else {
                senten="SENTENCIA -----INCORRECTA";
            }

         /*   if (getCadena().equals(af_numero.reglaCarat1())){
                senten="SENTENCIA CORRECTA";
                System.out.println(af_numero.getCadenaRegla()+"       "+ af_numero.reglaCarat1()+ " " );
            }else if (getCadena().equals(af_numero.reglaCarat2())){
                senten="SENTENCIA CORRECTA";
                System.out.println(af_numero.getCadenaRegla()+"       "+ af_numero.reglaCarat2()+ " " );
            }else if (getCadena().equals(af_numero.reglaCarat3())){
                senten="SENTENCIA CORRECTA";
                System.out.println(af_numero.getCadenaRegla()+"       "+ af_numero.reglaCarat3()+ " " );
            }else if(getCadena().equals(af_numero.reglaCarat4())){
                senten="SENTENCIA CORRECTA";
                System.out.println(af_numero.getCadenaRegla()+"       "+ af_numero.reglaCarat4()+ " " );
            }else if(getCadena().equals(af_numero.reglaCarat5())){
                senten="SENTENCIA CORRECTA";
                System.out.println(af_numero.getCadenaRegla()+"       "+ af_numero.reglaCarat5()+ " " );
            }else if(getCadena().equals(af_numero.reglaCarat6())){
                senten="SENTENCIA CORRECTA";
                System.out.println(af_numero.getCadenaRegla()+"       "+ af_numero.reglaCarat6()+ " " );
            }else {
                senten="SENTENCIA -----INCORRECTA";
                System.out.println(af_numero.getCadenaRegla()+"       "+ af_numero.getCadenaRegla()+ " " );
            }*/


            //af_numero.anularCadena();
            setN(0);
            setCadena("");
            return senten;

   }

}
