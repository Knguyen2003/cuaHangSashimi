/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;


public class OrderDetail implements Serializable{
    private Food food;
    private int soLuongMua;
    private double tongTien;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public OrderDetail() {
    }

    public OrderDetail(Food food, int soLuongMua, double tongTien) {
        this.food = food;
        this.soLuongMua = soLuongMua;
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "food=" + food + ", soLuongMua=" + soLuongMua + ", tongTien=" + tongTien + '}';
    }

   
    
    
    
    
}
