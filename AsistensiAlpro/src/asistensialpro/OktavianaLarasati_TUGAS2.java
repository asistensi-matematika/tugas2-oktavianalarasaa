/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensialpro;

/**
 *
 * @author oktaviana larasati
 */
public class OktavianaLarasati_TUGAS2 extends javax.swing.JFrame {

    /**
     * Creates new form OktavianaLarasati_TUGAS2
     */
    public OktavianaLarasati_TUGAS2() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PilihSoal = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MasukA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MasukX = new javax.swing.JTextField();
        MasukN = new javax.swing.JTextField();
        TombolHitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SoalTerpilih = new javax.swing.JTextField();
        HasilHitung = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("PERHITUNGAN APROKSIMASI");

        PilihSoal.setBackground(new java.awt.Color(0, 204, 204));
        PilihSoal.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PilihSoal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "f(x) = sin(2x)", "f(x) = cosh(-6)", "f(X) = x/1-x" }));
        PilihSoal.setToolTipText("");
        PilihSoal.setActionCommand("Pilih fungsi");
        PilihSoal.setName("PILIH SOAL"); // NOI18N
        PilihSoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihSoalActionPerformed(evt);
            }
        });

        jLabel2.setText("PILIH JENIS FUNGSI :");

        jLabel3.setText("Masukkan NIlai a");

        MasukA.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        MasukA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasukAActionPerformed(evt);
            }
        });

        jLabel4.setText("Masukkan Nilai X");

        MasukX.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        MasukN.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        TombolHitung.setText("HITUNG");
        TombolHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolHitungActionPerformed(evt);
            }
        });

        jLabel6.setText("HASIL HITUNG");

        jLabel7.setText("Masukkan Nilai n");

        SoalTerpilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoalTerpilihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(PilihSoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SoalTerpilih))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(64, 64, 64)
                        .addComponent(HasilHitung))
                    .addComponent(TombolHitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(MasukA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(MasukX, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(65, 65, 65)
                        .addComponent(MasukN, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PilihSoal)
                        .addComponent(SoalTerpilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MasukX, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MasukN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(MasukA))
                .addGap(18, 18, 18)
                .addComponent(TombolHitung)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(HasilHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PilihSoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihSoalActionPerformed
// TODO add your handling code here:
        switch (PilihSoal.getSelectedIndex()){
            case 1:
                MasukA.setText (null);
                MasukX.setText (null);
                MasukN.setText(null);
                HasilHitung.setText(null);
                SoalTerpilih.setText("f(x) = sin(2x)");
                break;
            case 2 :
                MasukA.setText(null);
                MasukX.setText(null);
                MasukN.setText(null);
                HasilHitung.setText(null);
                SoalTerpilih.setText("f(x) = cosh(-6)");
                break;
            case 3 :
                MasukA.setText(null);
                MasukX.setText(null);
                MasukN.setText(null);
                HasilHitung.setText(null);
                SoalTerpilih.setText("f(X) = x/1-x");
                break;
            default :
                MasukA.setText(null);
                MasukX.setText(null);
                MasukN.setText(null);
                HasilHitung.setText(null);
                SoalTerpilih.setText(null);
                
                
                
        }
    }//GEN-LAST:event_PilihSoalActionPerformed

    private void MasukAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasukAActionPerformed

    private void TombolHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolHitungActionPerformed

       // soal no 2 f(x) = sin (2x)
      
        double A = Double.parseDouble(MasukA.getText());
        double X = Double.parseDouble(MasukX.getText());
        double N = Double.parseDouble(MasukN.getText());
        double ab = 0.5*Math.pow(10, (2-N));
        double[] f= new double[10001];
        double xxx = 0
       
        
        switch(SoalTerpilih.getSelectedIndex()){
            case 1:
                f[0] = Math.sin(Math.toRadians(2*A)) + Math.cos(Math.toRadians(2*A)) * (Math.toRadians(X-A));
                
                for (int i = 1 ; i<= 10000; i++){
                    f[i] = f[i-1] + ((Math.pow(-1,i)* Math.cos(Math.toRadians(2*A))*(Math.toRadians(X-A), 2*i))/faktorial (2*i)) + Math.pow(-1,i)*Math.pow(2,(2*i+1)*Math.cos(Math.toRadians(2*A))*Math.pow(Math.toRadians(X-A),2*i+1)/faktorial(2*i)) ;
                double ac = ((f[i]-f[i-1])/f[i])*100;
                if (math.abs(ac)<ab){
                    xxx += f[i];
                    break;
                }
                }
                      HasilHitung.setText(String.valueOF(xxx));
                      break;
                      
            case 2:
                f[0] = ((Math.exp(6*A)) + (Math.exp((-6)*A)))/2;
                for(int i=1 ; i<= 10000; i++){
                    if ( A==0){
                        f[i] = f[i-1] + ((Math.pow(6*X,2*i)) / faktorial(2*i));
                    }
                    +Math.pow((-1),i)*(Math.exp(-6*A)) * (Math.pow(6,i) * Math.pow(X-A, k))))/ (2*(faktorial(i)));
                        
                    }
                }
                      
               
                
                
                f[0]= Math.sin(Math.toRadians(2*A1))
            
        }
        
        switch
    }//GEN-LAST:event_TombolHitungActionPerformed

    private void SoalTerpilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoalTerpilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoalTerpilihActionPerformed

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
            java.util.logging.Logger.getLogger(OktavianaLarasati_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OktavianaLarasati_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OktavianaLarasati_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OktavianaLarasati_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OktavianaLarasati_TUGAS2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HasilHitung;
    private javax.swing.JTextField MasukA;
    private javax.swing.JTextField MasukN;
    private javax.swing.JTextField MasukX;
    private javax.swing.JComboBox PilihSoal;
    private javax.swing.JTextField SoalTerpilih;
    private javax.swing.JButton TombolHitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

