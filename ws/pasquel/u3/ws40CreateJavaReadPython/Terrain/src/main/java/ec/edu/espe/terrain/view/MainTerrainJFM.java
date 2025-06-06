package ec.edu.espe.terrain.view;

/**
 *
 * @author LABS-DCCO
 */
public class MainTerrainJFM extends javax.swing.JPanel {

    /**
     * Creates new form MainTerrainJFM
     */
    public MainTerrainJFM() {
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

        Header = new javax.swing.JPanel();
        TitleTxtF = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        addNewTerrainBTN = new javax.swing.JButton();
        CalculateTerrainPriceBTN = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();

        TitleTxtF.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TitleTxtF.setText("Terrain Price Calculator");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(TitleTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        addNewTerrainBTN.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        addNewTerrainBTN.setText("Add NewTerrain");

        CalculateTerrainPriceBTN.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        CalculateTerrainPriceBTN.setText("Calculate Terrain Price");

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(addNewTerrainBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(CalculateTerrainPriceBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addNewTerrainBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(CalculateTerrainPriceBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JButton CalculateTerrainPriceBTN;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel TitleTxtF;
    private javax.swing.JButton addNewTerrainBTN;
    // End of variables declaration//GEN-END:variables

    
}
