/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OrderDelivery extends Order implements Serializable{

    private String diaChi;
    private String ghiChu;

    public OrderDelivery() {
    }

//    public OrderDelivery(String diaChi, String ghiChu) {
//        this.diaChi = diaChi;
//        this.ghiChu = ghiChu;
//    }

    public OrderDelivery(String diaChi, String ghiChu, String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, double thanhToan, double tienKhachDua, double tienThoi, Table ban, String phuongThucThanhToan, int trangThai) {
        super(maHD, ngayTaoHD, khachHang, nhanVien, thanhToan, tienKhachDua, tienThoi, ban, phuongThucThanhToan, trangThai);
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
    }

    public OrderDelivery(String diaChi, String ghiChu, String maHD, LocalDateTime ngayTaoHD, Customer khachHang, Employee nhanVien, int trangThai) {
        super(maHD, ngayTaoHD, khachHang, nhanVien, trangThai);
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
    }

    

    
    
    

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return super.toString() + "OrderDelivery{" + "diaChi=" + diaChi + ", ghiChu=" + ghiChu + '}';
    }

   



   

}
