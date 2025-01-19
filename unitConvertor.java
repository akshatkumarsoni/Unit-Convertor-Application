/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package usingSwingBuilder;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class unitConvertor extends javax.swing.JFrame {

    /**
     * Creates new form unitConvertor
     */
    public unitConvertor() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEnterKilometer = new javax.swing.JLabel();
        lblAfterConversion = new javax.swing.JLabel();
        txtEnterKilometer = new javax.swing.JTextField();
        txtShowConversion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rdoMeter = new javax.swing.JRadioButton();
        rdoCentimeter = new javax.swing.JRadioButton();
        rdoMillimeter = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unit Convertor Application");

        lblEnterKilometer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEnterKilometer.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterKilometer.setText("Enter Kilometers");

        lblAfterConversion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAfterConversion.setForeground(new java.awt.Color(255, 255, 255));
        lblAfterConversion.setText("After Conversion");

        txtEnterKilometer.setBackground(new java.awt.Color(0, 0, 0));
        txtEnterKilometer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEnterKilometer.setForeground(new java.awt.Color(255, 255, 255));

        txtShowConversion.setEditable(false);
        txtShowConversion.setBackground(new java.awt.Color(0, 0, 0));
        txtShowConversion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtShowConversion.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Select the Conversion unit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        buttonGroup1.add(rdoMeter);
        rdoMeter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoMeter.setForeground(new java.awt.Color(255, 255, 255));
        rdoMeter.setText("Meter");
        rdoMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMeterActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoCentimeter);
        rdoCentimeter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoCentimeter.setForeground(new java.awt.Color(255, 255, 255));
        rdoCentimeter.setText("Centimeter");
        rdoCentimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCentimeterActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoMillimeter);
        rdoMillimeter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoMillimeter.setForeground(new java.awt.Color(255, 255, 255));
        rdoMillimeter.setText("Millimeter");
        rdoMillimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMillimeterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rdoMeter)
                .addGap(40, 40, 40)
                .addComponent(rdoCentimeter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(rdoMillimeter)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoMeter)
                    .addComponent(rdoCentimeter)
                    .addComponent(rdoMillimeter))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEnterKilometer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAfterConversion, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtShowConversion)
                                    .addComponent(txtEnterKilometer))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterKilometer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterKilometer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAfterConversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtShowConversion, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMeterActionPerformed
        try{
        String kmStr = txtEnterKilometer.getText();
        int km = Integer.parseInt(kmStr);
        int m = km*1000;
        txtShowConversion.setText(String.valueOf(m) + " meters");
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null , "Enter digits only!!" , "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rdoMeterActionPerformed

    private void rdoCentimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCentimeterActionPerformed
       try{
        String kmStr = txtEnterKilometer.getText();
        int km = Integer.parseInt(kmStr);
        long cm = km*100000L;
        txtShowConversion.setText(String.valueOf(cm) + " centimeters");
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null , "Enter digits only!!" , "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rdoCentimeterActionPerformed

    private void rdoMillimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMillimeterActionPerformed
       try{
        String kmStr = txtEnterKilometer.getText();
        int km = Integer.parseInt(kmStr);
        long mm = km*1000000L;
        txtShowConversion.setText(String.valueOf(mm) + " millimeters");
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null , "Enter digits only!!" , "Error" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rdoMillimeterActionPerformed

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
            java.util.logging.Logger.getLogger(unitConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unitConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unitConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unitConvertor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new unitConvertor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAfterConversion;
    private javax.swing.JLabel lblEnterKilometer;
    private javax.swing.JRadioButton rdoCentimeter;
    private javax.swing.JRadioButton rdoMeter;
    private javax.swing.JRadioButton rdoMillimeter;
    private javax.swing.JTextField txtEnterKilometer;
    private javax.swing.JTextField txtShowConversion;
    // End of variables declaration//GEN-END:variables
}
