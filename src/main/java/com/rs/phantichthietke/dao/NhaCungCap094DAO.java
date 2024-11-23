package com.rs.phantichthietke.dao;

import com.rs.phantichthietke.entity.TKNhaCungCapTheoHoaDon094;
import com.rs.phantichthietke.entity.TKNguyenLieuChoHoaDon094;
import com.rs.phantichthietke.entity.NhaCungCap094;
import com.rs.phantichthietke.entity.TKTheoSoLuongNhap094;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhaCungCap094DAO extends DAO{

    public NhaCungCap094DAO(){
        super();
    }

    public List<NhaCungCap094> getDsNhaCungCap() throws SQLException, IOException {
        String url = "select * from nhacungcap094";

        PreparedStatement preparedStatement = con.prepareStatement(url);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<NhaCungCap094> nhaCungCap094List = new ArrayList<>();

        while(resultSet.next()){
            NhaCungCap094 nhaCungCap094 = new NhaCungCap094(resultSet.getInt("id"), resultSet.getString("ten"),resultSet.getString("diachi"), resultSet.getString("sodienthoai"));
            nhaCungCap094List.add(nhaCungCap094);
        }

        return nhaCungCap094List;
    }

    public List<TKTheoSoLuongNhap094> getTkTheoSoLuongNhap094(String batDau, String ketThuc) throws SQLException, IOException{
        String url = "select nhacungcap094.id, nhacungcap094.ten, sum(hoadon_nguyenlieu094.soluong) as soluong, sum(hoadon_nguyenlieu094.soluong * hoadon_nguyenlieu094.gia) as gia from nhacungcap094\n" +
                "inner join hoadonncc094 on nhacungcap094.id = hoadonncc094.nhacungcap094id\n" +
                "inner join hoadon_nguyenlieu094 on hoadonncc094.id = hoadon_nguyenlieu094.hoadonncc094id\n" +
                "where hoadonncc094.ngay >= ' "+batDau+ "' and hoadonncc094.ngay <= '"+ketThuc+"'\n" +
                "group by nhacungcap094.id, nhacungcap094.ten, nhacungcap094.diachi, nhacungcap094.sodienthoai";
        PreparedStatement preparedStatement = con.prepareStatement(url);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<TKTheoSoLuongNhap094> save = new ArrayList<>();

        while(resultSet.next()){
            TKTheoSoLuongNhap094 tk = new TKTheoSoLuongNhap094(resultSet.getInt("id"), resultSet.getString("ten"),resultSet.getFloat("soluong"), resultSet.getFloat("gia"));
            save.add(tk);
        }

        return save;
    }

    public List<TKNhaCungCapTheoHoaDon094> getTkNhaCungCapTheoHoaDon094(int NCCid, String batDau, String ketThuc) throws IOException, SQLException {
        String url = "select hoadonncc094.id, hoadonncc094.ngay, sum(hoadon_nguyenlieu094.soluong) as soluong, sum(hoadon_nguyenlieu094.soluong * hoadon_nguyenlieu094.gia) as tongtien from hoadonncc094\n" +
                "inner join hoadon_nguyenlieu094 on hoadonncc094.id = hoadon_nguyenlieu094.hoadonncc094id\n" +
                "inner join nguyenlieu094 on hoadon_nguyenlieu094.nguyenlieu094id = nguyenlieu094.id\n" +
                "where hoadonncc094.ngay <= '" + ketThuc + "' and hoadonncc094.ngay >= '" + batDau + "' and hoadonncc094.nhacungcap094id =" + NCCid + "\n" +
                "group by hoadonncc094.ngay, hoadonncc094.id";
        PreparedStatement preparedStatement = con.prepareStatement(url);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<TKNhaCungCapTheoHoaDon094> TKNhaCungCapTheoHoaDon094List = new ArrayList<>();

        while (resultSet.next()) {
            TKNhaCungCapTheoHoaDon094List.add(new TKNhaCungCapTheoHoaDon094(resultSet.getInt("id"),resultSet.getDate("ngay"),resultSet.getFloat("soluong"),resultSet.getFloat("tongtien")));
        }

        return TKNhaCungCapTheoHoaDon094List;

    }

    public List<TKNguyenLieuChoHoaDon094> getNguyenLieuChoHoaDon094(int idHoaDon) throws IOException, SQLException{
        String url = "select nguyenlieu094.ten, hoadon_nguyenlieu094.soluong, hoadon_nguyenlieu094.gia,hoadon_nguyenlieu094.soluong *hoadon_nguyenlieu094.gia as tong   from hoadonncc094\n" +
                "inner join hoadon_nguyenlieu094 on hoadonncc094.id = hoadon_nguyenlieu094.hoadonncc094id\n" +
                "inner join nguyenlieu094 on hoadon_nguyenlieu094.nguyenlieu094id = nguyenlieu094.id\n" +
                "where hoadonncc094.id =" + idHoaDon;
        PreparedStatement preparedStatement = con.prepareStatement(url);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<TKNguyenLieuChoHoaDon094> save = new ArrayList<>();

        while (resultSet.next()){
            save.add(new TKNguyenLieuChoHoaDon094(resultSet.getString("ten"),resultSet.getFloat("soluong"),resultSet.getFloat("gia"), resultSet.getFloat("tong")));
        }

        return save;
    }
}
