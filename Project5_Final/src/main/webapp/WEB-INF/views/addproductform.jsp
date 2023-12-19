<%--
  Created by IntelliJ IDEA.
  User: 임승범
  Date: 2023-12-16
  Time: 오후 3:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>AddProduct</title>
</head>
<body>

<h1>새로운 상품 추가</h1>

<form action="addok" method="post">
    <table id="edit">
        <tr><td>상품명</td><td><input type="text" name="name"/></td></tr>
        <tr><td>판매가</td><td><input type="text" name="price"/></td></tr>
        <tr><td>재고량</td><td><input type="text" name="stock"/></td></tr>
        <tr><td>원산지</td><td><input type="text" name="origin"/></td></tr>
        <tr><td>유통기한</td><td><input type="text" name="validation"/></td></tr>
        <tr><td>배달여부</td><td><input type="text" name="delivery"/></td></tr>
        <tr><td>소개</td><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
    </table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>

</body>
</html>
