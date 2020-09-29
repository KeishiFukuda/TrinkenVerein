<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
  <meta charset="utf-8">
    <title>Registration</title>

    <link rel="stylesheet" href="css/input.css">
</head>
<body>
 <h1>&emsp;</h1>
 <h2>&emsp;</h2>

 <center> <h3><font color="white" size="+3">New user registration</font></h3>
 </center>


    <div id="login">
      <form name='form-login'action="${pageContext.request.contextPath}/UserRegisterServlet" method="post">
        <span class="fontawesome-user"></span>
          <input type="text"  name="user_name"  value="" placeholder="UseNamer">

        <span class="fontawesome-user"></span>
          <input type="text"  name="user_id"  value="" placeholder="UserId">

        <span class="fontawesome-lock"></span>
          <input type="password"  name="password"  value="" placeholder="Password">

         <span class="fontawesome-date"></span>
          <input type="date"  name="age"  value="" placeholder="age">



        <input type="submit" value="Registration">
<ul>
<li class="title"><font color="white">登録済みの方はログイン画面へお進み下さい。</font></li>
<p><a href="${pageContext.request.contextPath}/loginInitServlet"><font color="white">ログイン画面</font></a></p>
<p><a href="${pageContext.request.contextPath}/MenuInitServlet"><font color="white">メニュー画面</font></a></p>

</ul>
		</form>
	</div>

<footer>

<div id="footermenu">



</div>
<!--/#footermenu-->

<div id="copyright">
<center><h5>TrinkenVerein</h5></center>
</div>
<!--/#copyright-->

</footer>

</body>
</html>