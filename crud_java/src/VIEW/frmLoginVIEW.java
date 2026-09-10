package VIEW;

import DAO.usuarioDAO;
import DTO.usuarioDTO;
import java.sql.ResultSet;

public class frmLoginVIEW extends javax.swing.JFrame {

    public frmLoginVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        txtNome_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha_usuario = new javax.swing.JTextField();
        btnAutorizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        txtNome_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNome_usuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha");

        txtSenha_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha_usuarioActionPerformed(evt);
            }
        });

        btnAutorizar.setText("ENTRAR");
        btnAutorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel3.setFont(new java.awt.Font("Dutch801 XBd BT", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("joao");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtNome_usuario)
                    .addComponent(txtSenha_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAutorizar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtSenha_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAutorizar)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNome_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_usuarioActionPerformed

    }//GEN-LAST:event_txtNome_usuarioActionPerformed

    private void txtSenha_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha_usuarioActionPerformed

    }//GEN-LAST:event_txtSenha_usuarioActionPerformed

    private void btnAutorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizarActionPerformed
        logar();
    }//GEN-LAST:event_btnAutorizarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutorizar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNome_usuario;
    private javax.swing.JTextField txtSenha_usuario;
    // End of variables declaration//GEN-END:variables

    private void logar() {
        try {
            String nome_usuario, senha_usuario;
            nome_usuario = txtNome_usuario.getText();
            senha_usuario = txtSenha_usuario.getText();
            
            usuarioDTO objusuariodto = new usuarioDTO();
            objusuariodto.setNome_usuario(nome_usuario);
            objusuariodto.setSenha_usuario(senha_usuario);

            usuarioDAO objusuarioDAO = new usuarioDAO();
            ResultSet rsusuariodao = objusuarioDAO.autxenticacaoUsuario(objusuarioDTO);
            if (rsusuariodao.next()) {
                    
            }
        } catch (Exception e) {

        }
    }

}
