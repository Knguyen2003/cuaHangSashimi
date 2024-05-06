/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.CustomerDao;
import dao.EmployeeDao;
import dao.OrderDao;
import dao.OrderDetailDao;
import entity.Employee;
import entity.Order;
import entity.OrderDetail;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.AppUltil;

/**
 *
 * @author PC
 */
public class panel_HoaDon extends javax.swing.JPanel {

    private DefaultTableModel modelHoaDon;
    private DefaultTableModel modelChiTietHoaDon;
    private OrderDao orderDao;
    private OrderDetailDao odDao;
    private EmployeeDao eDao;
    private CustomerDao customerDao;

    public panel_HoaDon() {
        initComponents();
        btn_Loc.setBackground(Color.WHITE);
        btn_lamMoi.setBackground(Color.WHITE);
        orderDao = new OrderDao(AppUltil.initDriver(), "quanliquanan");
        odDao = new OrderDetailDao(AppUltil.initDriver(), "quanliquanan");
        eDao = new EmployeeDao(AppUltil.initDriver(), "quanliquanan");
        customerDao = new CustomerDao(AppUltil.initDriver(), "quanliquanan");
        modelHoaDon = (DefaultTableModel) table_DanhSachHoaDon.getModel();
        modelChiTietHoaDon = (DefaultTableModel) table_ChiTietHoaDon.getModel();
        DocDuLieuHD();
        designTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_HoaDon = new javax.swing.JPanel();
        pnl_ChucNang = new javax.swing.JPanel();
        pnl_TimKiem = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txt_timHoaDon = new javax.swing.JTextField();
        pnl_Loc = new javax.swing.JPanel();
        cmb_TongTien = new javax.swing.JComboBox<>();
        jdc_ThoiGianTu = new com.toedter.calendar.JDateChooser();
        jdc_ThoiGianDen = new com.toedter.calendar.JDateChooser();
        lbl_LocThoiGianTu = new javax.swing.JLabel();
        lbl_LocThoiGianTu1 = new javax.swing.JLabel();
        btn_Loc = new javax.swing.JButton();
        btn_lamMoi = new javax.swing.JButton();
        pnl_DanhSachHoaDon = new javax.swing.JPanel();
        jsp_DSHD = new javax.swing.JScrollPane();
        table_DanhSachHoaDon = new javax.swing.JTable();
        pnl_ChiTietHoaDon = new javax.swing.JPanel();
        jsp_CTHD = new javax.swing.JScrollPane();
        table_ChiTietHoaDon = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        pnl_HoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnl_HoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        pnl_ChucNang.setBackground(new java.awt.Color(255, 255, 255));

        pnl_TimKiem.setBackground(new java.awt.Color(255, 255, 255));
        pnl_TimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/search.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_timHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pnl_TimKiemLayout = new javax.swing.GroupLayout(pnl_TimKiem);
        pnl_TimKiem.setLayout(pnl_TimKiemLayout);
        pnl_TimKiemLayout.setHorizontalGroup(
            pnl_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_timHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_TimKiemLayout.setVerticalGroup(
            pnl_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TimKiemLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnl_TimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_timHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnl_Loc.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Loc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cmb_TongTien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_TongTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng Tiền", "200.000 - 500.000 VNĐ", "500.000 - 1.000.000 VNĐ", "1.000.000 - 2.000.000 VNĐ", ">  2.000.000 VNĐ", "< 200.000 VNĐ" }));
        cmb_TongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TongTienActionPerformed(evt);
            }
        });

        jdc_ThoiGianTu.setDateFormatString("dd / MM /yyyy");

        jdc_ThoiGianDen.setDateFormatString("dd / MM /yyyy");

        lbl_LocThoiGianTu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_LocThoiGianTu.setText("Từ:");

        lbl_LocThoiGianTu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_LocThoiGianTu1.setText("Đến:");

