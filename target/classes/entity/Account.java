/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class Account implements Serializable{
    private Employee nhanVien;
    private String matKhau;
    private int trangThai;
    private String loaiTaiKhoan;

    public Employee getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(Employee nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getLoaiTaiKhoan() {
        return loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(String loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public Account() {
    }

    public Account(Employee nhanVien, String matKhau, int trangThai, String loaiTaiKhoan) {
        this.nhanVien = nhanVien;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    @Override
    public String toString() {
        return "Account{" + "nhanVien=" + nhanVien + ", matKhau=" + matKhau + ", trangThai=" + trangThai + ", loaiTaiKhoan=" + loaiTaiKhoan + '}';
    }
    
    
    
    
}
