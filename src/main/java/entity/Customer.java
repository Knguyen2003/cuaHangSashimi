/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Customer implements Serializable{
    private String maKhachHang;
    private String tenKhachHang;
    private int gioiTinh;
    private LocalDateTime ngaySinh;
    private String soDienThoai;
    private double diemTichLuy;

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(LocalDateTime ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setDiemTichLuy(double diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.maKhachHang);
        hash = 17 * hash + Objects.hashCode(this.soDienThoai);
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
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.maKhachHang, other.maKhachHang)) {
            return false;
        }
        return Objects.equals(this.soDienThoai, other.soDienThoai);
    }

    

    public LocalDateTime getNgaySinh() {
        return ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public double getDiemTichLuy() {
        return diemTichLuy;
    }

    public Customer(String tenKhachHang, String soDienThoai) {
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
    }

    public Customer(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    
    
    

    public Customer(String maKhachHang, String tenKhachHang, int gioiTinh, LocalDateTime ngaySinh, String soDienThoai, double diemTichLuy) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.diemTichLuy = diemTichLuy;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", soDienThoai=" + soDienThoai + ", diemTichLuy=" + diemTichLuy + '}';
    }
    
}
