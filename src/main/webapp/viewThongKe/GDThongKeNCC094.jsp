<%@ page import="java.util.List" %>
<%@ page import="com.rs.phantichthietke.entity.NhaCungCap094" %>
<%@ page import="com.rs.phantichthietke.dao.NhaCungCap094DAO" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: laing
  Date: 11/15/2024
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thống kê nhà cung cấp</title>
    <link rel="stylesheet" href="../css/GDThongKeNhaCungCap094.css">
</head>
<body>

<div class="container">
    <header>
        <h1>Thống kê nhà cung cấp theo số lượng hàng nhập</h1>
    </header>

    <form action="GDNhaCungCapDuocThongKe094.jsp" method="post">
    <div class="input-container">
        <input type="date" id="startDate" placeholder="Bắt đầu" name="batDau">
        <input type="date" id="endDate" placeholder="Kết thúc" name="ketThuc">
        <button type="submit" id="searchButton">Thống kê</button>
    </div>
    </form>

    <table>
        <thead>
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Địa Chỉ</th>
            <th>SĐT</th>
        </tr>
        </thead>
        <tbody>

        <%
            NhaCungCap094DAO nhaCungCap094DAO = new NhaCungCap094DAO();
            List<NhaCungCap094> dsNhaCungCap = new ArrayList<>();
            try {
                dsNhaCungCap = nhaCungCap094DAO.getDsNhaCungCap();
            }catch (Exception e){
                e.printStackTrace();
            }
        for(int i = 0; i < dsNhaCungCap.size(); i++){
        %>
        <tr>
            <td><%=i + 1%></td>
            <td><%=dsNhaCungCap.get(i).getTen()%></td>
            <td><%=dsNhaCungCap.get(i).getDiachi()%></td>
            <td><%=dsNhaCungCap.get(i).getSoDienThoai()%></td>
        </tr>

        <%
            }
        %>
        <!-- Thêm nhiều nhà cung cấp tại đây -->
        </tbody>
    </table>

    <div class="back-button-container">
        <button class="back-button" id="backButton" onclick="history.back()">Quay lại</button>
    </div>
</div>
</body>
</html>