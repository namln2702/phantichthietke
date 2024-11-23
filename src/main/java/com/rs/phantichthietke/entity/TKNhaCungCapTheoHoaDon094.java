package com.rs.phantichthietke.entity;

import java.util.Date;

public class TKNhaCungCapTheoHoaDon094 extends HoaDonNCC094{

    private  Date ngay;
    private Float soLuong;
    private Float tongTien;


    public Float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Float soLuong) {
        this.soLuong = soLuong;
    }


    public Float getTongTien() {
        return tongTien;
    }

    public void setTongTien(Float tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public TKNhaCungCapTheoHoaDon094(int id, Date ngay, Float soLuong, Float tongTien) {
        super(id);
        this.ngay = ngay;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

}
