/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.EmployeeDao;
import entity.Account;
import entity.Employee;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import util.AppUltil;

public class JFrame_MainNVTT extends javax.swing.JFrame {

    private CardLayout card = null;
    private final Map<JLabel, Boolean> labelStates = new HashMap<>();
    private final Employee nhanVien;
    private final EmployeeDao eDao;

    public JFrame_MainNVTT(Account tk) {
        initComponents();
        eDao = new EmployeeDao(AppUltil.initDriver(), "quanliquanan");
        lbl_maNV.setText(tk.getNhanVien().getMaNhanVien());
        nhanVien = eDao.findEmployeeByID(tk.getNhanVien().getMaNhanVien());
        lbl_tenNhanVien.setText(nhanVien.getTenNhanVien());

        ImageIcon originalIcon = new ImageIcon(nhanVien.getAnhNhanVien());

        ImageIcon resizedIcon = resizeImageIcon(originalIcon, lbl_anhNhanVien.getWidth(), lbl_anhNhanVien.getWidth());
        card = (CardLayout) this.pnl_Main.getLayout();
        lbl_anhNhanVien.setIcon(resizedIcon);
        clearLable();
        pressLable(lbl_trangchu);
        pnl_Main.add(new panel_TrangChu(), "manhinhchinh");
        card.show(this.pnl_Main, "manhinhchinh");

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnl_Chinh = new javax.swing.JPanel();
        pnl_Title = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_anhNhanVien = new javax.swing.JLabel();
        lbl_tenNhanVien = new javax.swing.JLabel();
        lbl_maNV = new javax.swing.JLabel();
        lbl_Menu = new javax.swing.JLabel();
        lbl_sashimiDuo = new javax.swing.JLabel();
        pnl_Center = new javax.swing.JPanel();
        pnl_Menu = new component.JpanelGradient();
        lbl_trangchu = new javax.swing.JLabel();
        lbl_khachHang = new javax.swing.JLabel();
        lbl_troGiup = new javax.swing.JLabel();
        lbl_banHang = new javax.swing.JLabel();
        lbl_hoaDon = new javax.swing.JLabel();
        lbl_DangXuat = new javax.swing.JLabel();
        pnl_Main = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_Chinh.setBackground(new java.awt.Color(204, 255, 255));
        pnl_Chinh.setPreferredSize(new java.awt.Dimension(1000, 600));
        pnl_Chinh.setLayout(new java.awt.BorderLayout());

        pnl_Title.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Title.setPreferredSize(new java.awt.Dimension(556, 55));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));

        lbl_anhNhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_tenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        lbl_maNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(lbl_maNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_anhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(lbl_anhNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lbl_maNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        lbl_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/menu.png"))); // NOI18N
        lbl_Menu.setPreferredSize(new java.awt.Dimension(35, 35));
        lbl_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_MenuMouseClicked(evt);
            }
        });

        lbl_sashimiDuo.setBackground(new java.awt.Color(102, 102, 255));
        lbl_sashimiDuo.setFont(new java.awt.Font("VNI-Viettay", 1, 24)); // NOI18N
        lbl_sashimiDuo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sashimiDuo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sashimiDuo.setText("SASHIMI DUO");
        lbl_sashimiDuo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        lbl_sashimiDuo.setOpaque(true);

        javax.swing.GroupLayout pnl_TitleLayout = new javax.swing.GroupLayout(pnl_Title);
        pnl_Title.setLayout(pnl_TitleLayout);
        pnl_TitleLayout.setHorizontalGroup(
            pnl_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TitleLayout.createSequentialGroup()
                .addComponent(lbl_sashimiDuo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 565, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_TitleLayout.setVerticalGroup(
            pnl_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_TitleLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(lbl_sashimiDuo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_Chinh.add(pnl_Title, java.awt.BorderLayout.NORTH);

        pnl_Center.setLayout(new java.awt.BorderLayout());

        pnl_Menu.setAutoscrolls(true);
        pnl_Menu.setColorEnd(new java.awt.Color(0, 255, 255));
        pnl_Menu.setColorStart(new java.awt.Color(102, 102, 255));
        pnl_Menu.setMinimumSize(new java.awt.Dimension(230, 530));
        pnl_Menu.setPreferredSize(new java.awt.Dimension(170, 530));

        lbl_trangchu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_trangchu.setForeground(new java.awt.Color(255, 255, 255));
        lbl_trangchu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_trangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/home.png"))); // NOI18N
        lbl_trangchu.setText("   Trang chủ");
        lbl_trangchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_trangchuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_trangchuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_trangchuMouseExited(evt);
            }
        });

        lbl_khachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_khachHang.setForeground(new java.awt.Color(255, 255, 255));
        lbl_khachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_khachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/customer.png"))); // NOI18N
        lbl_khachHang.setText("   Khách hàng");
        lbl_khachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_khachHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_khachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_khachHangMouseExited(evt);
            }
        });

        lbl_troGiup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_troGiup.setForeground(new java.awt.Color(255, 255, 255));
        lbl_troGiup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_troGiup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/question.png"))); // NOI18N
        lbl_troGiup.setText("   Trợ giúp");
        lbl_troGiup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_troGiupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_troGiupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_troGiupMouseExited(evt);
            }
        });

        lbl_banHang.setBackground(new java.awt.Color(0, 204, 204));
        lbl_banHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_banHang.setForeground(new java.awt.Color(255, 255, 255));
        lbl_banHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_banHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/coupon.png"))); // NOI18N
        lbl_banHang.setText("   Bán hàng");
        lbl_banHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_banHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_banHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_banHangMouseExited(evt);
            }
        });

        lbl_hoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_hoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_hoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/bill.png"))); // NOI18N
        lbl_hoaDon.setText("   Hóa đơn");
        lbl_hoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_hoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_hoaDonMouseExited(evt);
            }
        });

        lbl_DangXuat.setBackground(new java.awt.Color(255, 0, 0));
        lbl_DangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_DangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lbl_DangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DangXuat.setText("Đăng Xuất");
        lbl_DangXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lbl_DangXuat.setOpaque(true);
        lbl_DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_DangXuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_DangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_DangXuatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_MenuLayout = new javax.swing.GroupLayout(pnl_Menu);
        pnl_Menu.setLayout(pnl_MenuLayout);
        pnl_MenuLayout.setHorizontalGroup(
            pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MenuLayout.createSequentialGroup()
                .addGroup(pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_khachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_hoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_troGiup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_banHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_MenuLayout.createSequentialGroup()
                        .addComponent(lbl_trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_DangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_MenuLayout.setVerticalGroup(
            pnl_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbl_trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_banHang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_khachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_hoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_troGiup, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(lbl_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pnl_Center.add(pnl_Menu, java.awt.BorderLayout.WEST);

        pnl_Main.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnl_Main.setPreferredSize(new java.awt.Dimension(0, 0));
        pnl_Main.setLayout(new java.awt.CardLayout());
        pnl_Center.add(pnl_Main, java.awt.BorderLayout.CENTER);

        pnl_Chinh.add(pnl_Center, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnl_Chinh, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_MenuMouseClicked
        Dimension panelSize = pnl_Menu.getSize();
        if (panelSize.width == 54) {
            openMenu(panelSize);
        } else {
            closeMenu(panelSize);
        }
    }//GEN-LAST:event_lbl_MenuMouseClicked

    private void lbl_trangchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_trangchuMouseClicked
        clearLable();
        pressLable(lbl_trangchu);
        pnl_Main.add(new panel_TrangChu(), "manhinhchinh");
        card.show(this.pnl_Main, "manhinhchinh");
    }//GEN-LAST:event_lbl_trangchuMouseClicked

    private void lbl_trangchuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_trangchuMouseEntered
        hoverLable(lbl_trangchu);
    }//GEN-LAST:event_lbl_trangchuMouseEntered

    private void lbl_khachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_khachHangMouseClicked
        clearLable();
        pressLable(lbl_khachHang);
        pnl_Main.add(new panel_QuanLyKhachHang(), "quanlikhachang");
        card.show(this.pnl_Main, "quanlikhachang");
    }//GEN-LAST:event_lbl_khachHangMouseClicked

    private void lbl_trangchuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_trangchuMouseExited
        restoreLable(lbl_trangchu);
    }//GEN-LAST:event_lbl_trangchuMouseExited

    private void lbl_banHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_banHangMouseClicked
        clearLable();
        pressLable(lbl_banHang);
        pnl_Main.add(new panel_QuanLiBanHang(lbl_maNV.getText()), "quanlibanhang");
        card.show(this.pnl_Main, "quanlibanhang");
    }//GEN-LAST:event_lbl_banHangMouseClicked

    private void lbl_banHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_banHangMouseEntered
        hoverLable(lbl_banHang);
    }//GEN-LAST:event_lbl_banHangMouseEntered

    private void lbl_banHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_banHangMouseExited
        restoreLable(lbl_banHang);
    }//GEN-LAST:event_lbl_banHangMouseExited

    private void lbl_khachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_khachHangMouseEntered
        hoverLable(lbl_khachHang);
    }//GEN-LAST:event_lbl_khachHangMouseEntered

    private void lbl_khachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_khachHangMouseExited
        restoreLable(lbl_khachHang);
    }//GEN-LAST:event_lbl_khachHangMouseExited

    private void lbl_hoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hoaDonMouseEntered
        hoverLable(lbl_hoaDon);
    }//GEN-LAST:event_lbl_hoaDonMouseEntered

    private void lbl_hoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hoaDonMouseExited
        restoreLable(lbl_hoaDon);
    }//GEN-LAST:event_lbl_hoaDonMouseExited

    private void lbl_troGiupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_troGiupMouseEntered
        hoverLable(lbl_troGiup);
    }//GEN-LAST:event_lbl_troGiupMouseEntered

    private void lbl_troGiupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_troGiupMouseExited
        restoreLable(lbl_troGiup);
    }//GEN-LAST:event_lbl_troGiupMouseExited

    private void lbl_hoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hoaDonMouseClicked
        // TODO add your handling code here:
        pnl_Main.add(new panel_HoaDon(), "quanlihoadon");
        card.show(this.pnl_Main, "quanlihoadon");
    }//GEN-LAST:event_lbl_hoaDonMouseClicked

    private void lbl_DangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DangXuatMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_DangXuatMouseEntered

    private void lbl_DangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DangXuatMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_DangXuatMouseExited

    private void lbl_DangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DangXuatMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn đăng xuất?", "Đăng Xuất", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            login loginFrame = new login();
            loginFrame.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lbl_DangXuatMouseClicked

    private void lbl_troGiupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_troGiupMouseClicked
        clearLable();
        pressLable(lbl_troGiup);
        pnl_Main.add(new panel_TroGiup(), "quanlitrogiup");
        card.show(this.pnl_Main, "quanlitrogiup");
    }//GEN-LAST:event_lbl_troGiupMouseClicked

    public static ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    /**
     * Dùng để hover các Jlable khi chạm vào
     *
     * @param lbl
     */
    public void hoverLable(JLabel lbl) {

        if (!labelStates.getOrDefault(lbl, false)) {
            if (pnl_Menu.getWidth() == 54) {
                pnl_Menu.setPreferredSize(new Dimension(54, pnl_Menu.getHeight()));
                pnl_Menu.revalidate();
                pnl_Menu.repaint();
            } else {
                pnl_Menu.setPreferredSize(new Dimension(170, pnl_Menu.getHeight()));
                pnl_Menu.revalidate();
                pnl_Menu.repaint();
            }
            lbl.setBackground(new Color(0, 204, 204));
            //[0,0,204]  255,204,153 [0,204,204]
            lbl.setOpaque(true);
            lbl.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        }
    }

    /**
     * Dùng đê trả về trạng thái ban đầu của các Jlable
     *
     * @param lbl
     */
    public void restoreLable(JLabel lbl) {
        if (!labelStates.getOrDefault(lbl, false)) {
            if (pnl_Menu.getWidth() == 54) {
                pnl_Menu.setPreferredSize(new Dimension(54, pnl_Menu.getHeight()));
                pnl_Menu.revalidate();
                pnl_Menu.repaint();
            } else {
                pnl_Menu.setPreferredSize(new Dimension(170, pnl_Menu.getHeight()));
                pnl_Menu.revalidate();
                pnl_Menu.repaint();
            }
            lbl.setBackground(UIManager.getColor("Label.background"));
            lbl.setOpaque(false);
            lbl.setBorder(null);
        }
    }

    /**
     * Mở menu
     *
     * @param panelSize
     */
    public void openMenu(Dimension panelSize) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 54; i <= 170; i++) {
                    pnl_Menu.setSize(i, panelSize.height);
                    pnl_Main.setLocation(i, pnl_Main.getY());
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JFrame_MainNVTT.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    /**
     * Đóng menu
     *
     * @param panelSize
     */
    public void closeMenu(Dimension panelSize) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = panelSize.width; i >= 54; i--) {
                    pnl_Menu.setSize(i, panelSize.height);
                    pnl_Main.setSize(pnl_Main.getWidth() + (i - 54), pnl_Main.getHeight());
                    pnl_Main.setLocation(i, pnl_Main.getY());

                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JFrame_MainNVTT.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    /**
     * Hàm dùng để nhấn vào nút lable
     *
     * @param args
     */
    public void pressLable(JLabel lbl) {
        labelStates.put(lbl, true);
        lbl.setBackground(new Color(0, 204, 204));
        //[0,0,204]  255,204,153 [0,204,204]
        lbl.setOpaque(true);
        lbl.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
    }

    /**
     * Hàm nút khác được nhấn
     *
     * @param args
     */
    public void clearLable() {
        JLabel[] labels = {lbl_trangchu, lbl_banHang, lbl_troGiup, lbl_hoaDon,
            lbl_khachHang,
            lbl_troGiup,};
        for (JLabel lbl : labels) {
            labelStates.put(lbl, false);
            lbl.setBackground(UIManager.getColor("Label.background"));
            lbl.setOpaque(false);
            lbl.setBorder(null);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_DangXuat;
    private javax.swing.JLabel lbl_Menu;
    private javax.swing.JLabel lbl_anhNhanVien;
    private javax.swing.JLabel lbl_banHang;
    private javax.swing.JLabel lbl_hoaDon;
    private javax.swing.JLabel lbl_khachHang;
    private javax.swing.JLabel lbl_maNV;
    private javax.swing.JLabel lbl_sashimiDuo;
    private javax.swing.JLabel lbl_tenNhanVien;
    private javax.swing.JLabel lbl_trangchu;
    private javax.swing.JLabel lbl_troGiup;
    private javax.swing.JPanel pnl_Center;
    private javax.swing.JPanel pnl_Chinh;
    private javax.swing.JPanel pnl_Main;
    private component.JpanelGradient pnl_Menu;
    private javax.swing.JPanel pnl_Title;
    // End of variables declaration//GEN-END:variables
}
