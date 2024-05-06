/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public class OrderTime extends Order implements Serializable{
    private LocalDateTime ngayDat;
    private LocalDateTime ngayNhan;

    public OrderTime() {
    }

    
    
    public OrderTime(LocalDateTime ngayDat, LocalDateTime ngayNhan) {
        this.ngayDat = ngayDat;
        this.ngayNhan = ngayNhan;
    }

    public OrderTime(LocalDateTime ngayDat, LocalDateTime ngayNhan, String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, double thanhToan, double tienKhachDua, double tienThoi, Table ban, String phuongThucThanhToan, int trangThai) {
        super(maHD, ngayTaoHD, khachHang, nhanVien, thanhToan, tienKhachDua, tienThoi, ban, phuongThucThanhToan, trangThai);
        this.ngayDat = ngayDat;
        this.ngayNhan = ngayNhan;
    }

    public OrderTime(LocalDateTime ngayDat, LocalDateTime ngayNhan, String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, int trangThai) {
        super(maHD, ngayTaoHD, khachHang, nhanVien, trangThai);
        this.ngayDat = ngayDat;
        this.ngayNhan = ngayNhan;
    }

    public OrderTime(LocalDateTime ngayDat, LocalDateTime ngayNhan, String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Table ban, int trangThai) {
        super(maHD, ngayTaoHD, khachHang, ban, trangThai);
        this.ngayDat = ngayDat;
        this.ngayNhan = ngayNhan;
    }

    public OrderTime(LocalDateTime ngayDat, LocalDateTime ngayNhan, String maHD, LocalDateTime ngayTaoHD, Table ban, int trangThai) {
        super(maHD, ngayTaoHD, ban, trangThai);
        this.ngayDat = ngayDat;
        this.ngayNhan = ngayNhan;
    }

    public OrderTime(LocalDateTime ngayDat, LocalDateTime ngayNhan, String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, Table ban, int trangThai) {
        super(maHD, ngayTaoHD, khachHang, nhanVien, ban, trangThai);
        this.ngayDat = ngayDat;
        this.ngayNhan = ngayNhan;
    }

    public OrderTime(LocalDateTime ngayDat, LocalDateTime ngayNhan, String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien) {
        super(maHD, ngayTaoHD, khachHang, nhanVien);
        this.ngayDat = ngayDat;
        this.ngayNhan = ngayNhan;
    }

    public LocalDateTime getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(LocalDateTime ngayDat) {
        this.ngayDat = ngayDat;
    }

    public LocalDateTime getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(LocalDateTime ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    @Override
    public String toString() {
        return "OrderTime{" + "ngayDat=" + ngayDat + ", ngayNhan=" + ngayNhan + '}';
    }
    
    
    
    
}
