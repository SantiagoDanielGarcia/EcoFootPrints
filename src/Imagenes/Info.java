
package Imagenes;

import javax.swing.JOptionPane;

public class Info extends javax.swing.JFrame {

    public Info() {
        initComponents();
        centrarData();
    setLocationRelativeTo(null); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        JBReintentar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        Data3 = new javax.swing.JLabel();
        Data1 = new javax.swing.JLabel();
        Data2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        Titulo.setFont(new java.awt.Font("Pacifico", 1, 29)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("¿Que son las huellas de carbono?");
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 40, 500, 100);

        JBReintentar.setBackground(new java.awt.Color(51, 51, 51));
        JBReintentar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JBReintentar.setForeground(new java.awt.Color(255, 255, 255));
        JBReintentar.setText("Calcular mi viaje");
        JBReintentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBReintentarActionPerformed(evt);
            }
        });
        getContentPane().add(JBReintentar);
        JBReintentar.setBounds(150, 690, 200, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Biker_Isometric_chico.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 560, 160, 130);

        Data.setForeground(new java.awt.Color(255, 255, 255));
        Data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Data);
        Data.setBounds(40, 150, 420, 190);

        Data3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Data3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Data3);
        Data3.setBounds(40, 490, 420, 70);

        Data1.setForeground(new java.awt.Color(255, 255, 255));
        Data1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Data1);
        Data1.setBounds(40, 150, 420, 200);

        Data2.setBackground(new java.awt.Color(255, 255, 255));
        Data2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Data2);
        Data2.setBounds(40, 350, 420, 120);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void centrarData (){
    Data.setText("<html><div align=center><h2>La tercera Ley de Newton nos indica que a toda acción le corresponde una reacción."
            +" Y así funciona todo, el mínimo hecho de comer una manzana o de caminar, arroja Co2 a la atmósfera."
            +" Y en la actualidad esta tiene mucho, en 2018 alcanzó las 407,8 pmm o partes por millon.</h2></div><html>");
    
    Data2.setText("<html><div align=center><h2>Números que no se ven desde el límite K-T, cuando se extingueron los dinosauros."
                  +" No se trata de dejar de consumir o de movilizarse. Se trata de hacerlo con sabiduria.</h2></div><html>");
    
    Data3.setText("<html><div align=center><strong><h1>!Ahora te invito a que calcules tu huella de carbono!</h1></strong></div><html>");
    }
    
    private void JBReintentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReintentarActionPerformed
    Base Ir = new Base ();
    Ir.setVisible (true);
    this.dispose();
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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
 
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Data1;
    private javax.swing.JLabel Data2;
    private javax.swing.JLabel Data3;
    private javax.swing.JButton JBReintentar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
