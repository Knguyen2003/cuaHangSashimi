/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Order implements Serializable{

    public static List<Order> findOrder(String tim) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String maHD;
    private LocalDateTime ngayTaoHD;
    private Customer khachHang;
    private Employee nhanVien;
    private double thanhToan;
    private double tienKhachDua;
    private double tienThoi;
    private Table ban;
    
    private String phuongThucThanhToan;
    private int trangThai;  //đang giao (3), đã thanh toán (4), chưa thanh toán (1), đang chuẩn bị (2), chờ (5), chờ nhân (6)

    public Order() {
    }

    public Order(String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, double thanhToan, double tienKhachDua, double tienThoi, Table ban, String phuongThucThanhToan, int trangThai) {
        this.maHD = maHD;
        this.ngayTaoHD = ngayTaoHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.thanhToan = thanhToan;
        this.tienKhachDua = tienKhachDua;
        this.tienThoi = tienThoi;
        this.ban = ban;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.trangThai = trangThai;
    }

    public Order(String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, int trangThai) {
        this.maHD = maHD;
        this.ngayTaoHD = ngayTaoHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.trangThai = trangThai;
    }

    public Order(String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Table ban, int trangThai) {
        this.maHD = maHD;
        this.ngayTaoHD = ngayTaoHD;
        this.khachHang = khachHang;
        this.ban = ban;
        this.trangThai = trangThai;
    }

    public Order(String maHD, LocalDateTime ngayTaoHD, Table ban, int trangThai) {
        this.maHD = maHD;
        this.ngayTaoHD = ngayTaoHD;
        this.ban = ban;
        this.trangThai = trangThai;
    }

    public Order(String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, Table ban, int trangThai) {
        this.maHD = maHD;
        this.ngayTaoHD = ngayTaoHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.ban = ban;
        this.trangThai = trangThai;
    }

    public Order(String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, double thanhToan, Table ban, int trangThai) {
        this.maHD = maHD;
        this.ngayTaoHD = ngayTaoHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.thanhToan = thanhToan;
        this.ban = ban;
        this.trangThai = trangThai;
    }

    
    
    
    

    
    
    
    

    public Order(String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien) {
        this.maHD = maHD;
        this.ngayTaoHD = ngayTaoHD;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }

    
    
    


    public Table getBan() {
        return ban;
    }

    public void setBan(Table ban) {
        this.ban = ban;
    }


    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public LocalDateTime getNgayTaoHD() {
        return ngayTaoHD;
    }

    public void setNgayTaoHD(LocalDateTime ngayTaoHD) {
        this.ngayTaoHD = ngayTaoHD;
    }

    public Customer getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(Customer khachHang) {
        this.khachHang = khachHang;
    }

    public Employee getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(Employee nhanVien) {
        this.nhanVien = nhanVien;
    }

    public double getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(double thanhToan) {
        this.thanhToan = thanhToan;
    }

    public double getTienKhachDua() {
        return tienKhachDua;
    }

    public void setTienKhachDua(double tienKhachDua) {
        this.tienKhachDua = tienKhachDua;
    }

    public double getTienThoi() {
        return tienThoi;
    }

    public void setTienThoi(double tienThoi) {
        this.tienThoi = tienThoi;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.maHD);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Order{" + "maHD=" + maHD + ", ngayTaoHD=" + ngayTaoHD + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", thanhToan=" + thanhToan + ", tienKhachDua=" + tienKhachDua + ", tienThoi=" + tienThoi + ", ban=" + ban + ", phuongThucThanhToan=" + phuongThucThanhToan + ", trangThai=" + trangThai + '}';
    }

    
    
    
    
}
