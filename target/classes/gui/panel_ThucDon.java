/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.CategoryDao;
import dao.FoodDao;
import entity.Category;
import entity.Food;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import util.AppUltil;

/**
 *
 * @author PC
 */
public class panel_ThucDon extends javax.swing.JPanel {

    private final CategoryDao categoryDao;
    private final FoodDao foodDao;
    private final DefaultTableModel modelThucDon;
    private String duongDanAnh;
    private boolean flat = true;
    private String danhMucBanDau;

    public panel_ThucDon() {
       
        initComponents();
        designTable();
        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 0, 200, 1);
        jsp_SoLuong.setModel(spinnerModel);
        categoryDao = new CategoryDao(AppUltil.initDriver(), "quanliquanan");
        foodDao = new FoodDao(AppUltil.initDriver(), "quanliquanan");
        modelThucDon = (DefaultTableModel) table_DSSP.getModel();
        createIdFood("DR");
        docDuLieuVaoCombobox();
        docDLLenTable();
        setColorButon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Center = new javax.swing.JPanel();
        pnl_TimKiem = new javax.swing.JPanel();
        btn_TimKiem = new javax.swing.JButton();
        txt_TimKiem = new javax.swing.JTextField();
        cmb_LocDanhMuc = new javax.swing.JComboBox<>();
        cmb_LocTrangThai = new javax.swing.JComboBox<>();
        cmb_soLuong = new javax.swing.JComboBox<>();
        pnl_ChucNang = new javax.swing.JPanel();
        btn_ThemMon = new javax.swing.JButton();
        btn_CapNhatMon = new javax.swing.JButton();
        btn_XoaMon = new javax.swing.JButton();
        btn_XoaTrang = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        pnl_North = new javax.swing.JPanel();
        lbl_MaSanpham = new javax.swing.JLabel();
        txt_MaSanPham = new javax.swing.JTextField();
        lbl_TenSanpham = new javax.swing.JLabel();
        txt_TenSanPham = new javax.swing.JTextField();
        lbl_DonGia = new javax.swing.JLabel();
        txt_DonGia = new javax.swing.JTextField();
        lbl_SoLuong = new javax.swing.JLabel();
        jsp_SoLuong = new javax.swing.JSpinner();
        lbl_TrangThai = new javax.swing.JLabel();
        cmb_TrangThai = new javax.swing.JComboBox<>();
        lbl_AnhSanPham = new javax.swing.JLabel();
        btn_chonAnh = new javax.swing.JButton();
        lbl_DanhMuc = new javax.swing.JLabel();
        cmb_DanhMuc = new javax.swing.JComboBox<>();
        pnl_DSSP = new javax.swing.JPanel();
        jsp_DSSP = new javax.swing.JScrollPane();
        table_DSSP = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        pnl_Center.setPreferredSize(new java.awt.Dimension(1296, 150));