        btn_Loc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Loc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/filter.png"))); // NOI18N
        btn_Loc.setText("LỌC");
        btn_Loc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LocActionPerformed(evt);
            }
        });

        btn_lamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_lamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/reset.png"))); // NOI18N
        btn_lamMoi.setText("LÀM MỚI");
        btn_lamMoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_LocLayout = new javax.swing.GroupLayout(pnl_Loc);
        pnl_Loc.setLayout(pnl_LocLayout);
        pnl_LocLayout.setHorizontalGroup(
            pnl_LocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LocLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cmb_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_LocThoiGianTu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdc_ThoiGianTu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_LocThoiGianTu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdc_ThoiGianDen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_LocLayout.setVerticalGroup(
            pnl_LocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LocLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnl_LocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_LocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_LocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_LocThoiGianTu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdc_ThoiGianTu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdc_ThoiGianDen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_LocThoiGianTu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_ChucNangLayout = new javax.swing.GroupLayout(pnl_ChucNang);
        pnl_ChucNang.setLayout(pnl_ChucNangLayout);
        pnl_ChucNangLayout.setHorizontalGroup(
            pnl_ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChucNangLayout.createSequentialGroup()
                .addComponent(pnl_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_Loc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_ChucNangLayout.setVerticalGroup(
            pnl_ChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_Loc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_DanhSachHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnl_DanhSachHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jsp_DSHD.setToolTipText("");
        jsp_DSHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsp_DSHDMouseClicked(evt);
            }
        });

        table_DanhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hoá Đơn", "Ngày Lập", "Nhân Viên Lập", "Tên Khách Hàng", "Số Điện Thoại", "Tổng Tiền"
            }
        ));
        table_DanhSachHoaDon.setRowHeight(30);
        table_DanhSachHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DanhSachHoaDonMouseClicked(evt);
            }
        });
        jsp_DSHD.setViewportView(table_DanhSachHoaDon);

        javax.swing.GroupLayout pnl_DanhSachHoaDonLayout = new javax.swing.GroupLayout(pnl_DanhSachHoaDon);
        pnl_DanhSachHoaDon.setLayout(pnl_DanhSachHoaDonLayout);
        pnl_DanhSachHoaDonLayout.setHorizontalGroup(
            pnl_DanhSachHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DanhSachHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsp_DSHD, javax.swing.GroupLayout.DEFAULT_SIZE, 1265, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_DanhSachHoaDonLayout.setVerticalGroup(
            pnl_DanhSachHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DanhSachHoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jsp_DSHD, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_HoaDonLayout = new javax.swing.GroupLayout(pnl_HoaDon);
        pnl_HoaDon.setLayout(pnl_HoaDonLayout);
        pnl_HoaDonLayout.setHorizontalGroup(
            pnl_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_ChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_DanhSachHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_HoaDonLayout.setVerticalGroup(
            pnl_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_ChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_DanhSachHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        add(pnl_HoaDon, java.awt.BorderLayout.NORTH);

        pnl_ChiTietHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnl_ChiTietHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi Tiết Hoá Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        table_ChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Số Lượng", "Giá", "Thành Tiền"
            }
        ));
        table_ChiTietHoaDon.setRowHeight(30);
        jsp_CTHD.setViewportView(table_ChiTietHoaDon);

        javax.swing.GroupLayout pnl_ChiTietHoaDonLayout = new javax.swing.GroupLayout(pnl_ChiTietHoaDon);
        pnl_ChiTietHoaDon.setLayout(pnl_ChiTietHoaDonLayout);
        pnl_ChiTietHoaDonLayout.setHorizontalGroup(
            pnl_ChiTietHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChiTietHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsp_CTHD, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_ChiTietHoaDonLayout.setVerticalGroup(
            pnl_ChiTietHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ChiTietHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsp_CTHD, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
        );

        add(pnl_ChiTietHoaDon, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jsp_DSHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsp_DSHDMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jsp_DSHDMouseClicked

    private void table_DanhSachHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DanhSachHoaDonMouseClicked
        int r = table_DanhSachHoaDon.getSelectedRow();
        String maHoaDon = (String) table_DanhSachHoaDon.getValueAt(r, 0);
        List<OrderDetail> dsOd = odDao.layDanhSachSanPham(maHoaDon);
        xoaHetDuLieuTablableCTHD();
        DocDuLieuCTHD(dsOd);

    }//GEN-LAST:event_table_DanhSachHoaDonMouseClicked

    private void cmb_TongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TongTienActionPerformed
        int loai = cmb_TongTien.getSelectedIndex();
        List<Order> dsOd = new ArrayList<>();

        if (loai == 1) {
            dsOd = orderDao.getTatCaHoaDonTongTienTuDen(200000, 500000);
            xoaHetDuLieuTablableHD();
            DocDuLieuHD2(dsOd);
        } else if (loai == 2) {
            dsOd = orderDao.getTatCaHoaDonTongTienTuDen(500000, 1000000);
            xoaHetDuLieuTablableHD();
            DocDuLieuHD2(dsOd);
        } else if (loai == 3) {
            dsOd = orderDao.getTatCaHoaDonTongTienTuDen(1000000, 2000000);
            xoaHetDuLieuTablableHD();
            DocDuLieuHD2(dsOd);
        } else if (loai == 4) {
            dsOd = orderDao.getTatCaHoaDonTongTienTuDen(2000000, 10000000);
            xoaHetDuLieuTablableHD();
            DocDuLieuHD2(dsOd);
        } else if (loai == 5) {
            dsOd = orderDao.getTatCaHoaDonTongTienTuDen(0, 200000);
            xoaHetDuLieuTablableHD();
            DocDuLieuHD2(dsOd);
        } else if (loai == 0) {
            btn_lamMoi.doClick();
        }

    }//GEN-LAST:event_cmb_TongTienActionPerformed

    private void btn_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LocActionPerformed
        if (jdc_ThoiGianTu.getDate().compareTo(jdc_ThoiGianDen.getDate()) == 0) {
            JOptionPane.showMessageDialog(null, "Ngày từ không được bằngngày đến");
        } else {
            if (jdc_ThoiGianTu.getDate().compareTo(jdc_ThoiGianDen.getDate()) != 0 && jdc_ThoiGianTu.getDate().compareTo(jdc_ThoiGianDen.getDate()) <= 0) {
                Date tu = jdc_ThoiGianTu.getDate();
                Date den = jdc_ThoiGianDen.getDate();

                // Chuyển Date thành Instant
                Instant instantTu = tu.toInstant();
                Instant instantDen = den.toInstant();
                // Chuyển Instant thành LocalDateTime
                LocalDateTime localDateTimeTu = instantTu.atZone(ZoneId.systemDefault()).toLocalDateTime();
                LocalDateTime localDateTimeDen = instantDen.atZone(ZoneId.systemDefault()).toLocalDateTime();

                List<Order> dsOd = orderDao.getTatCaHoaDonTuNgayDen(localDateTimeTu, localDateTimeDen);
                xoaHetDuLieuTablableHD();
                DocDuLieuHD2(dsOd);
            } else {
                JOptionPane.showMessageDialog(null, "Ngày từ không được lớn hơn ngày đến");
            }
        }


    }//GEN-LAST:event_btn_LocActionPerformed

    private void btn_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiActionPerformed
        xoaHetDuLieuTablableCTHD();
        xoaHetDuLieuTablableHD();
        DocDuLieuHD();
    }//GEN-LAST:event_btn_lamMoiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tim = txt_timHoaDon.getText();
        List<Order> dsHD = orderDao.findOrder(tim);
        xoaHetDuLieuTablableHD();
        xoaHetDuLieuTablableCTHD();
        DocDuLieuHD2(dsHD);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void xoaHetDuLieuTablableCTHD() {
        modelChiTietHoaDon.getDataVector().removeAllElements();
        modelChiTietHoaDon.fireTableDataChanged();
    }

    public void xoaHetDuLieuTablableHD() {
        modelHoaDon.getDataVector().removeAllElements();
        modelHoaDon.fireTableDataChanged();
    }

    public void DocDuLieuHD() {
        List<Order> dsHD = orderDao.getTatCaHoaDon();
        if (dsHD.size() > 0) {
            for (Order o : dsHD) {
                modelHoaDon.addRow(getObjHoaDon(o));
            }
        }
    }

    public void DocDuLieuHD2(List<Order> dsHD) {
        if (dsHD.size() > 0) {
            for (Order o : dsHD) {
                modelHoaDon.addRow(getObjHoaDon(o));
            }
        }
    }

    public void DocDuLieuCTHD(List<OrderDetail> dsOD) {

        if (dsOD.size() > 0) {
            for (OrderDetail o : dsOD) {
                modelChiTietHoaDon.addRow(getObjCTHD(o));
            }
        }
    }

    public void designTable() {
        table_ChiTietHoaDon.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_DanhSachHoaDon.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        table_ChiTietHoaDon.setFont(new Font("Arial", Font.PLAIN, 14));
        table_DanhSachHoaDon.setFont(new Font("Arial", Font.PLAIN, 14));

    }

    public Object[] getObjCTHD(OrderDetail od) {
        String giaBan = formatCurrency(od.getFood().getPrice());
        String tongTien = formatCurrency(od.getTongTien());
        Object[] obj = {od.getFood().getFoodName(), od.getSoLuongMua(), giaBan, tongTien};
        return obj;
    }

    public Object[] getObjHoaDon(Order o) {
        String ngayLapHD;
        ngayLapHD = o.getNgayTaoHD().getDayOfMonth() + "/" + o.getNgayTaoHD().getMonthValue() + "/" + o.getNgayTaoHD().getYear();

        Employee e = eDao.findEmployeeByID(o.getNhanVien().getMaNhanVien());
        String kh;
        if (o.getKhachHang().getSoDienThoai().equalsIgnoreCase("Khách vãng lai") || o.getKhachHang().getSoDienThoai() == null) {
            kh = "Khách vãng lai";
        } else {
            kh = customerDao.findCustomerByPhone(o.getKhachHang().getSoDienThoai()).getTenKhachHang();
        }

        Object[] obj = {o.getMaHD(), ngayLapHD, e.getTenNhanVien(), kh, o.getKhachHang().getSoDienThoai(), formatCurrency(o.getThanhToan())};
        return obj;
    }

    public static String formatCurrency(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("###,### VNĐ");
        return decimalFormat.format(number);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Loc;
    private javax.swing.JButton btn_lamMoi;
    private javax.swing.JComboBox<String> cmb_TongTien;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jdc_ThoiGianDen;
    private com.toedter.calendar.JDateChooser jdc_ThoiGianTu;
    private javax.swing.JScrollPane jsp_CTHD;
    private javax.swing.JScrollPane jsp_DSHD;
    private javax.swing.JLabel lbl_LocThoiGianTu;
    private javax.swing.JLabel lbl_LocThoiGianTu1;
    private javax.swing.JPanel pnl_ChiTietHoaDon;
    private javax.swing.JPanel pnl_ChucNang;
    private javax.swing.JPanel pnl_DanhSachHoaDon;
    private javax.swing.JPanel pnl_HoaDon;
    private javax.swing.JPanel pnl_Loc;
    private javax.swing.JPanel pnl_TimKiem;
    private javax.swing.JTable table_ChiTietHoaDon;
    private javax.swing.JTable table_DanhSachHoaDon;
    private javax.swing.JTextField txt_timHoaDon;
    // End of variables declaration//GEN-END:variables
}
