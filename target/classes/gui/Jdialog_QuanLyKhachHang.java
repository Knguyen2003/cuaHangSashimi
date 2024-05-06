/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.CustomerDao;
import entity.Customer;
import java.awt.Font;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.AppUltil;

public class Jdialog_QuanLyKhachHang extends javax.swing.JDialog {

    private DefaultTableModel modelKhachHang;
    private CustomerDao khachHangDao;
    private String std;
    private JButton buttonThem;

    public Jdialog_QuanLyKhachHang(String sdt, JButton btnThem) {
        initComponents();
        setUpGui();
        designTable();
        buttonThem = btnThem;
        txt_SoDienThoai.setText(sdt);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        pnl_thongTinhachHang = new javax.swing.JPanel();
        lbl_MaKhachHang = new javax.swing.JLabel();
        txt_MaKhachHang = new javax.swing.JTextField();
        lbl_TenKhachHang = new javax.swing.JLabel();
        txt_TenKhachHang = new javax.swing.JTextField();
        lbl_GioiTinh = new javax.swing.JLabel();
        lbl_NgaySinh = new javax.swing.JLabel();
        lbl_SoDienThoai = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JTextField();
        radio_nam = new javax.swing.JRadioButton();
        radio_nu = new javax.swing.JRadioButton();
        lbl_DiemTichLuy = new javax.swing.JLabel();
        txt_DiemTichLuy = new javax.swing.JTextField();
        jdc_ngaySinh = new com.toedter.calendar.JDateChooser();
        pnl_center = new javax.swing.JPanel();
        pnl_ChucNang = new javax.swing.JPanel();
        txt_TimKiem = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_CapNhatNhanVien1 = new javax.swing.JButton();
        btn_ThemNhanVien1 = new javax.swing.JButton();
        btn_xoaTrang = new javax.swing.JButton();
        btn_lamMoi = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();
        pnl_danhSachKhachHang = new javax.swing.JPanel();
        jScrollPane_DanhSachKhachHang = new javax.swing.JScrollPane();
        table_DanhSachKhachHang = new javax.swing.JTable();

        pnl_thongTinhachHang.setBackground(new java.awt.Color(204, 204, 204));
        pnl_thongTinhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        pnl_thongTinhachHang.setPreferredSize(new java.awt.Dimension(1461, 191));

        lbl_MaKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_MaKhachHang.setText("Mã Khách Hàng");

        txt_MaKhachHang.setEditable(false);
        txt_MaKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_MaKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_TenKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_TenKhachHang.setText("Tên Khách Hàng:");

        txt_TenKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_TenKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_GioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_GioiTinh.setText("Giới Tính:");

        lbl_NgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_NgaySinh.setText("Ngày Sinh:");

        lbl_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_SoDienThoai.setText("Số Điện Thoại: ");

        txt_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_SoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        radio_nam.setBackground(new java.awt.Color(204, 204, 204));
        radio_nam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radio_nam.setSelected(true);
        radio_nam.setText("Nam");
        radio_nam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        radio_nam.setOpaque(true);
        radio_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_namActionPerformed(evt);
            }
        });

        radio_nu.setBackground(new java.awt.Color(204, 204, 204));
        radio_nu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radio_nu.setText("Nữ");
        radio_nu.setOpaque(true);

        lbl_DiemTichLuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_DiemTichLuy.setText("Điểm tích lũy :");

        txt_DiemTichLuy.setEditable(false);
        txt_DiemTichLuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_DiemTichLuy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jdc_ngaySinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jdc_ngaySinh.setDateFormatString("dd-MM-yyyy\n");

        javax.swing.GroupLayout pnl_thongTinhachHangLayout = new javax.swing.GroupLayout(pnl_thongTinhachHang);
        pnl_thongTinhachHang.setLayout(pnl_thongTinhachHangLayout);
        pnl_thongTinhachHangLayout.setHorizontalGroup(
            pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thongTinhachHangLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_thongTinhachHangLayout.createSequentialGroup()
                            .addComponent(lbl_TenKhachHang)
                            .addGap(18, 18, 18))
                        .addGroup(pnl_thongTinhachHangLayout.createSequentialGroup()
                            .addComponent(lbl_MaKhachHang)
                            .addGap(14, 14, 14)))
                    .addGroup(pnl_thongTinhachHangLayout.createSequentialGroup()
                        .addComponent(lbl_GioiTinh)
                        .addGap(43, 43, 43)))
                .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnl_thongTinhachHangLayout.createSequentialGroup()
                        .addComponent(radio_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radio_nu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txt_MaKhachHang)
                    .addComponent(txt_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(300, 300, 300)
                .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_SoDienThoai)
                    .addComponent(lbl_DiemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NgaySinh))
                .addGap(12, 12, 12)
                .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(txt_DiemTichLuy))
                    .addComponent(jdc_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );
        pnl_thongTinhachHangLayout.setVerticalGroup(
            pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thongTinhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdc_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_MaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_MaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_thongTinhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_nam)
                    .addComponent(radio_nu)
                    .addComponent(lbl_DiemTichLuy)
                    .addComponent(txt_DiemTichLuy, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
        );

        getContentPane().add(pnl_thongTinhachHang, java.awt.BorderLayout.NORTH);

        pnl_center.setLayout(new java.awt.BorderLayout());

        pnl_ChucNang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnl_ChucNang.setPreferredSize(new java.awt.Dimension(613, 70));
        pnl_ChucNang.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 50, 0));

        txt_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_TimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_TimKiem.setPreferredSize(new java.awt.Dimension(280, 36));
        pnl_ChucNang.add(txt_TimKiem);

        btn_timKiem.setBackground(new java.awt.Color(102, 102, 255));
        btn_timKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_timKiem.setText("TÌM KIẾM");
        btn_timKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_timKiem.setPreferredSize(new java.awt.Dimension(105, 36));
        btn_timKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_timKiemMouseClicked(evt);
            }
        });
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_timKiem);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(2, 65));
        pnl_ChucNang.add(jLabel2);

        btn_CapNhatNhanVien1.setBackground(new java.awt.Color(102, 102, 255));
        btn_CapNhatNhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_CapNhatNhanVien1.setText("CẬP NHẬT");
        btn_CapNhatNhanVien1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_CapNhatNhanVien1.setPreferredSize(new java.awt.Dimension(105, 36));
        btn_CapNhatNhanVien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CapNhatNhanVien1MouseClicked(evt);
            }
        });
        pnl_ChucNang.add(btn_CapNhatNhanVien1);

        btn_ThemNhanVien1.setBackground(new java.awt.Color(102, 102, 255));
        btn_ThemNhanVien1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ThemNhanVien1.setText("THÊM ");
        btn_ThemNhanVien1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ThemNhanVien1.setPreferredSize(new java.awt.Dimension(105, 36));
        btn_ThemNhanVien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemNhanVien1ActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_ThemNhanVien1);

        btn_xoaTrang.setBackground(new java.awt.Color(102, 102, 255));
        btn_xoaTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_xoaTrang.setText("XÓA TRẮNG");
        btn_xoaTrang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_xoaTrang.setPreferredSize(new java.awt.Dimension(105, 36));
        btn_xoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaTrangActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_xoaTrang);

        btn_lamMoi.setBackground(new java.awt.Color(102, 102, 255));
        btn_lamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_lamMoi.setText("LÀM MỚI");
        btn_lamMoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_lamMoi.setPreferredSize(new java.awt.Dimension(105, 36));
        btn_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lamMoiActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_lamMoi);

        btn_thoat.setBackground(new java.awt.Color(255, 51, 0));
        btn_thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_thoat.setForeground(new java.awt.Color(255, 255, 255));
        btn_thoat.setText("THOÁT");
        btn_thoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_thoat.setPreferredSize(new java.awt.Dimension(105, 36));
        btn_thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_thoatMouseClicked(evt);
            }
        });
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_thoat);

        pnl_center.add(pnl_ChucNang, java.awt.BorderLayout.NORTH);

        pnl_danhSachKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH KHÁCH HÀNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        table_DanhSachKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "Ngày Sinh", "Số Điện Thoại", "Điểm tích lũy"
            }
        ));
        table_DanhSachKhachHang.setRowHeight(30);
        table_DanhSachKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DanhSachKhachHangMouseClicked(evt);
            }
        });
        jScrollPane_DanhSachKhachHang.setViewportView(table_DanhSachKhachHang);

        javax.swing.GroupLayout pnl_danhSachKhachHangLayout = new javax.swing.GroupLayout(pnl_danhSachKhachHang);
        pnl_danhSachKhachHang.setLayout(pnl_danhSachKhachHangLayout);
        pnl_danhSachKhachHangLayout.setHorizontalGroup(
            pnl_danhSachKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_danhSachKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_DanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 1439, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_danhSachKhachHangLayout.setVerticalGroup(
            pnl_danhSachKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_danhSachKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_DanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_center.add(pnl_danhSachKhachHang, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnl_center, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void radio_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_namActionPerformed

    private void btn_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiActionPerformed
        createID();
        txt_SoDienThoai.setText("");
        txt_TenKhachHang.setText("");
        txt_DiemTichLuy.setText("");
        xoaHetDuLieuTablable();
        DocDuLieuSQLToTable();
        table_DanhSachKhachHang.revalidate();
        table_DanhSachKhachHang.repaint();
    }//GEN-LAST:event_btn_lamMoiActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        String tim = txt_TimKiem.getText();
        List<Customer> dsKH = khachHangDao.findCustomer(tim);
        xoaHetDuLieuTablable();
        DocDuLieuSQLToTable2(dsKH);
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void btn_ThemNhanVien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemNhanVien1ActionPerformed
        // TODO add your handling code here:
        themKhachHang();

    }//GEN-LAST:event_btn_ThemNhanVien1ActionPerformed


    private void table_DanhSachKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DanhSachKhachHangMouseClicked
        // TODO add your handling code here:
        int r = table_DanhSachKhachHang.getSelectedRow();
        if (r != -1) {
            std = table_DanhSachKhachHang.getValueAt(r, 4).toString();
            txt_MaKhachHang.setText(table_DanhSachKhachHang.getValueAt(r, 0).toString());
            txt_TenKhachHang.setText(table_DanhSachKhachHang.getValueAt(r, 1).toString());
            String gt = table_DanhSachKhachHang.getValueAt(r, 2).toString();
            if (gt.equalsIgnoreCase("Nam")) {
                radio_nam.setSelected(true);
            } else {
                radio_nu.setSelected(true);
            }

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String ngaySinh = table_DanhSachKhachHang.getValueAt(r, 3).toString();
            Date date = null;
            try {
                date = dateFormat.parse(ngaySinh);
            } catch (ParseException ex) {
                Logger.getLogger(Jdialog_QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
            jdc_ngaySinh.setDate(date);

            txt_SoDienThoai.setText(table_DanhSachKhachHang.getValueAt(r, 4).toString());
            txt_DiemTichLuy.setText(table_DanhSachKhachHang.getValueAt(r, 5).toString());
        }
    }//GEN-LAST:event_table_DanhSachKhachHangMouseClicked

    private void btn_CapNhatNhanVien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatNhanVien1MouseClicked
        if (!std.equalsIgnoreCase(txt_SoDienThoai.getText()) && khachHangDao.findCustomerByPhone(txt_SoDienThoai.getText()) != null) {

            JOptionPane.showMessageDialog(null, "Số điện thoại đã được sử dụng");
            txt_SoDienThoai.selectAll();
            txt_SoDienThoai.requestFocus();
        } else {
            Customer c = createCustomerUpdate();
            boolean kt = khachHangDao.capNhatKhachHang(c);
            if (kt == true) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                xoaHetDuLieuTablable();
                DocDuLieuSQLToTable();

            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
            }
        }


    }//GEN-LAST:event_btn_CapNhatNhanVien1MouseClicked

    private void btn_xoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaTrangActionPerformed
        txt_SoDienThoai.setText("");
        txt_TenKhachHang.setText("");
        txt_DiemTichLuy.setText("");
        createID();
    }//GEN-LAST:event_btn_xoaTrangActionPerformed

    private void btn_timKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_timKiemMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_timKiemMouseClicked

    private void btn_thoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_thoatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_thoatMouseClicked

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_thoatActionPerformed

    public void designTable() {
        table_DanhSachKhachHang.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_DanhSachKhachHang.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    public void xoaHetDuLieuTablable() {
        modelKhachHang.getDataVector().removeAllElements();
    }

    public void setUpGui() {
        ButtonGroup group = new ButtonGroup();
        group.add(radio_nam);
        group.add(radio_nu);
        khachHangDao = new CustomerDao(AppUltil.initDriver(), "quanliquanan");
        createID();
        modelKhachHang = (DefaultTableModel) table_DanhSachKhachHang.getModel();
        DocDuLieuSQLToTable();
    }

    public void createID() {
        String ma = khachHangDao.lay4SoCuoiMa(); //0001
        if (ma.equalsIgnoreCase("0000")) {
            txt_MaKhachHang.setText("KH0001");
        } else {
            int maInt = Integer.parseInt(ma); //1
            maInt = maInt + 1; //2 9
            if (maInt < 10) {
                txt_MaKhachHang.setText("KH000" + maInt);
            } else if (maInt >= 10 && maInt <= 99) {
                txt_MaKhachHang.setText("KH00" + maInt);
            } else if (maInt >= 100 && maInt <= 999) {
                txt_MaKhachHang.setText("KH0" + maInt);
            } else if (maInt >= 1000) {
                txt_MaKhachHang.setText("KH" + maInt);
            }

        }

    }

    public void themKhachHang() {

        Calendar now = Calendar.getInstance();
        Date ngaySinh = jdc_ngaySinh.getDate();
        Calendar ngayHienTaiTru8Nam = Calendar.getInstance();
        ngayHienTaiTru8Nam.add(Calendar.YEAR, -8);
        Calendar ngaySinhCalendar = Calendar.getInstance();
        ngaySinhCalendar.setTime(ngaySinh);

        if (txt_TenKhachHang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên Khách Hàng Không Được Để Trống");
            txt_TenKhachHang.requestFocus();
        } else {
            if (txt_SoDienThoai.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Số Điện Thoại Không Được Rỗng");
                txt_SoDienThoai.requestFocus();
            } else if (!txt_SoDienThoai.getText().matches("(^(03)[2-9]\\d{7})|(^(07)[06-9]\\d{7})|(^(08)[1-5]\\d{7})|(^(056)\\d{7})|(^(058)\\d{7})|(^(059)\\d{7})|(^(09)[0-46-9]\\d{7})")) {
                JOptionPane.showMessageDialog(null, "Số điện thoại không đúng định dạng. Số điện thoại: Bắt đầu 03, 07, 08, 056, 058, 059, 09 và có 10 chữ số");
                txt_SoDienThoai.selectAll();
                txt_SoDienThoai.requestFocus();
            } else if (khachHangDao.findCustomerByPhone(txt_SoDienThoai.getText()) != null) {
                JOptionPane.showMessageDialog(null, "Số điện thoại đã được sử dụng");
                txt_SoDienThoai.selectAll();
                txt_SoDienThoai.requestFocus();
            } else if (ngaySinh == null) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày sinh");
            } else if (ngaySinhCalendar.after(ngayHienTaiTru8Nam)) {
                JOptionPane.showMessageDialog(null, "Khách Hàng Chưa Đủ Tuổi Mua Hàng. Vui Long Nhờ Người Lớn Mua");
            } else {
                Customer kh = createCustomer();
                boolean them = khachHangDao.themKhachHang(kh);
                if (them == true) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                    xoaHetDuLieuTablable();
                    DocDuLieuSQLToTable();
                    table_DanhSachKhachHang.revalidate();
                    createID();
                    btn_thoat.doClick();
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm thất bại");
                }
            }

        }
    }
    

    public Customer createCustomer() {
        Customer kh = new Customer();

        Customer c = khachHangDao.findCustomerByID(txt_MaKhachHang.getText());
        if (c == null) {
            kh.setMaKhachHang(txt_MaKhachHang.getText());
            kh.setTenKhachHang(txt_TenKhachHang.getText());
            if (radio_nam.isSelected()) {
                kh.setGioiTinh(0); //nam
            } else {
                kh.setGioiTinh(1);
            }
            Date ngaySinh = jdc_ngaySinh.getDate();
            LocalDateTime ngaySinhLocalDateTime = ngaySinh.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            kh.setNgaySinh(ngaySinhLocalDateTime);
            kh.setSoDienThoai(txt_SoDienThoai.getText());

            kh.setDiemTichLuy(0);

            return kh;
        } else {
            JOptionPane.showMessageDialog(null, "Khách hàng đã tồn tại. Thêm thất bại.");
            return null;
        }

    }

    public Customer createCustomerUpdate() {
        Customer kh = new Customer();

        kh.setMaKhachHang(txt_MaKhachHang.getText());
        kh.setTenKhachHang(txt_TenKhachHang.getText());
        if (radio_nam.isSelected()) {
            kh.setGioiTinh(0); //nam
        } else {
            kh.setGioiTinh(1);
        }
        Date ngaySinh = jdc_ngaySinh.getDate();
        LocalDateTime ngaySinhLocalDateTime = ngaySinh.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        kh.setNgaySinh(ngaySinhLocalDateTime);
        kh.setSoDienThoai(txt_SoDienThoai.getText());

        String diemTichLuy = txt_DiemTichLuy.getText();
        kh.setDiemTichLuy(Double.parseDouble(diemTichLuy));

        return kh;

    }

    public Object[] getObjKhachHang(Customer kh) {
        String gioiTinh = "";
        gioiTinh = switch (kh.getGioiTinh()) {
            case 0 ->
                "Nam";
            case 1 ->
                "Nữ";
            default ->
                "Trống";
        };
        String ngaySinh;
        if (kh.getTenKhachHang().equalsIgnoreCase("Khách vãng lai")) {
            ngaySinh = "Trống";
        } else {
            ngaySinh = kh.getNgaySinh().getDayOfMonth() + "/" + kh.getNgaySinh().getMonthValue() + "/" + kh.getNgaySinh().getYear();
        }

        Object[] obj = {kh.getMaKhachHang(), kh.getTenKhachHang(), gioiTinh, ngaySinh, kh.getSoDienThoai(), kh.getDiemTichLuy()};
        return obj;
    }

    public void DocDuLieuSQLToTable() {
        List<Customer> dsKH = khachHangDao.getTatCaKhachHang();
        if (dsKH.size() > 0) {
            for (Customer K : dsKH) {
                modelKhachHang.addRow(getObjKhachHang(K));
            }
        }

    }

    public void DocDuLieuSQLToTable2(List<Customer> dsKH) {
        if (dsKH.size() > 0) {
            for (Customer K : dsKH) {
                modelKhachHang.addRow(getObjKhachHang(K));
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhatNhanVien1;
    private javax.swing.JButton btn_ThemNhanVien1;
    private javax.swing.JButton btn_lamMoi;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoaTrang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane_DanhSachKhachHang;
    private javax.swing.JSpinner jSpinner1;
    private com.toedter.calendar.JDateChooser jdc_ngaySinh;
    private javax.swing.JLabel lbl_DiemTichLuy;
    private javax.swing.JLabel lbl_GioiTinh;
    private javax.swing.JLabel lbl_MaKhachHang;
    private javax.swing.JLabel lbl_NgaySinh;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_TenKhachHang;
    private javax.swing.JPanel pnl_ChucNang;
    private javax.swing.JPanel pnl_center;
    private javax.swing.JPanel pnl_danhSachKhachHang;
    private javax.swing.JPanel pnl_thongTinhachHang;
    private javax.swing.JRadioButton radio_nam;
    private javax.swing.JRadioButton radio_nu;
    private javax.swing.JTable table_DanhSachKhachHang;
    private javax.swing.JTextField txt_DiemTichLuy;
    private javax.swing.JTextField txt_MaKhachHang;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_TenKhachHang;
    private javax.swing.JTextField txt_TimKiem;
    // End of variables declaration//GEN-END:variables
}
