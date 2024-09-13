<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/13/2024
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Mượn Sách</title>
</head>
<body>
<h2>Mượn sách</h2>
<form action="MuonSachController" method="post">
  <label>Mã mượn sách:</label>
  <input type="text" name="maMuonSach" value="MS-${randomNumber}" readonly><br><br>

  <label>Tên sách:</label>
  <input type="text" name="tenSach" value="${book.tenSach}" readonly><br><br>

  <label>Tên học sinh:</label>
  <select name="maHocSinh">
    <c:forEach var="hocSinh" items="${listHocSinh}">
      <option value="${hocSinh.maHocSinh}">${hocSinh.hoTen}</option>
    </c:forEach>
  </select><br><br>

  <label>Ngày mượn:</label>
  <input type="text" name="ngayMuon" value="${currentDate}" readonly><br><br>

  <label>Ngày trả:</label>
  <input type="text" name="ngayTra" placeholder="dd/MM/yyyy"><br><br>

  <input type="submit" value="Mượn sách">
</form>
</body>
</html>

