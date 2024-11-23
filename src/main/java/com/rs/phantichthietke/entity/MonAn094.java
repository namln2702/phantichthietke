package com.rs.phantichthietke.entity;

public class MonAn094 {
    private int id;
    private String ten;
    private String mota;
    private Float gia;
    private String nguyenLieu;

    public MonAn094(int id, String ten, String mota, float gia, String nguyenLieu) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.gia = gia;
        this.nguyenLieu = nguyenLieu;
    }

    public MonAn094(){}

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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(String nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }
}
