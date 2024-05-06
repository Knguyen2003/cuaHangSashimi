/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import component.TableActionCellEditor;
import component.TableActionCellRender;
import component.TableActionEvent;
import dao.CustomerDao;
import dao.FoodDao;
import dao.OrderDao;
import dao.OrderDetailDao;
import dao.TableDao;
import entity.Customer;
import entity.Employee;
import entity.EnumTrangThai;
import entity.Food;
import entity.Order;
import entity.OrderDelivery;
import entity.OrderDetail;
import entity.Table;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import util.AppUltil;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public final class JDialog_datMonMangDi extends javax.swing.JDialog {

    private DefaultTableModel modeHoaDon;
    private DefaultTableModel modelCTHD;
    private OrderDao orderDao;
    private OrderDetailDao odDao;
    private FoodDao foodDao;
    private TableDao tableDao;
    private List<Food> dsFoodAll = null;
    private String maHoaDon;
    private String maHoaDonTao;
    private final String maNhanVienTao;
    private LocalDateTime ngayTaoHDDat;
    private CustomerDao customerDao;
    private JButton btnLamMoiTable;

    private int loaiHoaDonDuocChon;
    private double luuTru;
    private double tongTienHoaDon;
    private double tienTra;
    private String soBanDangSuDung;
    private double tienGoc;

    public JDialog_datMonMangDi(String maNV, JButton btnlm) {

        initComponents();
        btnLamMoiTable = btnlm;
        maNhanVienTao = maNV;
        setUp();
        btn_thanhToan.setEnabled(false);
        if (cmb_phuongThuc.getSelectedIndex() == 0) {
            if (!txt_tienKhachDua.getText().isEmpty()) {
                btn_thanhToan.setEnabled(true);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_West = new javax.swing.JPanel();
        pnl_North = new javax.swing.JPanel();
        pnl_ttHoaDon = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_datHang = new javax.swing.JTable();
        pnl_chiTietHoaDon = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_chiTietHoaDon = new javax.swing.JTable();
        pnl_Center = new javax.swing.JPanel();
        pnl_timFood = new javax.swing.JPanel();
        txt_tim = new javax.swing.JTextField();
        btn_tim = new javax.swing.JButton();
        cbb_timDanhMuc = new javax.swing.JComboBox<>();
        btn_lamMoi = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        pnl_dsMon = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnl_datHang = new javax.swing.JPanel();
        lbl_maHD = new javax.swing.JLabel();
        lbl_maHoaDon = new javax.swing.JLabel();
        lbl_ngayTao = new javax.swing.JLabel();
        lbl_ngayTaoHD = new javax.swing.JLabel();
        lbl_nhanVien = new javax.swing.JLabel();
        lbl_maNhanVien = new javax.swing.JLabel();
        lbl_khachHang1 = new javax.swing.JLabel();
        lbl_giamGia = new javax.swing.JLabel();
        lbl_soDienThoai1 = new javax.swing.JLabel();
        txt_soDienThoai = new javax.swing.JTextField();
        btn_taoHoaDon = new javax.swing.JButton();
        btn_themKhachHang = new javax.swing.JButton();
        lbl_tongTien1 = new javax.swing.JLabel();
        lbl_tongTien = new javax.swing.JLabel();
        lbl_tl = new javax.swing.JLabel();
        txt_diemTichLuy = new javax.swing.JTextField();
        btn_diemTichLuyPnl0 = new javax.swing.JButton();
        lbl_giamGia1 = new javax.swing.JLabel();
        lbl_khachHang = new javax.swing.JLabel();
        lbl_thanhToan1 = new javax.swing.JLabel();
        lbl_thanhToan = new javax.swing.JLabel();
        lbl_chonPhuongThuc = new javax.swing.JLabel();
        cmb_phuongThuc = new javax.swing.JComboBox<>();
        lbl_tienKhachDua1 = new javax.swing.JLabel();
        txt_tienKhachDua = new javax.swing.JTextField();
        lbl_vnd = new javax.swing.JLabel();
        lbl_tienThoi1 = new javax.swing.JLabel();
        lbl_tienThoi = new javax.swing.JLabel();
        lbl_loi = new javax.swing.JLabel();
        cb_cho = new javax.swing.JCheckBox();
        btn_thanhToan = new javax.swing.JButton();
        btn_xoaHoaDon = new javax.swing.JButton();
        btn_xoaHoaDon1 = new javax.swing.JButton();
        pnl_hoaDon = new javax.swing.JPanel();
        lbl_maDonDatHang1 = new javax.swing.JLabel();
        lbl_maDonDatHang = new javax.swing.JLabel();
        lbl_ngayDat1 = new javax.swing.JLabel();
        lbl_ngayDat = new javax.swing.JLabel();
        lbl_nhanVienHD1 = new javax.swing.JLabel();
        lbl_tongTienHoaDon = new javax.swing.JLabel();
        lbl_khachHangHD1 = new javax.swing.JLabel();
        lbl_soDienThoaiHD = new javax.swing.JLabel();
        lbl_diaChi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tta_diaChi = new javax.swing.JTextArea();
        lbl_trangThai = new javax.swing.JLabel();
        txt_khachHangHD = new javax.swing.JTextField();
        txt_soDienThoaiHD = new javax.swing.JTextField();
        lbl_ghiChu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tta_ghiChu = new javax.swing.JTextArea();
        lbl_tongTienHD = new javax.swing.JLabel();
        lbl_nhanVienHD = new javax.swing.JLabel();
        lbl_giamGiaHD1 = new javax.swing.JLabel();
        lbl_giamGiaHoaDon = new javax.swing.JLabel();
        lbl_thanhToanHD1 = new javax.swing.JLabel();
        lbl_thanhToanHD = new javax.swing.JLabel();
        btn_tao = new javax.swing.JButton();
        btn_themKh = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        lbl_trangThaiDH = new javax.swing.JLabel();
        lbl_diemTichLuy = new javax.swing.JLabel();
        txt_diemTichLuyHD = new javax.swing.JTextField();
        btn_tichLuyHD = new javax.swing.JButton();
        btn_xoaTrangPnl1 = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pnl_West.setBackground(new java.awt.Color(255, 255, 255));
        pnl_West.setPreferredSize(new java.awt.Dimension(1000, 731));
        pnl_West.setLayout(new java.awt.BorderLayout());

        pnl_North.setPreferredSize(new java.awt.Dimension(1609, 400));
        pnl_North.setLayout(new java.awt.BorderLayout());

        pnl_ttHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnl_ttHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách đơn đặt hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnl_ttHoaDon.setPreferredSize(new java.awt.Dimension(1135, 150));

        table_datHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Ngày đặt", "Tên khách hàng", "Số điện thoại", "Trạng thái", "Bàn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_datHang.setPreferredSize(new java.awt.Dimension(300, 150));
        table_datHang.setRowHeight(25);
        table_datHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_datHangMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_datHang);

        javax.swing.GroupLayout pnl_ttHoaDonLayout = new javax.swing.GroupLayout(pnl_ttHoaDon);
        pnl_ttHoaDon.setLayout(pnl_ttHoaDonLayout);
        pnl_ttHoaDonLayout.setHorizontalGroup(
            pnl_ttHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ttHoaDonLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnl_ttHoaDonLayout.setVerticalGroup(
            pnl_ttHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );

        pnl_North.add(pnl_ttHoaDon, java.awt.BorderLayout.NORTH);

        pnl_chiTietHoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnl_chiTietHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnl_chiTietHoaDon.setPreferredSize(new java.awt.Dimension(462, 150));

        table_chiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên món", "SL", "Giá", "Thanh toán", "Chức năng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_chiTietHoaDon.setPreferredSize(new java.awt.Dimension(300, 150));
        table_chiTietHoaDon.setRowHeight(30);
        jScrollPane3.setViewportView(table_chiTietHoaDon);
        if (table_chiTietHoaDon.getColumnModel().getColumnCount() > 0) {
            table_chiTietHoaDon.getColumnModel().getColumn(4).setPreferredWidth(150);
            table_chiTietHoaDon.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        javax.swing.GroupLayout pnl_chiTietHoaDonLayout = new javax.swing.GroupLayout(pnl_chiTietHoaDon);
        pnl_chiTietHoaDon.setLayout(pnl_chiTietHoaDonLayout);
        pnl_chiTietHoaDonLayout.setHorizontalGroup(
            pnl_chiTietHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_chiTietHoaDonLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnl_chiTietHoaDonLayout.setVerticalGroup(
            pnl_chiTietHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );

        pnl_North.add(pnl_chiTietHoaDon, java.awt.BorderLayout.CENTER);

        pnl_West.add(pnl_North, java.awt.BorderLayout.SOUTH);

        pnl_Center.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Center.setPreferredSize(new java.awt.Dimension(1994, 477));
        pnl_Center.setLayout(new java.awt.BorderLayout());

        pnl_timFood.setBackground(new java.awt.Color(255, 255, 255));
        pnl_timFood.setPreferredSize(new java.awt.Dimension(777, 60));

        txt_tim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_tim.setForeground(new java.awt.Color(153, 153, 153));
        txt_tim.setText("Nhập tên món ..........");
        txt_tim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_tim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_timFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_timFocusLost(evt);
            }
        });

        btn_tim.setBackground(new java.awt.Color(51, 153, 255));
        btn_tim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/search.png"))); // NOI18N
        btn_tim.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(0, 0, 0)));
        btn_tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timActionPerformed(evt);
            }
        });

        cbb_timDanhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TẤT CẢ", "Nước Uống", "Set Sinh Nhật", "Món Chiên", "Cơm Tô", "Mì Udon", "Món Nướng", "Han Rolls", "Khai Vị", "Nigiri", "Cơm Cuộn", "ichiana awesome", "Combo", "Sashimi" }));
        cbb_timDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_timDanhMucActionPerformed(evt);
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

        javax.swing.GroupLayout pnl_timFoodLayout = new javax.swing.GroupLayout(pnl_timFood);
        pnl_timFood.setLayout(pnl_timFoodLayout);
        pnl_timFoodLayout.setHorizontalGroup(
            pnl_timFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_timFoodLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txt_tim, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_tim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(cbb_timDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_lamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        pnl_timFoodLayout.setVerticalGroup(
            pnl_timFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_timFoodLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_timFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tim)
                    .addComponent(btn_tim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbb_timDanhMuc)
                    .addComponent(btn_lamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_Center.add(pnl_timFood, java.awt.BorderLayout.NORTH);

        jScrollPane5.setPreferredSize(new java.awt.Dimension(1994, 317));

        pnl_dsMon.setPreferredSize(new java.awt.Dimension(1000, 1100));
        pnl_dsMon.setLayout(new java.awt.GridLayout(0, 5, 5, 5));
        jScrollPane5.setViewportView(pnl_dsMon);

        pnl_Center.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        pnl_West.add(pnl_Center, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnl_West, java.awt.BorderLayout.CENTER);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(380, 100));

        pnl_datHang.setBackground(new java.awt.Color(255, 255, 255));

        lbl_maHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_maHD.setText("Mã hóa đơn     : ");

        lbl_ngayTao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_ngayTao.setText("Ngày tạo          :");

        lbl_nhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nhanVien.setText("Nhân viên        :");

        lbl_khachHang1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_khachHang1.setText("Khách hàng    :");

        lbl_giamGia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_giamGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_giamGia.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbl_giamGiaPropertyChange(evt);
            }
        });

        lbl_soDienThoai1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_soDienThoai1.setText("Số điện thoại   :");

        txt_soDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_soDienThoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btn_taoHoaDon.setBackground(new java.awt.Color(236, 231, 231));
        btn_taoHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/document.png"))); // NOI18N
        btn_taoHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_taoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoHoaDonActionPerformed(evt);
            }
        });

        btn_themKhachHang.setBackground(new java.awt.Color(236, 231, 231));
        btn_themKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_themKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/right-up.png"))); // NOI18N
        btn_themKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_themKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themKhachHangActionPerformed(evt);
            }
        });

        lbl_tongTien1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tongTien1.setText("Tổng tiền         :");

        lbl_tongTien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tongTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbl_tl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tl.setText("Điểm tích lũy :");

        txt_diemTichLuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_diemTichLuy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_diemTichLuy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_diemTichLuyKeyReleased(evt);
            }
        });

        btn_diemTichLuyPnl0.setBackground(new java.awt.Color(236, 231, 231));
        btn_diemTichLuyPnl0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_diemTichLuyPnl0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/right-up.png"))); // NOI18N
        btn_diemTichLuyPnl0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_diemTichLuyPnl0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diemTichLuyPnl0ActionPerformed(evt);
            }
        });

        lbl_giamGia1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_giamGia1.setText("Giảm giá          :");

        lbl_thanhToan1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_thanhToan1.setForeground(new java.awt.Color(255, 51, 0));
        lbl_thanhToan1.setText("Thanh toán  :");

        lbl_thanhToan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_thanhToan.setForeground(new java.awt.Color(255, 51, 0));
        lbl_thanhToan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbl_chonPhuongThuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_chonPhuongThuc.setText("Chọn phương thức thanh toán : ");

        cmb_phuongThuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_phuongThuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Momo", "Chuyển khoản" }));
        cmb_phuongThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_phuongThucActionPerformed(evt);
            }
        });

        lbl_tienKhachDua1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tienKhachDua1.setText("Tiền khách đưa :");

        txt_tienKhachDua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_tienKhachDua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_tienKhachDua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tienKhachDuaKeyReleased(evt);
            }
        });

        lbl_vnd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vnd.setText("VNĐ");

        lbl_tienThoi1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tienThoi1.setText("Tiền thối           :");

        lbl_tienThoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_loi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_loi.setForeground(new java.awt.Color(255, 204, 0));

        cb_cho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cb_cho.setForeground(new java.awt.Color(51, 51, 255));
        cb_cho.setText("Chờ");
        cb_cho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_choItemStateChanged(evt);
            }
        });
        cb_cho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_choActionPerformed(evt);
            }
        });

        btn_thanhToan.setBackground(new java.awt.Color(236, 231, 231));
        btn_thanhToan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_thanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/money.png"))); // NOI18N
        btn_thanhToan.setText("THANH TOÁN");
        btn_thanhToan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_thanhToan.setOpaque(true);
        btn_thanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhToanActionPerformed(evt);
            }
        });

        btn_xoaHoaDon.setBackground(new java.awt.Color(236, 231, 231));
        btn_xoaHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoaHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/remov_table.png"))); // NOI18N
        btn_xoaHoaDon.setText("XÓA TRẮNG");
        btn_xoaHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_xoaHoaDon.setOpaque(true);
        btn_xoaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaHoaDonActionPerformed(evt);
            }
        });

        btn_xoaHoaDon1.setBackground(new java.awt.Color(236, 231, 231));
        btn_xoaHoaDon1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoaHoaDon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/logout.png"))); // NOI18N
        btn_xoaHoaDon1.setText("THOÁT");
        btn_xoaHoaDon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_xoaHoaDon1.setOpaque(true);
        btn_xoaHoaDon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaHoaDon1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_datHangLayout = new javax.swing.GroupLayout(pnl_datHang);
        pnl_datHang.setLayout(pnl_datHangLayout);
        pnl_datHangLayout.setHorizontalGroup(
            pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datHangLayout.createSequentialGroup()
                        .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_ngayTaoHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_nhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_maNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_khachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_khachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnl_datHangLayout.createSequentialGroup()
                        .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_maHD, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_maHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_taoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(pnl_datHangLayout.createSequentialGroup()
                                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnl_datHangLayout.createSequentialGroup()
                                        .addComponent(lbl_tongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_tongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnl_datHangLayout.createSequentialGroup()
                                        .addComponent(lbl_soDienThoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_themKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(pnl_datHangLayout.createSequentialGroup()
                        .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_datHangLayout.createSequentialGroup()
                                .addComponent(cb_cho, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_loi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_tienKhachDua1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_vnd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_tienThoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_tienThoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_chonPhuongThuc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_phuongThuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_thanhToan1)
                                .addGap(9, 9, 9)
                                .addComponent(lbl_thanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_tl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_diemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_diemTichLuyPnl0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_datHangLayout.createSequentialGroup()
                                .addComponent(lbl_giamGia1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_giamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(pnl_datHangLayout.createSequentialGroup()
                        .addComponent(btn_thanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_xoaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_xoaHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnl_datHangLayout.setVerticalGroup(
            pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datHangLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_datHangLayout.createSequentialGroup()
                        .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_maHD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_maHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(pnl_datHangLayout.createSequentialGroup()
                        .addComponent(btn_taoHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ngayTaoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_khachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_khachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_soDienThoai1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(txt_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_themKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tongTien1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(lbl_tongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_diemTichLuyPnl0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_giamGia1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_giamGia, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_thanhToan1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_thanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_chonPhuongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_phuongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_tienKhachDua1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_tienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_vnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tienThoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tienThoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_loi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_cho))
                .addGap(18, 18, 18)
                .addGroup(pnl_datHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_thanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );

        jTabbedPane1.addTab("Bán mang đi", pnl_datHang);

        pnl_hoaDon.setBackground(new java.awt.Color(255, 255, 255));
        pnl_hoaDon.setPreferredSize(new java.awt.Dimension(225, 650));

        lbl_maDonDatHang1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_maDonDatHang1.setText("Mã đơn đặt hàng :");

        lbl_ngayDat1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_ngayDat1.setText("Ngày tạo               :");

        lbl_nhanVienHD1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nhanVienHD1.setText("Nhân viên             :");

        lbl_tongTienHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tongTienHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbl_khachHangHD1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_khachHangHD1.setText("Khách hàng          :");

        lbl_soDienThoaiHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_soDienThoaiHD.setText("Số điện thoại       :");

        lbl_diaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_diaChi.setText("Địa chỉ                  : ");

        tta_diaChi.setColumns(20);
        tta_diaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tta_diaChi.setRows(5);
        tta_diaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(tta_diaChi);

        lbl_trangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_trangThai.setText("Trạng thái            :");

        txt_khachHangHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_khachHangHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txt_soDienThoaiHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_soDienThoaiHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbl_ghiChu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_ghiChu.setText("Ghi chú                :");

        tta_ghiChu.setColumns(20);
        tta_ghiChu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tta_ghiChu.setRows(5);
        tta_ghiChu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(tta_ghiChu);

        lbl_tongTienHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_tongTienHD.setText("Tổng tiền           :");

        lbl_giamGiaHD1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_giamGiaHD1.setText("Giảm giá            : ");

        lbl_giamGiaHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_giamGiaHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lbl_thanhToanHD1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_thanhToanHD1.setForeground(new java.awt.Color(255, 51, 0));
        lbl_thanhToanHD1.setText("Thanh toán :");

        lbl_thanhToanHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_thanhToanHD.setForeground(new java.awt.Color(255, 51, 0));
        lbl_thanhToanHD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btn_tao.setBackground(new java.awt.Color(236, 231, 231));
        btn_tao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/document.png"))); // NOI18N
        btn_tao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_tao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoActionPerformed(evt);
            }
        });

        btn_themKh.setBackground(new java.awt.Color(236, 231, 231));
        btn_themKh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/right-up.png"))); // NOI18N
        btn_themKh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_themKh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themKhActionPerformed(evt);
            }
        });

        btn_luu.setBackground(new java.awt.Color(236, 231, 231));
        btn_luu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/update.png"))); // NOI18N
        btn_luu.setText("CẬP NHẬT");
        btn_luu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_luu.setOpaque(true);
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        lbl_trangThaiDH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lbl_diemTichLuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_diemTichLuy.setText("Điểm tích lũy     :");

        txt_diemTichLuyHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_diemTichLuyHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_diemTichLuyHD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_diemTichLuyHDKeyReleased(evt);
            }
        });

        btn_tichLuyHD.setBackground(new java.awt.Color(236, 231, 231));
        btn_tichLuyHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/right-up.png"))); // NOI18N
        btn_tichLuyHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_tichLuyHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tichLuyHDActionPerformed(evt);
            }
        });

        btn_xoaTrangPnl1.setBackground(new java.awt.Color(236, 231, 231));
        btn_xoaTrangPnl1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoaTrangPnl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/remov_table.png"))); // NOI18N
        btn_xoaTrangPnl1.setText("XÓA TRẮNG");
        btn_xoaTrangPnl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_xoaTrangPnl1.setOpaque(true);
        btn_xoaTrangPnl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaTrangPnl1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnl_hoaDonLayout = new javax.swing.GroupLayout(pnl_hoaDon);
        pnl_hoaDon.setLayout(pnl_hoaDonLayout);
        pnl_hoaDonLayout.setHorizontalGroup(
            pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_hoaDonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_giamGiaHD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_tongTienHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ghiChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_diaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(lbl_soDienThoaiHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_khachHangHD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_nhanVienHD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ngayDat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_maDonDatHang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_trangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_diemTichLuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_nhanVienHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_ngayDat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_hoaDonLayout.createSequentialGroup()
                            .addComponent(lbl_maDonDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_tao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_tongTienHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_trangThaiDH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_hoaDonLayout.createSequentialGroup()
                            .addComponent(txt_soDienThoaiHD, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_themKh, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_khachHangHD, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_giamGiaHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_hoaDonLayout.createSequentialGroup()
                            .addComponent(txt_diemTichLuyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_tichLuyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(pnl_hoaDonLayout.createSequentialGroup()
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_hoaDonLayout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(lbl_thanhToanHD, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_hoaDonLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbl_thanhToanHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_hoaDonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_xoaTrangPnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_hoaDonLayout.setVerticalGroup(
            pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_hoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_maDonDatHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_maDonDatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ngayDat1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ngayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nhanVienHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nhanVienHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_khachHangHD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_khachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_soDienThoaiHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_soDienThoaiHD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_themKh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_hoaDonLayout.createSequentialGroup()
                        .addComponent(lbl_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_hoaDonLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_trangThaiDH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tongTienHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tongTienHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_diemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_diemTichLuyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_tichLuyHD, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_giamGiaHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_giamGiaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_thanhToanHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_thanhToanHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_hoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_xoaTrangPnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
        );

        jTabbedPane1.addTab("Đặt hàng", pnl_hoaDon);

        jPanel1.add(jTabbedPane1, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_datHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_datHangMouseClicked
        int r = table_datHang.getSelectedRow();
        maHoaDon = (String) table_datHang.getValueAt(r, 0);
        soBanDangSuDung = (String) table_datHang.getValueAt(r, 5);
        List<OrderDetail> dsOd = odDao.layDanhSachSanPham(maHoaDon);

        if (table_datHang.getValueAt(r, 5).toString().equalsIgnoreCase("Trống")) {
            if (table_datHang.getValueAt(r, 4).toString().equalsIgnoreCase("Chờ")) {
                jTabbedPane1.setSelectedIndex(0);
                loaiHoaDonDuocChon = 0;
                if (dsOd.size() > 0) {
                    xoaHetDuLieuTablableCTHD();
                    loadChiTietHoaDon(dsOd);
                    setUpPane0(maHoaDon, r);
                } else {
                    xoaHetDuLieuTablableCTHD();
                    setUpPane0(maHoaDon, r);
                }
            } else {
                jTabbedPane1.setSelectedIndex(1);
                loaiHoaDonDuocChon = 1;
                if (dsOd.size() > 0) {
                    xoaHetDuLieuTablableCTHD();
                    loadChiTietHoaDon(dsOd);
                    setUpPane1(maHoaDon);
                } else {
                    xoaHetDuLieuTablableCTHD();
                    setUpPane1(maHoaDon);
                }
            }
        } else {
            jTabbedPane1.setSelectedIndex(0);
            loaiHoaDonDuocChon = 0;
            if (dsOd.size() > 0) {
                xoaHetDuLieuTablableCTHD();
                loadChiTietHoaDon(dsOd);
                setUpPane0(maHoaDon, r);
            } else {
                xoaHetDuLieuTablableCTHD();
                setUpPane0(maHoaDon, r);
            }
        }
    }//GEN-LAST:event_table_datHangMouseClicked

    private void btn_timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timActionPerformed
        List<Food> dsFood = foodDao.searchFoodByName(txt_tim.getText());
        loadFood(dsFood);

    }//GEN-LAST:event_btn_timActionPerformed

    private void btn_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiActionPerformed
        dsFoodAll = foodDao.getAllFoodLimit20();
        loadFood(dsFoodAll);
        txt_tim.setText("");
    }//GEN-LAST:event_btn_lamMoiActionPerformed

    private void cbb_timDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_timDanhMucActionPerformed
        String selectedValue = (String) cbb_timDanhMuc.getSelectedItem();
        if (selectedValue.equals("TẤT CẢ")) {
            loadFood(dsFoodAll);
        } else {
            List<Food> dsFood = foodDao.getFoodByCategoryName(selectedValue);
            loadFood(dsFood);
        }
    }//GEN-LAST:event_cbb_timDanhMucActionPerformed

    private void btn_taoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoHoaDonActionPerformed
        createOrderID();
        lbl_maHoaDon.setText(maHoaDonTao);
        LocalDateTime now = LocalDateTime.now();
        lbl_khachHang.setText("Khách vãng lai");
        ngayTaoHDDat = now;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = now.format(formatter);
        lbl_ngayTaoHD.setText(formattedDate);
        lbl_maNhanVien.setText(maNhanVienTao);

        Customer kvl = customerDao.findCustomerByID("KH0000");
        Order o = new Order(lbl_maHoaDon.getText(), ngayTaoHDDat, kvl, new Employee(lbl_maNhanVien.getText()), null, 5);
        orderDao.luuHoaDonBanMangDi(o);

        xoaHetDuLieuTablableCTHD();
        maHoaDon = lbl_maHoaDon.getText();
    }//GEN-LAST:event_btn_taoHoaDonActionPerformed

    private void btn_taoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoActionPerformed
        //tao ma
        createOrderID();
        lbl_maDonDatHang.setText(maHoaDonTao);
        maHoaDon = maHoaDonTao;
        LocalDateTime now = LocalDateTime.now();
        ngayTaoHDDat = now;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = now.format(formatter);
        lbl_ngayDat.setText(formattedDate);
        lbl_nhanVienHD.setText(maNhanVienTao);
    }//GEN-LAST:event_btn_taoActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed

        if (lbl_trangThaiDH.getText().isEmpty()) {
            if (txt_soDienThoaiHD.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Bắt buộc nhập số điện thoại khách hàng");
            } else if (tta_diaChi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Bắt buộc nhập địa chỉ khách hàng");
            } else {
                luuHoaDonGiaoHang();
            }

        } else if (lbl_trangThaiDH.getText().equalsIgnoreCase("Đang chuẩn bị")) {

            orderDao.updateTrangThaiHoaDon(maHoaDon, 3, tongTienHoaDon);
            lbl_trangThaiDH.setText("Đang giao");
            xuatHD_filepdfMangDi();
            xoaTrangPanel1();
            xoaHetDuLieuTablableHoaDon();
            xoaHetDuLieuTablableCTHD();
            loadOrder();
            table_datHang.revalidate();
            table_chiTietHoaDon.revalidate();
            table_datHang.repaint();
            table_chiTietHoaDon.repaint();
        } else {
            orderDao.updateTrangThaiHoaDon(maHoaDon, 4, tongTienHoaDon);
            if (!txt_soDienThoaiHD.getText().isEmpty()) {
                Customer khTim = customerDao.findCustomerByPhone(txt_soDienThoaiHD.getText());
                if(tienGoc > tongTienHoaDon){
                   customerDao.updateDiemTichLuy(khTim.getMaKhachHang(),0);
                   customerDao.updateDiemTichLuy(khTim.getMaKhachHang(), tongTienHoaDon / 1000);
                }else{
                    customerDao.updateDiemTichLuy(khTim.getMaKhachHang(),khTim.getDiemTichLuy()+ tongTienHoaDon / 1000);
                }
            }
            xoaTrangPanel1();
            xoaHetDuLieuTablableHoaDon();
            xoaHetDuLieuTablableCTHD();
            loadOrder();
            table_datHang.revalidate();
            table_chiTietHoaDon.revalidate();
            table_datHang.repaint();
            table_chiTietHoaDon.repaint();
        }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void txt_timFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_timFocusGained
        if (txt_tim.getText().equalsIgnoreCase("Nhập tên món ..........")) {
            txt_tim.setText("");
            txt_tim.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_timFocusGained

    private void txt_timFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_timFocusLost
        if (txt_tim.getText().isEmpty()) {
            txt_tim.setText("Nhập tên món ..........");
            txt_tim.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txt_timFocusLost

    private void btn_themKhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themKhActionPerformed
        if (txt_soDienThoaiHD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số điện thoại khách hàng");
        } else {
            Customer c = customerDao.findCustomerByPhone(txt_soDienThoaiHD.getText());
            if (c == null) {
                if (JOptionPane.showConfirmDialog(null, "Bạn muốn thêm khách hàng không ? ", "Thêm khách hàng", JOptionPane.YES_NO_OPTION,
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    Jdialog_QuanLyKhachHang pnl = new Jdialog_QuanLyKhachHang(txt_soDienThoaiHD.getText(), btn_themKh);
                    pnl.setVisible(true);
                    pnl.setSize(1450, 750);
                    pnl.setLocationRelativeTo(null);
                    
                    btn_themKh.doClick();

                }
            } else {
                txt_khachHangHD.setText(c.getTenKhachHang());
                if (c.getDiemTichLuy() > 100) {
                    txt_diemTichLuyHD.setText(c.getDiemTichLuy() + "");
                } else {
                    txt_diemTichLuyHD.setText("");
                    lbl_giamGiaHoaDon.setText("0 VNĐ");
                }
            }
        }
    }//GEN-LAST:event_btn_themKhActionPerformed

    private void btn_themKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themKhachHangActionPerformed
        if (txt_soDienThoai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số điện thoại khách hàng");
        } else {
            Customer c = customerDao.findCustomerByPhone(txt_soDienThoai.getText());
            if (c == null) {
                if (JOptionPane.showConfirmDialog(null, "Bạn muốn thêm khách hàng không ? ", "Thêm khách hàng", JOptionPane.YES_NO_OPTION,
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    Jdialog_QuanLyKhachHang pnl = new Jdialog_QuanLyKhachHang(txt_soDienThoai.getText(), btn_themKhachHang);
                    pnl.setVisible(true);
                    pnl.setSize(1450, 750);
                    pnl.setLocationRelativeTo(null);

                }
            } else {
                lbl_khachHang.setText(c.getTenKhachHang());
                if (c.getDiemTichLuy() > 100) {
                    txt_diemTichLuy.setText(c.getDiemTichLuy() + "");
                } else {
                    lbl_giamGia.setText("0 VNĐ");
                }
            }
        }
    }//GEN-LAST:event_btn_themKhachHangActionPerformed

    private void btn_tichLuyHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tichLuyHDActionPerformed
        Customer cus = customerDao.findCustomerByPhone(txt_soDienThoaiHD.getText());
        if (txt_diemTichLuyHD.getText().isEmpty()) {
            lbl_giamGiaHoaDon.setText("0 VNĐ");
            lbl_thanhToanHD.setText(formatCurrency(tienGoc) + "   ");
            tongTienHoaDon = tienGoc;
        } else {
            double tienGiamGia = (cus.getDiemTichLuy() / 100) * 1000;
            lbl_giamGiaHoaDon.setText(formatCurrency(tienGiamGia));
            tongTienHoaDon = tongTienHoaDon - tienGiamGia;
            lbl_thanhToanHD.setText(formatCurrency(tongTienHoaDon) + "   ");
        }
    }//GEN-LAST:event_btn_tichLuyHDActionPerformed

    private void btn_thanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhToanActionPerformed

        Table t= null;
         
         if (soBanDangSuDung!=null &&  !soBanDangSuDung.equalsIgnoreCase("Trống")) {
            tableDao.updateTrangThaiTable("Trống", soBanDangSuDung);
            t = tableDao.timBanTheoSoBan(soBanDangSuDung);
            t.setTrangThai(EnumTrangThai.TRONG);
        }
        btnLamMoiTable.doClick();
        Order o = new Order(lbl_maHoaDon.getText(), ngayTaoHDDat, new Customer(lbl_khachHang.getText(),
                txt_soDienThoai.getText()), new Employee(lbl_maNhanVien.getText()),
                tongTienHoaDon,
                Double.parseDouble(txt_tienKhachDua.getText()),
                tienTra,
                t, (String) cmb_phuongThuc.getSelectedItem(),
                4);
       JOptionPane.showMessageDialog(null, o);
        orderDao.thanhToanHoaDonBanMangDi(o);

        Customer khTim = customerDao.findCustomerByPhone(txt_soDienThoai.getText());
      
        if(khTim!=null){
            if (tienGoc > tongTienHoaDon) {
                
                customerDao.updateDiemTichLuy(khTim.getMaKhachHang(), 0);
                customerDao.updateDiemTichLuy(khTim.getMaKhachHang(), tongTienHoaDon / 1000);
                
            } else {
                customerDao.updateDiemTichLuy(khTim.getMaKhachHang(), khTim.getDiemTichLuy() + tongTienHoaDon / 1000);
            }
        }
        
        xuatHD_filepdf();
        xoaTrangPanel0();
        xoaHetDuLieuTablableHoaDon();
        xoaHetDuLieuTablableCTHD();
        loadOrder();
        table_datHang.revalidate();
        table_datHang.repaint();
        table_chiTietHoaDon.revalidate();
        table_chiTietHoaDon.repaint();


    }//GEN-LAST:event_btn_thanhToanActionPerformed

    private void cb_choItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_choItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            choHoaDonBanMangVe();
            xoaTrangPanel0();
            xoaHetDuLieuTablableHoaDon();
            xoaHetDuLieuTablableCTHD();
            loadOrder();
            table_datHang.revalidate();
            table_chiTietHoaDon.revalidate();
            table_datHang.repaint();
            table_chiTietHoaDon.repaint();
            
            cb_cho.setSelected(false);

        }
    }//GEN-LAST:event_cb_choItemStateChanged

    private void btn_xoaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaHoaDonActionPerformed
        xoaTrangPanel0();
        xoaHetDuLieuTablableHoaDon();
        loadOrder();
        xoaHetDuLieuTablableCTHD();
        xoaHetDuLieuTablableCTHD();
    }//GEN-LAST:event_btn_xoaHoaDonActionPerformed

    private void btn_diemTichLuyPnl0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diemTichLuyPnl0ActionPerformed
        Customer cus = customerDao.findCustomerByPhone(txt_soDienThoai.getText());

        
        if (txt_diemTichLuy.getText().isEmpty()) {
            lbl_giamGia.setText("0 VNĐ");
            lbl_thanhToan.setText(formatCurrency(tienGoc) + "   ");
            tongTienHoaDon = tienGoc;
        } else {
            double tienGiamGia = (cus.getDiemTichLuy() / 100) * 1000;
            lbl_giamGia.setText(formatCurrency(tienGiamGia));
            tongTienHoaDon = tongTienHoaDon - tienGiamGia;
            lbl_thanhToan.setText(formatCurrency(tongTienHoaDon) + "   ");
        }

    }//GEN-LAST:event_btn_diemTichLuyPnl0ActionPerformed

    private void lbl_giamGiaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbl_giamGiaPropertyChange

    }//GEN-LAST:event_lbl_giamGiaPropertyChange

    private void txt_tienKhachDuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tienKhachDuaKeyReleased
        try {
            // Lấy giá trị từ ô nhập tiền
            double nhapTien = Double.parseDouble(txt_tienKhachDua.getText());
            double tienThua = nhapTien - tongTienHoaDon;
            if (tienThua < 0) {
                lbl_loi.setText("Tiền khách đưa chưa đủ !!!");
                btn_thanhToan.setEnabled(false);
            } else {
                lbl_loi.setText("");
                tienTra = tienThua;
                DecimalFormat dft = new DecimalFormat("###,###");
                String tinhTienThua = dft.format(tienThua);
                tinhTienThua = tinhTienThua.replace(",", ".");
                lbl_tienThoi.setText(tinhTienThua + " VNĐ ");
                btn_thanhToan.setEnabled(true);

            }

        } catch (NumberFormatException ex) {
            // Xử lý nếu người dùng nhập vào không phải là số
            if (!txt_tienKhachDua.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Dữ liệu nhập vào không hợp lệ");
            }

        }
    }//GEN-LAST:event_txt_tienKhachDuaKeyReleased

    private void btn_xoaTrangPnl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaTrangPnl1ActionPerformed
        xoaTrangPanel1();
        xoaHetDuLieuTablableHoaDon();
        loadOrder();
        xoaHetDuLieuTablableCTHD();
        xoaHetDuLieuTablableCTHD();
    }//GEN-LAST:event_btn_xoaTrangPnl1ActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        this.setVisible(false);
        btnLamMoiTable.doClick();
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_xoaHoaDon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaHoaDon1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_xoaHoaDon1ActionPerformed

    private void cmb_phuongThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_phuongThucActionPerformed

        int loai = cmb_phuongThuc.getSelectedIndex();
        if (loai == 0) {
            txt_tienKhachDua.setEnabled(true);
            btn_thanhToan.setEnabled(false);
        } else {
            txt_tienKhachDua.setEnabled(false);
            btn_thanhToan.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_phuongThucActionPerformed

    private void cb_choActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_choActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_choActionPerformed

    private void txt_diemTichLuyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diemTichLuyKeyReleased
        Customer cus = customerDao.findCustomerByPhone(txt_soDienThoai.getText());

      
        if (txt_diemTichLuy.getText().isEmpty()) {
            lbl_giamGia.setText("0 VNĐ");
            lbl_thanhToan.setText(formatCurrency(tienGoc) + "   ");
            tongTienHoaDon = tienGoc;
        } else {
            double tienGiamGia = (cus.getDiemTichLuy() / 100) * 10000;
            lbl_giamGia.setText(formatCurrency(tienGiamGia));
            tongTienHoaDon = tongTienHoaDon - tienGiamGia;
            lbl_thanhToan.setText(formatCurrency(tongTienHoaDon) + "   ");
        }
    }//GEN-LAST:event_txt_diemTichLuyKeyReleased

    private void txt_diemTichLuyHDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_diemTichLuyHDKeyReleased
        Customer cus = customerDao.findCustomerByPhone(txt_soDienThoaiHD.getText());

        if (txt_diemTichLuyHD.getText().isEmpty()) {
            lbl_giamGiaHoaDon.setText("0 VNĐ");
             lbl_thanhToanHD.setText(formatCurrency(tienGoc) + "   ");
             tongTienHoaDon = tienGoc;
        } else {
            double tienGiamGia = (cus.getDiemTichLuy() / 100) * 10000;
            lbl_giamGiaHoaDon.setText(formatCurrency(tienGiamGia));
            tongTienHoaDon = tongTienHoaDon - tienGiamGia;
            lbl_thanhToanHD.setText(formatCurrency(tongTienHoaDon) + "   ");
        }

    }//GEN-LAST:event_txt_diemTichLuyHDKeyReleased
    public void xoaTrangPanel1() {
        lbl_maDonDatHang.setText("");
        lbl_ngayDat.setText("");
        lbl_nhanVienHD.setText("");
        txt_khachHangHD.setText("");
        txt_soDienThoaiHD.setText("");
        tta_diaChi.setText("");
        tta_ghiChu.setText("");
        lbl_trangThaiDH.setText("");
        lbl_tongTienHoaDon.setText("");
        txt_diemTichLuyHD.setText("");
        lbl_giamGiaHoaDon.setText("");
    }

    public void xoaTrangPanel0() {
        lbl_maHoaDon.setText("");
        lbl_ngayTaoHD.setText("");
        lbl_maNhanVien.setText("");
        lbl_khachHang.setText("");
        txt_soDienThoai.setText("");
        lbl_tongTien.setText("");
        txt_diemTichLuy.setText("");
        lbl_giamGia.setText("");
        lbl_thanhToan.setText("");
        txt_tienKhachDua.setText("");
        lbl_tienThoi.setText("");
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
        maHoaDonTao = orderID;

    }

    //===================================================================================================\\
    public void setUpPane0(String maHD, int r) {
        Order o = orderDao.timHoaDonTheoMa(maHoaDon);
        lbl_maHoaDon.setText(o.getMaHD());

        ngayTaoHDDat = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = LocalDateTime.now().format(formatter);
        lbl_ngayTaoHD.setText(formattedDate);

        lbl_maNhanVien.setText(maNhanVienTao);

        if (o.getKhachHang() == null || o.getKhachHang().getSoDienThoai().equalsIgnoreCase("Khách vãng lai")) {
            lbl_khachHang.setText("Khách vãng lai");
            lbl_giamGia.setText("0 VNĐ");
        } else {
            txt_soDienThoai.setText(o.getKhachHang().getSoDienThoai());
            if (r != -1 && table_datHang.getValueAt(r, 4).toString().equalsIgnoreCase("Chờ")) {
                btn_themKhachHang.doClick();
            }
        }

        lbl_tienThoi.setText("0 VNĐ");

        List<OrderDetail> od = odDao.layDanhSachSanPham(maHD);
        double tongTien = 0;
        for (OrderDetail i : od) {
            tongTien += i.getTongTien();
        }
        tienGoc = tongTien;
        tongTienHoaDon = tongTien;
        lbl_tongTien.setText(formatCurrency(tongTien) + " ");

        
        lbl_thanhToan.setText(formatCurrency(tongTienHoaDon));
    }

    //=========================================================================================================//
    public void setUpPane1(String maHD) {
        OrderDelivery o = orderDao.timHoaDonDatHangTheoMa(maHoaDon);
        lbl_maDonDatHang.setText(o.getMaHD());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        ngayTaoHDDat = LocalDateTime.now();
        String formattedDate = ngayTaoHDDat.format(formatter);
        lbl_ngayDat.setText(formattedDate);
        orderDao.upDateNgayTao(maHD, ngayTaoHDDat);

        lbl_nhanVienHD.setText(o.getNhanVien().getMaNhanVien());
        txt_soDienThoaiHD.setText(o.getKhachHang().getSoDienThoai());
        Customer cus = customerDao.findCustomerByPhone(o.getKhachHang().getSoDienThoai());
        txt_khachHangHD.setText(cus.getTenKhachHang());

        String tenKH;
        if (o.getKhachHang() == null) {
            tenKH = "Khách vãng lai";
        } else {
            tenKH = o.getKhachHang().getTenKhachHang();
        }
        tta_diaChi.setText(o.getDiaChi());
        switch (o.getTrangThai()) {
            case 1:
                lbl_trangThaiDH.setText("Chưa thanh toán");
                break;
            case 2:
                lbl_trangThaiDH.setText("Đang chuẩn bị");
                break;
            case 3:
                lbl_trangThaiDH.setText("Đang giao");
                break;
            default:
                lbl_trangThaiDH.setText("Đã thanh toán");
                break;
        }

        tta_ghiChu.setText(o.getGhiChu());

        List<OrderDetail> od = odDao.layDanhSachSanPham(maHD);
        double tongTien = 0;
        for (OrderDetail i : od) {
            tongTien += i.getTongTien();
        }
        tienGoc = tongTien;
        tongTienHoaDon = tongTien;
        lbl_tongTienHoaDon.setText(formatCurrency(tongTien) + "  ");
        lbl_thanhToanHD.setText(formatCurrency(tongTien) + "  ");
        lbl_giamGiaHoaDon.setText("0 VNĐ");
        luuTru = cus.getDiemTichLuy();
        txt_diemTichLuyHD.setText(cus.getDiemTichLuy() + "");
    }

    //=========================================================================================================//
    public void luuHoaDonGiaoHang() {
        String ghiChu;
        if (tta_ghiChu.getText().isEmpty()) {
            ghiChu = "Trống";
        } else {
            ghiChu = tta_ghiChu.getText();
        }
        OrderDelivery o = new OrderDelivery(tta_diaChi.getText(),
                ghiChu,
                lbl_maDonDatHang.getText(),
                ngayTaoHDDat,
                new Customer(txt_khachHangHD.getText(), txt_soDienThoaiHD.getText()),
                new Employee(lbl_nhanVienHD.getText()), 2);
        orderDao.luuHoaDonDatHang(o);
        lbl_trangThaiDH.setText("Đang chuẩn bị");

        JOptionPane.showMessageDialog(null, "Đã lưu hóa đơn đặt hàng!!!");

        xoaHetDuLieuTablableHoaDon();
        loadOrder();
        xoaHetDuLieuTablableCTHD();
        table_datHang.revalidate();
        table_datHang.repaint();
        table_chiTietHoaDon.revalidate();
        table_chiTietHoaDon.repaint();

    }

    //=========================================================================================================//
    public void choHoaDonBanMangVe() {
        Order o = new Order(lbl_maHoaDon.getText(), ngayTaoHDDat, new Customer(lbl_khachHang.getText(),
                txt_soDienThoai.getText()), new Employee(lbl_maNhanVien.getText()));

        orderDao.capNhatHoaDonBanMangDi(o);

        xoaHetDuLieuTablableCTHD();
        xoaHetDuLieuTablableHoaDon();
        loadOrder();
        table_chiTietHoaDon.revalidate();
        table_chiTietHoaDon.repaint();
    }
    //=========================================================================================================//

    public void xoaTrangDatHang() {
        lbl_maDonDatHang.setText("");
        lbl_ngayDat.setText("");
        lbl_nhanVienHD.setText("");
        txt_khachHangHD.setText("");
        tta_diaChi.setText("");
        lbl_trangThaiDH.setText("");
        tta_ghiChu.setText("");
        lbl_tongTienHoaDon.setText("");
        lbl_giamGiaHoaDon.setText("");
        lbl_thanhToanHD.setText("");
    }

    //=========================================================================================================//
    public void setUp() {
        designTable();
        modeHoaDon = (DefaultTableModel) table_datHang.getModel();
        modelCTHD = (DefaultTableModel) table_chiTietHoaDon.getModel();
        orderDao = new OrderDao(AppUltil.initDriver(), "quanliquanan");
        odDao = new OrderDetailDao(AppUltil.initDriver(), "quanliquanan");
        tableDao = new TableDao(AppUltil.initDriver(), "quanliquanan");
        foodDao = new FoodDao(AppUltil.initDriver(), "quanliquanan");
        customerDao = new CustomerDao(AppUltil.initDriver(), "quanliquanan");

        dsFoodAll = foodDao.getAllFoodLimit20();
        loadFood(dsFoodAll);
        loadOrder();

    }

    //=========================================================================================================//
    public void designTable() {
        table_chiTietHoaDon.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_datHang.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        TableColumnModel columnModel = table_chiTietHoaDon.getColumnModel();
        columnModel.getColumn(4).setPreferredWidth(150);
        table_chiTietHoaDon.setFont(new Font("Arial", Font.PLAIN, 14));
        table_datHang.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    //=========================================================================================================//
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
                    timFood.setSoLuong(timFood.getSoLuong() + soLuongXoa);
                    dsFoodAll = foodDao.getAllFoodLimit20();
                    loadFood(dsFoodAll);

                    odDao.deleteOrderDetail(table_chiTietHoaDon.getValueAt(row, 0).toString(), maHoaDon);
                    if (table_chiTietHoaDon.isEditing()) {
                        table_chiTietHoaDon.getCellEditor().stopCellEditing();
                    }
                    modelCTHD.removeRow(row);
                    table_chiTietHoaDon.revalidate();
                    table_chiTietHoaDon.repaint();

                    if (loaiHoaDonDuocChon == 1) {
                        setUpPane1(maHoaDon);
                    } else {
                        setUpPane0(maHoaDon, -1);
                    }
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
                    timFood.setSoLuong(timFood.getSoLuong() - 1);
                    dsFoodAll = foodDao.getAllFoodLimit20();
                    loadFood(dsFoodAll);

                    odDao.updateSoLuong(table_chiTietHoaDon.getValueAt(row, 0).toString(), value, maHoaDon);
                    xoaHetDuLieuTablableCTHD();
                    loadChiTietHoaDon2();
                    table_chiTietHoaDon.revalidate();
                    table_chiTietHoaDon.repaint();

                    if (loaiHoaDonDuocChon == 1) {
                        setUpPane1(maHoaDon);
                    } else {
                        setUpPane0(maHoaDon, -1);
                    }
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
                            timFood.setSoLuong(timFood.getSoLuong() + soLuongXoa);
                            dsFoodAll = foodDao.getAllFoodLimit20();
                            loadFood(dsFoodAll);

                            odDao.deleteOrderDetail(table_chiTietHoaDon.getValueAt(row, 0).toString(), maHoaDon);
                            if (table_chiTietHoaDon.isEditing()) {
                                table_chiTietHoaDon.getCellEditor().stopCellEditing();
                            }
                            modelCTHD.removeRow(row);
                            table_chiTietHoaDon.revalidate();
                            table_chiTietHoaDon.repaint();

                            if (loaiHoaDonDuocChon == 1) {
                                setUpPane1(maHoaDon);
                            } else {
                                setUpPane0(maHoaDon, -1);
                            }
                        }
                    } else {
                        value = value - 1;
                        table_chiTietHoaDon.setValueAt(value, row, 1);
                        Food timFood = foodDao.searchFoodByName2(table_chiTietHoaDon.getValueAt(row, 0).toString());
                        foodDao.updateFoodSoLuong(timFood.getSoLuong() + 1, table_chiTietHoaDon.getValueAt(row, 0).toString());
                        timFood.setSoLuong(timFood.getSoLuong() + 1);
                        dsFoodAll = foodDao.getAllFoodLimit20();
                        loadFood(dsFoodAll);
                        odDao.updateSoLuong(table_chiTietHoaDon.getValueAt(row, 0).toString(), value, maHoaDon);
                        xoaHetDuLieuTablableCTHD();
                        loadChiTietHoaDon2();
                        table_chiTietHoaDon.revalidate();
                        table_chiTietHoaDon.repaint();

                        if (loaiHoaDonDuocChon == 1) {
                            setUpPane1(maHoaDon);
                        } else {
                            setUpPane0(maHoaDon, -1);
                        }
                    }
                } else {
                    // Xử lý trường hợp dữ liệu không hợp lệ
                }

            }
        };
        table_chiTietHoaDon.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        table_chiTietHoaDon.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
    }
    //=========================================================================================================//

    public void loadChiTietHoaDon2() {
        List<OrderDetail> dsFood = odDao.layDanhSachSanPham(maHoaDon);
        if (!dsFood.isEmpty()) {
            for (OrderDetail K : dsFood) {
                modelCTHD.addRow(getObjCTHD(K));
                modelCTHD.fireTableDataChanged();
            }
        }
        chenButton();

    }
    //=========================================================================================================//

    public JPanel taoPanelFood(Food food) {
        JPanel panelFood = new JPanel();
        panelFood.setPreferredSize(new Dimension(50, 200));
        panelFood.setMaximumSize(new Dimension(50, 100));
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
//
                while (!isValid) {
                    soLuong = JOptionPane.showInputDialog("Nhập số lượng:");
                    if (soLuong == null) { // Người dùng nhấn Cancel
                        isValid = false;
                        break; // Thoát khỏi vòng lặp
                    } else if (soLuong != null && soLuong.matches("[1-9]\\d*")) {
                        int soLuongInt = Integer.parseInt(soLuong);
                        if (soLuongInt <= food.getSoLuong()) {
                            Order ktraO = orderDao.timHoaDonTheoMa(maHoaDon);
                            isValid = true;
                            Object[] obj = getObjectFood(food, soLuongInt);
                            OrderDetail spTim = odDao.timFoodInOrderDetail(maHoaDon, food.getFoodName());
                            if (ktraO != null) {
                                if (spTim == null) {
                                    foodDao.updateFoodSoLuong(food.getSoLuong() - soLuongInt, food.getFoodName());
                                    food.setSoLuong(food.getSoLuong() - soLuongInt);
                                    dsFoodAll = foodDao.getAllFoodLimit20();
                                    loadFood(dsFoodAll);
                                    pnl_dsMon.revalidate();
                                    pnl_dsMon.repaint();
                                    modelCTHD.addRow(obj);
                                    double tt = soLuongInt * food.getPrice();
                                    OrderDetail od = new OrderDetail(food, soLuongInt, tt);
                                    odDao.taoChiTietHoaDon(od, maHoaDon);
                                    xoaHetDuLieuTablableCTHD();
                                    loadChiTietHoaDon2();

                                    if (loaiHoaDonDuocChon == 1) {
                                        setUpPane1(maHoaDon);
                                    } else {

                                        setUpPane0(maHoaDon, -1);
                                    }
                                } else {
                                    foodDao.updateFoodSoLuong(food.getSoLuong() - soLuongInt, food.getFoodName());
                                    food.setSoLuong(food.getSoLuong() - soLuongInt);
                                    dsFoodAll = foodDao.getAllFoodLimit20();
                                    loadFood(dsFoodAll);
                                    pnl_dsMon.revalidate();
                                    pnl_dsMon.repaint();

                                    soLuongInt = soLuongInt + spTim.getSoLuongMua();
                                    odDao.updateSoLuong(food.getFoodName(), soLuongInt, maHoaDon);
                                    xoaHetDuLieuTablableCTHD();
                                    loadChiTietHoaDon2();
                                    table_chiTietHoaDon.revalidate();
                                    table_chiTietHoaDon.repaint();

                                    if (loaiHoaDonDuocChon == 1) {
                                        setUpPane1(maHoaDon);
                                    } else {
                                        setUpPane0(maHoaDon, -1);
                                    }
                                }
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Số lượng không đủ để đặt.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Vui lòng chỉ nhập số nguyên dương và lớn hơn 0.");
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
        panelFood.setPreferredSize(new Dimension(50, 200));
        panelFood.setMaximumSize(new Dimension(50, 100));
        return panelFood;
    }

    //=========================================================================================================//
    /**
     * Load danh sách food lên giao diện
     *
     * @param dsMonAn
     */
    public void loadFood(List<Food> dsMonAn) {
        pnl_dsMon.removeAll();

        for (Food food : dsMonAn) {
            JPanel panel = taoPanelFood(food);
            pnl_dsMon.add(panel);
        }
        pnl_dsMon.revalidate();
        pnl_dsMon.repaint();
    }
    //=========================================================================================================//

    /**
     * Thay đổi kích thước icon phù hợp với lable
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

    //=========================================================================================================//
    public void loadOrder() {
        List<Order> dsO = orderDao.layAllOrderChuaThanhToan();
        if (!dsO.isEmpty()) {
            for (Order K : dsO) {
                modeHoaDon.addRow(getObjHD(K));
            }
        }

    }

    public void loadChiTietHoaDon(List<OrderDetail> dsFood) {
        if (!dsFood.isEmpty()) {
            for (OrderDetail K : dsFood) {
                modelCTHD.addRow(getObjCTHD(K));
            }
            chenButton();
        }
    }

    public Object[] getObjCTHD(OrderDetail od) {
        String giaBan = formatCurrency(od.getFood().getPrice());
        String tongTien = formatCurrency(od.getTongTien());
        Object[] obj = {od.getFood().getFoodName(), od.getSoLuongMua(), giaBan, tongTien};
        return obj;
    }

    public void xoaHetDuLieuTablableHoaDon() {
        modeHoaDon.getDataVector().removeAllElements();
    }

    public void xoaHetDuLieuTablableCTHD() {
        modelCTHD.getDataVector().removeAllElements();
        modelCTHD.fireTableDataChanged();
    }

    public Object[] getObjHD(Order o) {
        String tenKH;
        if (o.getKhachHang() == null || o.getKhachHang().getSoDienThoai().equalsIgnoreCase("Khách vãng lai")) {
            tenKH = "Khách vãng lai";
        } else {
            Customer kh = customerDao.findCustomerByPhone(o.getKhachHang().getSoDienThoai());
            tenKH = kh.getTenKhachHang();
        }
        String sdt;
        if (o.getKhachHang() == null) {
            sdt = "Khách vãng lai";
        } else {
            sdt = o.getKhachHang().getSoDienThoai();
        }
        String trangThai = null;
        switch (o.getTrangThai()) {
            case 1 ->
                trangThai = "Chưa thanh toán";
            case 2 ->
                trangThai = "Đang chuẩn bị";
            case 3 ->
                trangThai = "Đang giao";
            case 5 ->
                trangThai = "Chờ";
            default -> {
            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = o.getNgayTaoHD().format(formatter);

        String soBan;
        if (o.getBan() == null) {
            soBan = "Trống";
        } else {
            soBan = o.getBan().getSoBan();
        }

        Object[] obj = {o.getMaHD(), formattedDate, tenKH, sdt, trangThai, soBan};
        return obj;
    }
    //=========================================================================================================//

    public Object[] getObjectFood(Food food, int soLuong) {
        double tienThanhToan = soLuong * food.getPrice();
        String tt = formatCurrency(tienThanhToan);
        String gia = formatCurrency(food.getPrice());
        Object[] obj = {food.getFoodName(), soLuong, gia, tt};
        return obj;
    }
    //=========================================================================================================//

    public static String formatCurrency(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("###,### VNĐ");
        return decimalFormat.format(number);
    }

    //=========================================================================================================//
    public void xuatHD_filepdf() {
        try {
            // Tạo một Document mới
            Document document = new Document(PageSize.A4);

            // Chọn vị trí lưu file PDF
            String pdfFilePath = "D:\\QuanLiCuaHangSashimi_desktop\\src\\main\\java\\bill\\" + lbl_maHoaDon.getText() + ".pdf";

            // Tạo PdfWriter và liên kết với Document
            PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath)).setPdfVersion(PdfWriter.PDF_VERSION_1_7);

            // Mở Document để bắt đầu ghi dữ liệu
            document.open();

            BaseFont unicodeFont = BaseFont.createFont("c:/windows/fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            com.itextpdf.text.Font headerFont = new com.itextpdf.text.Font(unicodeFont, 14, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Font font = new com.itextpdf.text.Font(unicodeFont, 14);
            com.itextpdf.text.Font fontPTT = new com.itextpdf.text.Font(unicodeFont, 35, com.itextpdf.text.Font.BOLD);

            Paragraph tenCuaHang = new Paragraph("SASHIMI DUO", fontPTT);
            Paragraph telParagraph = new Paragraph("TEL:0934185833 / ADDRESS: 12 Nguyễn Văn Bảo phường 4 quận Gò Vấp,TPHCM", headerFont);
            Paragraph PTT = new Paragraph("PHIẾU THANH TOÁN", fontPTT);
            Paragraph MHD = new Paragraph("Hóa đơn:" + lbl_maHoaDon.getText(), headerFont);
            Paragraph TRANGTRI = new Paragraph("********************************************************************");
            Paragraph TRONG = new Paragraph(" ");

            Paragraph TONGTIENPHONG = new Paragraph("demo1" + "                             ", headerFont);
            Paragraph BANGCHU = new Paragraph("                             " + "demo2" + "                                    ", headerFont);
            Paragraph TONGTIENDICHVU = new Paragraph("demo3" + "                             ", headerFont);
            Paragraph GACH = new Paragraph("====================================================", font);

            //canh chinh noi dung ow dau
            tenCuaHang.setAlignment(Element.ALIGN_CENTER);
            telParagraph.setAlignment(Element.ALIGN_CENTER);
            MHD.setAlignment(Element.ALIGN_CENTER);
            PTT.setAlignment(Element.ALIGN_CENTER);
            TRANGTRI.setAlignment(Element.ALIGN_CENTER);
            GACH.setAlignment(Element.ALIGN_CENTER);

            TONGTIENPHONG.setAlignment(Element.ALIGN_RIGHT);
            TONGTIENDICHVU.setAlignment(Element.ALIGN_RIGHT);
            BANGCHU.setAlignment(Element.ALIGN_LEFT);
            PdfPTable tableTieuDe = new PdfPTable(2);
            tableTieuDe.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

            PdfPCell celltd1 = new PdfPCell(new Phrase("Tên khách hàng: " + lbl_khachHang.getText(), font));
            PdfPCell celltd2 = new PdfPCell(new Phrase("Tên nhân viên: " + lbl_maNhanVien.getText(), font));
            PdfPCell celltd4 = new PdfPCell(new Phrase("Ngày tạo: " + lbl_ngayTaoHD.getText(), font));

            String sdt;
            if (txt_soDienThoai.getText().isEmpty()) {
                sdt = "Trống";
            } else {
                sdt = txt_soDienThoai.getText();
            }
            PdfPCell celltd5 = new PdfPCell(new Phrase("Số điện thoại        : " + sdt, font));

            celltd1.setHorizontalAlignment(Element.ALIGN_LEFT);

            celltd2.setHorizontalAlignment(Element.ALIGN_LEFT);

            celltd4.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celltd5.setHorizontalAlignment(Element.ALIGN_RIGHT);

            celltd1.setFixedHeight(35);
            celltd2.setFixedHeight(35);

            celltd4.setFixedHeight(35);
            celltd5.setFixedHeight(35);

            // Đặt các đường viền của ô thành không có đường viền
            celltd1.setBorder(PdfPCell.NO_BORDER);
            celltd2.setBorder(PdfPCell.NO_BORDER);

            celltd4.setBorder(PdfPCell.NO_BORDER);
            celltd5.setBorder(PdfPCell.NO_BORDER);

            tableTieuDe.addCell(celltd1);
            tableTieuDe.addCell(celltd5);
            tableTieuDe.addCell(celltd2);
            tableTieuDe.addCell(celltd4);

            document.add(tenCuaHang);
            document.add(telParagraph);
            document.add(MHD);
            document.add(TRONG);
            document.add(PTT);

            document.add(TRANGTRI);
            document.add(TRONG);
            document.add(tableTieuDe);
            document.add(TRONG);

            // Tạo bảng PDF với số cột tương ứng với số cột trong JTable
            PdfPTable pdfTableDV = new PdfPTable(table_chiTietHoaDon.getColumnCount() - 1);

            // Thêm tiêu đề từ JTable vào PDF
            for (int i = 0; i < table_chiTietHoaDon.getColumnCount() - 1; i++) {
                PdfPCell cell = new PdfPCell(new Phrase(new String(table_chiTietHoaDon.getColumnName(i).getBytes("UTF-8"), "UTF-8"), headerFont));
                cell.setFixedHeight(35);
                pdfTableDV.addCell(cell);
            }
            // Thêm dữ liệu từ JTable vào PDF
            for (int i = 0; i < table_chiTietHoaDon.getRowCount(); i++) {
                for (int j = 0; j < table_chiTietHoaDon.getColumnCount() - 1; j++) { // Trừ đi 1 để loại bỏ cột cuối cùng
                    Object value = table_chiTietHoaDon.getValueAt(i, j);
                    String cellValue = (value != null) ? value.toString() : "";
                    PdfPCell cell = new PdfPCell(new Phrase(new String(cellValue.getBytes("UTF-8"), "UTF-8"), font));
                    cell.setFixedHeight(35);
                    pdfTableDV.addCell(cell);
                }
            }

            document.add(TRONG);
            document.add(pdfTableDV);
            document.add(GACH);

            PdfPTable tableKet = new PdfPTable(2);
            tableKet.setWidthPercentage(100); // Đặt chiều rộng của bảng bằng 100% của trang

            // Tạo các ô chứa nhãn và nội dung
            PdfPCell labelCell;
            PdfPCell contentCell;

            // Hàng 1
            labelCell = new PdfPCell(new Phrase("Tổng tiền  :", font));
            contentCell = new PdfPCell(new Phrase(lbl_tongTien.getText(), font));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 2
            labelCell = new PdfPCell(new Phrase("Giảm BILL  :", font));
            contentCell = new PdfPCell(new Phrase(lbl_giamGia.getText(), font));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 3
            labelCell = new PdfPCell(new Phrase("Thuế VAT   :", font));
            contentCell = new PdfPCell(new Phrase("0%", font));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 4
            labelCell = new PdfPCell(new Phrase("Thanh toán :", headerFont));
            contentCell = new PdfPCell(new Phrase(lbl_thanhToan.getText(), headerFont));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 5
            labelCell = new PdfPCell(new Phrase("==================================================", font));
            labelCell.setColspan(2); // Thiết lập cả hai ô trên cùng để trải dài trên 2 cột
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);

            // Hàng 6
            labelCell = new PdfPCell(new Phrase("Tiền mặt   :", font));
            long amount = Long.parseLong(txt_tienKhachDua.getText()); // Chuyển đổi chuỗi thành số long

            DecimalFormat formatter = new DecimalFormat("###,###,###,###");
            String formattedAmount = formatter.format(amount) + " VNĐ";
            contentCell = new PdfPCell(new Phrase(formattedAmount, font));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 7
            labelCell = new PdfPCell(new Phrase("Tiền thối  :", font));
            contentCell = new PdfPCell(new Phrase(lbl_tienThoi.getText(), font));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            tableKet.setWidthPercentage(80);
            tableKet.setHorizontalAlignment(Element.ALIGN_CENTER);

            document.add(TRONG);
            document.add(tableKet);
            document.add(TRONG);

            // Đóng Document để hoàn thành ghi dữ liệu
            document.close();

            // Mở file PDF sau khi tạo xong
            Desktop.getDesktop().open(new java.io.File(pdfFilePath));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //=========================================================================================================//
    public void xuatHD_filepdfMangDi() {
        try {
            // Tạo một Document mới
            Document document = new Document(PageSize.A4);

            // Chọn vị trí lưu file PDF
            String pdfFilePath = "D:\\QuanLiCuaHangSashimi_desktop\\src\\main\\java\\bill\\" + lbl_maDonDatHang.getText() + ".pdf";

            // Tạo PdfWriter và liên kết với Document
            PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath)).setPdfVersion(PdfWriter.PDF_VERSION_1_7);

            // Mở Document để bắt đầu ghi dữ liệu
            document.open();

            BaseFont unicodeFont = BaseFont.createFont("c:/windows/fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            com.itextpdf.text.Font headerFont = new com.itextpdf.text.Font(unicodeFont, 14, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Font font = new com.itextpdf.text.Font(unicodeFont, 14);
            com.itextpdf.text.Font fontPTT = new com.itextpdf.text.Font(unicodeFont, 35, com.itextpdf.text.Font.BOLD);

            Paragraph tenCuaHang = new Paragraph("SASHIMI DUO", fontPTT);
            Paragraph telParagraph = new Paragraph("TEL:0934185833 / ADDRESS: 12 Nguyễn Văn Bảo phường 4 quận Gò Vấp,TPHCM", headerFont);
            Paragraph PTT = new Paragraph("PHIẾU ĐẶT HÀNG", fontPTT);
            Paragraph MHD = new Paragraph("Hóa đơn:" + lbl_maDonDatHang.getText(), headerFont);
            Paragraph TRANGTRI = new Paragraph("********************************************************************");
            Paragraph TRONG = new Paragraph(" ");
            Paragraph GACH = new Paragraph("====================================================", font);

            PdfPTable tableTieuDe = new PdfPTable(2);
            tableTieuDe.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

            PdfPCell celltd1 = new PdfPCell(new Phrase("Tên khách hàng: " + txt_khachHangHD.getText(), font));
            PdfPCell celltd2 = new PdfPCell(new Phrase("Tên nhân viên: " + lbl_nhanVienHD.getText(), font));

            PdfPCell celltd5 = new PdfPCell(new Phrase("Số điện thoại: " + txt_soDienThoaiHD.getText(), font));
            PdfPCell celltd4 = new PdfPCell(new Phrase("Ngày tạo     : " + lbl_ngayDat.getText(), font));

            Paragraph diaChi = new Paragraph("             Địa chỉ: " + tta_diaChi.getText(), font);
            Paragraph ghiChu = new Paragraph("             Ghi chú: " + tta_ghiChu.getText(), font);

            tenCuaHang.setAlignment(Element.ALIGN_CENTER);
            telParagraph.setAlignment(Element.ALIGN_CENTER);
            MHD.setAlignment(Element.ALIGN_CENTER);
            PTT.setAlignment(Element.ALIGN_CENTER);
            TRANGTRI.setAlignment(Element.ALIGN_CENTER);
            GACH.setAlignment(Element.ALIGN_CENTER);
            diaChi.setAlignment(Element.ALIGN_LEFT);
            ghiChu.setAlignment(Element.ALIGN_LEFT);

            celltd1.setHorizontalAlignment(Element.ALIGN_LEFT);
            celltd2.setHorizontalAlignment(Element.ALIGN_LEFT);
            celltd4.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celltd5.setHorizontalAlignment(Element.ALIGN_RIGHT);

            celltd1.setFixedHeight(35);
            celltd2.setFixedHeight(35);
            celltd4.setFixedHeight(35);
            celltd5.setFixedHeight(35);

            // Đặt các đường viền của ô thành không có đường viền
            celltd1.setBorder(PdfPCell.NO_BORDER);
            celltd2.setBorder(PdfPCell.NO_BORDER);
            celltd4.setBorder(PdfPCell.NO_BORDER);
            celltd5.setBorder(PdfPCell.NO_BORDER);

            tableTieuDe.addCell(celltd1);
            tableTieuDe.addCell(celltd5);
            tableTieuDe.addCell(celltd2);
            tableTieuDe.addCell(celltd4);

            document.add(tenCuaHang);
            document.add(telParagraph);
            document.add(MHD);
            document.add(TRONG);
            document.add(PTT);
            document.add(TRANGTRI);
            document.add(TRONG);
            document.add(tableTieuDe);
            document.add(diaChi);
            document.add(TRONG);
            document.add(ghiChu);
            document.add(TRONG);

            // Tạo bảng PDF với số cột tương ứng với số cột trong JTable
            PdfPTable pdfTableDV = new PdfPTable(table_chiTietHoaDon.getColumnCount() - 1);

            // Thêm tiêu đề từ JTable vào PDF
            for (int i = 0; i < table_chiTietHoaDon.getColumnCount() - 1; i++) {
                PdfPCell cell = new PdfPCell(new Phrase(new String(table_chiTietHoaDon.getColumnName(i).getBytes("UTF-8"), "UTF-8"), headerFont));
                cell.setFixedHeight(35);
                pdfTableDV.addCell(cell);
            }
            // Thêm dữ liệu từ JTable vào PDF
            for (int i = 0; i < table_chiTietHoaDon.getRowCount(); i++) {
                for (int j = 0; j < table_chiTietHoaDon.getColumnCount() - 1; j++) { // Trừ đi 1 để loại bỏ cột cuối cùng
                    Object value = table_chiTietHoaDon.getValueAt(i, j);
                    String cellValue = (value != null) ? value.toString() : "";
                    PdfPCell cell = new PdfPCell(new Phrase(new String(cellValue.getBytes("UTF-8"), "UTF-8"), font));
                    cell.setFixedHeight(35);
                    pdfTableDV.addCell(cell);
                }
            }

            document.add(pdfTableDV);
            document.add(GACH);

            PdfPTable tableKet = new PdfPTable(2);
            tableKet.setWidthPercentage(100); // Đặt chiều rộng của bảng bằng 100% của trang

            // Tạo các ô chứa nhãn và nội dung
            PdfPCell labelCell;
            PdfPCell contentCell;

            // Hàng 1
            labelCell = new PdfPCell(new Phrase("Tổng tiền  :", font));
            contentCell = new PdfPCell(new Phrase(lbl_tongTienHoaDon.getText(), font));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 2
            labelCell = new PdfPCell(new Phrase("Giảm BILL  :", font));
            contentCell = new PdfPCell(new Phrase(lbl_giamGiaHoaDon.getText(), font));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 3
            labelCell = new PdfPCell(new Phrase("Thuế VAT   :", font));
            contentCell = new PdfPCell(new Phrase("0%", font));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 4
            labelCell = new PdfPCell(new Phrase("Thanh toán :", headerFont));
            contentCell = new PdfPCell(new Phrase(lbl_thanhToanHD.getText(), headerFont));
            contentCell.setHorizontalAlignment(Element.ALIGN_RIGHT); // Căn phải nội dung
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);
            tableKet.addCell(contentCell);

            // Hàng 5
            labelCell = new PdfPCell(new Phrase("==================================================", font));
            labelCell.setColspan(2); // Thiết lập cả hai ô trên cùng để trải dài trên 2 cột
            contentCell.setBorder(PdfPCell.NO_BORDER);
            labelCell.setBorder(PdfPCell.NO_BORDER);
            tableKet.addCell(labelCell);

            tableKet.setWidthPercentage(80);
            tableKet.setHorizontalAlignment(Element.ALIGN_CENTER);

            document.add(TRONG);
            document.add(tableKet);
            document.add(TRONG);

            // Đóng Document để hoàn thành ghi dữ liệu
            document.close();

            // Mở file PDF sau khi tạo xong
            Desktop.getDesktop().open(new java.io.File(pdfFilePath));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_diemTichLuyPnl0;
    private javax.swing.JButton btn_lamMoi;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_tao;
    private javax.swing.JButton btn_taoHoaDon;
    private javax.swing.JButton btn_thanhToan;
    private javax.swing.JButton btn_themKh;
    private javax.swing.JButton btn_themKhachHang;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_tichLuyHD;
    private javax.swing.JButton btn_tim;
    private javax.swing.JButton btn_xoaHoaDon;
    private javax.swing.JButton btn_xoaHoaDon1;
    private javax.swing.JButton btn_xoaTrangPnl1;
    private javax.swing.JCheckBox cb_cho;
    private javax.swing.JComboBox<String> cbb_timDanhMuc;
    private javax.swing.JComboBox<String> cmb_phuongThuc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_chonPhuongThuc;
    private javax.swing.JLabel lbl_diaChi;
    private javax.swing.JLabel lbl_diemTichLuy;
    private javax.swing.JLabel lbl_ghiChu;
    private javax.swing.JLabel lbl_giamGia;
    private javax.swing.JLabel lbl_giamGia1;
    private javax.swing.JLabel lbl_giamGiaHD1;
    private javax.swing.JLabel lbl_giamGiaHoaDon;
    private javax.swing.JLabel lbl_khachHang;
    private javax.swing.JLabel lbl_khachHang1;
    private javax.swing.JLabel lbl_khachHangHD1;
    private javax.swing.JLabel lbl_loi;
    private javax.swing.JLabel lbl_maDonDatHang;
    private javax.swing.JLabel lbl_maDonDatHang1;
    private javax.swing.JLabel lbl_maHD;
    private javax.swing.JLabel lbl_maHoaDon;
    private javax.swing.JLabel lbl_maNhanVien;
    private javax.swing.JLabel lbl_ngayDat;
    private javax.swing.JLabel lbl_ngayDat1;
    private javax.swing.JLabel lbl_ngayTao;
    private javax.swing.JLabel lbl_ngayTaoHD;
    private javax.swing.JLabel lbl_nhanVien;
    private javax.swing.JLabel lbl_nhanVienHD;
    private javax.swing.JLabel lbl_nhanVienHD1;
    private javax.swing.JLabel lbl_soDienThoai1;
    private javax.swing.JLabel lbl_soDienThoaiHD;
    private javax.swing.JLabel lbl_thanhToan;
    private javax.swing.JLabel lbl_thanhToan1;
    private javax.swing.JLabel lbl_thanhToanHD;
    private javax.swing.JLabel lbl_thanhToanHD1;
    private javax.swing.JLabel lbl_tienKhachDua1;
    private javax.swing.JLabel lbl_tienThoi;
    private javax.swing.JLabel lbl_tienThoi1;
    private javax.swing.JLabel lbl_tl;
    private javax.swing.JLabel lbl_tongTien;
    private javax.swing.JLabel lbl_tongTien1;
    private javax.swing.JLabel lbl_tongTienHD;
    private javax.swing.JLabel lbl_tongTienHoaDon;
    private javax.swing.JLabel lbl_trangThai;
    private javax.swing.JLabel lbl_trangThaiDH;
    private javax.swing.JLabel lbl_vnd;
    private javax.swing.JPanel pnl_Center;
    private javax.swing.JPanel pnl_North;
    private javax.swing.JPanel pnl_West;
    private javax.swing.JPanel pnl_chiTietHoaDon;
    private javax.swing.JPanel pnl_datHang;
    private javax.swing.JPanel pnl_dsMon;
    private javax.swing.JPanel pnl_hoaDon;
    private javax.swing.JPanel pnl_timFood;
    private javax.swing.JPanel pnl_ttHoaDon;
    private javax.swing.JTable table_chiTietHoaDon;
    private javax.swing.JTable table_datHang;
    private javax.swing.JTextArea tta_diaChi;
    private javax.swing.JTextArea tta_ghiChu;
    private javax.swing.JTextField txt_diemTichLuy;
    private javax.swing.JTextField txt_diemTichLuyHD;
    private javax.swing.JTextField txt_khachHangHD;
    private javax.swing.JTextField txt_soDienThoai;
    private javax.swing.JTextField txt_soDienThoaiHD;
    private javax.swing.JTextField txt_tienKhachDua;
    private javax.swing.JTextField txt_tim;
    // End of variables declaration//GEN-END:variables
}
