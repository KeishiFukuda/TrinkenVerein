<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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

  <h3 style="text-align: center">
   <font color="white" size="+3">Login screen</font>
  </h3>

  <%--ログイン失敗時表示「ユーザIDまたはパスワードが間違っています。」--%>
  <c:if test="${not empty message}">
   <div style="text-align: center">
    <span style="color:red">${message}</span>
   </div>
  </c:if>

  <%--未ログイン時表示「おススメビール検索をご利用の方は、ログインをお願いします。」--%>
  <c:if test="${not empty loginRequestInformation}">
   <div style="text-align: center">
    <span style="color:yellow">${loginRequestInformation}</span>
   </div>
  </c:if>

  <div id="login">
   <form name='form-login' action="${pageContext.request.contextPath}/LoginServlet" method="post">
    <span class="fontawesome-user"></span>
    <input type="text" name="userId" value="" placeholder="UserId 英数字5～20文字">
    <span class="fontawesome-lock"></span>
    <input type="password" name="password" value="" placeholder="Password 英数字4～8文字">
    <input type="submit" value="Login">

    <ul>
     <li class="title"><font color="white">新規の方は新規登録画面へお進みください。</font></li>

     <li><a href="${pageContext.request.contextPath}/RegisterInitServlet">
      <font color="white">新規登録画面</font>
     </a></li>

     <li><a href="${pageContext.request.contextPath}/MenuInitServlet">
      <font color="white">メニュー画面</font>
     </a></li>
    </ul>
   </form>
  </div>

  <footer>
   <div id="footermenu"></div>

   <div id="copyright">
    <h5 style="text-align: center"><font color="white">TrinkenVerein</font></h5>
   </div>

  </footer>
 </body>
</html>