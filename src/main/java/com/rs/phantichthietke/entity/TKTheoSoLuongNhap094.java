package com.rs.phantichthietke.entity;

public class TKTheoSoLuongNhap094 extends NhaCungCap094{

    private String ten;
    private float soLuong;
    private float gia;

    public TKTheoSoLuongNhap094(int idNCC, String ten, float soLuong, float gia) {
        super(idNCC);
        this.ten = ten;
        this.soLuong = soLuong;
        this.gia = gia;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
}
