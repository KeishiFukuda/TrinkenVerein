<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "test.TestInitServlet" %>
<%@ page import= "test.QuestionDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TrinkenVerein</title>
</head>
<body>
<%

QuestionDTO question = (QuestionDTO)request.getAttribute("question");

%>

<h1>テスト</h1>

<h2><%= question.getQuestion() %></h2>

<h2>
<form action="/TrinkenVelein/QuestionTestServlet" method="post">
	<label><input type="checkbox" name= "<%= question.getName() %>" value="A1">ANS a</label>&nbsp;&nbsp;&nbsp;
	<label><input type="checkbox" name= "<%= question.getName() %>" value="A2">ANS b</label>&nbsp;&nbsp;&nbsp;
<tr>
<td><input type="submit" value="送信"></td>
</tr>

</form>
</h2>
</body>
</html>