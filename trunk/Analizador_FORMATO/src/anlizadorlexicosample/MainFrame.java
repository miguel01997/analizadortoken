/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on 05/12/2010, 00:40:25 PM
 *
 * @author movs_666 karys
 */

package anlizadorlexicosample;

import java.io.BufferedWriter;
import java.io.File;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.undo.UndoManager;

/**
 *
 * @author karys
 */
public class MainFrame extends javax.swing.JFrame {
    private final UndoManager undo;
    /** Creates new form MainFrame */
    public MainFrame() {

        initComponents();
        archivito=new DefaultStyledDocument();
        jTextPane1.setStyledDocument(archivito);
        colortexto=new Color_texto();
        undo= new UndoManager();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        analizadorLexico = new anlizadorlexicosample.AnalizadorLexico();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVistaPreliminar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnImp = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnCopiar = new javax.swing.JButton(new DefaultEditorKit.CopyAction());
        btnPegar = new javax.swing.JButton(new DefaultEditorKit.PasteAction());
        btnCortar = new javax.swing.JButton(new DefaultEditorKit.CutAction());
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        MenuItemAbrir = new javax.swing.JMenuItem();
        MenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        editar = new javax.swing.JMenu();
        deshacer = new javax.swing.JMenuItem();
        rehacer = new javax.swing.JMenuItem();
        metodoCortar = new javax.swing.JMenuItem(new DefaultEditorKit.CutAction());
        metodoCopiar = new javax.swing.JMenuItem(new DefaultEditorKit.CopyAction());
        metodoPegar = new javax.swing.JMenuItem(new DefaultEditorKit.PasteAction());
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                   ************    IDENTIFICADOR DE TOKENS    ************");
        setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.gif"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.setToolTipText("Salir de la Aplicación");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.png"))); // NOI18N
        jButton2.setText("NUEVO");
        jButton2.setToolTipText("Para dejar el área en blanco");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane1.setToolTipText("INGRESE AQUI LAS PALABRAS A VERIFICAR");
        jTextPane1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextPane1CaretUpdate(evt);
            }
        });
        jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPane1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPane1KeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTextPane1);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo_1.gif"))); // NOI18N
        btnNuevo.setToolTipText("CREA UN NUEVO DOCUMENTO .cmp");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CarpetaAmar.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir un nuevo Documento");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAbrir);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco_1.gif"))); // NOI18N
        btnGuardar.setToolTipText("Guardar cambios al archivo actual");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnVistaPreliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informe.gif"))); // NOI18N
        btnVistaPreliminar.setToolTipText("Vista Previa para ver el Documento");
        btnVistaPreliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaPreliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVistaPreliminar);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AYUDA.png"))); // NOI18N
        btnAyuda.setToolTipText("Opción de Ayuda ...");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAyuda);

        btnImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir - copia.jpg"))); // NOI18N
        btnImp.setToolTipText("Imprimir Documento");
        btnImp.setFocusable(false);
        btnImp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImp);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.gif"))); // NOI18N
        jButton3.setToolTipText("Buscar un Documento");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.gif"))); // NOI18N
        jButton4.setToolTipText("Deshacer");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/redo16.png"))); // NOI18N
        jButton5.setToolTipText("Rehacer");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tux.jpg"))); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Refresh.gif"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);

        tabla1.setBackground(new java.awt.Color(204, 204, 204));
        tabla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla1.setToolTipText("TABLA DE TOKENS");
        jScrollPane4.setViewportView(tabla1);

        btnCopiar.setBackground(new java.awt.Color(102, 102, 255));
        btnCopiar.setText("COPIAR");

        btnPegar.setBackground(new java.awt.Color(102, 102, 255));
        btnPegar.setText("PEGAR");

        btnCortar.setBackground(new java.awt.Color(102, 102, 255));
        btnCortar.setText("CORTAR");

        jScrollPane1.setViewportView(jTextPane2);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("ARCHIVO");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo_1.gif"))); // NOI18N
        jMenuItem13.setText("Nuevo");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        MenuItemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.gif"))); // NOI18N
        MenuItemAbrir.setText("ABRIR");
        MenuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAbrirActionPerformed(evt);
            }
        });
        MenuItemAbrir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MenuItemAbrirKeyPressed(evt);
            }
        });
        jMenu1.add(MenuItemAbrir);

        MenuItemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        MenuItemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.gif"))); // NOI18N
        MenuItemGuardar.setText("GUARDAR");
        MenuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemGuardar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/filesave.png"))); // NOI18N
        jMenuItem1.setText("GUARDAR COMO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconProject.png"))); // NOI18N
        jMenuItem9.setText("VISTA PRELIMINAR");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresión.png"))); // NOI18N
        jMenuItem10.setText("IMPRIMIR");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jMenuItem11.setText("SALIR");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        deshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        deshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.gif"))); // NOI18N
        deshacer.setText("Deshacer");
        editar.add(deshacer);

        rehacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        rehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/redo16.png"))); // NOI18N
        rehacer.setText("Rehacer");
        editar.add(rehacer);

        metodoCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        metodoCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cut_edit.gif"))); // NOI18N
        metodoCortar.setText("Cortar");
        metodoCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoCortarActionPerformed(evt);
            }
        });
        editar.add(metodoCortar);

        metodoCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        metodoCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Dibujocv.JPG"))); // NOI18N
        metodoCopiar.setText("Copiar");
        metodoCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoCopiarActionPerformed(evt);
            }
        });
        editar.add(metodoCopiar);

        metodoPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        metodoPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconTask.png"))); // NOI18N
        metodoPegar.setText("Pegar");
        editar.add(metodoPegar);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.gif"))); // NOI18N
        jMenuItem7.setText("Eliminar");
        editar.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inbox.png"))); // NOI18N
        jMenuItem8.setText("Seleccionar Todo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        editar.add(jMenuItem8);

        jMenuBar1.add(editar);

        jMenu3.setText("VER");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("AYUDA");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconHelp.png"))); // NOI18N
        jMenuItem12.setText("HELP??");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jToolBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(btnCortar, 0, 0, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, btnCopiar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, btnPegar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jButton2)
                            .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jScrollPane1)
                            .add(layout.createSequentialGroup()
                                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 307, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(29, 29, 29)
                                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 343, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(51, 51, 51)
                        .add(btnCopiar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnPegar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnCortar)
                        .add(44, 44, 44)
                        .add(jButton2)
                        .add(18, 18, 18)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(242, 242, 242))
                    .add(layout.createSequentialGroup()
                        .add(23, 23, 23)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                        .add(18, 18, 18)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(33, 33, 33))))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-850)/2, (screenSize.height-613)/2, 850, 613);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int n= JOptionPane.showConfirmDialog(null,"DESEA GUARDAR LOS CAMBIOS");
        if (n==0){
             FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formato cmp(*.cmp)", "cmp");
            try{
                String nombre = "";
                JFileChooser selector=new JFileChooser(System.getProperty("outFile"));
                selector.setFileFilter(filtro);
                selector.setCurrentDirectory(new File("."));
                selector.showSaveDialog(this);
                File GUARDAR =selector.getSelectedFile();
                if(GUARDAR != null){
                    nombre=selector.getSelectedFile().getAbsolutePath();
                    if(!nombre.endsWith(".cmp"))
                        nombre=nombre.concat(".cmp");
                    FileWriter GUARDADO=new FileWriter(nombre);
                    BufferedWriter bw=new BufferedWriter(GUARDADO);
                    jTextPane1.write(bw);
                }
            }
            catch(IOException exp){
            }

        }else if(n==1){
             System.exit(0);
        }else if (n==2){
        
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTextPane1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MenuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAbrirActionPerformed
            JFileChooser selector=new JFileChooser();
            selector.setFileFilter(new Archivo_CMP());
            Clase_Leer_CMP clase= new Clase_Leer_CMP();

            int opcion=selector.showOpenDialog(this);
            if (opcion==JFileChooser.APPROVE_OPTION) {
            try {
                File archivo = selector.getSelectedFile();
                jTextPane1.setText(clase.leerArchivo(archivo));
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_MenuItemAbrirActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void MenuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGuardarActionPerformed
    }//GEN-LAST:event_MenuItemGuardarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formato cmp(*.cmp)", "cmp");
        try{
            String nombre = "";
            JFileChooser selector=new JFileChooser(System.getProperty("outFile"));
            selector.setFileFilter(filtro);
            selector.setCurrentDirectory(new File("."));
            selector.showSaveDialog(this);
            File GUARDAR =selector.getSelectedFile();
            if(GUARDAR != null){
                nombre=selector.getSelectedFile().getAbsolutePath();
                if(!nombre.endsWith(".cmp"))
                    nombre=nombre.concat(".cmp");
                FileWriter GUARDADO=new FileWriter(nombre);
                BufferedWriter bw=new BufferedWriter(GUARDADO);
                jTextPane1.write(bw);
            }
        }
        catch(IOException exp){
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
          jTextPane1.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    // JOptionPane.showMessageDialog(null, "Campos Obligatorios Vacios", "CAMPOS VACIOS", JOptionPane.showConfirmDialog(YES, evt, null, WIDTH, WIDTH, null));
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVistaPreliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaPreliminarActionPerformed

        new Vista_Previa(jTextPane1.getText()).setVisible(true);


}//GEN-LAST:event_btnVistaPreliminarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
       new anlizadorlexicosample.Ayuda().setVisible(true);
}//GEN-LAST:event_btnAyudaActionPerformed

    private void MenuItemAbrirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MenuItemAbrirKeyPressed
        
    }//GEN-LAST:event_MenuItemAbrirKeyPressed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
     JFileChooser selector=new JFileChooser();
            selector.setFileFilter(new Archivo_CMP());
            Clase_Leer_CMP clase= new Clase_Leer_CMP();

            int opcion=selector.showOpenDialog(this);
            if (opcion==JFileChooser.APPROVE_OPTION) {
            try {
                File archivo = selector.getSelectedFile();
                jTextPane1.setText(clase.leerArchivo(archivo));
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}//GEN-LAST:event_btnAbrirActionPerformed

    private void btnImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpActionPerformed
         PrintComponents_1 p = new PrintComponents_1(jTextPane1);
}//GEN-LAST:event_btnImpActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
         PrintComponents_1 p = new PrintComponents_1(jTextPane1);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        jTextPane1.setText("");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Buscar_Arxhivo txtBusca= new Buscar_Arxhivo();
        txtBusca.Buscar(jTextPane1);
    }//GEN-LAST:event_jButton3ActionPerformed
