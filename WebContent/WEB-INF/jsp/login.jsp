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

 <center> <h3><font color="white" size="+3">Login screen</font></h3>
 </center>
</body>

    <div id="login">
      <form name='form-login'>
        <span class="fontawesome-user"></span>
          <input type="text" id="user" placeholder="UserId">

        <span class="fontawesome-lock"></span>
          <input type="password" id"pass" placeholder="Password">



        <input type="submit" value="Login">

<footer>

<div id="footermenu">


<ul>
<li class="title"><font color="white">新規の方は新規登録画面へお進みください。</font></li>
<p><a href="${pageContext.request.contextPath}/RegisterInitServlet"><font color="white">新規登録画面へ</font></a></p>
<p><a href="${pageContext.request.contextPath}/MenuInitServlet"><font color="white">戻る</font></a></p>


</ul>

</div>
<!--/#footermenu-->

<div id="copyright">
<center><h5>TrinkenVerein</h5></center>
</div>
<!--/#copyright-->

</footer>

</form>
</html>