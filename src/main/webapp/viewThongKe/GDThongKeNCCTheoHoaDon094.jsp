<%@ page import="java.util.List" %>
<%@ page import="com.rs.phantichthietke.entity.NhaCungCap094" %>
<%@ page import="com.rs.phantichthietke.entity.TKTheoSoLuongNhap094" %>
<%@ page import="com.rs.phantichthietke.dao.NhaCungCap094DAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.rs.phantichthietke.entity.TKNhaCungCapTheoHoaDon094" %><%--
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
<%String tenNCC =request.getParameter("tenNCC");
    String batDau = (String) session.getAttribute("batDau");
    String ketThuc = (String) session.getAttribute("ketThuc");
    int id = Integer.parseInt(request.getParameter("id"));

%>

<div class="container">
    <header>
        <h1>Thống kê nhà cung cấp <%=tenNCC%> theo số lượng hàng nhập từ ngày <%=batDau%> đến <%=ketThuc%></h1>
    </header>
    <table>
        <thead>
        <tr>
            <th>STT</th>
            <th>Ngày</th>
            <th>Số Lượng</th>
            <th>Tổng Tiền</th>
        </tr>
        </thead>
        <tbody>

        <%
            NhaCungCap094DAO nhaCungCap094DAO = new NhaCungCap094DAO();
            List<TKNhaCungCapTheoHoaDon094> dsTKTheoNgay = new ArrayList<>();

            try{
                dsTKTheoNgay = nhaCungCap094DAO.getTkNhaCungCapTheoHoaDon094(id, batDau, ketThuc);
            }catch (Exception e){
                e.printStackTrace();
            }
            for(int i = 0; i < dsTKTheoNgay.size(); i++){
        %>
        <tr onclick="window.location.href = 'GDTKNguyenLieuChoHoaDon094.jsp?id=<%=dsTKTheoNgay.get(i).getId()%>'">
            <td><%=i + 1%></td>
            <td><%=dsTKTheoNgay.get(i).getNgay()%></td>
            <td><%=dsTKTheoNgay.get(i).getSoLuong()%></td>
            <td><%=dsTKTheoNgay.get(i).getTongTien()%></td>
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

<script src="../js/GDThongKeNhaCungCapTheoNgay094.js"></script>

</body>
</html>