package com.rs.phantichthietke.entity;

import java.util.Date;

public class ThanhVien094 {

    private int id;
    private String ten;
    private String tenDangnhap;
    private String matKhau;
    private Date ngaySinh;
    private String dienThoai;
    private String vaiTro;

    public ThanhVien094(int id, String ten, String tenDangnhap, String matKhau, Date ngaySinh, String dienThoai, String vaiTro) {
        this.id = id;
        this.ten = ten;
        this.tenDangnhap = tenDangnhap;
        this.matKhau = matKhau;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.vaiTro = vaiTro;
    }
    public ThanhVien094(int id){
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

    public String getTenDangnhap() {
        return tenDangnhap;
    }

    public void setTenDangnhap(String tenDangnhap) {
        this.tenDangnhap = tenDangnhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }
}
