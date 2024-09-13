<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/13/2024
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách học sinh</title>
</head>
<body>
<h2>Danh sách học sinh</h2>
<table border="1">
    <tr>
        <th>Mã Học Sinh</th>
        <th>Họ Tên</th>
        <th>Lớp</th>
    </tr>
    <c:forEach var="hocSinh" items="${listHocSinh}">
        <tr>
            <td>${hocSinh.maHocSinh}</td>
            <td>${hocSinh.hoTen}</td>
            <td>${hocSinh.lop}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

