<%@ page import="com.rs.phantichthietke.entity.MonAn094" %>
<%@ page import="com.rs.phantichthietke.dao.MonAn094DAO" %>
<%@ page import="com.rs.phantichthietke.dao.MonAn094DAO" %><%--
  Created by IntelliJ IDEA.
  User: laing
  Date: 11/9/2024
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>


    <title>GD Chi tiết món ăn </title>
    <link rel="stylesheet" href="../css/GDChiTietMonAn094.css" />
</head>
<body>
<%
    MonAn094DAO monAn094DAO = new MonAn094DAO();
    MonAn094 monAn094 = new MonAn094();
    try {
        monAn094 = monAn094DAO.getChiTietMonAn(Integer.parseInt(request.getParameter("id")));
    }
    catch (Exception e){
        e.printStackTrace();
    }


%>
<div class="container">
    <%String tenMonAn = monAn094.getTen();%>
    <h2>GD Chi tiết món ăn <%=tenMonAn%></h2>
    <table>
        <tr>
            <th>Mô tả</th>
            <th>Nguyên liệu</th>
            <th>Giá</th>
        </tr>
        <tr>
            <td><%=monAn094.getMota()%></td>
            <td><%=monAn094.getNguyenLieu()%></td>
            <td><%=monAn094.getGia()%></td>
        </tr>
    </table>

    <div class="back-button-container">
        <button class="back-button" id="backButton" onclick="history.back()">Quay lại</button>
    </div>
</div>
<script src="../js/GDChiTietMonAn094.js"></script>
</body>
</html>