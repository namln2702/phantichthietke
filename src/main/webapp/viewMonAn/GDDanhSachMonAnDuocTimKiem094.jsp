<%@ page import="com.rs.phantichthietke.entity.MonAn094" %>
<%@ page import="java.util.List" %>
<%@ page import="com.rs.phantichthietke.dao.MonAn094DAO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.rs.phantichthietke.dao.MonAn094DAO" %><%--
  Created by IntelliJ IDEA.
  User: laing
  Date: 11/9/2024
  Time: 1:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Giao Diện Món Ăn</title>
  <link rel="stylesheet" href="../css/GDMonAnDuocTimKiem094.css" /></head>
<body>
<div class="container">
  <div class="search-container">
    <div class="action-buttons">
    <%String tenMonAn = request.getParameter("tenMonAn");%>
      <h1>Các món ăn liên quan đến <%=tenMonAn%></h1>
    </div>
<%--    <%=request.getAttribute("monAnDuocTimKiem")%>--%>
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
      List<MonAn094> dsMonAn = new ArrayList<>();
      try {
        dsMonAn = monAn094DAO.getTimMonAn(request.getParameter("tenMonAn"));
      }catch (Exception e){
        e.printStackTrace();
      }
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
    <button type="submit" id="backButton" onclick="history.back()">Quay lại</button>
  </div>
</div>
</body>
