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
  <input type="text" name="maMuonSach"><br><br>

  <label>Mã học sinh:</label>
  <input type="text" name="maHocSinh"><br><br>

  <label>Mã sách:</label>
  <input type="text" name="maSach"><br><br>

  <label>Ngày mượn:</label>
  <input type="date" name="ngayMuon"><br><br>

  <label>Ngày trả:</label>
  <input type="date" name="ngayTra"><br><br>

  <input type="submit" value="Mượn sách">
</form>
</body>
</html>


