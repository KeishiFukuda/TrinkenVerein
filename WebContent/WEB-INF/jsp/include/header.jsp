<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <header>
  <h1 id="logo">
   <a href="${pageContext.request.contextPath}/MenuInitServlet"><img src="images/title2.png"></a>
  </h1>


  <nav id="menubar">
   <ul>
    <li class="ddmenu-title">Service▾
     <ul class="ddmenu">
      <li><a href="${pageContext.request.contextPath}/ServiceInitServlet">サイト紹介</a></li>
      <li><a href="${pageContext.request.contextPath}/QuestionInitServlet">あなたにお勧めのビール検索</a></li>
     </ul>
    </li>

    <li class="ddmenu-title">Login▾
     <ul class="ddmenu">
      <li><a href="${pageContext.request.contextPath}/loginInitServlet">ログインする</a></li>
      <li><a href="${pageContext.request.contextPath}/RegisterInitServlet">新規登録をする</a></li>
     </ul>
    </li>

    <li class="ddmenu-title">Logout▾
     <ul class="ddmenu">
      <li><a href="${pageContext.request.contextPath}/LogoutServlet">ログアウト</a></li>
     </ul>
    </li>

    <c:if test="${not empty sessionScope.LOGIN_USER_ENTITY}">
     <li class="ddmenu-title">
      ようこそ${sessionScope.LOGIN_USER_ENTITY.userName}さん
     </li>
    </c:if>
   </ul>
  </nav>


  <nav id="menubar-s">
   <ul class="icon">
    <li><a href="#"><img src="images/icon_facebook.png" alt="Facebook"></a></li>
    <li><a href="#"><img src="images/icon_twitter.png" alt="Twitter"></a></li>
    <li><a href="#"><img src="images/icon_instagram.png" alt="Instagram"></a></li>
    <li><a href="#"><img src="images/icon_youtube.png" alt="TouTube"></a></li>
   </ul>
  </nav>
 </header>