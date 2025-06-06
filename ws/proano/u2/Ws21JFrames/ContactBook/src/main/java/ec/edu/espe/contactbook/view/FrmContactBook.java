/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.contactbook.view;

/**
 *
 * @author Alan Arias
 */
public class FrmContactBook extends javax.swing.JFrame {

    /**
     * Creates new form FrmContactBook
     */
    public FrmContactBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuData = new javax.swing.JMenu();
        ItmAddContacts = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        ItmExit = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuCloudOptions = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        mnuFacebook = new javax.swing.JMenuItem();
        mnuInstagram = new javax.swing.JMenuItem();
        mnuEmails = new javax.swing.JMenu();
        mnuGmail = new javax.swing.JMenuItem();
        mnuYahoo = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu8.setText("File");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar2.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar3.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar3.add(jMenu11);

        jMenu13.setText("File");
        jMenuBar4.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar4.add(jMenu14);

        jMenu15.setText("File");
        jMenuBar5.add(jMenu15);

        jMenu16.setText("Edit");
        jMenuBar5.add(jMenu16);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuData.setText("Data");

        ItmAddContacts.setText("Contacts");
        mnuData.add(ItmAddContacts);

        jMenu7.setText("Add");
        mnuData.add(jMenu7);

        jMenuBar1.add(mnuData);

        ItmExit.setText("ContactBook");

        jMenuItem1.setText("Exit");
        ItmExit.add(jMenuItem1);

        jMenuBar1.add(ItmExit);

        mnuCloudOptions.setText("Cloud Options");

        jMenu18.setText("Social");

        mnuFacebook.setText("Facebook");
        jMenu18.add(mnuFacebook);

        mnuInstagram.setText("Instagram");
        jMenu18.add(mnuInstagram);

        mnuCloudOptions.add(jMenu18);

        mnuEmails.setText("Emails");

        mnuGmail.setText("Gmail");
        mnuEmails.add(mnuGmail);

        mnuYahoo.setText("Yahoo");
        mnuEmails.add(mnuYahoo);

        mnuCloudOptions.add(mnuEmails);

        jMenuBar1.add(mnuCloudOptions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmContactBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmContactBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmContactBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmContactBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmContactBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ItmAddContacts;
    private javax.swing.JMenu ItmExit;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnuCloudOptions;
    private javax.swing.JMenu mnuData;
    private javax.swing.JMenu mnuEmails;
    private javax.swing.JMenuItem mnuFacebook;
    private javax.swing.JMenuItem mnuGmail;
    private javax.swing.JMenuItem mnuInstagram;
    private javax.swing.JMenuItem mnuYahoo;
    // End of variables declaration//GEN-END:variables
}
