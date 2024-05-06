/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Employee implements Serializable{

    private String maNhanVien;
    private String tenNhanVien;
    private int gioiTinh;
    private LocalDateTime ngaySinh;
    private LocalDateTime ngayVaoLam;
    private String email;
    private String anhNhanVien;
    private String caLamViec;
    private String chucVu;
    private String trangThai;
    private String soDienThoai;
    private double luong;
    private String CCCD;

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(LocalDateTime ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setNgayVaoLam(LocalDateTime ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAnhNhanVien(String anhNhanVien) {
        this.anhNhanVien = anhNhanVien;
    }

    public void setCaLamViec(String caLamViec) {
        this.caLamViec = caLamViec;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public LocalDateTime getNgaySinh() {
        return ngaySinh;
    }

    public LocalDateTime getNgayVaoLam() {
        return ngayVaoLam;
    }

    public String getEmail() {
        return email;
    }

    public String getAnhNhanVien() {
        return anhNhanVien;
    }

    public String getCaLamViec() {
        return caLamViec;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public double getLuong() {
        return luong;
    }

    public String getCCCD() {
        return CCCD;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.maNhanVien);
        hash = 53 * hash + Objects.hashCode(this.soDienThoai);
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.maNhanVien, other.maNhanVien)) {
            return false;
        }
        return Objects.equals(this.soDienThoai, other.soDienThoai);
    }

    public Employee(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Employee(String maNhanVien, String trangThai) {
        this.maNhanVien = maNhanVien;
        this.trangThai = trangThai;
    }

    public Employee(String maNhanVien, String tenNhanVien, int gioiTinh, LocalDateTime ngaySinh, LocalDateTime ngayVaoLam, String email, String anhNhanVien, String caLamViec, String chucVu, String trangThai, String soDienThoai, double luong, String CCCD) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.email = email;
        this.anhNhanVien = anhNhanVien;
        this.caLamViec = caLamViec;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
        this.soDienThoai = soDienThoai;
        this.luong = luong;
        this.CCCD = CCCD;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", ngayVaoLam=" + ngayVaoLam + ", email=" + email + ", anhNhanVien=" + anhNhanVien + ", caLamViec=" + caLamViec + ", chucVu=" + chucVu + ", trangThai=" + trangThai + ", soDienThoai=" + soDienThoai + ", luong=" + luong + ", CCCD=" + CCCD + '}';
    }

}
