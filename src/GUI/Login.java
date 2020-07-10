/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import style.StyleLogin;

/**
 *
 * @author sam
 */
public class Login extends javax.swing.JFrame {

    StyleLogin st = new StyleLogin();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        StyleLogin.changeColor(this);
        st.setImage(this);
        StyleLogin.setPlaceholder(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pan_login = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        btn_log = new javax.swing.JButton();
        lbl_crear = new javax.swing.JLabel();
        lbl_rec = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        lbl_close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 44, 152));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan_login.setBackground(new java.awt.Color(17, 138, 178));
        pan_login.setMinimumSize(new java.awt.Dimension(400, 600));
        pan_login.setPreferredSize(new java.awt.Dimension(400, 600));
        pan_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pan_login.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 270, 42));

        btn_log.setBackground(new java.awt.Color(254, 254, 254));
        btn_log.setFont(new java.awt.Font("L M Mono Caps10", 1, 18)); // NOI18N
        btn_log.setForeground(new java.awt.Color(7, 59, 76));
        btn_log.setText("Login");
        pan_login.add(btn_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 350, 81, -1));

        lbl_crear.setFont(new java.awt.Font("L M Roman Caps10", 1, 13)); // NOI18N
        lbl_crear.setForeground(new java.awt.Color(254, 254, 254));
        lbl_crear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_crear.setText("Crear perfil de usuario");
        lbl_crear.setToolTipText("Registrar nuevo usuario");
        lbl_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pan_login.add(lbl_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 400, 40));

        lbl_rec.setFont(new java.awt.Font("Cantarell", 3, 12)); // NOI18N
        lbl_rec.setForeground(new java.awt.Color(254, 254, 254));
        lbl_rec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rec.setText("Olvidé mi contraseña");
        lbl_rec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pan_login.add(lbl_rec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 400, 30));
        pan_login.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 270, 42));

        jPanel2.setBackground(new java.awt.Color(7, 59, 76));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_close.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 24)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(171, 84, 84));
        lbl_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_close.setText("X");
        lbl_close.setToolTipText("cerrar");
        lbl_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 9, 30, 30));

        pan_login.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 150));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿No tienes una cuenta?");
        pan_login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 400, 40));

        jPanel1.add(pan_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -7, 410, 610));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mind Universe 2.jpg"))); // NOI18N
        jPanel1.add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_log;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbl_close;
    public javax.swing.JLabel lbl_crear;
    public javax.swing.JLabel lbl_fondo;
    public javax.swing.JLabel lbl_rec;
    public javax.swing.JPanel pan_login;
    public javax.swing.JTextField txt_name;
    public javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
