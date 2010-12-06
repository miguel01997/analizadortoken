/*
 * VentanaPrincipal.java
 *
 * Created on 20 de noviembre de 2010, 19:44
 *
 *
 *
 * @uthor karys
 */


package anlizadorlexicosample;

import javax.swing.ImageIcon;
import java.awt.Image;

public class Presentacion extends javax.swing.JWindow {
    
    /** Creates new form Presentacion */
    public Presentacion() {
        initComponents();
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(53, 102, 154));
        setIconImage(null);
        getContentPane().setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(0, 153, 0));
        jProgressBar1.setFont(new java.awt.Font("Arial Black", 2, 11));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(40, 140, 380, 20);
        new Hilo();

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel1.setText("         ©2010 KARMIV2SOFTWARE ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 270, 440, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-467)/2, (screenSize.height-338)/2, 467, 338);
    }// </editor-fold>//GEN-END:initComponents
    
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
      class Hilo extends Thread implements Runnable {

        public Hilo() {
            this.start();
        }

        public void run() {
            try {
                for (int i = 1; i < jProgressBar1.getMaximum(); i++) {
                    sleep(70);
                    jProgressBar1.setValue(i);
                    jProgressBar1.setStringPainted(true);
                    jProgressBar1.setString("INICIANDO");
                    // System.out.println("aqui estas error "+jProgressBar1.getMaximum());
                    if (i >= 25 && i <= 49) {
                        jProgressBar1.setString("PROGRAMA DE AUTOMATAS");
                    } else if (i >= 50 && i <= 74) {
                        jProgressBar1.setString("INICIANDO... ");
                    } else if (i >= 75 && i <= 89) {
                        jProgressBar1.setString("LISTO.....");
                    } else if (i >= 90) {
                        jProgressBar1.setString("Carga completa");
                    }
                    if (i == 99) {
                        new MainFrame().setVisible(true);
                        dispose();
                    }
                }
            } catch (Exception ex) {

            }
        }
    }
}
