/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.AccountDao;
import dao.EmployeeDao;
import entity.Employee;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import util.AppUltil;

/**
 *
 * @author PC
 */
public final class panel_QuanLiNhanVien extends javax.swing.JPanel {

    private final DefaultTableModel modelNhanVien;
    private final EmployeeDao nhanVienDao;
    private String duongDanAnh;
    private final AccountDao aDao;
    private LocalDateTime now;
    private String std;
    private boolean flat = true;

    public panel_QuanLiNhanVien() {
        initComponents();
        setColorButon();
        ButtonGroup group = new ButtonGroup();
        group.add(radio_Nam);
        group.add(radio_Nu);

        nhanVienDao = new EmployeeDao(AppUltil.initDriver(), "quanliquanan");
        aDao = new AccountDao(AppUltil.initDriver(), "quanliquanan");
        modelNhanVien = (DefaultTableModel) table_DanhSachNhanVien.getModel();
        docDuLieuSQLToTable();
        createIdNhanVien("NVTT");
        themSetCung();
        now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = now.format(formatter);
        lbl_ngayLam.setText(formattedDate);

        designTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_thongTinNhanVien = new javax.swing.JPanel();
        lbl_MaNhanVien = new javax.swing.JLabel();
        txt_MaNhanVien = new javax.swing.JTextField();
        lbl_TenNhanVien = new javax.swing.JLabel();
        txt_TenNhanVien = new javax.swing.JTextField();
        lbl_GioiTinh = new javax.swing.JLabel();
        lbl_NgaySinh = new javax.swing.JLabel();
        lbl_NgaySinh1 = new javax.swing.JLabel();
        lbl_AnhNhanVienChen = new javax.swing.JLabel();
        lbl_SoDienThoai = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JTextField();
        txt_luong = new javax.swing.JTextField();
        lbl_Luong = new javax.swing.JLabel();
        lbl_CaLamViec = new javax.swing.JLabel();
        cmb_CaLamViec = new javax.swing.JComboBox<>();
        lbl_ChucVu = new javax.swing.JLabel();
        cmb_ChucVu = new javax.swing.JComboBox<>();
        lbl_TrangThai = new javax.swing.JLabel();
        cmb_TrangThai = new javax.swing.JComboBox<>();
        btn_chonAnh = new javax.swing.JButton();
        radio_Nam = new javax.swing.JRadioButton();
        radio_Nu = new javax.swing.JRadioButton();
        txt_CCCD = new javax.swing.JTextField();
        lbl_CCCD = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        jdc_ngaySinh = new com.toedter.calendar.JDateChooser();
        lbl_ngayLam = new javax.swing.JLabel();
        pnl_Center = new javax.swing.JPanel();
        pnl_ChucNang = new javax.swing.JPanel();
        btn_ThemNhanVien = new javax.swing.JButton();
        btn_CapNhatNhanVien = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        btn_xoaTrang = new javax.swing.JButton();
        pnl_Loc = new javax.swing.JPanel();
        txt_TimKiem = new javax.swing.JTextField();
        cmb_LocCaLamViec = new javax.swing.JComboBox<>();
        cmb_LocChucVu = new javax.swing.JComboBox<>();
        cmb_LocTrangThai = new javax.swing.JComboBox<>();
        cmb_LocGioiTinh = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_Loc = new javax.swing.JButton();
        btn_timKiem = new javax.swing.JButton();
        pnl_DanhSachNhanVien = new javax.swing.JPanel();
        jScrollPane_DanhSachNhanVien = new javax.swing.JScrollPane();
        table_DanhSachNhanVien = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        pnl_thongTinNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        pnl_thongTinNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnl_thongTinNhanVien.setPreferredSize(new java.awt.Dimension(2114, 320));

        lbl_MaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_MaNhanVien.setText("Mã Nhân Viên: ");

        txt_MaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_MaNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_TenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_TenNhanVien.setText("Tên Nhân Viên:");

        txt_TenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_TenNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_GioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_GioiTinh.setText("Giới Tính:");

        lbl_NgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_NgaySinh.setText("Ngày Sinh:");

        lbl_NgaySinh1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_NgaySinh1.setText("Ngày Vào Làm:");

        lbl_AnhNhanVienChen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_SoDienThoai.setText("Số Điện Thoại: ");

        txt_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_SoDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txt_luong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_luong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_Luong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_Luong.setText("Lương:");

        lbl_CaLamViec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_CaLamViec.setText("Ca Làm Việc: ");

        cmb_CaLamViec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_CaLamViec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 Tiếng", "8 Tiếng", "12 Tiếng" }));
        cmb_CaLamViec.setBorder(null);

        lbl_ChucVu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_ChucVu.setText("Chức Vụ:");

        cmb_ChucVu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_ChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên Tiếp Tân", "Nhân Viên Phục Vụ", "Nhân Viên Quản Lý" }));
        cmb_ChucVu.setBorder(null);
        cmb_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ChucVuActionPerformed(evt);
            }
        });

        lbl_TrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_TrangThai.setText("Trạng Thái: ");

        cmb_TrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Làm", "Nghỉ Việc" }));
        cmb_TrangThai.setBorder(null);

        btn_chonAnh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_chonAnh.setText("CHỌN ẢNH");
        btn_chonAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_chonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chonAnhActionPerformed(evt);
            }
        });

        radio_Nam.setBackground(new java.awt.Color(204, 204, 204));
        radio_Nam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radio_Nam.setSelected(true);
        radio_Nam.setText("Nam");

        radio_Nu.setBackground(new java.awt.Color(204, 204, 204));
        radio_Nu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radio_Nu.setText("Nữ");

        txt_CCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_CCCD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_CCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_CCCD.setText("CCCD/CMND");

        txt_email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_email.setText("Email :");

        lbl_ngayLam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout pnl_thongTinNhanVienLayout = new javax.swing.GroupLayout(pnl_thongTinNhanVien);
        pnl_thongTinNhanVien.setLayout(pnl_thongTinNhanVienLayout);
        pnl_thongTinNhanVienLayout.setHorizontalGroup(
            pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                        .addComponent(lbl_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                                    .addComponent(lbl_TenNhanVien)
                                    .addGap(28, 28, 28))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_thongTinNhanVienLayout.createSequentialGroup()
                                    .addComponent(lbl_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                                .addComponent(lbl_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                                .addComponent(radio_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radio_Nu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jdc_ngaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_NgaySinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_ngayLam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(155, 155, 155)
                .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_AnhNhanVienChen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_chonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155)
                .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                        .addComponent(lbl_Luong, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                                .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_CaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_ChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_TrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_luong, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_CaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                                .addComponent(lbl_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(242, 242, 242))))
        );
        pnl_thongTinNhanVienLayout.setVerticalGroup(
            pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_AnhNhanVienChen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_MaNhanVien)
                            .addComponent(txt_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_TenNhanVien)
                            .addComponent(txt_TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_GioiTinh)
                                .addComponent(radio_Nam))
                            .addComponent(radio_Nu))
                        .addGap(24, 24, 24)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_NgaySinh)
                            .addComponent(jdc_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ngayLam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_NgaySinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_thongTinNhanVienLayout.createSequentialGroup()
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_CaLamViec)
                            .addComponent(cmb_CaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ChucVu))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_TrangThai))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SoDienThoai))
                        .addGap(16, 16, 16)
                        .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_luong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Luong))))
                .addGap(18, 18, 18)
                .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_CCCD))
                    .addComponent(btn_chonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_thongTinNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_email)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        add(pnl_thongTinNhanVien, java.awt.BorderLayout.NORTH);

        pnl_Center.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        pnl_Center.setPreferredSize(new java.awt.Dimension(1128, 130));
        pnl_Center.setLayout(new java.awt.BorderLayout());

        pnl_ChucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnl_ChucNang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnl_ChucNang.setPreferredSize(new java.awt.Dimension(120, 65));
        pnl_ChucNang.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 130, 10));

        btn_ThemNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ThemNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/plus.png"))); // NOI18N
        btn_ThemNhanVien.setText("THÊM ");
        btn_ThemNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_ThemNhanVien.setOpaque(true);
        btn_ThemNhanVien.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_ThemNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThemNhanVienMouseClicked(evt);
            }
        });
        btn_ThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemNhanVienActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_ThemNhanVien);

        btn_CapNhatNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_CapNhatNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/update.png"))); // NOI18N
        btn_CapNhatNhanVien.setText("CẬP NHẬT");
        btn_CapNhatNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_CapNhatNhanVien.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_CapNhatNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatNhanVienActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_CapNhatNhanVien);

        btn_LamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/reset.png"))); // NOI18N
        btn_LamMoi.setText("LÀM MỚI");
        btn_LamMoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_LamMoi.setPreferredSize(new java.awt.Dimension(120, 40));
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_LamMoi);

        btn_xoaTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_xoaTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/eraser.png"))); // NOI18N
        btn_xoaTrang.setText("XÓA TRẮNG");
        btn_xoaTrang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_xoaTrang.setPreferredSize(new java.awt.Dimension(130, 40));
        btn_xoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaTrangActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_xoaTrang);

        pnl_Center.add(pnl_ChucNang, java.awt.BorderLayout.NORTH);

        pnl_Loc.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Loc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        pnl_Loc.setMaximumSize(new java.awt.Dimension(32767, 50));
        pnl_Loc.setPreferredSize(new java.awt.Dimension(2112, 10));

        txt_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_TimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_TimKiem.setPreferredSize(new java.awt.Dimension(200, 22));

        cmb_LocCaLamViec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ca Làm Việc", "Ca 4 Tiếng", "Ca 8 Tiếng", "Ca 12 Tiếng" }));
        cmb_LocCaLamViec.setBorder(null);
        cmb_LocCaLamViec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_LocCaLamViecItemStateChanged(evt);
            }
        });
        cmb_LocCaLamViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_LocCaLamViecActionPerformed(evt);
            }
        });

        cmb_LocChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chức Vụ", "Nhân Viên Tiếp Tân", "Nhân Viên Phục Vụ", "Nhân Viên Quản Lý" }));
        cmb_LocChucVu.setBorder(null);
        cmb_LocChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_LocChucVuActionPerformed(evt);
            }
        });

        cmb_LocTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trạng Thái", "Đang Làm", "Nghỉ Việc" }));
        cmb_LocTrangThai.setBorder(null);
        cmb_LocTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_LocTrangThaiActionPerformed(evt);
            }
        });

        cmb_LocGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giới Tính", "Nam ", "Nữ" }));
        cmb_LocGioiTinh.setBorder(null);
        cmb_LocGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_LocGioiTinhActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);

        btn_Loc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Loc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/filter.png"))); // NOI18N
        btn_Loc.setText("LỌC");
        btn_Loc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_Loc.setPreferredSize(new java.awt.Dimension(105, 36));
        btn_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LocActionPerformed(evt);
            }
        });

        btn_timKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_timKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/search.png"))); // NOI18N
        btn_timKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_timKiem.setPreferredSize(new java.awt.Dimension(105, 36));
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_LocLayout = new javax.swing.GroupLayout(pnl_Loc);
        pnl_Loc.setLayout(pnl_LocLayout);
        pnl_LocLayout.setHorizontalGroup(
            pnl_LocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_LocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cmb_LocCaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cmb_LocChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cmb_LocTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cmb_LocGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btn_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(780, Short.MAX_VALUE))
        );
        pnl_LocLayout.setVerticalGroup(
            pnl_LocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addGroup(pnl_LocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_LocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_LocCaLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_LocChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_LocTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_LocGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_Center.add(pnl_Loc, java.awt.BorderLayout.CENTER);

        pnl_DanhSachNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        table_DanhSachNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Giới Tính", "CCCD/ CMND", "Ngày Vào Làm"
            }
        ));
        table_DanhSachNhanVien.setRowHeight(30);
        table_DanhSachNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DanhSachNhanVienMouseClicked(evt);
            }
        });
        jScrollPane_DanhSachNhanVien.setViewportView(table_DanhSachNhanVien);

        javax.swing.GroupLayout pnl_DanhSachNhanVienLayout = new javax.swing.GroupLayout(pnl_DanhSachNhanVien);
        pnl_DanhSachNhanVien.setLayout(pnl_DanhSachNhanVienLayout);
        pnl_DanhSachNhanVienLayout.setHorizontalGroup(
            pnl_DanhSachNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_DanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 2102, Short.MAX_VALUE)
        );
        pnl_DanhSachNhanVienLayout.setVerticalGroup(
            pnl_DanhSachNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_DanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        pnl_Center.add(pnl_DanhSachNhanVien, java.awt.BorderLayout.SOUTH);

        add(pnl_Center, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_LocCaLamViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_LocCaLamViecActionPerformed
        int caLV = cmb_LocCaLamViec.getSelectedIndex();
        List<Employee> dsNV = new ArrayList<>();
        if (caLV == 1) {
            dsNV = nhanVienDao.findEmployeeCaLamViec("4 Tiếng");
            cmb_LocCaLamViec.setSelectedIndex(1);
        } else if (caLV == 2) {
            dsNV = nhanVienDao.findEmployeeCaLamViec("8 Tiếng");
        } else if (caLV == 3) {
            dsNV = nhanVienDao.findEmployeeCaLamViec("12 Tiếng");
        }

        cmb_LocChucVu.setSelectedIndex(0);
        cmb_LocGioiTinh.setSelectedIndex(0);
        cmb_LocTrangThai.setSelectedIndex(0);

        xoaDLTrenTable();
        docDuLieuSQLToTable2(dsNV);
        table_DanhSachNhanVien.revalidate();
        table_DanhSachNhanVien.repaint();
    }//GEN-LAST:event_cmb_LocCaLamViecActionPerformed

    private void cmb_LocTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_LocTrangThaiActionPerformed
        int trangThai = cmb_LocTrangThai.getSelectedIndex();
        List<Employee> dsNV = new ArrayList<>();
        if (trangThai == 1) {
            dsNV = nhanVienDao.findEmployeeTrangThai("Đang Làm");
        } else if (trangThai == 2) {
            dsNV = nhanVienDao.findEmployeeTrangThai("Nghỉ Việc");
        }

        cmb_LocChucVu.setSelectedIndex(0);
        cmb_LocGioiTinh.setSelectedIndex(0);
        cmb_CaLamViec.setSelectedIndex(0);

        xoaDLTrenTable();
        docDuLieuSQLToTable2(dsNV);
        table_DanhSachNhanVien.revalidate();
        table_DanhSachNhanVien.repaint();
    }//GEN-LAST:event_cmb_LocTrangThaiActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        // TODO add your handling code here:
        xoaTrang();
        xoaDLTrenTable();
        docDuLieuSQLToTable();
        table_DanhSachNhanVien.revalidate();
        table_DanhSachNhanVien.repaint();
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_ThemNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemNhanVienMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_btn_ThemNhanVienMouseClicked

    private void cmb_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ChucVuActionPerformed
        if (flat) {
            int loai = cmb_ChucVu.getSelectedIndex();
            switch (loai) {
                case 0 ->
                    createIdNhanVien("NVTT");
                case 1 ->
                    createIdNhanVien("NVPV");
                default ->
                    createIdNhanVien("NVQL");
            }
        }
    }//GEN-LAST:event_cmb_ChucVuActionPerformed

    private void btn_chonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chonAnhActionPerformed
        String duongDanProject = System.getProperty("user.dir");
        String duongDanThuMuc = duongDanProject + "\\src\\main\\java\\utilities";
        JFileChooser fileChooser = new JFileChooser(duongDanThuMuc);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Tập tin ảnh", "jpg", "jpeg", "png", "gif"));
        int option = fileChooser.showOpenDialog(panel_QuanLiNhanVien.this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            duongDanAnh = selectedFile.getAbsolutePath();
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
            ImageIcon resizedIcon = resizeImageIcon(icon, lbl_AnhNhanVienChen.getWidth(), lbl_AnhNhanVienChen.getWidth());
            lbl_AnhNhanVienChen.setIcon(resizedIcon);
        } else {
            lbl_AnhNhanVienChen.setIcon(null);
        }
    }//GEN-LAST:event_btn_chonAnhActionPerformed

    public void designTable() {
        table_DanhSachNhanVien.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_DanhSachNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));

    }


    private void table_DanhSachNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DanhSachNhanVienMouseClicked
        flat = false;
        int r = table_DanhSachNhanVien.getSelectedRow();
        if (r != -1) {
            String ma = table_DanhSachNhanVien.getValueAt(r, 0).toString();
            txt_MaNhanVien.setText(ma);
            txt_TenNhanVien.setText(table_DanhSachNhanVien.getValueAt(r, 1).toString());
            String gt = table_DanhSachNhanVien.getValueAt(r, 2).toString();
            if (gt.equalsIgnoreCase("Nam")) {
                radio_Nam.setSelected(true);
            } else {
                radio_Nu.setSelected(true);
            }

            Employee ee = nhanVienDao.findEmployeeByID(ma);
            txt_email.setText(ee.getEmail());
            txt_SoDienThoai.setText(ee.getSoDienThoai());
            std = ee.getSoDienThoai();
            double luong = ee.getLuong();
            txt_luong.setText(luong + "");

            String ca = ee.getCaLamViec();
            if (ca.equalsIgnoreCase("4 Tiếng")) {
                cmb_CaLamViec.setSelectedIndex(0);
            } else if (ca.equalsIgnoreCase("8 Tiếng")) {
                cmb_CaLamViec.setSelectedIndex(1);
            } else {
                cmb_CaLamViec.setSelectedIndex(2);
            }

            String cv = ee.getChucVu();
            if (cv.equalsIgnoreCase("Nhân Viên Tiếp Tân")) {
                cmb_ChucVu.setSelectedIndex(0);
            } else if (cv.equalsIgnoreCase("Nhân Viên Phục Vụ")) {
                cmb_ChucVu.setSelectedIndex(1);
            } else {
                cmb_ChucVu.setSelectedIndex(2);
            }

            String tt = ee.getTrangThai();

            if (tt.equalsIgnoreCase("Đang Làm")) {
                cmb_TrangThai.setSelectedIndex(0);
            } else {
                cmb_TrangThai.setSelectedIndex(1);
            }

            LocalDateTime ns = ee.getNgaySinh();
            Date d = Date.from(ns.atZone(ZoneId.systemDefault()).toInstant());
            jdc_ngaySinh.setDate(d);

//            ImageIcon icon = new ImageIcon(getClass().getResource(food.getImg()));
//            ImageIcon resizedIcon = resizeImageIcon(icon, lbl_AnhSanPham.getWidth(), lbl_AnhSanPham.getWidth());
            ImageIcon icon = new ImageIcon(ee.getAnhNhanVien());
            ImageIcon resizedIcon = resizeImageIcon(icon, lbl_AnhNhanVienChen.getWidth(), lbl_AnhNhanVienChen.getWidth());
            lbl_AnhNhanVienChen.setIcon(resizedIcon);

            txt_CCCD.setText(table_DanhSachNhanVien.getValueAt(r, 3).toString());

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            String ngayVL = table_DanhSachNhanVien.getValueAt(r, 4).toString();
            lbl_ngayLam.setText(ngayVL);

        }
    }//GEN-LAST:event_table_DanhSachNhanVienMouseClicked

    private void btn_xoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaTrangActionPerformed
        xoaTrang();
    }//GEN-LAST:event_btn_xoaTrangActionPerformed

    private void btn_CapNhatNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatNhanVienActionPerformed

        if (!std.equalsIgnoreCase(txt_SoDienThoai.getText()) && nhanVienDao.findEmployeeByPhone(txt_SoDienThoai.getText()) != null) {
            JOptionPane.showMessageDialog(null, "Số điện thoại đã được sử dụng");
            txt_SoDienThoai.selectAll();
            txt_SoDienThoai.requestFocus();
        } else {
            Employee e = createEmployeeUpdate();
            boolean kt = nhanVienDao.capNhatNhanVien(e);
            int trangThai = cmb_TrangThai.getSelectedIndex();
            if (kt == true) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                if (trangThai == 1) {
                    aDao.updateTrangThai(2, e.getMaNhanVien());
                } else if (trangThai == 0) {
                    aDao.updateTrangThai(1, e.getMaNhanVien());
                }
                xoaDLTrenTable();
                docDuLieuSQLToTable();

            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
            }
        }

    }//GEN-LAST:event_btn_CapNhatNhanVienActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        // TODO add your handling code here:
        String tim = txt_TimKiem.getText();
        List<Employee> dsNV = nhanVienDao.findEmployee(tim);
        xoaDLTrenTable();

        docDuLieuSQLToTable2(dsNV);
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void btn_ThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemNhanVienActionPerformed

        themNhanVien();

    }//GEN-LAST:event_btn_ThemNhanVienActionPerformed

    
    public void themSetCung() {
        createIdNhanVien("NVTT");
        txt_TenNhanVien.setText("Nguyễn Văn Hiếu");
        txt_email.setText("Hieu123@gmail.com");
        lbl_AnhNhanVienChen.setIcon(null);
        cmb_CaLamViec.setSelectedIndex(0);
        cmb_ChucVu.setSelectedIndex(0);
        cmb_TrangThai.setSelectedIndex(0);
        txt_SoDienThoai.setText("0935874612");
        txt_luong.setText("20000");
        txt_CCCD.setText("080203005698");

    }
    private void cmb_LocChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_LocChucVuActionPerformed
        int chucVu = cmb_LocChucVu.getSelectedIndex();
        List<Employee> dsNV = new ArrayList<>();
        if (chucVu == 1) {
            dsNV = nhanVienDao.findEmployeeChucVu("Nhân Viên Tiếp Tân");
        } else if (chucVu == 2) {
            dsNV = nhanVienDao.findEmployeeChucVu("Nhân Viên Phục Vụ");
        } else if (chucVu == 3) {
            dsNV = nhanVienDao.findEmployeeChucVu("Nhân Viên Quản Lý");
        }

        cmb_LocCaLamViec.setSelectedIndex(0);
        cmb_LocGioiTinh.setSelectedIndex(0);
        cmb_LocTrangThai.setSelectedIndex(0);

        xoaDLTrenTable();
        docDuLieuSQLToTable2(dsNV);
        table_DanhSachNhanVien.revalidate();
        table_DanhSachNhanVien.repaint();
    }//GEN-LAST:event_cmb_LocChucVuActionPerformed

    private void btn_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LocActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_LocActionPerformed

    private void cmb_LocGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_LocGioiTinhActionPerformed
        // TODO add your handling code here:
        int gioiTinh = cmb_LocGioiTinh.getSelectedIndex();
        List<Employee> dsNV = new ArrayList<>();
        if (gioiTinh == 1) {
            dsNV = nhanVienDao.findEmployeeGioiTinh(0);
        } else if (gioiTinh == 2) {
            dsNV = nhanVienDao.findEmployeeGioiTinh(1);
        }

        cmb_LocCaLamViec.setSelectedIndex(0);
        cmb_LocChucVu.setSelectedIndex(0);
        cmb_LocTrangThai.setSelectedIndex(0);

        xoaDLTrenTable();
        docDuLieuSQLToTable2(dsNV);
        table_DanhSachNhanVien.revalidate();
        table_DanhSachNhanVien.repaint();
    }//GEN-LAST:event_cmb_LocGioiTinhActionPerformed

    private void cmb_LocCaLamViecItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_LocCaLamViecItemStateChanged

    }//GEN-LAST:event_cmb_LocCaLamViecItemStateChanged

    public static ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    public Employee createEmployeeUpdate() {
        Employee nv = new Employee();

        nv.setMaNhanVien(txt_MaNhanVien.getText());
        nv.setTenNhanVien(txt_TenNhanVien.getText());

        if (radio_Nam.isSelected()) {
            nv.setGioiTinh(0); //nam
        } else {
            nv.setGioiTinh(1);
        }

        Date ngaySinh = jdc_ngaySinh.getDate();
        LocalDateTime ngaySinhLocalDateTime = ngaySinh.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        nv.setNgaySinh(ngaySinhLocalDateTime);

        nv.setNgayVaoLam(now);
        nv.setEmail(txt_email.getText());
        nv.setAnhNhanVien(duongDanAnh);
        nv.setSoDienThoai(txt_SoDienThoai.getText());
        double luong = Double.parseDouble(txt_luong.getText());
        nv.setLuong(luong);
        nv.setCCCD(txt_CCCD.getText());
        nv.setCaLamViec((String) cmb_CaLamViec.getSelectedItem());
        nv.setChucVu((String) cmb_ChucVu.getSelectedItem());
        nv.setTrangThai((String) cmb_TrangThai.getSelectedItem());
        return nv;
    }

    public void xoaTrang() {
        txt_MaNhanVien.setText(" ");
        createIdNhanVien("NVTT");
        txt_TenNhanVien.setText(" ");
        txt_email.setText(" ");
        lbl_AnhNhanVienChen.setIcon(null);
        cmb_CaLamViec.setSelectedIndex(0);
        cmb_ChucVu.setSelectedIndex(0);
        cmb_TrangThai.setSelectedIndex(0);
        txt_SoDienThoai.setText(" ");
        txt_luong.setText(" ");
        txt_CCCD.setText(" ");

    }

    public void setColorButon() {
        btn_ThemNhanVien.setBackground(Color.WHITE);
        btn_CapNhatNhanVien.setBackground(Color.WHITE);
        btn_xoaTrang.setBackground(Color.WHITE);
        btn_LamMoi.setBackground(Color.WHITE);
        btn_Loc.setBackground(Color.WHITE);
        btn_timKiem.setBackground(Color.WHITE);
    }

    public void themNhanVien() {
        boolean kt = true;

        // Lấy ngày hiện tại
        Calendar now = Calendar.getInstance();

        // Tính ngày trước 18 năm
        Calendar ngayHienTaiTru18Nam = Calendar.getInstance();
        ngayHienTaiTru18Nam.add(Calendar.YEAR, -18);

        if (txt_TenNhanVien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên Nhân Viên Không Được Trống");
            txt_TenNhanVien.requestFocus();
            kt = false;
        }

        if (kt == true) {
            Date ngaySinh = jdc_ngaySinh.getDate();
            if (ngaySinh == null) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày sinh");
                kt = false;
            } else {
                Calendar ngaySinhCalendar = Calendar.getInstance();
                ngaySinhCalendar.setTime(ngaySinh);

                if (ngaySinhCalendar.after(ngayHienTaiTru18Nam)) {
                    JOptionPane.showMessageDialog(null, "Nhân viên chưa đủ 18 tuổi");
                    kt = false;
                }
            }
        }

        if (kt == true && txt_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Email Không Được Trống");
            txt_email.requestFocus();
            kt = false;
        } else if (kt == true && !txt_email.getText().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$")) {
            JOptionPane.showMessageDialog(null, "Email không hợp lệ");
            txt_email.requestFocus();
            kt = false;
        }

        if (kt == true && txt_SoDienThoai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Số Điện Thoại Không Được Trống");
            txt_SoDienThoai.requestFocus();
            kt = false;
        } else if (kt == true && !txt_SoDienThoai.getText().matches("(^(03)[2-9]\\d{7})|(^(07)[06-9]\\d{7})|(^(08)[1-5]\\d{7})|(^(056)\\d{7})|(^(058)\\d{7})|(^(059)\\d{7})|(^(09)[0-46-9]\\d{7})")) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không đúng định dạng. Số điện thoại: Bắt đầu 03, 07, 08, 056, 058, 059, 09 và có 10 chữ số");
            txt_SoDienThoai.selectAll();
            txt_SoDienThoai.requestFocus();
            kt = false;
        } else if (kt == true && nhanVienDao.findEmployeeByPhone(txt_SoDienThoai.getText()) != null) {
            JOptionPane.showMessageDialog(null, "Số điện thoại đã được sử dụng");
            txt_SoDienThoai.selectAll();
            txt_SoDienThoai.requestFocus();
            kt = false;
        }

        if (kt == true && txt_luong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lương Không Được Trống");
            txt_luong.requestFocus();
            kt = false;
        } else if (kt == true) {
            boolean showError = false; // Biến cờ để kiểm tra xem đã hiển thị thông báo lỗi chưa

            try {
                double d = Double.parseDouble(txt_luong.getText());
                if (d < 0) {
                    JOptionPane.showMessageDialog(null, "Lương Không Được Nhỏ Hơn 0");
                    txt_luong.requestFocus();
                    showError = true;
                    kt = false;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Lương phải là số");
                txt_luong.requestFocus();
                showError = true;
                kt = false;
            }

        }

        if (kt == true && txt_CCCD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CMND/CCCD Không Được Trống");
            txt_CCCD.requestFocus();
            kt = false;
        } else if (kt == true && !txt_CCCD.getText().matches("^\\d{8}$|^\\d{12}$")) {
            JOptionPane.showMessageDialog(null, "CMND/CCCD phải chứa 8 hoặc 12 chữ số");
            txt_CCCD.requestFocus();
            kt = false;
        }

        if (kt == true && lbl_AnhNhanVienChen.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "Ảnh không được trống");
            kt = false;
        }

        if (kt == true) {
            Employee e = createNhanVien();
            boolean ktThem = nhanVienDao.themNhanVien(e);
            if (ktThem) {
                JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công");
                xoaDLTrenTable();
                docDuLieuSQLToTable();
                table_DanhSachNhanVien.revalidate();
                xoaTrang();
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
            aDao.createAccout(e);
        }
    }

    public Employee createNhanVien() {

        Employee nv = new Employee();

        Employee e = nhanVienDao.findEmployeeByID(txt_MaNhanVien.getText());
        if (e == null) {
            nv.setMaNhanVien(txt_MaNhanVien.getText());
            nv.setTenNhanVien(txt_TenNhanVien.getText());
            if (radio_Nam.isSelected()) {
                nv.setGioiTinh(0); //nam
            } else {
                nv.setGioiTinh(1);
            }
            Date ngaySinh = jdc_ngaySinh.getDate();
            LocalDateTime ngaySinhLocalDateTime = ngaySinh.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

            nv.setNgaySinh(ngaySinhLocalDateTime);

            nv.setNgayVaoLam(now);
            nv.setEmail(txt_email.getText());
            nv.setAnhNhanVien(duongDanAnh);
            nv.setSoDienThoai(txt_SoDienThoai.getText());
            double luong = Double.parseDouble(txt_luong.getText());
            nv.setLuong(luong);
            nv.setCCCD(txt_CCCD.getText());
            nv.setCaLamViec((String) cmb_CaLamViec.getSelectedItem());
            nv.setChucVu((String) cmb_ChucVu.getSelectedItem());
            nv.setTrangThai((String) cmb_TrangThai.getSelectedItem());
            return nv;
        } else {
            JOptionPane.showMessageDialog(null, "Nhân viên đã tồn tại. Thêm thất bại.");
            return null;
        }
    }

    public void xoaDLTrenTable() {
        modelNhanVien.getDataVector().removeAllElements();
    }

    public Object[] getObjNhanVien(Employee nv) {
        String gioiTinh = "";
        if (nv.getGioiTinh() == 0) {
            gioiTinh = "Nam";
        } else {
            gioiTinh = "Nữ";
        }
        String ngayVaolam = nv.getNgayVaoLam().getDayOfMonth() + "-" + nv.getNgayVaoLam().getMonthValue() + "-" + nv.getNgayVaoLam().getYear();

        Object[] obj = {nv.getMaNhanVien(), nv.getTenNhanVien(), gioiTinh, nv.getCCCD(), ngayVaolam};
        return obj;
    }

    public void docDuLieuSQLToTable() {
        List<Employee> dsNV = nhanVienDao.getTatCaNhanVien();
        if (dsNV.size() > 0) {
            for (Employee e : dsNV) {
                modelNhanVien.addRow(getObjNhanVien(e));
            }
        }
    }

    public void docDuLieuSQLToTable2(List<Employee> dsNV) {

        if (dsNV.size() > 0) {
            for (Employee e : dsNV) {
                modelNhanVien.addRow(getObjNhanVien(e));
            }
        }
    }

    public void createIdNhanVien(String loaiNV) {

        String ma = nhanVienDao.lay3SoCuoiMa(loaiNV);

        if (ma.equalsIgnoreCase("000")) {
            txt_MaNhanVien.setText(loaiNV + "001");
        } else {
            int maInt = Integer.parseInt(ma);
            maInt = maInt + 1;
            if (maInt < 10) {
                txt_MaNhanVien.setText(loaiNV + "00" + maInt);
            } else if (maInt >= 10 && maInt <= 99) {
                txt_MaNhanVien.setText(loaiNV + "0" + maInt);
            } else if (maInt >= 100 && maInt <= 999) {
                txt_MaNhanVien.setText(loaiNV + maInt);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhatNhanVien;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Loc;
    private javax.swing.JButton btn_ThemNhanVien;
    private javax.swing.JButton btn_chonAnh;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoaTrang;
    private javax.swing.JComboBox<String> cmb_CaLamViec;
    private javax.swing.JComboBox<String> cmb_ChucVu;
    private javax.swing.JComboBox<String> cmb_LocCaLamViec;
    private javax.swing.JComboBox<String> cmb_LocChucVu;
    private javax.swing.JComboBox<String> cmb_LocGioiTinh;
    private javax.swing.JComboBox<String> cmb_LocTrangThai;
    private javax.swing.JComboBox<String> cmb_TrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane_DanhSachNhanVien;
    private com.toedter.calendar.JDateChooser jdc_ngaySinh;
    private javax.swing.JLabel lbl_AnhNhanVienChen;
    private javax.swing.JLabel lbl_CCCD;
    private javax.swing.JLabel lbl_CaLamViec;
    private javax.swing.JLabel lbl_ChucVu;
    private javax.swing.JLabel lbl_GioiTinh;
    private javax.swing.JLabel lbl_Luong;
    private javax.swing.JLabel lbl_MaNhanVien;
    private javax.swing.JLabel lbl_NgaySinh;
    private javax.swing.JLabel lbl_NgaySinh1;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_TenNhanVien;
    private javax.swing.JLabel lbl_TrangThai;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_ngayLam;
    private javax.swing.JPanel pnl_Center;
    private javax.swing.JPanel pnl_ChucNang;
    private javax.swing.JPanel pnl_DanhSachNhanVien;
    private javax.swing.JPanel pnl_Loc;
    private javax.swing.JPanel pnl_thongTinNhanVien;
    private javax.swing.JRadioButton radio_Nam;
    private javax.swing.JRadioButton radio_Nu;
    private javax.swing.JTable table_DanhSachNhanVien;
    private javax.swing.JTextField txt_CCCD;
    private javax.swing.JTextField txt_MaNhanVien;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_TenNhanVien;
    private javax.swing.JTextField txt_TimKiem;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_luong;
    // End of variables declaration//GEN-END:variables

}
