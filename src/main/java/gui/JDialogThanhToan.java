/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import dao.CustomerDao;
import dao.EmployeeDao;
import dao.OrderDao;
import dao.OrderDetailDao;
import entity.Customer;
import entity.Employee;
import entity.Order;
import entity.OrderDetail;
import entity.Table;
import java.awt.Font;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.AppUltil;

public class JDialogThanhToan extends javax.swing.JDialog {

    private Table banDuocChon;
    private JButton btnLamMoiTable;
    private OrderDao orderDao;
    private OrderDetailDao odDao;
    private EmployeeDao employeeDao;
    private CustomerDao cusDao;
    private DefaultTableModel model;
    private String maHoaDon;
    private double tien;
    private LocalDateTime ngayTao;
    private Order hoaDon;
    private double tongTienHoaDon;
    private double tienTra;
    private String maNhanVien;

    public JDialogThanhToan(Table t, String ma, JButton btnLmMoi) {
        initComponents();
        
        
        banDuocChon = t;
        maNhanVien = ma;
        btnLamMoiTable = btnLmMoi;
        odDao = new OrderDetailDao(AppUltil.initDriver(), "quanliquanan");
        orderDao = new OrderDao(AppUltil.initDriver(), "quanliquanan");
        employeeDao = new EmployeeDao(AppUltil.initDriver(), "quanliquanan");
        cusDao = new CustomerDao(AppUltil.initDriver(), "quanliquanan");
        model = (DefaultTableModel) table_CTHD.getModel();
        hoaDon = orderDao.timHoaDonTheoBan(t.getSoBan(), 1);
        maHoaDon = hoaDon.getMaHD();
        setUp();
        designTable();
        loadChiTietHoaDon();

    }

    public void setUp() {
        lbl_maHDSet.setText(maHoaDon);
        String tenNhanVien = employeeDao.findEmployeeByID(maNhanVien).getTenNhanVien();
        lbl_tenNhanVienThanhToanSet.setText(tenNhanVien);
        ngayTao = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        lbl_ngayTaoTest.setText(ngayTao.format(formatter));
        lbl_tenKhachHangSet.setText(hoaDon.getKhachHang().getSoDienThoai());
        lbl_soBanTest.setText(banDuocChon.getSoBan());

        if (hoaDon.getKhachHang().getSoDienThoai().equalsIgnoreCase("Khách vãng lai")) {
            btn_diemTichLuy.setEnabled(false);
            lbl_giamBillTT.setText("0%");
        } else {
            double giam = cusDao.findCustomerByPhone(hoaDon.getKhachHang().getSoDienThoai()).getDiemTichLuy();
            txt_diemTichLuy.setText(giam + "");
            btn_diemTichLuy.setEnabled(true);
        }
    }

