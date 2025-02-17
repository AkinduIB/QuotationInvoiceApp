
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quotationinvoiceapp2;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author akidu
 */
public class NewBuyer extends javax.swing.JFrame {

    /**
     * Creates new form NewBuyer
     */
    public NewBuyer() {
        initComponents();
        setNextAvailableId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDesignation = new javax.swing.JTextField();
        txtCompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("New Buyer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 588, 10));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(153, 153, 153));
        txtName.setText("Enter Name");
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 233, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Designation");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        txtDesignation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDesignation.setForeground(new java.awt.Color(153, 153, 153));
        txtDesignation.setText("Enter Designation");
        txtDesignation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDesignationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDesignationFocusLost(evt);
            }
        });
        getContentPane().add(txtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 233, -1));

        txtCompany.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCompany.setForeground(new java.awt.Color(153, 153, 153));
        txtCompany.setText("Enter Company");
        txtCompany.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCompanyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCompanyFocusLost(evt);
            }
        });
        getContentPane().add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 233, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Company");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Address");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 370, 590, 10));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 37, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 40, 20));

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(153, 153, 153));
        txtAddress.setRows(5);
        txtAddress.setText("Enter Address");
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quotationinvoiceapp2/all backgroung.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
        if(txtName.getText().equals("Enter Name"))
        {
            txtName.setText("");
            txtName.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if(txtName.getText().equals(""))
        {
            txtName.setText("Enter Name");
            txtName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtDesignationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDesignationFocusGained
        // TODO add your handling code here:
        if(txtDesignation.getText().equals("Enter Designation"))
        {
            txtDesignation.setText("");
            txtDesignation.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtDesignationFocusGained

    private void txtDesignationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDesignationFocusLost
        // TODO add your handling code here:
        if(txtDesignation.getText().equals(""))
        {
            txtDesignation.setText("Enter Designation");
            txtDesignation.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtDesignationFocusLost

    private void txtCompanyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCompanyFocusGained
        // TODO add your handling code here:
        if(txtCompany.getText().equals("Enter Company"))
        { 
            txtCompany.setText("");
            txtCompany.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtCompanyFocusGained

    private void txtCompanyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCompanyFocusLost
        // TODO add your handling code here:
        if(txtCompany.getText().equals(""))
        {
            txtCompany.setText("Enter Company");
            txtCompany.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtCompanyFocusLost

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new NewBuyer().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String id  = jLabel9.getText();
        String name = txtName.getText();
        String designation = txtDesignation.getText();
        String company = txtCompany.getText();
        String address = txtAddress.getText().replace("\n", " "); // Replace newlines with spaces or any delimiter of your choice

        boolean idExists = false;
        File file = new File("newBuyer.csv");

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[0].equals(id)) {
                        idExists = true;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (idExists) {
            JOptionPane.showMessageDialog(null, "ID already exists");
        } else {
            try (FileWriter writer = new FileWriter(file, true)) {
                if (file.length() == 0) {
                    writer.write("ID,Name,Designation,Company,Address\n");
                }
                writer.write(id + "," + name + "," + designation + "," + company + "," + "\"" + address + "\"\n");
                JOptionPane.showMessageDialog(null, "New Buyer Added Successfully");
                setNextAvailableId(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        // TODO add your handling code here:
        if(txtAddress.getText().equals("Enter Address"))
        {
            txtAddress.setText("");
            txtAddress.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        // TODO add your handling code here:
         if(txtAddress.getText().equals(""))
        {
            txtAddress.setText("Enter Address");
            txtAddress.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtAddressFocusLost

    private void setNextAvailableId() {
        File file = new File("newBuyer.csv");
        int maxId = 0;

        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length > 0 && !parts[0].isEmpty()) {
                        int currentId = Integer.parseInt(parts[0]);
                        if (currentId > maxId) {
                            maxId = currentId;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        int nextId = maxId + 1;
        jLabel9.setText(String.valueOf(nextId));
    }
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
            java.util.logging.Logger.getLogger(NewBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBuyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
