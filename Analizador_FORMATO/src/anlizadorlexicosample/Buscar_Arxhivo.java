/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package anlizadorlexicosample;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.Caret;


 //* @author movs_666 karys


public class Buscar_Arxhivo extends JFrame{

    //variable gloval tipo String contendra la cadena a buscar
    String textoBuscar;

    //En el constructor del objeto asigno el texto seleccionado a la variable
    //textoBuscar y luego llamo a la funcion buscarEnElTexto(texto), recuerden que
    //los constructores se ejecutan al momento de crear el objeto.
    public void Buscar(JTextPane texto){
        //Asigno a la variable textoBuscar el texto seleccionado en el editor
        textoBuscar=texto.getSelectedText();
        buscarEnElTexto(texto);
    }

    private void buscarEnElTexto(JTextPane texto){

        //Se verifica que contenga algo
        if (textoBuscar == null)
        {
            textoBuscar = "";
        }

        //Muestra el dialogo con la cadena a buscar si habia texto seleccionado sino la
        //muestra vacia para que se ingrese la cadena a buscar
        textoBuscar = JOptionPane.showInputDialog(texto, "Texto a buscar", textoBuscar);

        // Se obtiene el todo el texto  del JTextArea en una nuva variable texto.
        //String textoAuxiliar = texto.getText();

        //Comprovando la pocicion del texto seleccionado si es que lo hay
        Caret seleccion = texto.getCaret();
        int posicion = 0;
        if (seleccion.getDot() != seleccion.getMark())
        {
            posicion = seleccion.getDot();
        }

        // Se busca el texto a partir de la posiciÃ³n del texto seleccionado si lo
        // habia
        posicion = texto.getText().indexOf(textoBuscar, posicion);

        //Si no encuentra coincidencias termina
        if (posicion == -1)
        {
            return;
        }

        //Pero si hay coincidencia se llamara a areaTexto.select(), para
        //selecionar el texto encontrado
        texto.setCaretPosition(posicion);
        texto.moveCaretPosition(posicion + textoBuscar.length());
    }

}
