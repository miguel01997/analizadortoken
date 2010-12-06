package anlizadorlexicosample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextPane;
import java.awt.print.*;


public class PrintComponents_1 {

    JTextPane jp;

    public PrintComponents_1(JTextPane np) {

        jp = np;
        performPrint();
    }

       protected void performPrint() {
        PrinterJob job = PrinterJob.getPrinterJob();

        job.setPrintable(new MyPrintable());

        try {
            if (job.printDialog()) {
                job.print();
            }
                
            } catch  (PrinterException pe) {
        }        
    }
    // MyPrintabla innar ciesa goas bara.
    class MyPrintable implements Printable {
        private Container np;

        public int print(Graphics g, PageFormat pf, int index) {
            if (index == 0) {
                g.translate((int) (pf.getImageableY()), (int) (pf.getImageableY()));
                Container pane = np;
                pane.paint(g);
                return Printable.PAGE_EXISTS;
            }
            return Printable.NO_SUCH_PAGE;
        }
    }
}




