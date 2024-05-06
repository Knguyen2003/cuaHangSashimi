/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

public class Food implements Serializable{
    private String foodID;
    private String foodName;
    private double price;
    private String img;
    private int soLuong;
    private String trangThai;

    public String getFoodID() {
        return foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public String getImg() {
        return img;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Food(String foodID, String foodName, double price, String img, int soLuong, String trangThai) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
        this.img = img;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public Food() {
    }

    @Override
    public String toString() {
        return "Food{" + "foodID=" + foodID + ", foodName=" + foodName + ", price=" + price + ", img=" + img + ", soLuong=" + soLuong + ", trangThai=" + trangThai + '}';
    }
    
    
}
