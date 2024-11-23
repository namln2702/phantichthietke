package com.rs.phantichthietke.entity;

import java.util.Date;

public class HoaDonNCC094 {
    private int id;
    private Date ngay;
    private int trangThai;
    private int nhanVienKho094Id;
    private int nhaCungCap094Id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getNhanVienKho094Id() {
        return nhanVienKho094Id;
    }

    public void setNhanVienKho094Id(int nhanVienKho094Id) {
        this.nhanVienKho094Id = nhanVienKho094Id;
    }

    public int getNhaCungCap094Id() {
        return nhaCungCap094Id;
    }

    public void setNhaCungCap094Id(int nhaCungCap094Id) {
        this.nhaCungCap094Id = nhaCungCap094Id;
    }

    public HoaDonNCC094(int id) {
        this.id = id;
    }

    public HoaDonNCC094(int id, Date ngay, int trangThai, int nhanVienKho094Id, int nhaCungCap094Id) {
        this.id = id;
        this.ngay = ngay;
        this.trangThai = trangThai;
        this.nhanVienKho094Id = nhanVienKho094Id;
        this.nhaCungCap094Id = nhaCungCap094Id;
    }
}
