<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="entity.BeerEntity"%>
<!--リクエストスコープからインスタンスを取得する -->
<%
BeerEntity beerE = (BeerEntity) request.getAttribute("beerEntity");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>おすすめ結果</h1>
<p>
製品名：<%= beerE.getProductName() %>
</p>

</body>
</html>