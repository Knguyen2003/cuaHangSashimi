/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import component.TableActionCellEditor;
import component.TableActionCellRender;
import component.TableActionEvent;
import dao.FoodDao;
import dao.OrderDao;
import dao.OrderDetailDao;
import dao.TableDao;
import entity.Food;
import entity.Order;
import entity.OrderDetail;
import entity.Table;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.neo4j.driver.Driver;
import util.AppUltil;

public final class JDialog_datMon extends javax.swing.JDialog {

    private DefaultTableModel modelFood;
    private FoodDao foodDao;
    private List<Food> dsFoodAll;
    private static final String DB_NAME = "quanliquanan";
    private final Table tableChon;
    private DefaultTableModel modelChiTieHoaDon;
    private OrderDetailDao odDao;
    private String maHoaDon;
    private TableDao tableDao;
    private OrderDao orderDao;
    private boolean flat = false;
    private double tien;
    private String maNV;
    private JButton buttonLamMoi;

    public JDialog_datMon(Table table, String ma, String maNhanVien, JButton btnLamMoi) {
        initComponents();
        tableChon = table;
        buttonLamMoi = btn_lamMoi;
        maHoaDon = ma;
        maNV = maNhanVien;
        setUp(AppUltil.initDriver());
        docDuLieuVaoCombobox();
        dsFoodAll = foodDao.getAllFoodLimit20();
        loadFood(dsFoodAll);
        cbb_timMon.setSelectedItem(tableChon.getSoBan());
        loadChiTietHoaDon();
        chenButton();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_danhSachMon = new javax.swing.JPanel();
        pnl_timMon = new javax.swing.JPanel();
        txt_timMon = new javax.swing.JTextField();
        btn_timMon = new javax.swing.JButton();
        cbb_timMon = new javax.swing.JComboBox<>();
        btn_lamMoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnl_thucDon = new javax.swing.JPanel();
        btn_east = new javax.swing.JPanel();
        pnl_chucNang = new javax.swing.JPanel();
        btn_thoat = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_thanhToan = new javax.swing.JButton();
        lbl_tongTien = new javax.swing.JLabel();
        lbl_tongTienThanhToan = new javax.swing.JLabel();
        pnl_chuyen = new javax.swing.JPanel();
        cbb_chuyenBan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lbl_banSo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_chiTietHoaDon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_danhSachMon.setBackground(new java.awt.Color(255, 255, 255));
        pnl_danhSachMon.setLayout(new java.awt.BorderLayout());

        pnl_timMon.setBackground(new java.awt.Color(255, 255, 255));
        pnl_timMon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        pnl_timMon.setPreferredSize(new java.awt.Dimension(0, 59));

        txt_timMon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_timMon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_timMon.setPreferredSize(new java.awt.Dimension(500, 22));

        btn_timMon.setBackground(new java.awt.Color(51, 153, 255));
        btn_timMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/search.png"))); // NOI18N
        btn_timMon.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_timMon.setOpaque(true);
        btn_timMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timMonActionPerformed(evt);
            }
        });

        cbb_timMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TẤT CẢ", "Nước Uống", "Set Sinh Nhật", "Món Chiên", "Cơm Tô", "Mì Udon", "Món Nướng", "Han Rolls", "Khai Vị", "Nigiri", "Cơm Cuộn", "ichiana awesome", "Combo", "Sashimi" }));
        cbb_timMon.setPreferredSize(new java.awt.Dimension(214, 22));
        cbb_timMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_timMonActionPerformed(evt);
            }
        });

        btn_lamMoi.setBackground(new java.awt.Color(236, 231, 231));
        btn_lamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_lamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/reset.png"))); // NOI18N
        btn_lamMoi.setText("LÀM MỚI");
        btn_lamMoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_lamMoi.setOpaque(true);
        btn_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_timMonLayout = new javax.swing.GroupLayout(pnl_timMon);
        pnl_timMon.setLayout(pnl_timMonLayout);
        pnl_timMonLayout.setHorizontalGroup(
            pnl_timMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_timMonLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txt_timMon, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_timMon)
                .addGap(53, 53, 53)
                .addComponent(cbb_timMon, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        pnl_timMonLayout.setVerticalGroup(
            pnl_timMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_timMonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_timMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_timMon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_timMon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_timMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbb_timMon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_lamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl_danhSachMon.add(pnl_timMon, java.awt.BorderLayout.NORTH);

        jScrollPane2.setToolTipText("");

        pnl_thucDon.setLayout(new java.awt.GridLayout(0, 5, 5, 5));
        jScrollPane2.setViewportView(pnl_thucDon);

        pnl_danhSachMon.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnl_danhSachMon, java.awt.BorderLayout.CENTER);

        btn_east.setLayout(new java.awt.BorderLayout());

        pnl_chucNang.setBackground(new java.awt.Color(255, 255, 255));
        pnl_chucNang.setPreferredSize(new java.awt.Dimension(480, 100));

        btn_thoat.setBackground(new java.awt.Color(236, 231, 231));
        btn_thoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/logout.png"))); // NOI18N
        btn_thoat.setText("THOÁT");
        btn_thoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_thoat.setOpaque(true);
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        btn_xoa.setBackground(new java.awt.Color(236, 231, 231));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/remove.png"))); // NOI18N
        btn_xoa.setText("XÓA");
        btn_xoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_xoa.setOpaque(true);
        btn_xoa.setPreferredSize(new java.awt.Dimension(105, 23));
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_thanhToan.setBackground(new java.awt.Color(236, 231, 231));
        btn_thanhToan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_thanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/money.png"))); // NOI18N
        btn_thanhToan.setText("THANH TOÁN");
        btn_thanhToan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_thanhToan.setOpaque(true);
        btn_thanhToan.setPreferredSize(new java.awt.Dimension(105, 32));
        btn_thanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhToanActionPerformed(evt);
            }
        });

        lbl_tongTien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tongTien.setText("Tồng tiền :");

        lbl_tongTienThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tongTienThanhToan.setForeground(new java.awt.Color(255, 51, 0));
        lbl_tongTienThanhToan.setText("150.000 VNĐ");

        javax.swing.GroupLayout pnl_chucNangLayout = new javax.swing.GroupLayout(pnl_chucNang);
        pnl_chucNang.setLayout(pnl_chucNangLayout);
        pnl_chucNangLayout.setHorizontalGroup(
            pnl_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_chucNangLayout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(lbl_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_tongTienThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_chucNangLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_thanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        pnl_chucNangLayout.setVerticalGroup(
            pnl_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_chucNangLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tongTienThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(pnl_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_thanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        btn_east.add(pnl_chucNang, java.awt.BorderLayout.SOUTH);

        pnl_chuyen.setBackground(new java.awt.Color(255, 255, 255));
        pnl_chuyen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(204, 204, 204)));

        cbb_chuyenBan.setEditable(true);
        cbb_chuyenBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trống" }));
        cbb_chuyenBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_chuyenBanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Chuyển bàn :");

        lbl_banSo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_banSo.setText("Bàn O1");

        javax.swing.GroupLayout pnl_chuyenLayout = new javax.swing.GroupLayout(pnl_chuyen);
        pnl_chuyen.setLayout(pnl_chuyenLayout);
        pnl_chuyenLayout.setHorizontalGroup(
            pnl_chuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_chuyenLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_banSo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbb_chuyenBan, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_chuyenLayout.setVerticalGroup(
            pnl_chuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_chuyenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_chuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_chuyenBan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_banSo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btn_east.add(pnl_chuyen, java.awt.BorderLayout.NORTH);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(570, 402));

        table_chiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên món", "SL", "Giá", "Thanh toán", "Chức năng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_chiTietHoaDon.setRowHeight(35);
        table_chiTietHoaDon.setShowGrid(false);
        jScrollPane1.setViewportView(table_chiTietHoaDon);

        btn_east.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(btn_east, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbb_timMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_timMonActionPerformed
        String selectedValue = (String) cbb_timMon.getSelectedItem();
        if (selectedValue.equals("TẤT CẢ")) {
            loadFood(dsFoodAll);
        } else {
            List<Food> dsFood = foodDao.getFoodByCategoryName(selectedValue);
            loadFood(dsFood);
        }
    }//GEN-LAST:event_cbb_timMonActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_timMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timMonActionPerformed
        List<Food> dsFood = foodDao.searchFoodByName(txt_timMon.getText());
        loadFood(dsFood);
        pnl_thucDon.revalidate();
        pnl_thucDon.repaint();
    }//GEN-LAST:event_btn_timMonActionPerformed

    private void btn_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiActionPerformed
        dsFoodAll = foodDao.getAllFoodLimit20();
        loadFood(dsFoodAll);
        txt_timMon.setText("");
        xoaHetDuLieuTablable();
        loadChiTietHoaDon();
        cbb_timMon.setSelectedIndex(0);
    }//GEN-LAST:event_btn_lamMoiActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int[] selectedRows = table_chiTietHoaDon.getSelectedRows();
        if (selectedRows.length > 0) {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa các sản phẩm được chọn", "Xóa sản phẩm", JOptionPane.YES_NO_OPTION,
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                for (int i = selectedRows.length - 1; i >= 0; i--) {
                     odDao.deleteOrderDetail(table_chiTietHoaDon.getValueAt(selectedRows[i], 0).toString(), maHoaDon);
                     Food timFood = foodDao.searchFoodByName2(table_chiTietHoaDon.getValueAt(selectedRows[i], 0).toString());
                     foodDao.updateFoodSoLuong(timFood.getSoLuong() + Integer.parseInt(table_chiTietHoaDon.getValueAt(selectedRows[i], 1).toString()),table_chiTietHoaDon.getValueAt(selectedRows[i], 0).toString());
                  
                }
              
                dsFoodAll = foodDao.getAllFoodLimit20();
                loadFood(dsFoodAll);
                xoaHetDuLieuTablable();
                loadChiTietHoaDon();
            }
        } else {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa toàn bộ sản phẩm", "Xóa sản phẩm", JOptionPane.YES_NO_OPTION,
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                 List<OrderDetail> dsO = odDao.layDanhSachSanPham(maHoaDon);
                 for(OrderDetail o :dsO){
                      Food timFood = foodDao.searchFoodByName2(o.getFood().getFoodName());
                      foodDao.updateFoodSoLuong(timFood.getSoLuong() + o.getSoLuongMua(), o.getFood().getFoodName());
                 }
                xoaHetDuLieuTablable();
                table_chiTietHoaDon.revalidate();
                table_chiTietHoaDon.repaint();
                odDao.deleteAllOrderDetail(maHoaDon);
                
                 dsFoodAll = foodDao.getAllFoodLimit20();
                 loadFood(dsFoodAll);
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void cbb_chuyenBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_chuyenBanActionPerformed
        if (flat) {
            String b = (String) cbb_chuyenBan.getSelectedItem();
            if (b != null && !b.isEmpty()) {
                String chiTiet = b.substring(b.indexOf("Bàn ") + 4);
                lbl_banSo.setText(chiTiet);
                Order o = orderDao.timHoaDonTheoBan(chiTiet, 1);
                maHoaDon = o.getMaHD();
                xoaHetDuLieuTablable();
                loadChiTietHoaDon();
                table_chiTietHoaDon.revalidate();
                table_chiTietHoaDon.repaint();
            }
        }
    }//GEN-LAST:event_cbb_chuyenBanActionPerformed

    private void btn_thanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhToanActionPerformed
        this.setVisible(false);
        JDialog_datMonMangDi dialog = new JDialog_datMonMangDi(maNV, buttonLamMoi);
        dialog.setSize(1500, 800);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);

    }//GEN-LAST:event_btn_thanhToanActionPerformed

    public void chenButton() {
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onDelete(int row) {
                if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa sản phẩm", "Xóa sản phẩm", JOptionPane.YES_NO_OPTION,
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    String soLuongXoaString = table_chiTietHoaDon.getValueAt(row, 1).toString();
                    int soLuongXoa = Integer.parseInt(soLuongXoaString);
                    Food timFood = foodDao.searchFoodByName2(table_chiTietHoaDon.getValueAt(row, 0).toString());
                    foodDao.updateFoodSoLuong(timFood.getSoLuong() + soLuongXoa, table_chiTietHoaDon.getValueAt(row, 0).toString());

                    dsFoodAll = foodDao.getAllFoodLimit20();
                    loadFood(dsFoodAll);

                    odDao.deleteOrderDetail(table_chiTietHoaDon.getValueAt(row, 0).toString(), maHoaDon);
                    if (table_chiTietHoaDon.isEditing()) {
                        table_chiTietHoaDon.getCellEditor().stopCellEditing();
                    }
                    modelChiTieHoaDon.removeRow(row);
                    xoaHetDuLieuTablable();
                    loadChiTietHoaDon();
                    table_chiTietHoaDon.revalidate();
                    table_chiTietHoaDon.repaint();
                }
            }

            @Override
            public void onPlus(int row) {
                int value = (int) table_chiTietHoaDon.getValueAt(row, 1);
                String tenFood = (String) table_chiTietHoaDon.getValueAt(row, 0);
                Food f = foodDao.searchFoodByName2(tenFood);
                if (value == f.getSoLuong()) {
                    JOptionPane.showMessageDialog(null, "Số lượng sản phẩm không đủ !!!");
                } else {
                    value = value + 1;
                    table_chiTietHoaDon.setValueAt(value, row, 1);
                    Food timFood = foodDao.searchFoodByName2(table_chiTietHoaDon.getValueAt(row, 0).toString());
                    foodDao.updateFoodSoLuong(timFood.getSoLuong() - 1, table_chiTietHoaDon.getValueAt(row, 0).toString());

                    dsFoodAll = foodDao.getAllFoodLimit20();
                    loadFood(dsFoodAll);

                    odDao.updateSoLuong(table_chiTietHoaDon.getValueAt(row, 0).toString(), value, maHoaDon);
                    xoaHetDuLieuTablable();
                    loadChiTietHoaDon();
                    table_chiTietHoaDon.revalidate();
                    table_chiTietHoaDon.repaint();
                }
            }

            @Override
            public void onMinor(int row) {
                Object valueObject = table_chiTietHoaDon.getValueAt(row, 1);
                if (valueObject != null && valueObject instanceof Integer) {
                    int value = (int) valueObject;
                    if (value == 1) {
                        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa sản phẩm", "Đóng ứng dụng?", JOptionPane.YES_NO_OPTION,
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                            String soLuongXoaString = table_chiTietHoaDon.getValueAt(row, 1).toString();
                            int soLuongXoa = Integer.parseInt(soLuongXoaString);
                            Food timFood = foodDao.searchFoodByName2(table_chiTietHoaDon.getValueAt(row, 0).toString());
                            foodDao.updateFoodSoLuong(timFood.getSoLuong() + soLuongXoa, table_chiTietHoaDon.getValueAt(row, 0).toString());

                            dsFoodAll = foodDao.getAllFoodLimit20();
                            loadFood(dsFoodAll);

                            odDao.deleteOrderDetail(table_chiTietHoaDon.getValueAt(row, 0).toString(), maHoaDon);
                            if (table_chiTietHoaDon.isEditing()) {
                                table_chiTietHoaDon.getCellEditor().stopCellEditing();
                            }
                            modelChiTieHoaDon.removeRow(row);
                            xoaHetDuLieuTablable();
                            loadChiTietHoaDon();
                            table_chiTietHoaDon.revalidate();
                            table_chiTietHoaDon.repaint();
                        }
                    } else {
                        value = value - 1;
                        table_chiTietHoaDon.setValueAt(value, row, 1);
                        Food timFood = foodDao.searchFoodByName2(table_chiTietHoaDon.getValueAt(row, 0).toString());
                        foodDao.updateFoodSoLuong(timFood.getSoLuong() + 1, table_chiTietHoaDon.getValueAt(row, 0).toString());

                        dsFoodAll = foodDao.getAllFoodLimit20();
                        loadFood(dsFoodAll);
                        odDao.updateSoLuong(table_chiTietHoaDon.getValueAt(row, 0).toString(), value, maHoaDon);
                        xoaHetDuLieuTablable();
                        loadChiTietHoaDon();
                        table_chiTietHoaDon.revalidate();
                        table_chiTietHoaDon.repaint();
                    }
                } else {
                    // Xử lý trường hợp dữ liệu không hợp lệ
                }

            }
        };
        table_chiTietHoaDon.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        table_chiTietHoaDon.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
    }

    //===================================================================================================\\
    public void loadChiTietHoaDon() {
        tien = 0;
        List<OrderDetail> dsFood = odDao.layDanhSachSanPham(maHoaDon);
        if (dsFood.size() > 0) {
            for (OrderDetail K : dsFood) {
                tien += K.getTongTien();
                modelChiTieHoaDon.addRow(getObjCTHD(K));
            }
            lbl_tongTienThanhToan.setText("" + formatCurrency(tien));
        }

    }

    public Object[] getObjCTHD(OrderDetail od) {
        String giaBan = formatCurrency(od.getFood().getPrice());
        String tongTien = formatCurrency(od.getTongTien());
        Object[] obj = {od.getFood().getFoodName(), od.getSoLuongMua(), giaBan, tongTien};
        return obj;
    }

    public void xoaHetDuLieuTablable() {
        modelChiTieHoaDon.getDataVector().removeAllElements();
    }

    public static String formatCurrency(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("###,### VNĐ");
        return decimalFormat.format(number);
    }

    //===================================================================================================\\
    /**
     * Khởi tạo các Dao
     */
    public void setUp(Driver driver) {
        designTable();
        foodDao = new FoodDao(driver, DB_NAME);
        odDao = new OrderDetailDao(driver, DB_NAME);
        orderDao = new OrderDao(driver, DB_NAME);
        tableDao = new TableDao(driver, DB_NAME);
        modelFood = (DefaultTableModel) table_chiTietHoaDon.getModel();
        modelChiTieHoaDon = (DefaultTableModel) table_chiTietHoaDon.getModel();
        lbl_banSo.setText("Số bàn : " + tableChon.getSoBan());

    }

    public void designTable() {
        table_chiTietHoaDon.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        TableColumnModel columnModel = table_chiTietHoaDon.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(160);
        columnModel.getColumn(1).setPreferredWidth(10);
        columnModel.getColumn(2).setPreferredWidth(70);
        columnModel.getColumn(3).setPreferredWidth(70);

        table_chiTietHoaDon.setFont(new Font("Arial", Font.PLAIN, 14));
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.LEFT);
        table_chiTietHoaDon.getColumnModel().getColumn(1).setCellRenderer(renderer);
    }

    //===================================================================================================\\
    /**
     * Tạo các món ăn để đọc lên giao diện
     *
     * @param food
     * @return
     */
    public JPanel taoPanelFood(Food food) {
        JPanel panelFood = new JPanel();
        panelFood.setPreferredSize(new Dimension(150, 250));
        panelFood.setMaximumSize(new Dimension(150, 250));
        panelFood.setBackground(Color.WHITE);

        //truyền ảnh
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        imagePanel.setMaximumSize(new Dimension(150, 190));
        imagePanel.setBackground(Color.WHITE);

        JLabel lbl_anhFood = new JLabel();
        lbl_anhFood.setSize(150, 150);
        lbl_anhFood.setPreferredSize(new Dimension(150, 150));

        ImageIcon originalIcon = new ImageIcon(getClass().getResource(food.getImg()));
        ImageIcon resizedIcon = resizeImageIcon(originalIcon, lbl_anhFood.getWidth(), lbl_anhFood.getWidth());
        lbl_anhFood.setIcon(resizedIcon);

        Color borderColor = new Color(255, 204, 0); // Màu vàng
        Border border = BorderFactory.createLineBorder(borderColor, 2);
        lbl_anhFood.setBorder(border);
        imagePanel.add(lbl_anhFood);

        //Tên món ăn
        JLabel lbl_tenMon = new JLabel(food.getFoodName()); //15
        lbl_tenMon.setAlignmentX(Component.CENTER_ALIGNMENT);
        lbl_tenMon.setFont(new Font("Tahoma", Font.BOLD, 16));

        //Giá 
        JLabel lbl_gia = new JLabel("Giá: " + formatCurrency(food.getPrice()));
        lbl_gia.setAlignmentX(Component.RIGHT_ALIGNMENT);
        lbl_gia.setFont(new Font("Tahoma", Font.PLAIN, 16));
        // Số lượng
        JLabel lbl_soLuong = new JLabel("Số lượng: " + food.getSoLuong());
        lbl_soLuong.setAlignmentX(Component.RIGHT_ALIGNMENT);
        lbl_soLuong.setFont(new Font("Tahoma", Font.PLAIN, 16));
        //Set border
        panelFood.setBorder(border);

        panelFood.setLayout(new BoxLayout(panelFood, BoxLayout.Y_AXIS));
        JPanel pnl_sLvaG = new JPanel();
        pnl_sLvaG.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl_sLvaG.setMaximumSize(new Dimension(250, 50));
        pnl_sLvaG.setBackground(Color.WHITE);

        imagePanel.add(lbl_tenMon);
        panelFood.add(imagePanel);
        panelFood.add(pnl_sLvaG);
        pnl_sLvaG.add(lbl_soLuong);
        pnl_sLvaG.add(lbl_gia);

        // Thêm sự kiện khi người dùng nhấp chuột vào phòng
        panelFood.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String soLuong;
                boolean isValid = false;

                while (!isValid) {
                    soLuong = JOptionPane.showInputDialog("Nhập số lượng:");
                    if (soLuong == null) { // Người dùng nhấn Cancel
                        isValid = false;
                        break; // Thoát khỏi vòng lặp
                    } else if (soLuong != null && soLuong.matches("[1-9]\\d*")) {
                        int soLuongInt = Integer.parseInt(soLuong);
                        if (soLuongInt <= food.getSoLuong()) {
                            isValid = true;
                            Object[] obj = getObjectFood(food, soLuongInt);
                            OrderDetail spTim = odDao.timFoodInOrderDetail(maHoaDon, food.getFoodName());
                            if (spTim == null) {

                                foodDao.updateFoodSoLuong(food.getSoLuong() - soLuongInt, food.getFoodName());
                                dsFoodAll = foodDao.getAllFoodLimit20();
                                loadFood(dsFoodAll);
                                modelFood.addRow(obj);
                                double tt = soLuongInt * food.getPrice();
                                OrderDetail od = new OrderDetail(food, soLuongInt, tt);
                                odDao.taoChiTietHoaDon(od, maHoaDon);
                                xoaHetDuLieuTablable();
                                loadChiTietHoaDon();
                            } else {
                                foodDao.updateFoodSoLuong(food.getSoLuong() - soLuongInt, food.getFoodName());
                                dsFoodAll = foodDao.getAllFoodLimit20();
                                loadFood(dsFoodAll);
                                soLuongInt = soLuongInt + spTim.getSoLuongMua();
                                odDao.updateSoLuong(food.getFoodName(), soLuongInt, maHoaDon);
                                xoaHetDuLieuTablable();
                                loadChiTietHoaDon();
                                table_chiTietHoaDon.revalidate();
                                table_chiTietHoaDon.repaint();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Số lượng không đủ để đặt.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Vui lòng chỉ nhập số nguyên dương.");
                    }
                }
            }

            public void actionPerformed(ActionEvent e) {
                //Sử lí sự kiện khi nhân viên chọn món
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        return panelFood;
    }

    //===================================================================================================\\
    public void docDuLieuVaoCombobox() {
        List<Table> dsTable = tableDao.getTableByTrangThai("Đang sử dụng");
        cbb_chuyenBan.removeAllItems();
        cbb_chuyenBan.addItem("Chọn bàn");
        for (Table t : dsTable) {
            cbb_chuyenBan.addItem("Bàn " + t.getSoBan());
        }

        flat = true;
    }

    //===================================================================================================\\
    /**
     * Load danh sách food lên giao diện
     */
    public void loadFood(List<Food> dsMonAn) {
        pnl_thucDon.removeAll();

        for (Food food : dsMonAn) {
            JPanel panel = taoPanelFood(food);
            pnl_thucDon.add(panel);
        }
        pnl_thucDon.revalidate();
        pnl_thucDon.repaint();
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
    public Object[] getObjectFood(Food food, int soLuong) {
        double tienThanhToan = soLuong * food.getPrice();
        String tt = formatCurrency(tienThanhToan);
        String gia = formatCurrency(food.getPrice());
        Object[] obj = {food.getFoodName(), soLuong, gia, tt};
        return obj;
    }
    //===================================================================================================\\

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_east;
    private javax.swing.JButton btn_lamMoi;
    private javax.swing.JButton btn_thanhToan;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_timMon;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbb_chuyenBan;
    private javax.swing.JComboBox<String> cbb_timMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_banSo;
    private javax.swing.JLabel lbl_tongTien;
    private javax.swing.JLabel lbl_tongTienThanhToan;
    private javax.swing.JPanel pnl_chucNang;
    private javax.swing.JPanel pnl_chuyen;
    private javax.swing.JPanel pnl_danhSachMon;
    private javax.swing.JPanel pnl_thucDon;
    private javax.swing.JPanel pnl_timMon;
    private javax.swing.JTable table_chiTietHoaDon;
    private javax.swing.JTextField txt_timMon;
    // End of variables declaration//GEN-END:variables
}
