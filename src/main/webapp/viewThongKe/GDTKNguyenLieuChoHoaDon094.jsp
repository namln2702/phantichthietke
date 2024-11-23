<%@ page import="com.rs.phantichthietke.dao.NhaCungCap094DAO" %>
<%@ page import="com.rs.phantichthietke.entity.TKNguyenLieuChoHoaDon094" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: laing
  Date: 11/18/2024
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thống kê nhà cung cấp</title>
    <link rel="stylesheet" href="../css/GDThongKeNhaCungCapTheoNgay094.css">
</head>
<body>

<div class="container">
    <header>
        <h1>Chi tiết hóa đơn</h1>
    </header>
    <table>
        <thead>
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Số Lượng</th>
            <th>Giá</th>
            <th>Tổng Tiền</th>
        </tr>
        </thead>
        <tbody>

        <%
            int id = Integer.parseInt(request.getParameter("id"));
            NhaCungCap094DAO nhaCungCap094DAO = new NhaCungCap094DAO();
            List<TKNguyenLieuChoHoaDon094> dsNguyenLieu = new ArrayList<>();

            try{
                dsNguyenLieu = nhaCungCap094DAO.getNguyenLieuChoHoaDon094(id);
            }catch (Exception e){
                e.printStackTrace();
            }
            for(int i = 0; i < dsNguyenLieu.size(); i++){
        %>
        <tr onclick="">
            <td><%=i + 1%></td>
            <td><%=dsNguyenLieu.get(i).getTen()%></td>
            <td><%=dsNguyenLieu.get(i).getSoLuong()%></td>
            <td><%=dsNguyenLieu.get(i).getGia()%></td>
            <td><%=dsNguyenLieu.get(i).getTong()%></td>
        </tr>

        <%
            }
        %>
        </tbody>
    </table>
    <div class="back-button-container">
        <button class="back-button" id="backButton" onclick="history.back()">Quay lại</button>
    </div>
</div>

<script src="../js/GDThongKeNhaCungCapTheoNgay094.js"></script>

</body>
</html>