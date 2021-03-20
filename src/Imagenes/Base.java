
package Imagenes;

import javax.swing.JOptionPane;

public class Base extends javax.swing.JFrame {

    public Base() {
        initComponents();
        transparencia ();
    setLocationRelativeTo(null); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBMasData = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Colectivo = new javax.swing.JCheckBox();
        Tren = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Text = new javax.swing.JTextField();
        JBCalcular = new javax.swing.JButton();
        Text2 = new javax.swing.JTextField();
        Text3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JBReintentar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Auto = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 800));
        setMinimumSize(new java.awt.Dimension(500, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        JBMasData.setBackground(new java.awt.Color(51, 51, 51));
        JBMasData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBMasData.setForeground(new java.awt.Color(255, 255, 255));
        JBMasData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tree-solid-24.png"))); // NOI18N
        JBMasData.setBorderPainted(false);
        JBMasData.setContentAreaFilled(false);
        JBMasData.setDefaultCapable(false);
        JBMasData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMasDataActionPerformed(evt);
            }
        });
        getContentPane().add(JBMasData);
        JBMasData.setBounds(200, 652, 90, 60);

        Titulo.setFont(new java.awt.Font("Pacifico", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Eco Foot Prints ");
        getContentPane().add(Titulo);
        Titulo.setBounds(10, 40, 480, 100);

        Colectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Colectivo.setForeground(new java.awt.Color(255, 255, 255));
        Colectivo.setText("Colectivo");
        getContentPane().add(Colectivo);
        Colectivo.setBounds(280, 270, 110, 28);

        Tren.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Tren.setForeground(new java.awt.Color(255, 255, 255));
        Tren.setText("Tren");
        getContentPane().add(Tren);
        Tren.setBounds(120, 270, 80, 28);

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Conocer más sobre movilidad sustentable");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 610, 370, 60);

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿Cuántos kilómetros vas a recorrer?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 140, 310, 60);

        Text.setBackground(new java.awt.Color(102, 102, 102));
        Text.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Text);
        Text.setBounds(110, 200, 280, 50);

        JBCalcular.setBackground(new java.awt.Color(51, 51, 51));
        JBCalcular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBCalcular.setForeground(new java.awt.Color(255, 255, 255));
        JBCalcular.setText("Calcular");
        JBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(JBCalcular);
        JBCalcular.setBounds(180, 310, 136, 40);

        Text2.setBackground(new java.awt.Color(102, 102, 102));
        Text2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Text2);
        Text2.setBounds(110, 410, 280, 50);

        Text3.setBackground(new java.awt.Color(102, 102, 102));
        Text3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Text3.setForeground(new java.awt.Color(102, 255, 102));
        Text3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Text3);
        Text3.setBounds(160, 510, 170, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vas a generar");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 350, 300, 60);

        JBReintentar.setBackground(new java.awt.Color(51, 51, 51));
        JBReintentar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBReintentar.setForeground(new java.awt.Color(255, 255, 255));
        JBReintentar.setText("Nuevo Viaje");
        JBReintentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBReintentarActionPerformed(evt);
            }
        });
        getContentPane().add(JBReintentar);
        JBReintentar.setBounds(176, 710, 140, 40);

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("¿Cuánto menos podrías generar?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 460, 290, 60);

        Auto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Auto.setForeground(new java.awt.Color(255, 255, 255));
        Auto.setText("Auto");
        getContentPane().add(Auto);
        Auto.setBounds(200, 270, 80, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Biker_Isometric_chico.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 540, 110, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void transparencia (){
    JBMasData.setOpaque(false);
    JBMasData.setContentAreaFilled(false);
    JBMasData.setBorderPainted(false);
    }
    private void JBMasDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMasDataActionPerformed
    Info Ir2 = new Info ();
    Ir2.setVisible (true);
    this.dispose();   
    }//GEN-LAST:event_JBMasDataActionPerformed

    private void JBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCalcularActionPerformed
    Float Kms;
    Float Kms2;
    int Co2Auto = 120;
    int Co2Colectivo = 28;
    int Co2Tren = 14;
    int Co2Bici = 5;
    
    if (Text.getText().length()==0){ //al ubicar 0 numeros arroja el mensaje
    JOptionPane.showMessageDialog (null, "Ingresá la cantidad de kilómetros a recorrer y elegí un medio de transporte");   
    }
    
    if (Auto.isSelected()){
    Kms = Float.parseFloat(Text.getText());
    Text2.setText(Float.toString(Kms*Co2Auto)+ " gramos de Co2");
    Kms2 = Float.parseFloat(Text.getText());
    Text3.setText(Float.toString(Kms2*Co2Bici)+ " gramos de Co2");
    }
    
    if (Colectivo.isSelected()){
    Kms = Float.parseFloat(Text.getText());
    Text2.setText(Float.toString(Kms*Co2Colectivo)+ " gramos de Co2");
    Kms2 = Float.parseFloat(Text.getText());
    Text3.setText(Float.toString(Kms2*Co2Bici)+ " gramos de Co2");
    
    }  
    if (Tren.isSelected()){
    Kms = Float.parseFloat(Text.getText());
    Text2.setText(Float.toString(Kms*Co2Tren)+ " gramos de Co2");
    Kms2 = Float.parseFloat(Text.getText());
    Text3.setText(Float.toString(Kms2*Co2Bici)+ " gramos de Co2");
    
    }  
    }//GEN-LAST:event_JBCalcularActionPerformed

    private void JBReintentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReintentarActionPerformed
    Text.setText("");
    Text2.setText("");
    Text3.setText("");
            
    }//GEN-LAST:event_JBReintentarActionPerformed

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
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base().setVisible(true);
            }
 
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Auto;
    private javax.swing.JCheckBox Colectivo;
    private javax.swing.JButton JBCalcular;
    private javax.swing.JButton JBMasData;
    private javax.swing.JButton JBReintentar;
    private javax.swing.JTextField Text;
    private javax.swing.JTextField Text2;
    private javax.swing.JTextField Text3;
    private javax.swing.JLabel Titulo;
    private javax.swing.JCheckBox Tren;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
