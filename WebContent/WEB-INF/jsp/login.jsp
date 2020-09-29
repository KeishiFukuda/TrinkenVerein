<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
  <meta charset="utf-8">
    <title>Login</title>

    <link rel="stylesheet" href="css/input.css">
</head>
<body>
 <h1>&emsp;</h1>
 <h2>&emsp;</h2>

<h3><font color="white" size="+3">Login screen</font></h3>



    <div id="login">
       <form name='form-login'action="${pageContext.request.contextPath}/LoginServlet" method="post">
        <span class="fontawesome-user"></span>
          <input type="text" name="userId" value="" placeholder="UserId">

        <span class="fontawesome-lock"></span>
          <input type="password" name="password" value="" placeholder="Password">



        <input type="submit" value="Login">
<ul>
<li class="title"><font color="white">新規の方は新規登録画面へお進みください。</font></li>
<p><a href="${pageContext.request.contextPath}/RegisterInitServlet"><font color="white">新規登録画面</font></a></p>
<p><a href="${pageContext.request.contextPath}/MenuInitServlet"><font color="white">メニュー画面</font></a></p>
</ul>
		</form>
	</div>
<footer>

<div id="footermenu">




</div>
<!--/#footermenu-->

<div id="copyright">
><h5>TrinkenVerein</h5>
</div>
<!--/#copyright-->

</footer>


</body>
</html>