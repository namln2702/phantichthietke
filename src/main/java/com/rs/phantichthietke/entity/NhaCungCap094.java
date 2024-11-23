package com.rs.phantichthietke.entity;


import java.util.Date;

public class NhaCungCap094  {

    private int id;
    private String ten;
    private String diachi;

    private String SoDienThoai;

    public NhaCungCap094(int id, String ten, String diachi, String soDienThoai) {
        this.id = id;
        this.ten = ten;
        this.diachi = diachi;
        SoDienThoai = soDienThoai;
    }
    public NhaCungCap094(int id){
        this.id = id;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }
}