    public void designTable() {
        table_CTHD.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_CTHD.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    public void xoaHetDuLieuTablable() {
        model.getDataVector().removeAllElements();
    }

    public void loadChiTietHoaDon() {
        tien = 0;
        List<OrderDetail> dsFood = odDao.layDanhSachSanPham(maHoaDon);
        if (dsFood.size() > 0) {
            for (OrderDetail K : dsFood) {
                tien += K.getTongTien();
                model.addRow(getObjCTHD(K));
            }
            lbl_tongTienDichVu.setText("Tổng tiền hóa đơn :" + formatCurrency(tien));
        }
    }

    public Object[] getObjCTHD(OrderDetail od) {
        String giaBan = formatCurrency(od.getFood().getPrice());
        String tongTien = formatCurrency(od.getTongTien());
        Object[] obj = {od.getFood().getFoodName(), od.getSoLuongMua(), giaBan, tongTien};
        return obj;
    }

    public static String formatCurrency(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("###,### VNĐ");
        return decimalFormat.format(number);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnl_Chinh = new javax.swing.JPanel();
        pnl_thongTinHoaDon = new javax.swing.JPanel();
        lbl_tenKhachHang = new javax.swing.JLabel();
        lblNgayTao = new javax.swing.JLabel();
        lblnhanVienTT = new javax.swing.JLabel();
        lbl_soBan = new javax.swing.JLabel();
        lbl_hoaDon = new javax.swing.JLabel();
        lbl_maHDSet = new javax.swing.JLabel();
        lbl_ngayTaoTest = new javax.swing.JLabel();
        lbl_tenNhanVienThanhToanSet = new javax.swing.JLabel();
        lbl_soBanTest = new javax.swing.JLabel();
        lbl_tenKhachHangSet = new javax.swing.JLabel();
        lbl_tenKhachHang1 = new javax.swing.JLabel();
        lbl_soDienThoaiSet = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbl_chiTietHoaDon = new javax.swing.JLabel();
        lbl_tongTienDichVu = new javax.swing.JLabel();
        scr_thongTinDichVu = new javax.swing.JScrollPane();
        table_CTHD = new javax.swing.JTable();
        lbltienNhan = new javax.swing.JLabel();
        lbltienThua = new javax.swing.JLabel();
        txt_tienNhan = new javax.swing.JTextField();
        lbl_tongTienTT = new javax.swing.JLabel();
        lblgiamBill = new javax.swing.JLabel();
        lbl_tienThueVAT = new javax.swing.JLabel();
        lblthanhToan = new javax.swing.JLabel();
        lbl_tienThanhToan = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblTieuDeThanhToan = new javax.swing.JLabel();
        lbl_tienThua = new javax.swing.JLabel();
        lblgiamBill1 = new javax.swing.JLabel();
        txt_diemTichLuy = new javax.swing.JTextField();
        btn_diemTichLuy = new javax.swing.JButton();
        lbl_giamBillTT = new javax.swing.JLabel();
        lbl_loi = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_Chinh.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Chinh.setPreferredSize(new java.awt.Dimension(1068, 900));

        pnl_thongTinHoaDon.setBackground(new java.awt.Color(255, 255, 204));

        lbl_tenKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tenKhachHang.setText("Khách hàng     : ");

        lblNgayTao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNgayTao.setText("Ngày tạo          :");

        lblnhanVienTT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnhanVienTT.setText("Nhân viên        :");

        lbl_soBan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_soBan.setText("Số bàn             :");

        lbl_hoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_hoaDon.setText("Mã hóa đơn     :");

        lbl_maHDSet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_maHDSet.setText("Phan Nguyễn Khôi Nguyên");

        lbl_ngayTaoTest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ngayTaoTest.setText(" 1-12-2003");

        lbl_tenNhanVienThanhToanSet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tenNhanVienThanhToanSet.setText("Phan Nguyễn Khôi Nguyên");

        lbl_soBanTest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_soBanTest.setText("29-11-2023 15:40");

        lbl_tenKhachHangSet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tenKhachHangSet.setText("Phan Nguyễn Khôi Nguyên");

        lbl_tenKhachHang1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tenKhachHang1.setText("Số điện thoại  :");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout pnl_thongTinHoaDonLayout = new javax.swing.GroupLayout(pnl_thongTinHoaDon);
        pnl_thongTinHoaDon.setLayout(pnl_thongTinHoaDonLayout);
        pnl_thongTinHoaDonLayout.setHorizontalGroup(
            pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_thongTinHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                        .addComponent(lblNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_ngayTaoTest, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                        .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblnhanVienTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_hoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_maHDSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                                .addComponent(lbl_tenNhanVienThanhToanSet)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                            .addComponent(lbl_tenKhachHang)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                            .addComponent(lbl_soBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(32, 32, 32)))
                    .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                        .addComponent(lbl_tenKhachHang1)
                        .addGap(32, 32, 32)))
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_soBanTest, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tenKhachHangSet)
                    .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                        .addComponent(lbl_soDienThoaiSet, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        pnl_thongTinHoaDonLayout.setVerticalGroup(
            pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thongTinHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_soBan)
                    .addComponent(lbl_maHDSet)
                    .addComponent(lbl_soBanTest)
                    .addComponent(lbl_hoaDon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tenNhanVienThanhToanSet)
                    .addComponent(lblnhanVienTT)
                    .addComponent(lbl_tenKhachHang)
                    .addComponent(lbl_tenKhachHangSet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_thongTinHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ngayTaoTest)
                    .addComponent(lblNgayTao)
                    .addComponent(lbl_tenKhachHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_soDienThoaiSet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lbl_chiTietHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_chiTietHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_chiTietHoaDon.setText("CHI TIẾT HÓA ĐƠN");

        lbl_tongTienDichVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tongTienDichVu.setForeground(new java.awt.Color(255, 0, 0));
        lbl_tongTienDichVu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        table_CTHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_CTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên món", "SL", "Giá bán", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scr_thongTinDichVu.setViewportView(table_CTHD);

        lbltienNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltienNhan.setText("Tiền nhận  :");

        lbltienThua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltienThua.setText("Tiền thừa  :");

        txt_tienNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_tienNhan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_tienNhan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tienNhanKeyReleased(evt);
            }
        });

        lbl_tongTienTT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblgiamBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgiamBill.setText("Giảm BILL      :");

        lbl_tienThueVAT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblthanhToan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblthanhToan.setForeground(new java.awt.Color(255, 0, 0));
        lblthanhToan.setText("Thanh toán   :");

        lbl_tienThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_tienThanhToan.setForeground(new java.awt.Color(255, 0, 0));

        btnThanhToan.setBackground(new java.awt.Color(0, 255, 0));
        btnThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 0, 0));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblTieuDeThanhToan.setBackground(new java.awt.Color(0, 255, 255));
        lblTieuDeThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTieuDeThanhToan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTieuDeThanhToan.setText("THANH TOÁN");
        lblTieuDeThanhToan.setOpaque(true);

        lbl_tienThua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblgiamBill1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgiamBill1.setText("Điểm tích lũy :");

        txt_diemTichLuy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btn_diemTichLuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcon/right-up.png"))); // NOI18N
        btn_diemTichLuy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_diemTichLuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diemTichLuyActionPerformed(evt);
            }
        });

        lbl_giamBillTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_giamBillTT.setPreferredSize(new java.awt.Dimension(0, 15));

        lbl_loi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_loi.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout pnl_ChinhLayout = new javax.swing.GroupLayout(pnl_Chinh);
        pnl_Chinh.setLayout(pnl_ChinhLayout);
        pnl_ChinhLayout.setHorizontalGroup(
            pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tongTienDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_ChinhLayout.createSequentialGroup()
                        .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(lbl_tienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltienNhan)
                                    .addComponent(lbltienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(txt_tienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_loi, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_tongTienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblgiamBill1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblthanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblgiamBill, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                        .addComponent(txt_diemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_diemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(lbl_tienThueVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbl_tienThanhToan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_giamBillTT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_chiTietHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scr_thongTinDichVu, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_thongTinHoaDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                .addComponent(lblTieuDeThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_ChinhLayout.setVerticalGroup(
            pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                .addComponent(lblTieuDeThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_thongTinHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_chiTietHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scr_thongTinDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tongTienDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ChinhLayout.createSequentialGroup()
                        .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgiamBill1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_diemTichLuy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(lblgiamBill, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tienThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                .addComponent(lblthanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_tongTienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_ChinhLayout.createSequentialGroup()
                        .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_tienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_diemTichLuy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbltienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_tienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_tienThueVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnl_ChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lbl_giamBillTT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_ChinhLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbltienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_loi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(pnl_Chinh, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnl_Chinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tienNhanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tienNhanKeyReleased
        try {
            // Lấy giá trị từ ô nhập tiền
            double nhapTien = Double.parseDouble(txt_tienNhan.getText());
            double tienThua = nhapTien - tongTienHoaDon;
            if (tienThua < 0) {
                lbl_loi.setText("Tiền khách đưa chưa đủ !!!");
                btnThanhToan.setEnabled(false);
            } else {
                lbl_loi.setText("");
                tienTra = tienThua;
                DecimalFormat dft = new DecimalFormat("###,###");
                String tinhTienThua = dft.format(tienThua);
                tinhTienThua = tinhTienThua.replace(",", ".");
                lbl_tienThua.setText(tinhTienThua + " VNĐ ");
                btnThanhToan.setEnabled(true);
            }
        } catch (NumberFormatException ex) {
            // Xử lý nếu người dùng nhập vào không phải là số
            if (!txt_tienNhan.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Dữ liệu nhập vào không hợp lệ");
            }

        }
    }//GEN-LAST:event_txt_tienNhanKeyReleased

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        Order o = new Order(lbl_maHDSet.getText(), ngayTao, new Customer(lbl_tenKhachHangSet.getText(),
                lbl_soDienThoaiSet.getText()), new Employee(maNhanVien),
                tongTienHoaDon,
                Double.parseDouble(txt_tienNhan.getText()),
                tienTra,
                null, "Tiền mặt",
                4);

        orderDao.thanhToanHoaDonBanMangDi(o);
        if (!lbl_soDienThoaiSet.getText().isEmpty()) {
            Customer khTim = cusDao.findCustomerByPhone(lbl_soDienThoaiSet.getText());
            cusDao.updateDiemTichLuy(khTim.getMaKhachHang(), tongTienHoaDon);
        }

        JOptionPane.showMessageDialog(null, "Xuất hóa đơn");
        btnThoat.doClick();

    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btn_diemTichLuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diemTichLuyActionPerformed
        Customer cus = cusDao.findCustomerByPhone(hoaDon.getKhachHang().getSoDienThoai());
        double luuTru = cus.getDiemTichLuy();
        double diemConLai = 0;
        if (cus.getDiemTichLuy() >= 5000 && cus.getDiemTichLuy() <= 7000) {
            lbl_giamBillTT.setText("5%");
            diemConLai = cus.getDiemTichLuy() - 5000;
            tongTienHoaDon = tongTienHoaDon - ((tongTienHoaDon * 3) / 100);
        } else if (cus.getDiemTichLuy() >= 7000 && cus.getDiemTichLuy() <= 10000) {
            lbl_giamBillTT.setText("10%");
            diemConLai = cus.getDiemTichLuy() - 7000;
            tongTienHoaDon = tongTienHoaDon - ((tongTienHoaDon * 10) / 100);
        } else if (cus.getDiemTichLuy() >= 10000) {
            lbl_giamBillTT.setText("30%");
            diemConLai = cus.getDiemTichLuy() - 10000;
            tongTienHoaDon = tongTienHoaDon - ((tongTienHoaDon * 30) / 100);
        } else if (txt_diemTichLuy.getText().isEmpty()) {
            diemConLai = luuTru;
            lbl_giamBillTT.setText("0%");
        } else {
            lbl_giamBillTT.setText("0%");
        }
        lbl_tienThanhToan.setText(formatCurrency(tongTienHoaDon) + "   ");
        cusDao.updateDiemTichLuy(cus.getMaKhachHang(), diemConLai);
    }//GEN-LAST:event_btn_diemTichLuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btn_diemTichLuy;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblTieuDeThanhToan;
    private javax.swing.JLabel lbl_chiTietHoaDon;
    private javax.swing.JLabel lbl_giamBillTT;
    private javax.swing.JLabel lbl_hoaDon;
    private javax.swing.JLabel lbl_loi;
    private javax.swing.JLabel lbl_maHDSet;
    private javax.swing.JLabel lbl_ngayTaoTest;
    private javax.swing.JLabel lbl_soBan;
    private javax.swing.JLabel lbl_soBanTest;
    private javax.swing.JTextField lbl_soDienThoaiSet;
    private javax.swing.JLabel lbl_tenKhachHang;
    private javax.swing.JLabel lbl_tenKhachHang1;
    private javax.swing.JLabel lbl_tenKhachHangSet;
    private javax.swing.JLabel lbl_tenNhanVienThanhToanSet;
    private javax.swing.JLabel lbl_tienThanhToan;
    private javax.swing.JLabel lbl_tienThua;
    private javax.swing.JLabel lbl_tienThueVAT;
    private javax.swing.JLabel lbl_tongTienDichVu;
    private javax.swing.JLabel lbl_tongTienTT;
    private javax.swing.JLabel lblgiamBill;
    private javax.swing.JLabel lblgiamBill1;
    private javax.swing.JLabel lblnhanVienTT;
    private javax.swing.JLabel lblthanhToan;
    private javax.swing.JLabel lbltienNhan;
    private javax.swing.JLabel lbltienThua;
    private javax.swing.JPanel pnl_Chinh;
    private javax.swing.JPanel pnl_thongTinHoaDon;
    private javax.swing.JScrollPane scr_thongTinDichVu;
    private javax.swing.JTable table_CTHD;
    private javax.swing.JTextField txt_diemTichLuy;
    private javax.swing.JTextField txt_tienNhan;
    // End of variables declaration//GEN-END:variables
}
