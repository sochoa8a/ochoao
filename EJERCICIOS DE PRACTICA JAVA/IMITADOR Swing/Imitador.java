/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicios;

/**
 *
 * @author Tarr
 */
public class Imitador extends javax.swing.JFrame {

    /**
     * Creates new form Imitador
     */
    public Imitador() {
        initComponents();
        
        buttonGroup1.add(this.rdOriginal1);
        buttonGroup1.add(this.rdOriginal2);
        buttonGroup1.add(this.rdOriginal3);
        
        buttonGroup2.add(this.rdEspejo1);
        buttonGroup2.add(this.rdEspejo2);
        buttonGroup2.add(this.rdEspejo3);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rdOriginal1 = new javax.swing.JRadioButton();
        rdOriginal3 = new javax.swing.JRadioButton();
        rdOriginal2 = new javax.swing.JRadioButton();
        chkOriginal4 = new javax.swing.JCheckBox();
        chkOriginal6 = new javax.swing.JCheckBox();
        chkOriginal5 = new javax.swing.JCheckBox();
        txtOriginal = new javax.swing.JTextField();
        cboOriginal = new javax.swing.JComboBox<>();
        spiOriginal = new javax.swing.JSpinner();
        chkEspejo6 = new javax.swing.JCheckBox();
        chkEspejo5 = new javax.swing.JCheckBox();
        txtEspejo = new javax.swing.JTextField();
        cboEspejo = new javax.swing.JComboBox<>();
        spiEspejo = new javax.swing.JSpinner();
        rdEspejo1 = new javax.swing.JRadioButton();
        rdEspejo3 = new javax.swing.JRadioButton();
        rdEspejo2 = new javax.swing.JRadioButton();
        chkEspejo4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Original");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Espejo");
        jLabel2.setEnabled(false);

        jSeparator1.setEnabled(false);

        rdOriginal1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rdOriginal1.setText("Opcion 1");
        rdOriginal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOriginal1ActionPerformed(evt);
            }
        });

        rdOriginal3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rdOriginal3.setText("Opcion 3");
        rdOriginal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOriginal3ActionPerformed(evt);
            }
        });

        rdOriginal2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rdOriginal2.setText("Opcion 2");
        rdOriginal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOriginal2ActionPerformed(evt);
            }
        });

        chkOriginal4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkOriginal4.setText("Opcion 4");
        chkOriginal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOriginal4ActionPerformed(evt);
            }
        });

        chkOriginal6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkOriginal6.setText("Opcion 6");
        chkOriginal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOriginal6ActionPerformed(evt);
            }
        });

        chkOriginal5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkOriginal5.setText("Opcion 5");
        chkOriginal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOriginal5ActionPerformed(evt);
            }
        });

        txtOriginal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOriginalKeyTyped(evt);
            }
        });

        cboOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboOriginal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboOriginalItemStateChanged(evt);
            }
        });

        spiOriginal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiOriginalStateChanged(evt);
            }
        });

        chkEspejo6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkEspejo6.setText("Opcion 6");
        chkEspejo6.setEnabled(false);

        chkEspejo5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkEspejo5.setText("Opcion 5");
        chkEspejo5.setEnabled(false);

        txtEspejo.setEnabled(false);

        cboEspejo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboEspejo.setEnabled(false);

        spiEspejo.setEnabled(false);

        rdEspejo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rdEspejo1.setText("Opcion 1");
        rdEspejo1.setEnabled(false);

        rdEspejo3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rdEspejo3.setText("Opcion 3");
        rdEspejo3.setEnabled(false);

        rdEspejo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rdEspejo2.setText("Opcion 2");
        rdEspejo2.setEnabled(false);

        chkEspejo4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkEspejo4.setText("Opcion 4");
        chkEspejo4.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdOriginal1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(rdOriginal3)
                                    .addComponent(rdOriginal2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkOriginal6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkOriginal5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkOriginal4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOriginal)
                                    .addComponent(cboOriginal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spiOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdEspejo3)
                                    .addComponent(rdEspejo2)
                                    .addComponent(rdEspejo1))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chkEspejo6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkEspejo5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkEspejo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEspejo)
                                    .addComponent(cboEspejo, 0, 140, Short.MAX_VALUE)
                                    .addComponent(spiEspejo))))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdOriginal1)
                            .addComponent(chkOriginal4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdOriginal2)
                            .addComponent(chkOriginal5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdOriginal3)
                            .addComponent(chkOriginal6))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(rdEspejo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdEspejo3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spiEspejo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkEspejo4)
                                    .addComponent(rdEspejo1))
                                .addGap(6, 6, 6)
                                .addComponent(chkEspejo5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkEspejo6))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spiOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdOriginal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOriginal1ActionPerformed
    
        
        this.rdEspejo1.setSelected(this.rdOriginal1.isSelected());
        
        
    }//GEN-LAST:event_rdOriginal1ActionPerformed

    private void rdOriginal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOriginal2ActionPerformed
        
        this.rdEspejo2.setSelected(this.rdOriginal2.isSelected());
        
    }//GEN-LAST:event_rdOriginal2ActionPerformed

    private void rdOriginal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOriginal3ActionPerformed
        
        this.rdEspejo3.setSelected(this.rdOriginal3.isSelected());
    }//GEN-LAST:event_rdOriginal3ActionPerformed

    private void chkOriginal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOriginal4ActionPerformed
        
        this.chkEspejo4.setSelected(this.chkOriginal4.isSelected());
    }//GEN-LAST:event_chkOriginal4ActionPerformed

    private void chkOriginal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOriginal5ActionPerformed
       
        this.chkEspejo5.setSelected(this.chkOriginal5.isSelected());
        
    }//GEN-LAST:event_chkOriginal5ActionPerformed

    private void chkOriginal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOriginal6ActionPerformed
       
        this.chkEspejo6.setSelected(this.chkOriginal6.isSelected());
        
    }//GEN-LAST:event_chkOriginal6ActionPerformed

    private void txtOriginalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginalKeyTyped
        
        this.txtEspejo.setText(this.txtOriginal.getText());
        
    }//GEN-LAST:event_txtOriginalKeyTyped

    private void cboOriginalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboOriginalItemStateChanged
        
        this.cboEspejo.setSelectedIndex(this.cboOriginal.getSelectedIndex());
        
    }//GEN-LAST:event_cboOriginalItemStateChanged

    private void spiOriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiOriginalStateChanged
        
        this.spiEspejo.setValue((Integer)this.spiOriginal.getValue());
        
    }//GEN-LAST:event_spiOriginalStateChanged

    
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
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imitador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imitador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboEspejo;
    private javax.swing.JComboBox<String> cboOriginal;
    private javax.swing.JCheckBox chkEspejo4;
    private javax.swing.JCheckBox chkEspejo5;
    private javax.swing.JCheckBox chkEspejo6;
    private javax.swing.JCheckBox chkOriginal4;
    private javax.swing.JCheckBox chkOriginal5;
    private javax.swing.JCheckBox chkOriginal6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdEspejo1;
    private javax.swing.JRadioButton rdEspejo2;
    private javax.swing.JRadioButton rdEspejo3;
    private javax.swing.JRadioButton rdOriginal1;
    private javax.swing.JRadioButton rdOriginal2;
    private javax.swing.JRadioButton rdOriginal3;
    private javax.swing.JSpinner spiEspejo;
    private javax.swing.JSpinner spiOriginal;
    private javax.swing.JTextField txtEspejo;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration//GEN-END:variables
}