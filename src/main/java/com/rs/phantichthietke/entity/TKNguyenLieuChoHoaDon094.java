package com.rs.phantichthietke.entity;

public class TKNguyenLieuChoHoaDon094 extends HoaDon_NguyenLieu094{
    private int id;
    private String ten;
    private Float soLuong;
    private Float gia;
    private Float tong;

    public TKNguyenLieuChoHoaDon094(String ten, Float soLuong, Float gia, Float tong) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
        this.tong = tong;
    }

    public Float getTong() {
        return tong;
    }

    public void setTong(Float tong) {
        this.tong = tong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Float soLuong) {
        this.soLuong = soLuong;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }
}
