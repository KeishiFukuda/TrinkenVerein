<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>飲酒クラブ（仮）</title>
</head>
<body>

	<h1>ログイン画面</h1>
	<span style="color:#ff0000;">${message}</span>
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
	<a href="${pageContext.request.contextPath}/public/UserInputInitServlet">新規ユーザ登録</a>

</body>
</html>