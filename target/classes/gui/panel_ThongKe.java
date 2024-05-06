/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import dao.CustomerDao;
import dao.FoodDao;
import dao.OrderDao;
import entity.Food;

import java.awt.Font;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;

import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import util.AppUltil;

/**
 *
 * @author PC
 */
public class panel_ThongKe extends javax.swing.JPanel {

    private final FoodDao foodDao;
    private final OrderDao orderDao;
    private final CustomerDao cusDao;
    private final DefaultTableModel modelSanPham;
    private final DefaultTableModel modeltop10;

    public panel_ThongKe() {
        initComponents();
        foodDao = new FoodDao(AppUltil.initDriver(), "quanliquanan");
        orderDao = new OrderDao(AppUltil.initDriver(), "quanliquanan");
        cusDao = new CustomerDao(AppUltil.initDriver(), "quanliquanan");
        modelSanPham = (DefaultTableModel) table_sanPhamSapHet.getModel();
        modeltop10 = (DefaultTableModel) table_top10sanphambannhieunhat.getModel();
        setUp();
        ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 700));
       
    }

    public void setUp() {
        designTable();
        lbl_tongSoSanPham.setText("" + foodDao.soSanPham());
        lbl_tongSoDanhMuc.setText("" + foodDao.soDanhMuc());

        LocalDate currentDate = LocalDate.now();
        String dateString = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        lbl_soHoaDonBanHomNay.setText("" + foodDao.soHoaDonNgayHomNay(dateString));
        lbl_tongSoKhachHang.setText(cusDao.soKhachHang() + "");
        
        
        double tongTien = orderDao.tongTienHoaDonTheoNgay(dateString);
        lbl_doanhThu.setText(formatCurrency(tongTien));

        LinkedHashMap<String, Long> top10 = orderDao.top10SanPhamBanTheoThang(4, 2024);
        for (Map.Entry<String, Long> entry : top10.entrySet()) {
            Object[] obj = {entry.getKey(), entry.getValue()};
            modeltop10.addRow(obj);
        }
        

        List<Food> dsSPSapHet = foodDao.findFoodSapHet();
        xoaHetDuLieuTablable();
        loadSanPham(dsSPSapHet);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel_TKSanPham = new javax.swing.JPanel();
        panel_TKSP_North = new javax.swing.JPanel();
        panel_soHoaDon = new javax.swing.JPanel();
        lbl_soHoaDonBanHomNay1 = new javax.swing.JLabel();
        lbl_soHoaDonBanHomNay = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_soHoaDon3 = new javax.swing.JPanel();
        lbl_SPBanChayNhat3 = new javax.swing.JLabel();
        lbl_doanhThu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel_soHoaDon4 = new javax.swing.JPanel();
        lbl_SPBanChayNhat4 = new javax.swing.JLabel();
        lbl_tongSoSanPham = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel_soHoaDon5 = new javax.swing.JPanel();
        lbl_SPBanChayNhat5 = new javax.swing.JLabel();
        lbl_tongSoDanhMuc = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panel_soHoaDon1 = new javax.swing.JPanel();
        lbl_SPBanChayNhat1 = new javax.swing.JLabel();
        lbl_tongSoKhachHang = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnl_soSanSapHet = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_sanPhamSapHet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pnl_top10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_top10sanphambannhieunhat = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setLayout(new java.awt.BorderLayout());

        panel_TKSanPham.setBackground(new java.awt.Color(255, 255, 255));
        panel_TKSanPham.setLayout(new java.awt.BorderLayout());

        panel_TKSP_North.setBackground(new java.awt.Color(255, 255, 255));
        panel_TKSP_North.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        panel_soHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        panel_soHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_soHoaDonBanHomNay1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_soHoaDonBanHomNay1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_soHoaDonBanHomNay1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_soHoaDonBanHomNay1.setText("Hóa đơn");
        lbl_soHoaDonBanHomNay1.setOpaque(true);

        lbl_soHoaDonBanHomNay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_soHoaDonBanHomNay.setForeground(new java.awt.Color(51, 102, 255));
        lbl_soHoaDonBanHomNay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_soHoaDonBanHomNay.setText("6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/transfer.png"))); // NOI18N

        javax.swing.GroupLayout panel_soHoaDonLayout = new javax.swing.GroupLayout(panel_soHoaDon);
        panel_soHoaDon.setLayout(panel_soHoaDonLayout);
        panel_soHoaDonLayout.setHorizontalGroup(
            panel_soHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_soHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_soHoaDonBanHomNay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_soHoaDonLayout.createSequentialGroup()
                        .addComponent(lbl_soHoaDonBanHomNay1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_soHoaDonLayout.setVerticalGroup(
            panel_soHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDonLayout.createSequentialGroup()
                .addGroup(panel_soHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_soHoaDonLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_soHoaDonLayout.createSequentialGroup()
                        .addComponent(lbl_soHoaDonBanHomNay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(lbl_soHoaDonBanHomNay1)))
                .addContainerGap())
        );

        panel_TKSP_North.add(panel_soHoaDon);

        panel_soHoaDon3.setBackground(new java.awt.Color(255, 255, 255));
        panel_soHoaDon3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_SPBanChayNhat3.setBackground(new java.awt.Color(255, 255, 255));
        lbl_SPBanChayNhat3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_SPBanChayNhat3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_SPBanChayNhat3.setText("Doanh thu");
        lbl_SPBanChayNhat3.setOpaque(true);

        lbl_doanhThu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_doanhThu.setForeground(new java.awt.Color(51, 102, 255));
        lbl_doanhThu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_doanhThu.setText("6");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/transfer.png"))); // NOI18N

        javax.swing.GroupLayout panel_soHoaDon3Layout = new javax.swing.GroupLayout(panel_soHoaDon3);
        panel_soHoaDon3.setLayout(panel_soHoaDon3Layout);
        panel_soHoaDon3Layout.setHorizontalGroup(
            panel_soHoaDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDon3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_soHoaDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_doanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_soHoaDon3Layout.createSequentialGroup()
                        .addComponent(lbl_SPBanChayNhat3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_soHoaDon3Layout.setVerticalGroup(
            panel_soHoaDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDon3Layout.createSequentialGroup()
                .addGroup(panel_soHoaDon3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_soHoaDon3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_soHoaDon3Layout.createSequentialGroup()
                        .addComponent(lbl_doanhThu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(lbl_SPBanChayNhat3)))
                .addContainerGap())
        );

        panel_TKSP_North.add(panel_soHoaDon3);

        panel_soHoaDon4.setBackground(new java.awt.Color(255, 255, 255));
        panel_soHoaDon4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_SPBanChayNhat4.setBackground(new java.awt.Color(255, 255, 255));
        lbl_SPBanChayNhat4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_SPBanChayNhat4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_SPBanChayNhat4.setText("Sản phẩm");
        lbl_SPBanChayNhat4.setOpaque(true);

        lbl_tongSoSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_tongSoSanPham.setForeground(new java.awt.Color(51, 102, 255));
        lbl_tongSoSanPham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_tongSoSanPham.setText("6");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/transfer.png"))); // NOI18N

        javax.swing.GroupLayout panel_soHoaDon4Layout = new javax.swing.GroupLayout(panel_soHoaDon4);
        panel_soHoaDon4.setLayout(panel_soHoaDon4Layout);
        panel_soHoaDon4Layout.setHorizontalGroup(
            panel_soHoaDon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDon4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_soHoaDon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tongSoSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_soHoaDon4Layout.createSequentialGroup()
                        .addComponent(lbl_SPBanChayNhat4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_soHoaDon4Layout.setVerticalGroup(
            panel_soHoaDon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDon4Layout.createSequentialGroup()
                .addGroup(panel_soHoaDon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_soHoaDon4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_soHoaDon4Layout.createSequentialGroup()
                        .addComponent(lbl_tongSoSanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(lbl_SPBanChayNhat4)))
                .addContainerGap())
        );

        panel_TKSP_North.add(panel_soHoaDon4);

        panel_soHoaDon5.setBackground(new java.awt.Color(255, 255, 255));
        panel_soHoaDon5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_SPBanChayNhat5.setBackground(new java.awt.Color(255, 255, 255));
        lbl_SPBanChayNhat5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_SPBanChayNhat5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_SPBanChayNhat5.setText("Danh mục");
        lbl_SPBanChayNhat5.setOpaque(true);

        lbl_tongSoDanhMuc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_tongSoDanhMuc.setForeground(new java.awt.Color(51, 102, 255));
        lbl_tongSoDanhMuc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_tongSoDanhMuc.setText("6");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/transfer.png"))); // NOI18N

        javax.swing.GroupLayout panel_soHoaDon5Layout = new javax.swing.GroupLayout(panel_soHoaDon5);
        panel_soHoaDon5.setLayout(panel_soHoaDon5Layout);
        panel_soHoaDon5Layout.setHorizontalGroup(
            panel_soHoaDon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDon5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_soHoaDon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tongSoDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_soHoaDon5Layout.createSequentialGroup()
                        .addComponent(lbl_SPBanChayNhat5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_soHoaDon5Layout.setVerticalGroup(
            panel_soHoaDon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDon5Layout.createSequentialGroup()
                .addGroup(panel_soHoaDon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_soHoaDon5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_soHoaDon5Layout.createSequentialGroup()
                        .addComponent(lbl_tongSoDanhMuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(lbl_SPBanChayNhat5)))
                .addContainerGap())
        );

        panel_TKSP_North.add(panel_soHoaDon5);

        panel_soHoaDon1.setBackground(new java.awt.Color(255, 255, 255));
        panel_soHoaDon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_SPBanChayNhat1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_SPBanChayNhat1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_SPBanChayNhat1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_SPBanChayNhat1.setText("Khách hàng");
        lbl_SPBanChayNhat1.setOpaque(true);

        lbl_tongSoKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_tongSoKhachHang.setForeground(new java.awt.Color(51, 102, 255));
        lbl_tongSoKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_tongSoKhachHang.setText("6");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/transfer.png"))); // NOI18N

        javax.swing.GroupLayout panel_soHoaDon1Layout = new javax.swing.GroupLayout(panel_soHoaDon1);
        panel_soHoaDon1.setLayout(panel_soHoaDon1Layout);
        panel_soHoaDon1Layout.setHorizontalGroup(
            panel_soHoaDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDon1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_soHoaDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tongSoKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_soHoaDon1Layout.createSequentialGroup()
                        .addComponent(lbl_SPBanChayNhat1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_soHoaDon1Layout.setVerticalGroup(
            panel_soHoaDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_soHoaDon1Layout.createSequentialGroup()
                .addGroup(panel_soHoaDon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_soHoaDon1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_soHoaDon1Layout.createSequentialGroup()
                        .addComponent(lbl_tongSoKhachHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(lbl_SPBanChayNhat1)))
                .addContainerGap())
        );

        panel_TKSP_North.add(panel_soHoaDon1);

        panel_TKSanPham.add(panel_TKSP_North, java.awt.BorderLayout.NORTH);

        add(panel_TKSanPham, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        pnl_soSanSapHet.setBackground(new java.awt.Color(204, 204, 204));

        table_sanPhamSapHet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên món", "Số lượng ", "Giá bán"
            }
        ));
        table_sanPhamSapHet.setRowHeight(30);
        jScrollPane2.setViewportView(table_sanPhamSapHet);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH MỤC SẢN PHẨM SẮP HẾT ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout pnl_soSanSapHetLayout = new javax.swing.GroupLayout(pnl_soSanSapHet);
        pnl_soSanSapHet.setLayout(pnl_soSanSapHetLayout);
        pnl_soSanSapHetLayout.setHorizontalGroup(
            pnl_soSanSapHetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnl_soSanSapHetLayout.setVerticalGroup(
            pnl_soSanSapHetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_soSanSapHetLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(pnl_soSanSapHet, java.awt.BorderLayout.CENTER);

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TOP 10 SẢN PHẨM BÁN NHIỀU NHẤT TRONG THÁNG");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel2.setOpaque(true);

        table_top10sanphambannhieunhat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên món", "Số lượng bán"
            }
        ));
        table_top10sanphambannhieunhat.setRowHeight(30);
        jScrollPane3.setViewportView(table_top10sanphambannhieunhat);

        javax.swing.GroupLayout pnl_top10Layout = new javax.swing.GroupLayout(pnl_top10);
        pnl_top10.setLayout(pnl_top10Layout);
        pnl_top10Layout.setHorizontalGroup(
            pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_top10Layout.setVerticalGroup(
            pnl_top10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_top10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pnl_top10, java.awt.BorderLayout.PAGE_START);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

     public static JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "BIỂU ĐỒ DÂN SỐ VIỆT NAM",
                "Năm", "Số người",
                createDataset(), PlotOrientation.VERTICAL, true, true, true);
        return barChart;
    }

    private static CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(68000000, "Số người", "1990");
        dataset.addValue(80000000, "Số người", "2000");
        dataset.addValue(88000000, "Số người", "2010");
        dataset.addValue(95000000, "Số người", "2020");
        return dataset;
    }
    
    
    
    
    
    
    
    
    
    public void loadSanPham(List<Food> dsFood) {
        if (dsFood.size() > 0) {
            for (Food K : dsFood) {
                modelSanPham.addRow(getObjCTHD(K));
            }
        }
    }

    public Object[] getObjCTHD(Food f) {
        String giaBan = formatCurrency(f.getPrice());
        Object[] obj = {f.getFoodID(), f.getFoodName(), f.getSoLuong(), giaBan};
        return obj;
    }

    public void xoaHetDuLieuTablable() {
        modelSanPham.getDataVector().removeAllElements();
    }

    public void designTable() {
        table_sanPhamSapHet.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_top10sanphambannhieunhat.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        table_sanPhamSapHet.setFont(new Font("Arial", Font.PLAIN, 14));
        table_top10sanphambannhieunhat.setFont(new Font("Arial", Font.PLAIN, 14));
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        table_sanPhamSapHet.getColumnModel().getColumn(2).setCellRenderer(renderer);
    }

    public static String formatCurrency(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("###,### VNĐ");
        return decimalFormat.format(number);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_SPBanChayNhat1;
    private javax.swing.JLabel lbl_SPBanChayNhat3;
    private javax.swing.JLabel lbl_SPBanChayNhat4;
    private javax.swing.JLabel lbl_SPBanChayNhat5;
    private javax.swing.JLabel lbl_doanhThu;
    private javax.swing.JLabel lbl_soHoaDonBanHomNay;
    private javax.swing.JLabel lbl_soHoaDonBanHomNay1;
    private javax.swing.JLabel lbl_tongSoDanhMuc;
    private javax.swing.JLabel lbl_tongSoKhachHang;
    private javax.swing.JLabel lbl_tongSoSanPham;
    private javax.swing.JPanel panel_TKSP_North;
    private javax.swing.JPanel panel_TKSanPham;
    private javax.swing.JPanel panel_soHoaDon;
    private javax.swing.JPanel panel_soHoaDon1;
    private javax.swing.JPanel panel_soHoaDon3;
    private javax.swing.JPanel panel_soHoaDon4;
    private javax.swing.JPanel panel_soHoaDon5;
    private javax.swing.JPanel pnl_soSanSapHet;
    private javax.swing.JPanel pnl_top10;
    private javax.swing.JTable table_sanPhamSapHet;
    private javax.swing.JTable table_top10sanphambannhieunhat;
    // End of variables declaration//GEN-END:variables
}