        pnl_TimKiem.setBackground(new java.awt.Color(255, 255, 255));
        pnl_TimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnl_TimKiem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_TimKiem.setBackground(new java.awt.Color(102, 153, 255));
        btn_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_TimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/search.png"))); // NOI18N
        btn_TimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });
        pnl_TimKiem.add(btn_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 16, 48, 42));

        txt_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_TimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TimKiemActionPerformed(evt);
            }
        });
        txt_TimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_TimKiemKeyPressed(evt);
            }
        });
        pnl_TimKiem.add(txt_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 16, 377, 42));

        cmb_LocDanhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danh Mục" }));
        cmb_LocDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_LocDanhMucActionPerformed(evt);
            }
        });
        pnl_TimKiem.add(cmb_LocDanhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 76, 124, 40));

        cmb_LocTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trạng Thái", "Đang Kinh Doanh", "Ngừng Kinh Doanh" }));
        cmb_LocTrangThai.setPreferredSize(new java.awt.Dimension(136, 40));
        cmb_LocTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_LocTrangThaiActionPerformed(evt);
            }
        });
        pnl_TimKiem.add(cmb_LocTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 76, 124, -1));

        cmb_soLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Số lượng", "Còn ", "Hết" }));
        cmb_soLuong.setPreferredSize(new java.awt.Dimension(100, 40));
        cmb_soLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_soLuongActionPerformed(evt);
            }
        });
        pnl_TimKiem.add(cmb_soLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 76, 124, -1));

        pnl_ChucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnl_ChucNang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        pnl_ChucNang.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 50));

        btn_ThemMon.setBackground(new java.awt.Color(0, 51, 255));
        btn_ThemMon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ThemMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/plus.png"))); // NOI18N
        btn_ThemMon.setText("THÊM");
        btn_ThemMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_ThemMon.setPreferredSize(new java.awt.Dimension(125, 40));
        btn_ThemMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemMonActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_ThemMon);

        btn_CapNhatMon.setBackground(new java.awt.Color(0, 51, 255));
        btn_CapNhatMon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_CapNhatMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/update.png"))); // NOI18N
        btn_CapNhatMon.setText("CẬP NHẬT");
        btn_CapNhatMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_CapNhatMon.setPreferredSize(new java.awt.Dimension(125, 40));
        btn_CapNhatMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatMonActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_CapNhatMon);

        btn_XoaMon.setBackground(new java.awt.Color(0, 51, 255));
        btn_XoaMon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_XoaMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/remove.png"))); // NOI18N
        btn_XoaMon.setText("XÓA");
        btn_XoaMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_XoaMon.setPreferredSize(new java.awt.Dimension(125, 40));
        btn_XoaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaMonActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_XoaMon);

        btn_XoaTrang.setBackground(new java.awt.Color(0, 51, 255));
        btn_XoaTrang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_XoaTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/eraser.png"))); // NOI18N
        btn_XoaTrang.setText("XÓA TRẮNG");
        btn_XoaTrang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_XoaTrang.setPreferredSize(new java.awt.Dimension(130, 40));
        btn_XoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaTrangActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_XoaTrang);

        btn_LamMoi.setBackground(new java.awt.Color(0, 51, 255));
        btn_LamMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/reset.png"))); // NOI18N
        btn_LamMoi.setText("LÀM MỚI");
        btn_LamMoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_LamMoi.setPreferredSize(new java.awt.Dimension(130, 40));
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        pnl_ChucNang.add(btn_LamMoi);

        javax.swing.GroupLayout pnl_CenterLayout = new javax.swing.GroupLayout(pnl_Center);
        pnl_Center.setLayout(pnl_CenterLayout);
        pnl_CenterLayout.setHorizontalGroup(
            pnl_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CenterLayout.createSequentialGroup()
                .addComponent(pnl_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnl_ChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_CenterLayout.setVerticalGroup(
            pnl_CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_TimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_ChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        add(pnl_Center, java.awt.BorderLayout.CENTER);

        pnl_North.setBackground(new java.awt.Color(204, 204, 204));
        pnl_North.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lbl_MaSanpham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_MaSanpham.setText("Mã Sản Phẩm: ");

        txt_MaSanPham.setEditable(false);
        txt_MaSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_MaSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_MaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaSanPhamActionPerformed(evt);
            }
        });

        lbl_TenSanpham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_TenSanpham.setText("Tên Sản Phẩm: ");

        txt_TenSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_TenSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_TenSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenSanPhamActionPerformed(evt);
            }
        });

        lbl_DonGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_DonGia.setText("Đơn Giá:");

        txt_DonGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_DonGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_DonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DonGiaActionPerformed(evt);
            }
        });

        lbl_SoLuong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_SoLuong.setText("Số Lượng:");

        jsp_SoLuong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbl_TrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_TrangThai.setText("Trạng Thái:");

        cmb_TrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_TrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Kinh Doanh", "Ngừng Kinh Doanh" }));
        cmb_TrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TrangThaiActionPerformed(evt);
            }
        });

        lbl_AnhSanPham.setBackground(new java.awt.Color(255, 255, 255));
        lbl_AnhSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lbl_AnhSanPham.setOpaque(true);

        btn_chonAnh.setBackground(new java.awt.Color(0, 51, 255));
        btn_chonAnh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_chonAnh.setForeground(new java.awt.Color(255, 255, 255));
        btn_chonAnh.setText("CHỌN ẢNH");
        btn_chonAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_chonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chonAnhActionPerformed(evt);
            }
        });

        lbl_DanhMuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_DanhMuc.setText("Danh Mục: ");

        cmb_DanhMuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_DanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_DanhMucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_NorthLayout = new javax.swing.GroupLayout(pnl_North);
        pnl_North.setLayout(pnl_NorthLayout);
        pnl_NorthLayout.setHorizontalGroup(
            pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NorthLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_NorthLayout.createSequentialGroup()
                        .addComponent(lbl_TenSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_TenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_NorthLayout.createSequentialGroup()
                        .addComponent(lbl_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_NorthLayout.createSequentialGroup()
                        .addComponent(lbl_MaSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_MaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138)
                .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_chonAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_AnhSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addGap(140, 140, 140)
                .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_DanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_SoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(lbl_TrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsp_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_DanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 72, Short.MAX_VALUE))
        );
        pnl_NorthLayout.setVerticalGroup(
            pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NorthLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsp_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_NorthLayout.createSequentialGroup()
                        .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_TrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(cmb_DanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(pnl_NorthLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lbl_DanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnl_NorthLayout.createSequentialGroup()
                .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_NorthLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_MaSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_TenSanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnl_NorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_NorthLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_AnhSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnl_North, java.awt.BorderLayout.NORTH);

        pnl_DSSP.setBackground(new java.awt.Color(255, 255, 255));
        pnl_DSSP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        pnl_DSSP.setPreferredSize(new java.awt.Dimension(1296, 329));

        jsp_DSSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsp_DSSPMouseClicked(evt);
            }
        });

        table_DSSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Đơn Giá", "Số Lượng", "Trạng Thái"
            }
        ));
        table_DSSP.setRowHeight(30);
        table_DSSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DSSPMouseClicked(evt);
            }
        });
        jsp_DSSP.setViewportView(table_DSSP);

        javax.swing.GroupLayout pnl_DSSPLayout = new javax.swing.GroupLayout(pnl_DSSP);
        pnl_DSSP.setLayout(pnl_DSSPLayout);
        pnl_DSSPLayout.setHorizontalGroup(
            pnl_DSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp_DSSP, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE)
        );
        pnl_DSSPLayout.setVerticalGroup(
            pnl_DSSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsp_DSSP, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );

        add(pnl_DSSP, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_XoaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaMonActionPerformed
        // TODO add your handling code here:
        int[] selectedRows = table_DSSP.getSelectedRows();

        if (selectedRows.length > 1) {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa các món được chọn", "Xóa thực đơn", JOptionPane.YES_NO_OPTION,
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                for (int i = selectedRows.length - 1; i >= 0; i--) {

                    String ma = table_DSSP.getValueAt(selectedRows[i], 0).toString();

                    foodDao.deleteFood(ma);
                }
                xoaDLTrenTable();
                docDLLenTable();
                xoaTrang();
            }
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa món được chọn", "Xóa thực đơn", JOptionPane.YES_NO_OPTION,
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                for (int i = selectedRows.length - 1; i >= 0; i--) {
                    String ma = table_DSSP.getValueAt(selectedRows[i], 0).toString();

                    foodDao.deleteFood(ma);
                }
                xoaDLTrenTable();
                docDLLenTable();
                xoaTrang();
            }

        }

    }//GEN-LAST:event_btn_XoaMonActionPerformed
    public void setColorButon() {
        btn_LamMoi.setBackground(Color.WHITE);
        btn_CapNhatMon.setBackground(Color.WHITE);
        btn_ThemMon.setBackground(Color.WHITE);
        btn_XoaTrang.setBackground(Color.WHITE);
        btn_XoaMon.setBackground(Color.WHITE);
    }
    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        flat = true;
        taoID();
        xoaTrang();
        xoaDLTrenTable();
        docDLLenTable();
        table_DSSP.revalidate();
        table_DSSP.repaint();
        txt_TimKiem.setText("");
    }//GEN-LAST:event_btn_LamMoiActionPerformed


    private void btn_chonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chonAnhActionPerformed

        String duongDanProject = System.getProperty("user.dir");
        String duongDanThuMuc = duongDanProject + "\\src\\main\\java\\Menu Sashimi";
        JFileChooser fileChooser = new JFileChooser(duongDanThuMuc);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Tập tin ảnh", "jpg", "jpeg", "png", "gif"));
        int option = fileChooser.showOpenDialog(panel_ThucDon.this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            duongDanAnh = selectedFile.getAbsolutePath();
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
            ImageIcon resizedIcon = resizeImageIcon(icon, lbl_AnhSanPham.getWidth(), lbl_AnhSanPham.getWidth());
            lbl_AnhSanPham.setIcon(resizedIcon);
        } else {
            lbl_AnhSanPham.setIcon(null);
        }
    }//GEN-LAST:event_btn_chonAnhActionPerformed

    private void txt_DonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DonGiaActionPerformed

    private void txt_TenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenSanPhamActionPerformed

    private void txt_MaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaSanPhamActionPerformed

    private void cmb_TrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TrangThaiActionPerformed

    }//GEN-LAST:event_cmb_TrangThaiActionPerformed

    private void btn_ThemMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemMonActionPerformed
        // TODO add your handling code here:
        themThucDon();

    }//GEN-LAST:event_btn_ThemMonActionPerformed

    private void btn_XoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaTrangActionPerformed
        flat = true;
        xoaTrang();
        createIdFood("DR");
    }//GEN-LAST:event_btn_XoaTrangActionPerformed

    private void cmb_DanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_DanhMucActionPerformed
        if (flat) {
            String loaiDM = (String) cmb_DanhMuc.getSelectedItem();
            String maDM = categoryDao.getIdByCategoryName(loaiDM);
            createIdFood(maDM);
        }
    }//GEN-LAST:event_cmb_DanhMucActionPerformed

    private void jsp_DSSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsp_DSSPMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jsp_DSSPMouseClicked

    private void table_DSSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DSSPMouseClicked
        // TODO add your handling code here:
        flat = false;
        int r = table_DSSP.getSelectedRow();
        if (r != -1) {
            String ma = table_DSSP.getValueAt(r, 0).toString();
            txt_MaSanPham.setText(table_DSSP.getValueAt(r, 0).toString());
            txt_TenSanPham.setText(table_DSSP.getValueAt(r, 1).toString());

            Food food = foodDao.findFoodByID(ma);
            double donGia = food.getPrice();
            txt_DonGia.setText(donGia + "");

            ImageIcon icon = new ImageIcon(getClass().getResource(food.getImg()));
            duongDanAnh = food.getImg();

            ImageIcon resizedIcon = resizeImageIcon(icon, lbl_AnhSanPham.getWidth(), lbl_AnhSanPham.getWidth());
            lbl_AnhSanPham.setIcon(resizedIcon);

            String trangThai = food.getTrangThai();
            if (trangThai.equalsIgnoreCase("Đang Kinh Doanh")) {
                cmb_TrangThai.setSelectedIndex(0);
            } else {
                cmb_TrangThai.setSelectedIndex(1);
            }

            String categoryName = categoryDao.findCategoryNameByFoodID(ma);
            danhMucBanDau = categoryName;
            cmb_DanhMuc.setSelectedItem(categoryName);

            String valueAsString = table_DSSP.getValueAt(r, 3).toString();
            int value = Integer.parseInt(valueAsString);
            jsp_SoLuong.setValue(value);

        }
    }//GEN-LAST:event_table_DSSPMouseClicked

    private void btn_CapNhatMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatMonActionPerformed
        foodDao.deleteFood(txt_MaSanPham.getText());
        updateThucDon();
        btn_LamMoi.doClick();
    }//GEN-LAST:event_btn_CapNhatMonActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        // TODO add your handling code here:
        if (txt_TimKiem.getText().isEmpty()) {
            xoaDLTrenTable();
            docDLLenTable();
        } else {
            String tim = txt_TimKiem.getText();
            List<Food> dsFood = foodDao.findFood(tim);
            if (dsFood.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại !!!");
                txt_TimKiem.setText("");
            } else {
                xoaDLTrenTable();
                docDuLieuSQLToTable2(dsFood);
            }
        }


    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void cmb_LocTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_LocTrangThaiActionPerformed
        // TODO add your handling code here:
        int trangThai = cmb_LocTrangThai.getSelectedIndex();
        List<Food> dsTD = new ArrayList<>();
        if (trangThai == 1) {
            dsTD = foodDao.findFoodTrangThai(1);
        } else if (trangThai == 2) {
            dsTD = foodDao.findFoodTrangThai(2);
        } else {

        }

        xoaDLTrenTable();
        docDuLieuSQLToTable2(dsTD);
        table_DSSP.revalidate();
        table_DSSP.repaint();
    }//GEN-LAST:event_cmb_LocTrangThaiActionPerformed

    private void cmb_soLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_soLuongActionPerformed
        // TODO add your handling code here:
        int soLuong = cmb_soLuong.getSelectedIndex();
        List<Food> dsSL = new ArrayList<>();
        if (soLuong == 1) {  //còn
            dsSL = foodDao.findFoodCon();
        } else if (soLuong == 2) {
            dsSL = foodDao.findFoodHet();
        } else {

        }

        xoaDLTrenTable();
        docDuLieuSQLToTable2(dsSL);
        table_DSSP.revalidate();
        table_DSSP.repaint();
    }//GEN-LAST:event_cmb_soLuongActionPerformed

    private void cmb_LocDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_LocDanhMucActionPerformed
        List<Food> dsF = foodDao.getFoodByCategoryName((String) cmb_LocDanhMuc.getSelectedItem());

        xoaDLTrenTable();
        docDuLieuSQLToTable2(dsF);
        table_DSSP.revalidate();
        table_DSSP.repaint();
    }//GEN-LAST:event_cmb_LocDanhMucActionPerformed

    private void txt_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TimKiemActionPerformed

    }//GEN-LAST:event_txt_TimKiemActionPerformed

    private void txt_TimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TimKiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt_TimKiem.getText().isEmpty()) {
                xoaDLTrenTable();
                docDLLenTable();
            } else {
                String tim = txt_TimKiem.getText();
                List<Food> dsFood = foodDao.findFood(tim);
                xoaDLTrenTable();
                docDuLieuSQLToTable2(dsFood);
            }
        }
    }//GEN-LAST:event_txt_TimKiemKeyPressed

    
    
    public void taoID() {
        if (flat) {
            String loaiDM = (String) cmb_DanhMuc.getSelectedItem();
            String maDM = categoryDao.getIdByCategoryName(loaiDM);
            createIdFood(maDM);
        }
    }

