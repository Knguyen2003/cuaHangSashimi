/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.CustomerDao;
import dao.OrderDao;
import dao.OrderDetailDao;
import dao.TableDao;
import entity.Customer;
import entity.Employee;
import entity.EnumTrangThai;
import entity.Order;
import entity.OrderDetail;
import entity.Table;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.neo4j.driver.Driver;
import util.AppUltil;

public final class panel_QuanLiBanHang extends javax.swing.JPanel {

    private TableDao tableDao;
    private static final String DB_NAME = "quanliquanan";
    private Table tabelDaChon;
    private String maHD;
    private OrderDao orderDao;
    private String maNhanVienTao;
    private OrderDetailDao odDao;
    private boolean daChon = false;
    private CustomerDao customerDao;

    public panel_QuanLiBanHang(String maNV) {
        initComponents();
        maNhanVienTao = maNV;
        customerDao = new CustomerDao(AppUltil.initDriver(), "quanliquanan");
        setUp(AppUltil.initDriver());
        loadALLBan();
        loadTrangThaiPhong();
        setUpGui();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Center = new javax.swing.JPanel();
        jsp_dsBan = new javax.swing.JScrollPane();
        pnl_dsBan = new javax.swing.JPanel();
        lbl_2ghe = new javax.swing.JLabel();
        lbl_4ghe = new javax.swing.JLabel();
        lbl_8ghe = new javax.swing.JLabel();
        lbl_12ghe = new javax.swing.JLabel();
        pnl_2ghe = new javax.swing.JPanel();
        pnl_4ghe = new javax.swing.JPanel();
        pnl_8ghe = new javax.swing.JPanel();
        pnl_12ghe = new javax.swing.JPanel();
        pnl_chucNang = new javax.swing.JPanel();
        btn_datBanTruoc = new javax.swing.JButton();
        btn_huyBan = new javax.swing.JButton();
        btn_chuyenBan = new javax.swing.JButton();
        btn_datMon = new javax.swing.JButton();
        btn_nhanBan = new javax.swing.JButton();
        btn_datMonMangDi = new javax.swing.JButton();
        btn_lamMoi = new javax.swing.JButton();
        pnl_sourth = new javax.swing.JPanel();
        lbl_trong1 = new javax.swing.JLabel();
        lbl_trong = new javax.swing.JLabel();
        lbl_using1 = new javax.swing.JLabel();
        lbl_using = new javax.swing.JLabel();
        lbl_cho1 = new javax.swing.JLabel();
        lbl_cho = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        pnl_Center.setBackground(new java.awt.Color(204, 255, 204));
        pnl_Center.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        pnl_Center.setLayout(new java.awt.BorderLayout());

        jsp_dsBan.setBackground(new java.awt.Color(255, 255, 255));

        pnl_dsBan.setBackground(new java.awt.Color(255, 255, 255));
        pnl_dsBan.setPreferredSize(new java.awt.Dimension(664, 825));

        lbl_2ghe.setBackground(new java.awt.Color(51, 102, 255));
        lbl_2ghe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_2ghe.setForeground(new java.awt.Color(255, 255, 255));
        lbl_2ghe.setText("   2 GHẾ");
        lbl_2ghe.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        lbl_2ghe.setOpaque(true);

        lbl_4ghe.setBackground(new java.awt.Color(51, 102, 255));
        lbl_4ghe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_4ghe.setForeground(new java.awt.Color(255, 255, 255));
        lbl_4ghe.setText("    4 GHẾ");
        lbl_4ghe.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        lbl_4ghe.setOpaque(true);

        lbl_8ghe.setBackground(new java.awt.Color(51, 102, 255));
        lbl_8ghe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_8ghe.setForeground(new java.awt.Color(255, 255, 255));
        lbl_8ghe.setText("    8 GHẾ");
        lbl_8ghe.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        lbl_8ghe.setOpaque(true);

        lbl_12ghe.setBackground(new java.awt.Color(51, 102, 255));
        lbl_12ghe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_12ghe.setForeground(new java.awt.Color(255, 255, 255));
        lbl_12ghe.setText("   12 GHẾ");
        lbl_12ghe.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        lbl_12ghe.setOpaque(true);

        pnl_2ghe.setBackground(new java.awt.Color(255, 255, 255));
        pnl_2ghe.setLayout(new java.awt.GridLayout(0, 4, 5, 5));

        pnl_4ghe.setBackground(new java.awt.Color(255, 255, 255));
        pnl_4ghe.setLayout(new java.awt.GridLayout(0, 4, 5, 5));

        pnl_8ghe.setBackground(new java.awt.Color(255, 255, 255));
        pnl_8ghe.setLayout(new java.awt.GridLayout(0, 4, 5, 5));

        pnl_12ghe.setBackground(new java.awt.Color(255, 255, 255));
        pnl_12ghe.setLayout(new java.awt.GridLayout(0, 4, 5, 5));

        javax.swing.GroupLayout pnl_dsBanLayout = new javax.swing.GroupLayout(pnl_dsBan);
        pnl_dsBan.setLayout(pnl_dsBanLayout);
        pnl_dsBanLayout.setHorizontalGroup(
            pnl_dsBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_12ghe, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
            .addGroup(pnl_dsBanLayout.createSequentialGroup()
                .addGroup(pnl_dsBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_8ghe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_4ghe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_2ghe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(pnl_12ghe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_8ghe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_4ghe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_2ghe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_dsBanLayout.setVerticalGroup(
            pnl_dsBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dsBanLayout.createSequentialGroup()
                .addComponent(lbl_2ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_2ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_4ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_4ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_8ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_8ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_12ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_12ghe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jsp_dsBan.setViewportView(pnl_dsBan);

        pnl_Center.add(jsp_dsBan, java.awt.BorderLayout.CENTER);

        pnl_chucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnl_chucNang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        pnl_chucNang.setPreferredSize(new java.awt.Dimension(179, 0));

        btn_datBanTruoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_datBanTruoc.setText("ĐẶT BÀN");
        btn_datBanTruoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_datBanTruoc.setOpaque(true);
        btn_datBanTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datBanTruocActionPerformed(evt);
            }
        });

        btn_huyBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_huyBan.setText("HỦY BÀN");
        btn_huyBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_huyBan.setOpaque(true);
        btn_huyBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyBanActionPerformed(evt);
            }
        });

        btn_chuyenBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_chuyenBan.setText("CHUYỂN BÀN");
        btn_chuyenBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_chuyenBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuyenBanActionPerformed(evt);
            }
        });

        btn_datMon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_datMon.setText("ĐẶT MÓN");
        btn_datMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_datMon.setOpaque(true);
        btn_datMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_datMonMouseClicked(evt);
            }
        });
        btn_datMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datMonActionPerformed(evt);
            }
        });

        btn_nhanBan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_nhanBan.setText("NHẬN BÀN");
        btn_nhanBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_nhanBan.setOpaque(true);
        btn_nhanBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nhanBanActionPerformed(evt);
            }
        });

        btn_datMonMangDi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_datMonMangDi.setText("ĐẶT MANG ĐI");
        btn_datMonMangDi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_datMonMangDi.setOpaque(true);
        btn_datMonMangDi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_datMonMangDiMouseClicked(evt);
            }
        });
        btn_datMonMangDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datMonMangDiActionPerformed(evt);
            }
        });

        btn_lamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_lamMoi.setText("LÀM MỚI");
        btn_lamMoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_chucNangLayout = new javax.swing.GroupLayout(pnl_chucNang);
        pnl_chucNang.setLayout(pnl_chucNangLayout);
        pnl_chucNangLayout.setHorizontalGroup(
            pnl_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_chucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_datBanTruoc, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btn_chuyenBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btn_datMon, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btn_nhanBan, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btn_huyBan, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btn_datMonMangDi, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(btn_lamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_chucNangLayout.setVerticalGroup(
            pnl_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_chucNangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_datBanTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_datMon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_datMonMangDi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_chuyenBan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_nhanBan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_huyBan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        pnl_Center.add(pnl_chucNang, java.awt.BorderLayout.EAST);

        add(pnl_Center, java.awt.BorderLayout.CENTER);

        pnl_sourth.setBackground(new java.awt.Color(255, 255, 255));
        pnl_sourth.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        pnl_sourth.setPreferredSize(new java.awt.Dimension(763, 82));

        lbl_trong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/trong_nho.png"))); // NOI18N

        lbl_trong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_trong.setText("Trống (10)");

        lbl_using1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/dsd_nho.png"))); // NOI18N

        lbl_using.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_using.setText("Đang sử dụng (10)");

        lbl_cho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/cho_nho.png"))); // NOI18N

        lbl_cho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_cho.setText("Chờ (10)");

        javax.swing.GroupLayout pnl_sourthLayout = new javax.swing.GroupLayout(pnl_sourth);
        pnl_sourth.setLayout(pnl_sourthLayout);
        pnl_sourthLayout.setHorizontalGroup(
            pnl_sourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sourthLayout.createSequentialGroup()
                .addGroup(pnl_sourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_sourthLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbl_trong1)
                        .addGap(86, 86, 86)
                        .addComponent(lbl_using1)
                        .addGap(85, 85, 85)
                        .addComponent(lbl_cho1))
                    .addGroup(pnl_sourthLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbl_trong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lbl_using, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lbl_cho, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(453, 453, 453))
        );
        pnl_sourthLayout.setVerticalGroup(
            pnl_sourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sourthLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_sourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_trong1)
                    .addComponent(lbl_using1)
                    .addComponent(lbl_cho1))
                .addGap(6, 6, 6)
                .addGroup(pnl_sourthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_trong)
                    .addComponent(lbl_using)
                    .addComponent(lbl_cho)))
        );

        add(pnl_sourth, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_huyBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyBanActionPerformed
        if (tabelDaChon.getTrangThai() == EnumTrangThai.DANGSU_DUNG) {
            Order o = orderDao.timHoaDonTheoBan(tabelDaChon.getSoBan(), 1);
            List<OrderDetail> dsOd = odDao.layDanhSachSanPham(o.getMaHD());
            if (dsOd.isEmpty()) {
                tableDao.updateTrangThaiTable("Trống", tabelDaChon.getSoBan());
                tabelDaChon.setTrangThai(EnumTrangThai.TRONG);
                loadALLBan();
                pnl_dsBan.revalidate();
                pnl_dsBan.repaint();
                orderDao.xoaHDTrong(o.getMaHD());
            } else {
                JOptionPane.showMessageDialog(null, "Không thể hủy vì bàn này có hóa đơn chưa thanh toán");
            }
        } else if (tabelDaChon.getTrangThai() == EnumTrangThai.CHO) {
            Order o = orderDao.timHoaDonTheoBan(tabelDaChon.getSoBan(), 6);

            tableDao.updateTrangThaiTable("Trống", tabelDaChon.getSoBan());
            tabelDaChon.setTrangThai(EnumTrangThai.TRONG);
            loadALLBan();
            pnl_dsBan.revalidate();
            pnl_dsBan.repaint();
            orderDao.xoaHDTrong(o.getMaHD());

        }
    }//GEN-LAST:event_btn_huyBanActionPerformed

    private void btn_chuyenBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuyenBanActionPerformed

        JDialog_chuyenBan chuyenBan = new JDialog_chuyenBan(tabelDaChon.getSoBan(),btn_lamMoi);

        chuyenBan.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Gọi loadALLBan() và cập nhật giao diện khi JDialog được đóng
                loadALLBan();
                pnl_dsBan.revalidate();
                pnl_dsBan.repaint();
            }
        });

        chuyenBan.setVisible(true);

    }//GEN-LAST:event_btn_chuyenBanActionPerformed

    private void btn_datMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datMonActionPerformed

        Order o = orderDao.timHoaDonTheoBan(tabelDaChon.getSoBan(), 1);
        JDialog_datMon pnl_datMon = new JDialog_datMon(tabelDaChon, o.getMaHD(), maNhanVienTao,btn_lamMoi);
        pnl_datMon.setSize(1450, 750);
        pnl_datMon.setLocationRelativeTo(null);
        pnl_datMon.setVisible(true);
    }//GEN-LAST:event_btn_datMonActionPerformed

    private void btn_nhanBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nhanBanActionPerformed
        if (tabelDaChon.getTrangThai() == EnumTrangThai.TRONG) {
            tabelDaChon.setTrangThai(EnumTrangThai.DANGSU_DUNG);
            createOrderID(); //tao id hoa don

            Customer kvl = customerDao.findCustomerByID("KH0000");
            Order oderTao = new Order(maHD, LocalDateTime.now(), kvl, new Employee(maNhanVienTao), tabelDaChon, 1);
            orderDao.luuHoaDonBanMangDi(oderTao);
            tableDao.updateTrangThaiTable("Đang sử dụng", tabelDaChon.getSoBan());
            tabelDaChon.setTrangThai(EnumTrangThai.DANGSU_DUNG);
            loadALLBan();
            pnl_dsBan.revalidate();
            pnl_dsBan.repaint();

            Order o = orderDao.timHoaDonTheoBan(tabelDaChon.getSoBan(), 1);
            JDialog_datMon pnl_datMon = new JDialog_datMon(tabelDaChon, o.getMaHD(), maNhanVienTao,btn_lamMoi);
            pnl_datMon.setSize(1450, 750);
            pnl_datMon.setLocationRelativeTo(null);
            pnl_datMon.setVisible(true);
        } else if (tabelDaChon.getTrangThai() == EnumTrangThai.CHO) {
            tabelDaChon.setTrangThai(EnumTrangThai.DANGSU_DUNG);

            tableDao.updateTrangThaiTable("Đang sử dụng", tabelDaChon.getSoBan());
            tabelDaChon.setTrangThai(EnumTrangThai.DANGSU_DUNG);
            loadALLBan();
            pnl_dsBan.revalidate();
            pnl_dsBan.repaint();
            Order oT = orderDao.timHoaDonTheoBan(tabelDaChon.getSoBan(), 6);
            orderDao.updateTrangThaiHoaDonDatBan(oT.getMaHD(), 1);
        }
    }//GEN-LAST:event_btn_nhanBanActionPerformed

    private void btn_datMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datMonMouseClicked

    }//GEN-LAST:event_btn_datMonMouseClicked

    private void btn_datMonMangDiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datMonMangDiMouseClicked

    }//GEN-LAST:event_btn_datMonMangDiMouseClicked

    private void btn_datMonMangDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datMonMangDiActionPerformed
        JDialog_datMonMangDi pnl_datMonMangDi = new JDialog_datMonMangDi(maNhanVienTao, btn_lamMoi);
        pnl_datMonMangDi.setSize(1500, 800);
        pnl_datMonMangDi.setLocationRelativeTo(null);
        
        pnl_datMonMangDi.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Gọi loadALLBan() và cập nhật giao diện khi JDialog được đóng
                loadALLBan();
                pnl_dsBan.revalidate();
                pnl_dsBan.repaint();
            }
        });
        pnl_datMonMangDi.setVisible(true);
    }//GEN-LAST:event_btn_datMonMangDiActionPerformed

    private void btn_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiActionPerformed
       loadALLBan();
       loadTrangThaiPhong();

    }//GEN-LAST:event_btn_lamMoiActionPerformed

    private void btn_datBanTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datBanTruocActionPerformed
        JDialog_DatBanTruoc dialog = new JDialog_DatBanTruoc(tabelDaChon, maNhanVienTao, btn_lamMoi);

        dialog.setLocationRelativeTo(null);
        dialog.setSize(1000, 500);

        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Gọi loadALLBan() và cập nhật giao diện khi JDialog được đóng hoàn toàn
                loadALLBan();
               
                pnl_dsBan.revalidate();
                pnl_dsBan.repaint();
            }
        });

        dialog.setVisible(true);
    }//GEN-LAST:event_btn_datBanTruocActionPerformed
    //===================================================================================================\\

    public void createOrderID() {
        Date ngayHienTai = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        String dateStr = dateFormat.format(ngayHienTai);
        String maLayRa = orderDao.layBaSoCuoiCuaMaHoaDonTheoNgay(dateStr);
        if (maLayRa != null) {
            int ma = Integer.parseInt(maLayRa);
            ma = ma + 1;
            if (ma < 10) {
                maLayRa = "00" + ma;
            } else if (ma >= 10 && ma < 100) {
                maLayRa = "0" + ma;
            }
        } else {
            maLayRa = "001";
        }
        String orderID = "HD" + dateStr + "-" + maLayRa;
        maHD = orderID;

    }
    //===================================================================================================\\

    //===================================================================================================\\
    /**
     * Khởi tạo các Dao
     *
     * @param driver
     */
    public void setUp(Driver driver) {
        tableDao = new TableDao(driver, DB_NAME);
        orderDao = new OrderDao(driver, DB_NAME);
        odDao = new OrderDetailDao(driver, DB_NAME);

    }

    //===================================================================================================\\
    /**
     * Lấy đường dẫn đến ảnh phù hợp với loại bàn
     *
     * @param trangThai
     * @return
     */
    public String layDiaChiIconTheoTrangThaiTable(String trangThai) {
        if (trangThai.equalsIgnoreCase("Trống")) {
            return "/ImagesAndIcon/trong_lon.png";
        } else if (trangThai.equalsIgnoreCase("Chờ")) {
            return "/ImagesAndIcon/cho_lon.png";
        } else {
            return "/ImagesAndIcon/dsd_lon.png";
        }
    }

    //===================================================================================================\\
    /**
     * Tạo panel bán hàng (giúp load các bàn lên giao diện)
     *
     * @param table
     * @return
     */
    public JPanel taoPanelTable(Table table) {
        JPanel panelTable = new JPanel();
        panelTable.setPreferredSize(new Dimension(190, 140));
        panelTable.setBackground(Color.WHITE);

        //truyền ảnh
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        String trangThai = " ";
        if (null == table.getTrangThai()) {
            trangThai = "Đang sử dụng";
        } else {
            trangThai = switch (table.getTrangThai()) {
                case CHO ->
                    "Chờ";
                case TRONG ->
                    "Trống";
                default ->
                    "Đang sử dụng";
            };
        }
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(layDiaChiIconTheoTrangThaiTable(trangThai)));
        ImageIcon resizedIcon = resizeImageIcon(originalIcon, 80, 100);
        lblNewLabel.setIcon(resizedIcon);

        String soBan = "Bàn: " + table.getSoBan();
        JLabel lblNewLabel_1 = new JLabel(soBan);
        lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));

        JLabel trangThaiBan = new JLabel("Trạng thái: " + trangThai);
        trangThaiBan.setAlignmentX(Component.LEFT_ALIGNMENT);
        trangThaiBan.setFont(new Font("Tahoma", Font.PLAIN, 16));

        panelTable.setLayout(new BoxLayout(panelTable, BoxLayout.Y_AXIS));
        panelTable.add(lblNewLabel);
        panelTable.add(lblNewLabel_1);

        // Thêm sự kiện khi người dùng nhấp chuột vào phòng
        panelTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                disabledChucNangTable(table);
                tabelDaChon = table;
                daChon = true;

            }

            public void actionPerformed(ActionEvent e) {
                //Xem chi tiet phong
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        return panelTable;
    }

    //===================================================================================================\\
    /**
     * Dùng để thay đổi kích thước icon phù hợp với lable
     *
     * @param icon
     * @param width
     * @param height
     * @return
     */
    public static ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    //===================================================================================================\\
    /**
     * Ràng buộc các nút button khi người dùng chọn vào các bàn
     *
     * @param table
     */
    public void disabledChucNangTable(Table table) {
        if (table.getTrangThai() == EnumTrangThai.TRONG) {
            btn_chuyenBan.setEnabled(false);
            btn_huyBan.setEnabled(false);
           

            btn_nhanBan.setEnabled(true);
            btn_datMonMangDi.setEnabled(true);
            btn_datBanTruoc.setEnabled(true);
            btn_datMon.setEnabled(false);
        } else if (table.getTrangThai() == EnumTrangThai.CHO) { //chờ
            btn_nhanBan.setEnabled(true);
            btn_datMon.setEnabled(true);
            btn_huyBan.setEnabled(true);
            btn_datMonMangDi.setEnabled(true);

            btn_datBanTruoc.setEnabled(false);
            btn_chuyenBan.setEnabled(false);
           

        } else {
            btn_chuyenBan.setEnabled(true);
         
            btn_datMon.setEnabled(true);
            btn_datMonMangDi.setEnabled(true);

            btn_huyBan.setEnabled(true);
            btn_nhanBan.setEnabled(false);
            btn_datBanTruoc.setEnabled(false);

        }
        setBackgroundButon(btn_datMonMangDi);
        setBackgroundButon(btn_chuyenBan);
        setBackgroundButon(btn_datMon);
        setBackgroundButon(btn_lamMoi);
        setBackgroundButon(btn_datMon);
        setBackgroundButon(btn_huyBan);
        setBackgroundButon(btn_nhanBan);
        setBackgroundButon(btn_datBanTruoc);
    }

    //===================================================================================================\\
    /**
     * Chỉnh màu button
     *
     * @param btn
     */
    public void setBackgroundButon(JButton btn) {
        if (btn.isEnabled()) {
            btn.setBackground(new Color(51, 255, 0));
        } else {
            btn.setBackground(null);
        }
    }

    //===================================================================================================\\
    /**
     * Load danh sách phòng lên giao diện
     */
    public void loadALLBan() {
        List<Table> ds2ghe = tableDao.getTableBySoGhe(2);
        List<Table> ds4ghe = tableDao.getTableBySoGhe(4);
        List<Table> ds8ghe = tableDao.getTableBySoGhe(8);
        List<Table> ds12ghe = tableDao.getTableBySoGhe(12);

        pnl_2ghe.removeAll();
        pnl_4ghe.removeAll();
        pnl_8ghe.removeAll();
        pnl_12ghe.removeAll();

        for (Table table1 : ds2ghe) {
            JPanel panel1 = taoPanelTable(table1);
            pnl_2ghe.add(panel1);
        }

        for (Table table2 : ds4ghe) {
            JPanel panel2 = taoPanelTable(table2);
            pnl_4ghe.add(panel2);
        }

        for (Table table3 : ds8ghe) {
            JPanel panel3 = taoPanelTable(table3);
            pnl_8ghe.add(panel3);
        }

        for (Table table4 : ds12ghe) {
            JPanel panel4 = taoPanelTable(table4);
            pnl_12ghe.add(panel4);
        }

        pnl_2ghe.revalidate();
        pnl_2ghe.repaint();
        pnl_2ghe.revalidate();
        pnl_2ghe.repaint();
        pnl_8ghe.revalidate();
        pnl_8ghe.repaint();
        pnl_12ghe.revalidate();
        pnl_12ghe.repaint();
    }
    //===================================================================================================\\

    /**
     * Loadd trang thái bàn
     */
    public void loadTrangThaiPhong() {
        int trong = tableDao.loadNumberByState("Trống");  //trống
        int cho = tableDao.loadNumberByState("Chờ");  //chờ
        int dangSuDung = tableDao.loadNumberByState("Đang sử dụng");// đang sử dung
        lbl_trong.setText("Bàn trống (" + trong + ")");
        lbl_using.setText("Bàn đang sử dụng (" + dangSuDung + ")");
        lbl_cho.setText("Bàn chờ (" + cho + ")");

    }

    //===================================================================================================\\
    public void setUpGui() {
        btn_chuyenBan.setEnabled(false);
        btn_lamMoi.setEnabled(true);
        btn_datMon.setEnabled(false);
        btn_datMonMangDi.setEnabled(true);
        btn_huyBan.setEnabled(false);
        btn_nhanBan.setEnabled(false);
        btn_datBanTruoc.setEnabled(false);

        setBackgroundButon(btn_datMonMangDi);
        setBackgroundButon(btn_chuyenBan);
        setBackgroundButon(btn_datMon);
        setBackgroundButon(btn_lamMoi);
        setBackgroundButon(btn_datMon);
        setBackgroundButon(btn_huyBan);
        setBackgroundButon(btn_nhanBan);
        setBackgroundButon(btn_datBanTruoc);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chuyenBan;
    private javax.swing.JButton btn_datBanTruoc;
    private javax.swing.JButton btn_datMon;
    private javax.swing.JButton btn_datMonMangDi;
    private javax.swing.JButton btn_huyBan;
    private javax.swing.JButton btn_lamMoi;
    private javax.swing.JButton btn_nhanBan;
    private javax.swing.JScrollPane jsp_dsBan;
    private javax.swing.JLabel lbl_12ghe;
    private javax.swing.JLabel lbl_2ghe;
    private javax.swing.JLabel lbl_4ghe;
    private javax.swing.JLabel lbl_8ghe;
    private javax.swing.JLabel lbl_cho;
    private javax.swing.JLabel lbl_cho1;
    private javax.swing.JLabel lbl_trong;
    private javax.swing.JLabel lbl_trong1;
    private javax.swing.JLabel lbl_using;
    private javax.swing.JLabel lbl_using1;
    private javax.swing.JPanel pnl_12ghe;
    private javax.swing.JPanel pnl_2ghe;
    private javax.swing.JPanel pnl_4ghe;
    private javax.swing.JPanel pnl_8ghe;
    private javax.swing.JPanel pnl_Center;
    private javax.swing.JPanel pnl_chucNang;
    private javax.swing.JPanel pnl_dsBan;
    private javax.swing.JPanel pnl_sourth;
    // End of variables declaration//GEN-END:variables
}
