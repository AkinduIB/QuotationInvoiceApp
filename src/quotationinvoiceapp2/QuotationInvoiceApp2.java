/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quotationinvoiceapp2;

/**
 *
 * @author akidu
 */
public class QuotationInvoiceApp2 {

       
    public static void main(String[] args) {
        // Set the look and feel to the system default, optional
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Create and display the AppFront JFrame
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFront().setVisible(true);
            }
        });
    }
}

