/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import dao.OrderDao;
import dao.TableDao;
import entity.EnumTrangThai;
import entity.Order;
import entity.Table;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import util.AppUltil;

public final class JDialog_chuyenBan extends javax.swing.JDialog {

    private final TableDao tableDao;
    private final String banDuocChon;
    private final OrderDao orderDao;
    private JButton buttonLamMoi;

    public JDialog_chuyenBan(String ban,JButton btnLamMoi) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        banDuocChon = ban;
        buttonLamMoi = btnLamMoi;
        lbl_banHienTai.setText(ban);
        tableDao = new TableDao(AppUltil.initDriver(), "quanliquanan");
        orderDao = new OrderDao(AppUltil.initDriver(), "quanliquanan");
        docDuLieuVaoCombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tieuDe = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_ban = new javax.swing.JLabel();
        lbl_banHienTai = new javax.swing.JLabel();
        lbl_chuyen = new javax.swing.JLabel();
        cbb_ban = new javax.swing.JComboBox<>();
        btn_chuyen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lbl_tieuDe.setBackground(new java.awt.Color(153, 255, 255));
        lbl_tieuDe.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbl_tieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tieuDe.setText("CHUYỂN BÀN");
        lbl_tieuDe.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_ban.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ban.setText("Bàn : ");

        lbl_banHienTai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_banHienTai.setForeground(new java.awt.Color(255, 51, 51));

        lbl_chuyen.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_chuyen.setText("==>");

        cbb_ban.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbb_ban.setBorder(null);

        btn_chuyen.setBackground(new java.awt.Color(236, 231, 231));
        btn_chuyen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_chuyen.setText("CHUYỂN");
        btn_chuyen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_chuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_ban, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lbl_banHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_chuyen)
                .addGap(18, 18, 18)
                .addComponent(cbb_ban, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btn_chuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbb_ban, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ban, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_banHienTai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_chuyen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btn_chuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_tieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_tieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_chuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyenActionPerformed
        String banChuyen = (String) cbb_ban.getSelectedItem();
        Order o = orderDao.timHoaDonTheoBan(banDuocChon, 1);
        orderDao.upDateSoBan(o.getMaHD(), banChuyen);
        tableDao.updateTrangThaiTable("Trống", banDuocChon);
        tableDao.updateTrangThaiTable("Đang sử dụng", banChuyen);
        Table a = tableDao.timBanTheoSoBan(banDuocChon);
        Table b = tableDao.timBanTheoSoBan(banChuyen);
        a.setTrangThai(EnumTrangThai.TRONG);
        b.setTrangThai(EnumTrangThai.DANGSU_DUNG);
        this.setVisible(false);
        buttonLamMoi.doClick();
    }//GEN-LAST:event_btn_chuyenActionPerformed

    public void docDuLieuVaoCombobox() {
        List<Table> dsTable = tableDao.getTableByTrangThai("Trống");
        cbb_ban.removeAllItems();
        for (Table t : dsTable) {
            cbb_ban.addItem(t.getSoBan());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chuyen;
    private javax.swing.JComboBox<String> cbb_ban;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_ban;
    private javax.swing.JLabel lbl_banHienTai;
    private javax.swing.JLabel lbl_chuyen;
    private javax.swing.JLabel lbl_tieuDe;
    // End of variables declaration//GEN-END:variables
}
