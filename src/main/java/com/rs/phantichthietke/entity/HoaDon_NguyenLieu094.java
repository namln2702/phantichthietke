package com.rs.phantichthietke.entity;

public class HoaDon_NguyenLieu094 {
    private int id;
    private Float gia;
    private Float soLuong;
    private int nguyenLieu094Id;
    private int hoaDon094Id;

    public HoaDon_NguyenLieu094() {
    }

    public HoaDon_NguyenLieu094(int id){
        this.id = id;
    }
    public HoaDon_NguyenLieu094(int id, Float gia, Float soLuong, int nguyenLieu094Id, int hoaDon094Id) {
        this.id = id;
        this.gia = gia;
        this.soLuong = soLuong;
        this.nguyenLieu094Id = nguyenLieu094Id;
        this.hoaDon094Id = hoaDon094Id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public Float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Float soLuong) {
        this.soLuong = soLuong;
    }

    public int getNguyenLieu094Id() {
        return nguyenLieu094Id;
    }

    public void setNguyenLieu094Id(int nguyenLieu094Id) {
        this.nguyenLieu094Id = nguyenLieu094Id;
    }

    public int getHoaDon094Id() {
        return hoaDon094Id;
    }

    public void setHoaDon094Id(int hoaDon094Id) {
        this.hoaDon094Id = hoaDon094Id;
    }
}