//    public Food createFoodUpdate() {
//        Food f = new Food();
//        f.setFoodID(txt_MaSanPham.getText());
//        f.setFoodName(txt_TenSanPham.getText());
//        double donGia = Double.parseDouble(txt_DonGia.getText());
//        f.setPrice(donGia);
//
//        f.setImg(duongDanAnh);
//
//        int soLuong = (int) jsp_SoLuong.getValue();
//        f.setSoLuong(soLuong);
//        f.setTrangThai((String) cmb_TrangThai.getSelectedItem());
//
//        return f;
//    }
    public void designTable() {
        table_DSSP.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_DSSP.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    //=============================================================================================//
    public static ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    //=============================================================================================//
    public void xoaTrang() {
        txt_MaSanPham.setText(" ");
        txt_TenSanPham.setText(" ");
        txt_DonGia.setText(" ");
        lbl_AnhSanPham.setIcon(null);
        jsp_SoLuong.setValue(1);
    }

    //=============================================================================================//
    public void docDuLieuVaoCombobox() {
        List<Category> ds = categoryDao.getAllCategory();
        for (Category c : ds) {
            cmb_DanhMuc.addItem(c.getCategoryName());
            cmb_LocDanhMuc.addItem(c.getCategoryName());
        }
    }

    //=============================================================================================//
    public void themThucDon() {
        int kt = 0;
        if (txt_TenSanPham.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên Sản Phẩm Không Được Trống");
            txt_TenSanPham.requestFocus();
            kt++;
        }

        if (kt == 0 && txt_DonGia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Giá Sản Phẩm Không Được Trống");
            txt_TenSanPham.requestFocus();
            kt++;
        } else if (kt == 0) {
            try {
                double giaDouble = Double.parseDouble(txt_DonGia.getText());
                if (giaDouble <= 0) {
                    JOptionPane.showMessageDialog(null, "Giá Sản Phẩm Phải Lớn Hơn 0");
                    txt_TenSanPham.requestFocus();
                    kt++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Giá Sản Phẩm Phải Là Số");
                txt_TenSanPham.requestFocus();
                kt++;
            }
        }

        if (kt == 0 && lbl_AnhSanPham.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "Ảnh không được trống");
            kt++;
        }

        if (kt == 0) {
            Food f = createFood();
            String maDM = categoryDao.getIdByCategoryName((String) cmb_DanhMuc.getSelectedItem());
            boolean ktThem = foodDao.themThucDon(f, maDM);
            if (ktThem) {
                JOptionPane.showMessageDialog(null, "Thêm Thực Đơn thành công");
                xoaTrang();
                xoaDLTrenTable();
                docDLLenTable();
                table_DSSP.revalidate();
                flat = true;
                taoID();
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
        }
    }

    public void updateThucDon() {
        int kt = 0;
        if (txt_TenSanPham.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên Sản Phẩm Không Được Trống");
            txt_TenSanPham.requestFocus();
            kt++;
        }
        String gia = txt_DonGia.getText();
        if (kt == 0 && gia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Giá Sản Phẩm Không Được Trống");
            txt_TenSanPham.requestFocus();
            kt++;
        } else {
            try {
                double giaDouble = Double.parseDouble(gia);
                if (giaDouble <= 0) {
                    JOptionPane.showMessageDialog(null, "Giá Sản Phẩm Phải Lớn Hơn 0");
                    txt_TenSanPham.requestFocus();
                    kt++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Giá Sản Phẩm Phải Là Số");
                txt_TenSanPham.requestFocus();
                kt++;
            }
        }
        if (kt == 0 && lbl_AnhSanPham.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "Ảnh không được trống");
            kt++;
        }

        if (kt == 0) {
            Food f = createFood();
            String maDM = categoryDao.getIdByCategoryName((String) cmb_DanhMuc.getSelectedItem());
            boolean ktThem = foodDao.themThucDon(f, maDM);
            if (ktThem) {
                JOptionPane.showMessageDialog(null, "Cập nhật thực đơn thành công");
                xoaTrang();
                xoaDLTrenTable();
                docDLLenTable();
                table_DSSP.revalidate();
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
            }
        }
    }

    //=============================================================================================//
    public Food createFood() {
        Food f = new Food();
        Food fo = foodDao.findFoodByID(txt_MaSanPham.getText());
        f.setFoodID(txt_MaSanPham.getText());
        f.setFoodName(txt_TenSanPham.getText());

        double donGia = Double.parseDouble(txt_DonGia.getText());
        f.setPrice(donGia);

        int indexOfJava = duongDanAnh.indexOf("java") + "java".length();
        String relativePath = "/" + duongDanAnh.substring(indexOfJava - 3).replace("\\", "/");
        f.setImg(relativePath);
       
        int soLuong = (int) jsp_SoLuong.getValue();
        f.setSoLuong(soLuong);
        f.setTrangThai((String) cmb_TrangThai.getSelectedItem());

        return f;
    }

    //=============================================================================================//
    public void xoaDLTrenTable() {
        modelThucDon.getDataVector().removeAllElements();
    }

    public void docDLLenTable() {
        List<Food> dsFood = foodDao.getAllFood();
        if (dsFood.size() > 0) {
            for (Food f : dsFood) {
                modelThucDon.addRow(getObjFood(f));
            }
        }

    }

    public void docDuLieuSQLToTable2(List<Food> dsFood) {
        if (dsFood.size() > 0) {
            for (Food f : dsFood) {
                modelThucDon.addRow(getObjFood(f));
            }
        }
    }

    public Object[] getObjFood(Food f) {
        double gia = f.getPrice();
        int soLuong = f.getSoLuong();
        Object[] obj = {f.getFoodID(), f.getFoodName(), gia, soLuong, f.getTrangThai()};
        return obj;
    }
    //=============================================================================================//

    public void createIdFood(String loaiSP) {

        String ma = foodDao.lay2SoCuoiMa(loaiSP);
        int maInt = Integer.parseInt(ma) + 1;

        if (ma.equalsIgnoreCase("00")) {
            txt_MaSanPham.setText(loaiSP + "01");
        } else if (maInt > 0 && maInt < 10) {
            txt_MaSanPham.setText(loaiSP + "0" + maInt);
        } else if (maInt >= 10 && maInt <= 99) {
            txt_MaSanPham.setText(loaiSP + maInt);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhatMon;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_ThemMon;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_XoaMon;
    private javax.swing.JButton btn_XoaTrang;
    private javax.swing.JButton btn_chonAnh;
    private javax.swing.JComboBox<String> cmb_DanhMuc;
    private javax.swing.JComboBox<String> cmb_LocDanhMuc;
    private javax.swing.JComboBox<String> cmb_LocTrangThai;
    private javax.swing.JComboBox<String> cmb_TrangThai;
    private javax.swing.JComboBox<String> cmb_soLuong;
    private javax.swing.JScrollPane jsp_DSSP;
    private javax.swing.JSpinner jsp_SoLuong;
    private javax.swing.JLabel lbl_AnhSanPham;
    private javax.swing.JLabel lbl_DanhMuc;
    private javax.swing.JLabel lbl_DonGia;
    private javax.swing.JLabel lbl_MaSanpham;
    private javax.swing.JLabel lbl_SoLuong;
    private javax.swing.JLabel lbl_TenSanpham;
    private javax.swing.JLabel lbl_TrangThai;
    private javax.swing.JPanel pnl_Center;
    private javax.swing.JPanel pnl_ChucNang;
    private javax.swing.JPanel pnl_DSSP;
    private javax.swing.JPanel pnl_North;
    private javax.swing.JPanel pnl_TimKiem;
    private javax.swing.JTable table_DSSP;
    private javax.swing.JTextField txt_DonGia;
    private javax.swing.JTextField txt_MaSanPham;
    private javax.swing.JTextField txt_TenSanPham;
    private javax.swing.JTextField txt_TimKiem;
    // End of variables declaration//GEN-END:variables
}
