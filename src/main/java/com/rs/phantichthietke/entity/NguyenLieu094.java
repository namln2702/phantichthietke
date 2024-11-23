package com.rs.phantichthietke.entity;

public class NguyenLieu094 {
    private int id;
    private String ten;
    private String moTa;
    private Float soLuong;
    private Float gia;

    public NguyenLieu094() {
    }

    public NguyenLieu094(int id, String ten, String moTa, Float soLuong, Float gia) {
        this.id = id;
        this.ten = ten;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
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
