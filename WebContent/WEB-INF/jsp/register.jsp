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

 <h3 style="text-align: center"><font color="white" size="+3">New user registration</font></h3>



    <div id="login">
      <form name='form-login'action="${pageContext.request.contextPath}/UserRegisterServlet" method="post">
        <span class="fontawesome-user"></span>
          <input type="text"  name="user_name"  value="" placeholder="UseNamer 英数字40文字以内">
			<p><font color="white">${nameMessage}</font></p>
        <span class="fontawesome-user"></span>
          <input type="text"  name="user_id"  value="" placeholder="UserId 英数字5～20文字">
			<p><font color="white">${idMessage}</font></p>
        <span class="fontawesome-lock"></span>
          <input type="password"  name="password"  value="" placeholder="Password 英数字4～8文字">
			<p><font color="white">${passwordMessage}</font></p>
         <span class="fontawesome-date"></span>
          <input type="date"  name="age"  value="" placeholder="age">
			<p><font color="white">${ageMessage}</font></p>


        <input type="submit" value="Registration">
<ul>
<li class="title"><font color="white">登録済みの方はログイン画面へお進み下さい。</font></li>
<li><a href="${pageContext.request.contextPath}/loginInitServlet"><font color="white">ログイン画面</font></a></li>
<li><a href="${pageContext.request.contextPath}/MenuInitServlet"><font color="white">メニュー画面</font></a></li>
</ul>
		</form>
	</div>

<footer>

<div id="footermenu">



</div>
<!--/#footermenu-->

<div id="copyright">
<h5 style="text-align: center"><font color="white">TrinkenVerein</font></h5>
</div>
<!--/#copyright-->

</footer>

</body>
</html>