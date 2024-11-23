package com.rs.phantichthietke.dao;

import com.rs.phantichthietke.entity.MonAn094;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MonAn094DAO extends DAO{

    public MonAn094DAO(){
        super();
    }

    public List<MonAn094> getDsMonAn() throws SQLException {
        String url = "select * from monan094";
        PreparedStatement preparedStatement = con.prepareStatement(url);
        ResultSet resultSet = preparedStatement.executeQuery();

        List<MonAn094> monAn094List = new ArrayList<>();

        while(resultSet.next()){
            MonAn094 monAn094 = new MonAn094(resultSet.getInt("id"), resultSet.getString("ten"), resultSet.getString("mota"), resultSet.getFloat("gia"),resultSet.getString("nguyenlieu"));
            monAn094List.add(monAn094);
        }

        return monAn094List;


    }

    public List<MonAn094> getTimMonAn(String tenMonAn) throws  SQLException{
        String url = "select * from monan094 where monan094.ten like ?";
        PreparedStatement preparedStatement = con.prepareStatement(url);
        preparedStatement.setString(1,"%" + tenMonAn + "%");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<MonAn094> monAn094List = new ArrayList<>();

        while(resultSet.next()){
            MonAn094 monAn094 = new MonAn094(resultSet.getInt("id"), resultSet.getString("ten"), resultSet.getString("mota"), resultSet.getFloat("gia"),resultSet.getString("nguyenlieu"));
            monAn094List.add(monAn094);
        }

        return monAn094List;
    }

    public MonAn094 getChiTietMonAn(int id) throws SQLException{
        String url = "select * from monan094 where monan094.id = " + id;
        PreparedStatement preparedStatement = con.prepareStatement(url);

        ResultSet resultSet = preparedStatement.executeQuery();

        MonAn094 monAn094 = new MonAn094();

        while (resultSet.next()){
            monAn094.setTen(resultSet.getString("ten"));
            monAn094.setMota(resultSet.getString("mota"));
            monAn094.setNguyenLieu(resultSet.getString("nguyenlieu"));
            monAn094.setGia(resultSet.getFloat("gia"));
        }

        return monAn094;
    }
}
