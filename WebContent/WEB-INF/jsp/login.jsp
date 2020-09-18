<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TrinkenVerein</title>
</head>
<body>

	<h1>ログイン画面</h1>

	<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
		<table>
			<tr>
				<td>ユーザID</td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>パスワード</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" value="ログイン">
				</td>
			</tr>
		</table>
	</form>
	<br>
	<a href="${pageContext.request.contextPath}/WEB-INF/login.jsp">新規ユーザ登録</a>

</body>
</html>