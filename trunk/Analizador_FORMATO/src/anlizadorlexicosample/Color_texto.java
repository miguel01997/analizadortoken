/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;

import java.awt.Color;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 * @author movs_666 karys
 */
public class Color_texto {

    public SimpleAttributeSet reservada;
    public SimpleAttributeSet error;
    public SimpleAttributeSet operador;
    public SimpleAttributeSet numero;
    public SimpleAttributeSet variable;
public Color_texto(){
       reservada = new SimpleAttributeSet();
       error = new SimpleAttributeSet();
       operador = new SimpleAttributeSet();
       numero = new SimpleAttributeSet();
       variable = new SimpleAttributeSet();
       StyleConstants.setForeground(reservada, Color.blue);
       StyleConstants.setForeground(error, Color.red);
       StyleConstants.setForeground(operador, Color.black);
       StyleConstants.setForeground(numero, Color.orange);
       StyleConstants.setForeground(variable, Color.green);
}

}
