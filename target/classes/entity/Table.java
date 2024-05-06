/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Objects;



public class Table implements Serializable{
    private String soBan;
    private EnumTrangThai trangThai;
    private int soGhe;

    public Table() {
    }

    public Table(String soBan, EnumTrangThai trangThai, int soGhe) {
        this.soBan = soBan;
        this.trangThai = trangThai;
        this.soGhe = soGhe;
    }

    public String getSoBan() {
        return soBan;
    }

    public void setSoBan(String soBan) {
        this.soBan = soBan;
    }



    public EnumTrangThai getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(EnumTrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    
    @Override
    public String toString() {
        return "Table{" + "soBan=" + soBan + ", trangThai=" + trangThai + ", soGhe=" + soGhe + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.soBan);
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
        final Table other = (Table) obj;
        return Objects.equals(this.soBan, other.soBan);
    }

   
    

   

   
    
    
    
    
}
