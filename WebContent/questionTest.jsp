<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "test.QuestionDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TrinkenVerein</title>
</head>
<body>


<h1>テスト</h1>

<h2>${question.question}</h2>

<form action="${pageContext.request.contextPath}/QuestionTestServlet" method="post">
	<input type="checkbox" name= "answer" value="A1">ANS a &nbsp;&nbsp;&nbsp;
	<input type="checkbox" name= "answer" value="A2">ANS b &nbsp;&nbsp;&nbsp;
	<input type="hidden" name="questionId" value="${question.questionId}"/>

		<input type="submit" value="送信">

</form>


</body>
</html>