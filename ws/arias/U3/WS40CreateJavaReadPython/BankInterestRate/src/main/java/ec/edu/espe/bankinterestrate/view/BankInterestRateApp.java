package ec.edu.espe.bankinterestrate.view;

/**
 *
 * @author Alan Arias
 */
public class BankInterestRateApp {
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBankInterestRate().setVisible(true);
            }
        });
    }
}
