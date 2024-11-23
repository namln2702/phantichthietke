<%@ page import="com.rs.phantichthietke.dao.MonAn094DAO" %>
<%@ page import="com.rs.phantichthietke.entity.MonAn094" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: laing
  Date: 11/9/2024
  Time: 12:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Giao Diện Món Ăn</title>
  <link rel="stylesheet" href="../css/GDTimKiem094.css" /></head>
<body>
<div class="container">
  <h1>Giao diện tìm kiếm món ăn</h1>
  <div class="search-container">
    <form action="GDDanhSachMonAnDuocTimKiem094.jsp" method="post">
      <input type="text" placeholder="Nhập tên món ăn" id="searchInput" name="tenMonAn">
      <button type="submit" id="searchButton">Tìm kiếm</button>
    </form>
  </div>
  <table>
    <thead>
    <tr>
      <th>STT</th>
      <th>Tên món ăn</th>
      <th>Mô tả</th>
      <th>Giá</th>
    </tr>
    </thead>
    <tbody id="tableBody">
    <%
      MonAn094DAO monAn094DAO = new MonAn094DAO();
      List<MonAn094> dsMonAn = monAn094DAO.getDsMonAn();
      for(int i = 0 ; i < dsMonAn.size(); i++){
    %>
<tr onclick="window.location.href = 'GDChiTietMonAn094.jsp?id=<%=dsMonAn.get(i).getId()%>'">
    <td><%=i + 1%></td>
    <td><%=dsMonAn.get(i).getTen()%></td>
    <td><%=dsMonAn.get(i).getMota()%></td>
    <td><%=dsMonAn.get(i).getGia()%></td>
</tr>
    <%
      }
    %>
    </tbody>
  </table>
  <div class="back-button-container">
    <button class="back-button" id="backButton"><a onclick="history.back()">Quay lại</a></button>
  </div>
</div>
</body>
</html>