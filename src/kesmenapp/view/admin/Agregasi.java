/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kesmenapp.view.admin;

import javax.swing.JScrollPane;
import kesmenapp.controller.adminController;
import kesmenapp.controller.adminController;

/**
 *
 * @author Dimas Haafizh Rahman
 */
public class Agregasi extends javax.swing.JPanel {
    adminController adminController = new adminController();
    JScrollPane content;

    /**
     * Creates new form Agregasi
     */
    public Agregasi() {
        initComponents();
    }
    
    public Agregasi(JScrollPane content) {
        initComponents();
        this.content = content;
        adminController.ratarata(
            p1Field, p2Field, p3Field, 
            p4Field, p5Field, p6Field, 
            p7Field, p8Field, p9Field, totalNilaiField
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        p1Label = new javax.swing.JLabel();
        p2Label = new javax.swing.JLabel();
        p3Label = new javax.swing.JLabel();
        p4Label = new javax.swing.JLabel();
        p5Label = new javax.swing.JLabel();
        p6Label = new javax.swing.JLabel();
        p7Label = new javax.swing.JLabel();
        p8Label = new javax.swing.JLabel();
        p9Label = new javax.swing.JLabel();
        totalNilaiLabel = new javax.swing.JLabel();
        p1Field = new javax.swing.JTextField();
        p2Field = new javax.swing.JTextField();
        p3Field = new javax.swing.JTextField();
        p4Field = new javax.swing.JTextField();
        p5Field = new javax.swing.JTextField();
        p6Field = new javax.swing.JTextField();
        p7Field = new javax.swing.JTextField();
        p8Field = new javax.swing.JTextField();
        p9Field = new javax.swing.JTextField();
        totalNilaiField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 204, 255));

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulLabel.setForeground(new java.awt.Color(0, 0, 0));
        judulLabel.setText("Rata-Rata Stress Mahasiswa:");

        p1Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p1Label.setForeground(new java.awt.Color(0, 0, 0));
        p1Label.setText("P1:");

        p2Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p2Label.setForeground(new java.awt.Color(0, 0, 0));
        p2Label.setText("P2:");

        p3Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p3Label.setForeground(new java.awt.Color(0, 0, 0));
        p3Label.setText("P3:");

        p4Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p4Label.setForeground(new java.awt.Color(0, 0, 0));
        p4Label.setText("P4:");

        p5Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p5Label.setForeground(new java.awt.Color(0, 0, 0));
        p5Label.setText("P5:");

        p6Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p6Label.setForeground(new java.awt.Color(0, 0, 0));
        p6Label.setText("P6:");

        p7Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p7Label.setForeground(new java.awt.Color(0, 0, 0));
        p7Label.setText("P7:");

        p8Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p8Label.setForeground(new java.awt.Color(0, 0, 0));
        p8Label.setText("P8:");

        p9Label.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        p9Label.setForeground(new java.awt.Color(0, 0, 0));
        p9Label.setText("P9:");

        totalNilaiLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        totalNilaiLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalNilaiLabel.setText("Total Nilai:");

        p1Field.setEditable(false);
        p1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1FieldActionPerformed(evt);
            }
        });

        p2Field.setEditable(false);
        p2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2FieldActionPerformed(evt);
            }
        });

        p3Field.setEditable(false);
        p3Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3FieldActionPerformed(evt);
            }
        });

        p4Field.setEditable(false);
        p4Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4FieldActionPerformed(evt);
            }
        });

        p5Field.setEditable(false);
        p5Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5FieldActionPerformed(evt);
            }
        });

        p6Field.setEditable(false);
        p6Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6FieldActionPerformed(evt);
            }
        });

        p7Field.setEditable(false);
        p7Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7FieldActionPerformed(evt);
            }
        });

        p8Field.setEditable(false);
        p8Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8FieldActionPerformed(evt);
            }
        });

        p9Field.setEditable(false);
        p9Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9FieldActionPerformed(evt);
            }
        });

        totalNilaiField.setEditable(false);
        totalNilaiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalNilaiFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p5Label)
                                .addGap(18, 18, 18)
                                .addComponent(p5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p4Label)
                                .addGap(18, 18, 18)
                                .addComponent(p4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p3Label)
                                .addGap(18, 18, 18)
                                .addComponent(p3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p2Label)
                                    .addComponent(p1Label))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalNilaiLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p9Label)
                            .addComponent(p8Label)
                            .addComponent(p7Label)
                            .addComponent(p6Label))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(totalNilaiField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(p9Field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(p8Field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(p7Field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(p6Field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(judulLabel))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judulLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1Label)
                            .addComponent(p1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2Label)
                            .addComponent(p2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p3Label)
                            .addComponent(p3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p4Label)
                            .addComponent(p4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p5Label)
                            .addComponent(p5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p6Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p7Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p7Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p8Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p8Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p9Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(p9Label)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalNilaiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalNilaiLabel))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void p2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2FieldActionPerformed

    private void p1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1FieldActionPerformed

    private void p4FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4FieldActionPerformed

    private void p5FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5FieldActionPerformed

    private void p3FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3FieldActionPerformed

    private void p7FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p7FieldActionPerformed

    private void p6FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p6FieldActionPerformed

    private void p9FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p9FieldActionPerformed

    private void totalNilaiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalNilaiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalNilaiFieldActionPerformed

    private void p8FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p8FieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField p1Field;
    private javax.swing.JLabel p1Label;
    private javax.swing.JTextField p2Field;
    private javax.swing.JLabel p2Label;
    private javax.swing.JTextField p3Field;
    private javax.swing.JLabel p3Label;
    private javax.swing.JTextField p4Field;
    private javax.swing.JLabel p4Label;
    private javax.swing.JTextField p5Field;
    private javax.swing.JLabel p5Label;
    private javax.swing.JTextField p6Field;
    private javax.swing.JLabel p6Label;
    private javax.swing.JTextField p7Field;
    private javax.swing.JLabel p7Label;
    private javax.swing.JTextField p8Field;
    private javax.swing.JLabel p8Label;
    private javax.swing.JTextField p9Field;
    private javax.swing.JLabel p9Label;
    private javax.swing.JTextField totalNilaiField;
    private javax.swing.JLabel totalNilaiLabel;
    // End of variables declaration//GEN-END:variables
}
