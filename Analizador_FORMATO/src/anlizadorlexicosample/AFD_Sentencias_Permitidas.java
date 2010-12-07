/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

/**
 *
 * @author movs_666 karys
 */

public class AFD_Sentencias_Permitidas {
    private static int numero;
    private static String cadenaRegla;


    private static String senteciaSumar="var operador num operador num";
    private static int regla1=43;
    private static int regla2=54;
    private static int regla3=39;
    private static int regla4=41;
    private static int regla5=52;
    private static int regla6=50;
  /**
     * @return the cadenaRegla
     */
    public static String getCadenaRegla() {
        return cadenaRegla;
    }
    public static void setCadenaRegla(String aCadenaRegla) {
        cadenaRegla = cadenaRegla+aCadenaRegla;
    }
    public static int getNumero() {
        return numero;
    }
    public static void setNumero(int aNumero) {
        numero = numero + aNumero;
    }
     public static void anularNumero(){
       numero = 0;
    }
     public static void anularCadena(){
       cadenaRegla ="";
    }
//7REGLAS NUMERICAS///
     ///////veronica soto



    /**
     * @return the regla1
     */
    public static int getRegla1() {
        return regla1;
    }
    public static void setRegla1(int aRegla1) {
        regla1 = 43;
    }

    /**
     * @return the regla2
     */
    public static int getRegla2() {
        return regla2;
    }
    public static void setRegla2(int aRegla2) {
        regla2 = 54;
    }

    /**
     * @return the regla3
     */
    public static int getRegla3() {
        return regla3;
    }
    public static void setRegla3(int aRegla3) {
        regla3 = 39;
    }

    /**
     * @return the regla4
     */
    public static int getRegla4() {
        return regla4;
    }
    public static void setRegla4(int aRegla4) {
        regla4 = 41;
    }

    /**
     * @return the regla5
     */
    public static int getRegla5() {
        return regla5;
    }
    public static void setRegla5(int aRegla5) {
        regla5 = 52;
    }

    /**
     * @return the regla6
     */
    public static int getRegla6() {
        return regla6;
    }
    public static void setRegla6(int aRegla6) {
        regla6 = 50;
    }


    /////REGLAS DE CARACTERES///

    public static String reglaCarat1(){
        String s ="varigualnumeroopermatnumero;";
        return s;
    }
    public static String reglaCarat2(){
        String s ="resparnumeronumeroper;";
        return s;
    }
    public static String reglaCarat3(){
        String s ="varigualvaropermatvar;";
        return s;
    }
    public static String reglaCarat4(){
        String s ="varigualnumeroopermatvar;";
        return s;
    }
    public static String reglaCarat5(){
        String s ="resparvarnumeroper;";
        return s;
    }
    public static String reglaCarat6(){
        String s ="resparvarvarper;";
        return s;
    }
}
