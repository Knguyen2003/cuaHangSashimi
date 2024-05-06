package gui;

import dao.AccountDao;
import entity.Account;
import javax.swing.JOptionPane;
import util.AppUltil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class login extends javax.swing.JFrame {

    private AccountDao acountDao;
    
    public login() {
        initComponents();

        lbl_eye.setVisible(false);
        this.setSize(920, 470);
        setLocationRelativeTo(null);
        acountDao = new AccountDao(AppUltil.initDriver(), "quanliquanan");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        pnl_Logo = new javax.swing.JPanel();
        lbl_Logo = new javax.swing.JLabel();
        pnl_FormLogin = new javax.swing.JPanel();
        lbl_Login = new javax.swing.JLabel();
        lbl_UserName = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        lbl_ForgetPassWord = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        txt_UserName = new javax.swing.JTextField();
        lbl_LogoUserName = new javax.swing.JLabel();
        lbl_hideeye = new javax.swing.JLabel();
        lbl_eye = new javax.swing.JLabel();
        jpw_matKhau = new javax.swing.JPasswordField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ NHÀ HÀNG SASHIMI");
        setBackground(new java.awt.Color(153, 204, 255));

        pnl_Logo.setBackground(new java.awt.Color(102, 102, 102));

        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/login.png"))); // NOI18N

        javax.swing.GroupLayout pnl_LogoLayout = new javax.swing.GroupLayout(pnl_Logo);
        pnl_Logo.setLayout(pnl_LogoLayout);
        pnl_LogoLayout.setHorizontalGroup(
            pnl_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LogoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnl_LogoLayout.setVerticalGroup(
            pnl_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_LogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pnl_FormLogin.setBackground(new java.awt.Color(153, 204, 255));

        lbl_Login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Login.setForeground(new java.awt.Color(51, 51, 255));
        lbl_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Login.setText("Đăng Nhập");

        lbl_UserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_UserName.setText("Tên Đăng Nhập");

        lbl_Password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Password.setText("Password");

        lbl_ForgetPassWord.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_ForgetPassWord.setForeground(new java.awt.Color(0, 0, 255));
        lbl_ForgetPassWord.setText("Quên mật khẩu ?");

        btn_Login.setBackground(new java.awt.Color(102, 102, 255));
        btn_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(255, 255, 255));
        btn_Login.setText("Đăng Nhập");
        btn_Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        btn_Cancel.setBackground(new java.awt.Color(255, 102, 0));
        btn_Cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Cancel.setText("Thoát");
        btn_Cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        txt_UserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_UserName.setText("NVQL001");
        txt_UserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_LogoUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/avatar-design.png"))); // NOI18N

        lbl_hideeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/hide.png"))); // NOI18N
        lbl_hideeye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hideeyeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_hideeyeMousePressed(evt);
            }
        });

        lbl_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/view.png"))); // NOI18N
        lbl_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_eyeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_eyeMousePressed(evt);
            }
        });

        jpw_matKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpw_matKhau.setText("1111");

        javax.swing.GroupLayout pnl_FormLoginLayout = new javax.swing.GroupLayout(pnl_FormLogin);
        pnl_FormLogin.setLayout(pnl_FormLoginLayout);
        pnl_FormLoginLayout.setHorizontalGroup(
            pnl_FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_FormLoginLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_FormLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnl_FormLoginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ForgetPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_FormLoginLayout.createSequentialGroup()
                        .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_LogoUserName))
                    .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_FormLoginLayout.createSequentialGroup()
                        .addComponent(jpw_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(pnl_FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_FormLoginLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lbl_hideeye, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl_FormLoginLayout.setVerticalGroup(
            pnl_FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_FormLoginLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbl_Login)
                .addGap(6, 6, 6)
                .addComponent(lbl_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_LogoUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(pnl_FormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpw_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hideeye, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_FormLoginLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(lbl_ForgetPassWord)
                .addGap(18, 18, 18)
                .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_FormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_FormLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(943, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_eyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eyeMouseClicked

    }//GEN-LAST:event_lbl_eyeMouseClicked

    private void lbl_hideeyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hideeyeMouseClicked

    }//GEN-LAST:event_lbl_hideeyeMouseClicked

    private void lbl_hideeyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hideeyeMousePressed
        lbl_hideeye.setVisible(false);
        lbl_eye.setVisible(true);
        jpw_matKhau.setEchoChar('*');
    }//GEN-LAST:event_lbl_hideeyeMousePressed

    private void lbl_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eyeMousePressed
        lbl_hideeye.setVisible(true);
        lbl_eye.setVisible(false);
        jpw_matKhau.setEchoChar((char) 0);
    }//GEN-LAST:event_lbl_eyeMousePressed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        String tenDN = txt_UserName.getText();
        char[] passwordChars = jpw_matKhau.getPassword();
        String password = new String(passwordChars);

        if (tenDN.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không được trống!!!");
        } else {
            Account tk = acountDao.timTaiKhoan(tenDN);
            if (tk == null) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên!!!");
            } else if (tk.getTrangThai() == 2) {
                JOptionPane.showMessageDialog(null, "Tài khoản này đã bị khóa!!!");
            } else if (password.equals(tk.getMatKhau())) {
                if (tk.getLoaiTaiKhoan().equalsIgnoreCase("Nhân Viên Quản Lý")) {
                    dispose();
                    this.setVisible(false);
                    new JFrame_MainNVQL(tk).setVisible(true);
                }else if (tk.getLoaiTaiKhoan().equalsIgnoreCase("Nhân Viên Tiếp Tân") || tk.getLoaiTaiKhoan().equalsIgnoreCase("Nhân Viên Phục Vụ")) {
                    dispose();
                    this.setVisible(false);
                    new JFrame_MainNVTT(tk).setVisible(true);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không hợp lệ!!!");
            }
        }


    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Login;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPasswordField jpw_matKhau;
    private javax.swing.JLabel lbl_ForgetPassWord;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_LogoUserName;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_UserName;
    private javax.swing.JLabel lbl_eye;
    private javax.swing.JLabel lbl_hideeye;
    private javax.swing.JPanel pnl_FormLogin;
    private javax.swing.JPanel pnl_Logo;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}
