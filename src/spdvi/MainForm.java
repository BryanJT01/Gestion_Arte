/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spdvi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author bryan
 */
public class MainForm extends javax.swing.JFrame {
    private static final java.lang.reflect.Type LIST_OF_OBRA_TYPE = new TypeToken<List<Obra>>() {}.getType();
    private final String dataFile = (System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\data\\obres.json");
    private final String imageFolder = (System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\");
    private boolean dataChanged = false;
     private boolean confirmSave = false;
    private JList<Obra> lstObras;
    ArrayList<Obra> obras = new ArrayList<Obra>();
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
       
        jScrollPane1.setViewportView(lstObras);
        lstObras = new JList<Obra>();
        jScrollPane1.setViewportView(lstObras);
        lstObras.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstObrasValueChanged(evt);
            }
        });
    }
    
    public boolean isConfirmSave() {
        return confirmSave;
    }

    public void setConfirmSave(boolean confirmSave) {
        this.confirmSave = confirmSave;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jCheckBox1 = new javax.swing.JCheckBox();
        lblImage = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        mnuCRUD = new javax.swing.JMenu();
        mniInsert = new javax.swing.JMenuItem();
        mniLoad = new javax.swing.JMenuItem();
        mniUpdate = new javax.swing.JMenuItem();
        mniDelete = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        mnuFile.setText("File");

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        mniExit.setText("Exit");
        mnuFile.add(mniExit);

        jMenuBar1.add(mnuFile);

        mnuCRUD.setText("CRUD");

        mniInsert.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniInsert.setText("Insertar ");
        mniInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInsertActionPerformed(evt);
            }
        });
        mnuCRUD.add(mniInsert);

        mniLoad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLoad.setText("Visualizar");
        mniLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoadActionPerformed(evt);
            }
        });
        mnuCRUD.add(mniLoad);

        mniUpdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniUpdate.setText("Actualizar");
        mnuCRUD.add(mniUpdate);

        mniDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDelete.setText("Eliminar");
        mnuCRUD.add(mniDelete);

        jMenuBar1.add(mnuCRUD);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnLoad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateObraListView() {

        DefaultListModel<Obra> obraListModel = new DefaultListModel<Obra>();
        for(Obra o: obras) {
            obraListModel.addElement(o);
        }
        lstObras.setModel(obraListModel);      
    }

    private void lstObrasValueChanged(javax.swing.event.ListSelectionEvent evt) {
        Obra selectedObra = lstObras.getSelectedValue();
        if (selectedObra != null) {
            for (Obra o: obras) {
                if (o.getRegistre().equals(selectedObra.getRegistre())) {
                    try {
                        BufferedImage bufferedImage;
                        if (o.getImagen() == (null)) {
                           String noImageFileString = getClass().getResource(imageFolder + 1).toString();
                           bufferedImage = ImageIO.read(getClass().getResource(imageFolder + 1)); 
                        }
                        else {
                            String imagePath = imageFolder + o.getImagen();
                            bufferedImage = ImageIO.read(new File(imagePath));
                        }
                        ImageIcon icon = resizeImageIcon(bufferedImage, lblImage.getWidth(), lblImage.getHeight());
                        lblImage.setIcon(icon);
                        
                    }
                    catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }            
        }
    }
    
    private ImageIcon resizeImageIcon (BufferedImage originalImage, int desiredWidth, int desiredHeight) {
        int newHeight = 0;    
        int newWidth = 0;
        float aspectRatio = (float)originalImage.getWidth() / originalImage.getHeight();
        if (originalImage.getWidth() > originalImage.getHeight()) {
            newWidth = desiredWidth;
            newHeight = Math.round( desiredWidth / aspectRatio);                
        }
        else {
            newHeight = desiredHeight;
            newWidth = Math.round(desiredHeight * aspectRatio);
        }
        Image resultingImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        ImageIcon imageIcon = new ImageIcon(outputImage);
        return imageIcon;
    }
    
    private void mniInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniInsertActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        InsertarObraDialog InsertDialog = new InsertarObraDialog(this, true);
        InsertDialog.setVisible(true);
        
        if (this.confirmSave) {
            try (Writer writer = new FileWriter(dataFile)) {
        Gson gson = new GsonBuilder().create();
        gson.toJson(obras, writer);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        UpdateObraListView();
            dataChanged = true;
        } 
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
       Gson gson = new Gson();
        try {
            obras.clear();
            JsonReader reader = new JsonReader(new FileReader(dataFile));
            obras = gson.fromJson(reader, LIST_OF_OBRA_TYPE);
            UpdateObraListView();
        }
        catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void mniLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoadActionPerformed
        // TODO add your handling code here:
        btnLoad.doClick();
    }//GEN-LAST:event_mniLoadActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JMenuItem mniDelete;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniInsert;
    private javax.swing.JMenuItem mniLoad;
    private javax.swing.JMenuItem mniUpdate;
    private javax.swing.JMenu mnuCRUD;
    private javax.swing.JMenu mnuFile;
    // End of variables declaration//GEN-END:variables
}

