/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import dao.CustomerDao;
import dao.OrderDao;
import dao.TableDao;
import entity.Customer;
import entity.Employee;
import entity.EnumTrangThai;
import entity.OrderTime;
import entity.Table;
import java.awt.Window;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import util.AppUltil;

/**
 *
 * @author PC
 */
public class JDialog_DatBanTruoc extends javax.swing.JDialog {

    private Table banDuocChon;
    private String maNhanVienTao;
    private CustomerDao customerDao;
    private OrderDao orderDao;
    private String mahoadontao;
    private LocalDateTime ngayDat;
    private TableDao tableDao;
    private JButton butonLamMoi;
  

    public JDialog_DatBanTruoc(Table ban, String maNV, JButton btnLamMoi) {

        initComponents();
        butonLamMoi = btnLamMoi;
        customerDao = new CustomerDao(AppUltil.initDriver(), "quanliquanan");
        orderDao = new OrderDao(AppUltil.initDriver(), "quanliquanan");
        tableDao = new TableDao(AppUltil.initDriver(), "quanliquanan");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        banDuocChon = ban;
        maNhanVienTao = maNV;
        setGui();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_TieuDe = new javax.swing.JPanel();
        lbl_TieuDe = new javax.swing.JLabel();
        pnl_PhieuDatBan = new javax.swing.JPanel();
        lbl_SoBan = new javax.swing.JLabel();
        lbl_SoGhe = new javax.swing.JLabel();
        lbl_SoBanSet = new javax.swing.JLabel();
        lbl_soGhe = new javax.swing.JLabel();
        lbl_ThoiGianDat = new javax.swing.JLabel();
        lbl_ThoiGianDatSet = new javax.swing.JLabel();
        lbl_ThoiGianNhan = new javax.swing.JLabel();
        jcd_timeNhan = new com.toedter.calendar.JDateChooser();
        lbl_GioNhan = new javax.swing.JLabel();
        cmb_hourNhan = new javax.swing.JComboBox<>();
        lbl_nganCachGio = new javax.swing.JLabel();
        cmb_minuteNhan = new javax.swing.JComboBox<>();
        lbl_TenKhachHang = new javax.swing.JLabel();
        txt_TenKhachHang = new javax.swing.JTextField();
        lbl_SoDienThoai = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JTextField();
        btn_timKH = new javax.swing.JButton();
        lbl_TenNhanVien = new javax.swing.JLabel();
        lbl_TenNhanVienSet = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_DatBan = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_TieuDe.setBackground(new java.awt.Color(0, 51, 255));
        lbl_TieuDe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_TieuDe.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setText("ĐẶT BÀN TRƯỚC");
        lbl_TieuDe.setOpaque(true);

        javax.swing.GroupLayout pnl_TieuDeLayout = new javax.swing.GroupLayout(pnl_TieuDe);
        pnl_TieuDe.setLayout(pnl_TieuDeLayout);
        pnl_TieuDeLayout.setHorizontalGroup(
            pnl_TieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_TieuDeLayout.setVerticalGroup(
            pnl_TieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnl_PhieuDatBan.setBackground(new java.awt.Color(255, 255, 255));
        pnl_PhieuDatBan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Phiếu Đặt Bàn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lbl_SoBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SoBan.setText("Số Bàn: ");

        lbl_SoGhe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SoGhe.setText("Số Ghế: ");

        lbl_SoBanSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_SoBanSet.setOpaque(true);

        lbl_soGhe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_soGhe.setOpaque(true);

        lbl_ThoiGianDat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_ThoiGianDat.setText("Thời Gian Đặt Bàn: ");

        lbl_ThoiGianDatSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_ThoiGianDatSet.setOpaque(true);

        lbl_ThoiGianNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_ThoiGianNhan.setText("Ngày Nhận Bàn: ");

        jcd_timeNhan.setDateFormatString("dd/MM/yyyy");
        jcd_timeNhan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcd_timeNhanPropertyChange(evt);
            }
        });

        lbl_GioNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_GioNhan.setText("Giờ Nhận Bàn:");