// Diana Amay//
    private void jTextPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyReleased
        AnalizadorLexico al= new AnalizadorLexico();
        al.crearTokens(jTextPane1.getText().toString());
        int offset=0;
        List<Lexico> lista =al.getLexicos();
        for(int i=0;i<lista.size();i++){
            Lexico lex=lista.get(i);
            System.out.println(lex.getLexema());
            if(lex.getToken()==AFD.TOKEN.NUMERO)
                archivito.setCharacterAttributes(offset,lex.getLexema().length(),colortexto.numero,false);
            else if(lex.getToken()==AFD.TOKEN.RESERVADA)
                archivito.setCharacterAttributes(offset,lex.getLexema().length(),colortexto.reservada,false);
            else if(lex.getToken()==AFD.TOKEN.OPERADOR)
                archivito.setCharacterAttributes(offset,lex.getLexema().length(),colortexto.operador,false);
            else if(lex.getToken()==AFD.TOKEN.ERROR)
                archivito.setCharacterAttributes(offset,lex.getLexema().length(),colortexto.error,false);
            else if(lex.getToken()==AFD.TOKEN.VARIABLE)
                archivito.setCharacterAttributes(offset,lex.getLexema().length(),colortexto.variable,false);
            offset+=lex.getLexema().length()+1;
        }
       Object datos [][] = new Object[lista.size()][2];
        for (int i = 0; i < datos.length; i++) {
            datos[i][0]=lista.get(i).getToken();
            datos[i][1]=lista.get(i).getLexema();
        }
        tabla1.setModel(new DefaultTableModel(
                datos,new String [] {"Tokens", "Lexema"
        }
        

        ))
        ;
        AFD afd= new AFD();
        String sentencia = afd.sentencias();
        jTextPane2.setText(sentencia +"\n");
    }//GEN-LAST:event_jTextPane1KeyReleased

    private void metodoCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoCopiarActionPerformed
       // CortarPegarCopiar ccp = new CortarPegarCopiar();
        //ccp.getCopiar();
    }//GEN-LAST:event_metodoCopiarActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new anlizadorlexicosample.Ayuda().setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void metodoCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoCortarActionPerformed
       /* CortarPegarCopiar cpc = new CortarPegarCopiar();
        cpc.getTextArea();
        cpc.getCortar();*/
    }//GEN-LAST:event_metodoCortarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
      /*  CortarPegarCopiar ccp = new CortarPegarCopiar();
        ccp.getPegar();*/
    }//GEN-LAST:event_editarActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jTextPane1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPane1KeyTyped

    private void jTextPane1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextPane1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPane1CaretUpdate

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (undo.canUndo()) {
            undo.undo();
        } else {
            JOptionPane.showMessageDialog(this, "No se puede deshacer");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (undo.canRedo()) {
            undo.redo();
        } else {
            JOptionPane.showMessageDialog(this, "No se puede rehacer");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAbrir;
    private javax.swing.JMenuItem MenuItemGuardar;
    private anlizadorlexicosample.AnalizadorLexico analizadorLexico;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImp;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPegar;
    private javax.swing.JButton btnVistaPreliminar;
    private javax.swing.JMenuItem deshacer;
    private javax.swing.JMenu editar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem metodoCopiar;
    private javax.swing.JMenuItem metodoCortar;
    private javax.swing.JMenuItem metodoPegar;
    private javax.swing.JMenuItem rehacer;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
   File archi;
   boolean nuevo = false;
   private DefaultStyledDocument archivito;
   private Color_texto colortexto;
}
