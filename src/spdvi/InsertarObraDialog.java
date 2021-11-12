/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package spdvi;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class InsertarObraDialog extends javax.swing.JDialog {
    private static final java.lang.reflect.Type LIST_OF_OBRA_TYPE = new TypeToken<List<Obra>>() {}.getType();
    boolean profileImageChoosen = false; 
    private JFileChooser fileChooser;
    private final MainForm mainForm;
    String userFolder = System.getProperty("user.home");
    String ImagePath = "/src/image/default.jpg";
    BufferedImage bufferedImage;
    //ArrayList<Obra> obras = new ArrayList<Obra>();
        
    /**
     * Creates new form InsertarObraDialog
     */
    public InsertarObraDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mainForm = (MainForm) this.getParent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblAny = new javax.swing.JLabel();
        lblFormato = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtAny = new javax.swing.JTextField();
        txtFormato = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        lblObraImage = new javax.swing.JLabel();
        btnLoadImage = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblImageName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRegistro.setText("Registro IB");

        lblTitulo.setText("Titulo");

        lblAny.setText("Año");

        lblFormato.setText("Formato");

        lblAutor.setText("Autor");

        txtRegistro.setName(""); // NOI18N
        txtRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegistroFocusGained(evt);
            }
        });
        txtRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroActionPerformed(evt);
            }
        });

        txtTitulo.setName(""); // NOI18N
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTituloFocusGained(evt);
            }
        });
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtAny.setName(""); // NOI18N
        txtAny.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAnyFocusGained(evt);
            }
        });
        txtAny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnyActionPerformed(evt);
            }
        });

        txtFormato.setName(""); // NOI18N
        txtFormato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFormatoFocusGained(evt);
            }
        });
        txtFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormatoActionPerformed(evt);
            }
        });

        txtAutor.setName(""); // NOI18N
        txtAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAutorFocusGained(evt);
            }
        });
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        lblObraImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObraImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/default.jpg"))); // NOI18N

        btnLoadImage.setText("Load image");
        btnLoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadImageActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblImageName.setText("default.jpg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAny, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAny, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLoadImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblObraImage, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblImageName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblAny)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblObraImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(lblFormato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoadImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAutor))
                    .addComponent(lblImageName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegistroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegistroFocusGained
        // TODO add your handling code here:
        txtRegistro.selectAll();
    }//GEN-LAST:event_txtRegistroFocusGained

    private void txtRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroActionPerformed

    private void txtFormatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFormatoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormatoFocusGained

    private void txtFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormatoActionPerformed

    private void txtTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloFocusGained

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtAnyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnyFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnyFocusGained

    private void txtAnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnyActionPerformed

    private void txtAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorFocusGained

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        //String registre, String titol, String any, String format, String autor, String imatge
       if (txtRegistro.getText().length() != 8 ) {
                lblError.setText("El registro tiene 8 numeros");
            } else if(!isNumber(txtRegistro.getText())){
                lblError.setText("El registro esta formado solo por numeros");
            } else {
                
            lblError.setText("Ok");
            
            
            
            
       Obra newObra = new Obra("IB" + txtRegistro.getText(), txtTitulo.getText(), txtAny.getText(), txtFormato.getText(), txtAutor.getText(), lblImageName.getText());
       guardarInfo(newObra);
       mainForm.obras.add(newObra);
       mainForm.UpdateObraListView();
       
       mainForm.setConfirmSave(true);
       this.setVisible(false); }
    }//GEN-LAST:event_btnInsertarActionPerformed

    public void guardarInfo(Obra newObra){
        
        try {
            if (profileImageChoosen) {
                ImagePath = userFolder + "\\AppData\\Local\\OpusList\\images\\" + fileChooser.getSelectedFile().getName();
                mainForm.writeData(newObra, fileChooser.getSelectedFile().getAbsolutePath());
                bufferedImage = ImageIO.read(new File(fileChooser.getSelectedFile().getAbsolutePath()));
            }
            else {
                mainForm.writeData(newObra, ImagePath);
                bufferedImage = ImageIO.read(new File(ImagePath));  
            }
            File outputImage = new File(ImagePath);
                ImageIO.write(bufferedImage, "jpg", outputImage);
        }
        catch (Exception ex) {
            
        }
    }
    

    private static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	} 
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        mainForm.setConfirmSave(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadImageActionPerformed
        // TODO add your handling code here:
        
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                bufferedImage = ImageIO.read(new File(fileChooser.getSelectedFile().getAbsolutePath()));
                String name = fileChooser.getSelectedFile().getName();
                profileImageChoosen = true; 
                lblImageName.setText(name);
                
                ImageIcon icon = mainForm.resizeImageIcon(bufferedImage, lblObraImage.getWidth(), lblObraImage.getHeight());
                lblObraImage.setIcon(icon);
                            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }   
        }
    }//GEN-LAST:event_btnLoadImageActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertarObraDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarObraDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarObraDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarObraDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InsertarObraDialog dialog = new InsertarObraDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLoadImage;
    private javax.swing.JLabel lblAny;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblImageName;
    private javax.swing.JLabel lblObraImage;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAny;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtFormato;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