        cmb_hourNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_hourNhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giờ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        cmb_hourNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_hourNhanActionPerformed(evt);
            }
        });
        cmb_hourNhan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmb_hourNhanPropertyChange(evt);
            }
        });

        lbl_nganCachGio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_nganCachGio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nganCachGio.setText(":");

        cmb_minuteNhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_minuteNhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phút", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        cmb_minuteNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_minuteNhanActionPerformed(evt);
            }
        });

        lbl_TenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TenKhachHang.setText("Tên Khách Hàng: ");

        txt_TenKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenKhachHangActionPerformed(evt);
            }
        });

        lbl_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SoDienThoai.setText("Số Điện Thoại:");

        btn_timKH.setBackground(new java.awt.Color(0, 51, 255));
        btn_timKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_timKH.setForeground(new java.awt.Color(255, 255, 255));
        btn_timKH.setText("Tìm");
        btn_timKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKHActionPerformed(evt);
            }
        });

        lbl_TenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TenNhanVien.setText("Tên Nhân Viên:");

        lbl_TenNhanVienSet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_TenNhanVienSet.setOpaque(true);

        javax.swing.GroupLayout pnl_PhieuDatBanLayout = new javax.swing.GroupLayout(pnl_PhieuDatBan);
        pnl_PhieuDatBan.setLayout(pnl_PhieuDatBanLayout);
        pnl_PhieuDatBanLayout.setHorizontalGroup(
            pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PhieuDatBanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_PhieuDatBanLayout.createSequentialGroup()
                        .addComponent(lbl_SoGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_soGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_PhieuDatBanLayout.createSequentialGroup()
                        .addComponent(lbl_SoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lbl_SoBanSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PhieuDatBanLayout.createSequentialGroup()
                        .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ThoiGianDat)
                            .addComponent(lbl_ThoiGianNhan))
                        .addGap(30, 30, 30)
                        .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcd_timeNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ThoiGianDatSet, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(98, 98, 98)
                .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_PhieuDatBanLayout.createSequentialGroup()
                        .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_TenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_TenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(pnl_PhieuDatBanLayout.createSequentialGroup()
                        .addComponent(lbl_GioNhan)
                        .addGap(47, 47, 47)))
                .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_PhieuDatBanLayout.createSequentialGroup()
                        .addComponent(cmb_hourNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_nganCachGio, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_minuteNhan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txt_TenKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(pnl_PhieuDatBanLayout.createSequentialGroup()
                        .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_timKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_TenNhanVienSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_PhieuDatBanLayout.setVerticalGroup(
            pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PhieuDatBanLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_TenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoBanSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_SoBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_TenKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_SoGhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_soGhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(btn_timKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_TenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ThoiGianDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ThoiGianDatSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_TenNhanVienSet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ThoiGianNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcd_timeNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_PhieuDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_minuteNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(lbl_nganCachGio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_hourNhan)
                        .addComponent(lbl_GioNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btn_DatBan.setBackground(new java.awt.Color(0, 51, 255));
        btn_DatBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_DatBan.setForeground(new java.awt.Color(255, 255, 255));
        btn_DatBan.setText("Đặt Bàn");
        btn_DatBan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_DatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DatBanActionPerformed(evt);
            }
        });

        btn_Thoat.setBackground(new java.awt.Color(255, 0, 0));
        btn_Thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Thoat.setForeground(new java.awt.Color(255, 255, 255));
        btn_Thoat.setText("Thoát");
        btn_Thoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(582, 582, 582)
                .addComponent(btn_DatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_PhieuDatBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_PhieuDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_minuteNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_minuteNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_minuteNhanActionPerformed

    private void jcd_timeNhanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcd_timeNhanPropertyChange

        Date selectedDate = jcd_timeNhan.getDate();
        Date ngayHienTai = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(selectedDate);

        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(ngayHienTai);

        int currentYear = currentDate.get(Calendar.YEAR);
        int currentMonth = currentDate.get(Calendar.MONTH);
        int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);
        int currentHour = currentDate.get(Calendar.HOUR_OF_DAY);
        int currentMinute = currentDate.get(Calendar.MINUTE);

        if (selectedDate != null && selectedDate.before(ngayHienTai)) {
            jcd_timeNhan.setDate(ngayHienTai);
        }

        Date selectedDate2 = jcd_timeNhan.getDate();
        Calendar cld = Calendar.getInstance();
        cld.setTime(selectedDate2);
        int selectedYear = cld.get(Calendar.YEAR);
        int selectedMonth = cld.get(Calendar.MONTH);
        int selectedDay = cld.get(Calendar.DAY_OF_MONTH);
        int selectedHour = cld.get(Calendar.HOUR_OF_DAY); // Thêm lấy giờ được chọn

        if (selectedYear == currentYear && selectedMonth == currentMonth && selectedDay == currentDay) {
            DefaultComboBoxModel<String> hourModel = new DefaultComboBoxModel<>(generateHoursFrom(currentHour));
            cmb_hourNhan.setModel(hourModel);
            if (selectedHour == currentHour) { // Kiểm tra nếu giờ được chọn bằng với giờ hiện tại
                DefaultComboBoxModel<String> minuteModel = new DefaultComboBoxModel<>(generateMinutes(currentMinute));
                cmb_minuteNhan.setModel(minuteModel);
            } else {
                DefaultComboBoxModel<String> minuteModel = new DefaultComboBoxModel<>(generateMinutes(0));
                cmb_minuteNhan.setModel(minuteModel);
            }
        } else {
            DefaultComboBoxModel<String> hourModel = new DefaultComboBoxModel<>(generateHoursFrom(7));
            cmb_hourNhan.setModel(hourModel);
            DefaultComboBoxModel<String> minuteModel = new DefaultComboBoxModel<>(generateMinutes(0));
            cmb_minuteNhan.setModel(minuteModel);
        }
        repaint();


    }//GEN-LAST:event_jcd_timeNhanPropertyChange

    private void txt_TenKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenKhachHangActionPerformed

    private void btn_timKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKHActionPerformed
        boolean kt= true;
        if (kt == true && txt_SoDienThoai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Số Điện Thoại Không Được Trống");
            txt_SoDienThoai.requestFocus();
            kt = false;
        } else if (kt == true && !txt_SoDienThoai.getText().matches("(^(03)[2-9]\\d{7})|(^(07)[06-9]\\d{7})|(^(08)[1-5]\\d{7})|(^(056)\\d{7})|(^(058)\\d{7})|(^(059)\\d{7})|(^(09)[0-46-9]\\d{7})")) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không đúng định dạng. Số điện thoại: Bắt đầu 03, 07, 08, 056, 058, 059, 09 và có 10 chữ số");
            txt_SoDienThoai.selectAll();
            txt_SoDienThoai.requestFocus();
            kt = false;
        } 
        else {
            Customer c = customerDao.findCustomerByPhone(txt_SoDienThoai.getText());
            if (c == null) {
                if (JOptionPane.showConfirmDialog(null, "Bạn muốn thêm khách hàng không ? ", "Thêm khách hàng", JOptionPane.YES_NO_OPTION,
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    Jdialog_QuanLyKhachHang pnl = new Jdialog_QuanLyKhachHang(txt_SoDienThoai.getText(), btn_timKH);
                    pnl.setVisible(true);
                    pnl.setSize(1450, 750);
                    pnl.setLocationRelativeTo(null);

                }
            } else {
                txt_TenKhachHang.setText(c.getTenKhachHang());
            }
        }
    }//GEN-LAST:event_btn_timKHActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_DatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DatBanActionPerformed
        if (txt_SoDienThoai.getText().isEmpty() || txt_TenKhachHang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bắt buộc phải có thông tin khách hàng");
        } else {
            Date dateNhan = jcd_timeNhan.getDate();

            String gio = (String) cmb_hourNhan.getSelectedItem();
            String phut = (String) cmb_minuteNhan.getSelectedItem();
            int gioInt = Integer.parseInt(gio);
            int phutInt = Integer.parseInt(phut);

            createOrderID();
            LocalDateTime localDateTime = toLocalDateTime(dateNhan, gioInt, phutInt);
            OrderTime ot = new OrderTime(ngayDat, localDateTime, mahoadontao, ngayDat, new Customer(txt_SoDienThoai.getText()), new Employee(maNhanVienTao), banDuocChon, 6);
            orderDao.luuHoaDonDatBan(ot);
            JOptionPane.showMessageDialog(null, "Đặt bàn thành công");

            tableDao.updateTrangThaiTable("Chờ", banDuocChon.getSoBan());
            banDuocChon.setTrangThai(EnumTrangThai.CHO);
            Window window = SwingUtilities.getWindowAncestor(this);
            window.dispose();
            butonLamMoi.doClick();
        }
    }//GEN-LAST:event_btn_DatBanActionPerformed

    private void cmb_hourNhanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmb_hourNhanPropertyChange

    }//GEN-LAST:event_cmb_hourNhanPropertyChange

    private void cmb_hourNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_hourNhanActionPerformed
        // Lấy giờ được chọn từ JComboBox của giờ
        int selectedHour = Integer.parseInt((String) cmb_hourNhan.getSelectedItem());

        // Cập nhật JComboBox của phút dựa trên giờ được chọn
        updateMinuteComboBox(selectedHour);
    }//GEN-LAST:event_cmb_hourNhanActionPerformed
    private void updateMinuteComboBox(int selectedHour) {
        DefaultComboBoxModel<String> minuteModel;
        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        int currentMinute = calendar.get(Calendar.MINUTE);
        if (selectedHour == currentHour) {
            minuteModel = new DefaultComboBoxModel<>(generateMinutes(currentMinute));
        } else {
            minuteModel = new DefaultComboBoxModel<>(generateMinutes(0));
        }
        cmb_minuteNhan.setModel(minuteModel);
    }

    
    public static LocalDateTime toLocalDateTime(Date date, int gio, int phut) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        LocalDate localDate = zonedDateTime.toLocalDate();
        LocalTime localTime = LocalTime.of(gio, phut);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        return localDateTime;
    }

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
        mahoadontao = orderID;

    }

    private String[] generateHoursFrom(int startHour) {
        String[] hours = new String[24 - startHour];
        for (int i = startHour; i <= 23; i++) {
            hours[i - startHour] = String.format("%02d", i);
        }
        return hours;
    }

    private String[] generateMinutes(int startMinute) {

        String[] minutes = new String[60 - startMinute];
        for (int i = startMinute; i < 60; i++) {
            minutes[i - startMinute] = String.format("%02d", i);

        }
        return minutes;
    }

    public void setGui() {
        lbl_SoBanSet.setText(banDuocChon.getSoBan());
        lbl_soGhe.setText(banDuocChon.getSoGhe() + "");
        LocalDateTime now = LocalDateTime.now();
        ngayDat = now;
        String formattedDateTime = formatLocalDateTime(now);
        lbl_ThoiGianDatSet.setText(formattedDateTime);

        lbl_TenNhanVienSet.setText(maNhanVienTao);
    }

    public static String formatLocalDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return dateTime.format(formatter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DatBan;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_timKH;
    private javax.swing.JComboBox<String> cmb_hourNhan;
    private javax.swing.JComboBox<String> cmb_minuteNhan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jcd_timeNhan;
    private javax.swing.JLabel lbl_GioNhan;
    private javax.swing.JLabel lbl_SoBan;
    private javax.swing.JLabel lbl_SoBanSet;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_SoGhe;
    private javax.swing.JLabel lbl_TenKhachHang;
    private javax.swing.JLabel lbl_TenNhanVien;
    private javax.swing.JLabel lbl_TenNhanVienSet;
    private javax.swing.JLabel lbl_ThoiGianDat;
    private javax.swing.JLabel lbl_ThoiGianDatSet;
    private javax.swing.JLabel lbl_ThoiGianNhan;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JLabel lbl_nganCachGio;
    private javax.swing.JLabel lbl_soGhe;
    private javax.swing.JPanel pnl_PhieuDatBan;
    private javax.swing.JPanel pnl_TieuDe;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_TenKhachHang;
    // End of variables declaration//GEN-END:variables
}
