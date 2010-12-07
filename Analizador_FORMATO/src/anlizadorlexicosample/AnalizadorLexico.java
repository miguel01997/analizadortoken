/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

import java.util.ArrayList;
import java.util.List;

/**
 *Created on 20 de noviembre de 2010, 19:44
 * @author movs_666 karys
 */
public class AnalizadorLexico {

    private List<Lexico> lexicos;
    private AFD afd;

    public AnalizadorLexico() {
        this.lexicos = new ArrayList<Lexico>();
        this.afd=new AFD();
    }

    public void crearTokens(String texto){
        this.afd.verificaTexto(texto, this);
        

    }

    public void addLexico(Lexico lexico){
        lexicos.add(lexico);
    }

    public List<Lexico> getLexicos() {
        return lexicos;
    }

    public void setLexicos(List<Lexico> lexicos) {
        this.lexicos = lexicos;
    }



}
