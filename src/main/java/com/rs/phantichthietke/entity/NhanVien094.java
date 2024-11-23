package com.rs.phantichthietke.entity;

import java.util.Date;

public class NhanVien094 extends ThanhVien094{
    private String vitri;

    public NhanVien094(int id, String vitri) {
        super(id);
        this.vitri = vitri;
    }
    public NhanVien094(int id){
        super(id);
    }
}
