<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sách</title>
</head>
<body>
<h2>Danh sách sách trong thư viện</h2>
<table border="1">
    <tr>
        <th>Mã Sách</th>
        <th>Tên Sách</th>
        <th>Tác Giả</th>
        <th>Số Lượng</th>
        <th>Mô Tả</th>
    </tr>
    <c:forEach var="book" items="${listBooks}">
        <tr>
            <td>${book.maSach}</td>
            <td>${book.tenSach}</td>
            <td>${book.tacGia}</td>
            <td>${book.soLuong}</td>
            <td>${book.moTa}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
