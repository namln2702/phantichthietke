<%@ page import="java.util.List" %>
<%@ page import="com.rs.phantichthietke.entity.NhaCungCap094" %>
<%@ page import="com.rs.phantichthietke.entity.TKTheoSoLuongNhap094" %>
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
    <link rel="stylesheet" href="../css/GDThongKeNhaCungCapTheoNgay094.css">
</head>
<body>
<%String batDau =request.getParameter("batDau");
String ketThuc = request.getParameter("ketThuc");
%>

<div class="container">
    <header>
        <h1>Thống kê nhà cung cấp theo số lượng hàng nhập từ ngày <%=batDau%> đến <%=ketThuc%></h1>
    </header>
    <table>
        <thead>
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Số Lượng</th>
            <th>Giá</th>
        </tr>
        </thead>
        <tbody>

        <%
            NhaCungCap094DAO nhaCungCap094DAO = new NhaCungCap094DAO();

            List<TKTheoSoLuongNhap094> dsTKNCC094 = new ArrayList<>();

            try{
                dsTKNCC094 = nhaCungCap094DAO.getTkTheoSoLuongNhap094(batDau, ketThuc);
                session.setAttribute("batDau", batDau);
                session.setAttribute("ketThuc", ketThuc);
            }catch (Exception e){

            }
            for(int i = 0; i < dsTKNCC094.size(); i++){
        %>
        <tr onclick="window.location.href = 'GDThongKeNCCTheoHoaDon094.jsp?id=<%=dsTKNCC094.get(i).getId()%>&tenNCC=<%=dsTKNCC094.get(i).getTen()%>'">
            <td><%=i + 1%></td>
            <td><%=dsTKNCC094.get(i).getTen()%></td>
            <td><%=dsTKNCC094.get(i).getSoLuong()%></td>
            <td><%=dsTKNCC094.get(i).getGia()%></td>
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