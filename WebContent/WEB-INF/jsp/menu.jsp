<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">

 <head>
  <meta charset="UTF-8">
  <title>TrinkenVerein</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>TrinkenVerein</title>
  <link rel="stylesheet" href="css/style.css">
  <script src="js/openclose.js"></script>
  <script src="js/fixmenu_pagetop.js"></script>
  <script src="js/ddmenu_min.js"></script>

  <style>
   h3 {
    position: relative;
    padding: 6px;
    color: #fff;
    border-radius: 10px;
    background-image: -webkit-linear-gradient(315deg, #231557 0%, #44107a 29%, #ff1361 67%, #fff800 100%);
    background-image: linear-gradient(-225deg, #231557 0%, #44107a 29%, #ff1361 67%, #fff800 100%);
   }

   h3 span {
    display: block;
    padding: 1rem 2rem;
    border-radius: 4px;
    background: rgba(255, 255, 255, .2);
   }

   h4 {
    padding: 1rem 1rem;
    color: #fff;
    border-radius: 10px;
    background-image: -webkit-gradient(linear, left top, right top, from(#f83600), to(#f9d423));
    background-image: -webkit-linear-gradient(left, #f83600 0%, #f9d423 60%);
    background-image: linear-gradient(to right, #f83600 0%, #f9d423 60%);
   }
  </style>
 </head>

 <body class="home">
  <div id="container"></div>

  <jsp:include page="/WEB-INF/jsp/include/header.jsp"/>

  <div id="contents">
   <section>
    <c:choose>
     <c:when test="${not empty sessionScope.LOGIN_USER_ENTITY}">
      <h2>Pickup News<span>今のおすすめビール🍻✨</span></h2>

      <div class="list">
       <figure><img src="${recommend.image}" alt="ビール画像"></figure>

       <div class="text">
        <h3><span>今のおすすめビールはこちらです✨</span></h3>
        <br>
        <h5>${recommend.productName}</h5>
        <p>${recommend.textParagraph1}</p>
        <p>${recommend.textParagraph2}</p>
        <p>${recommend.textParagraph3}</p>
        <p class="btn1"><a href="${recommend.shopUrl}">買ってみる</a></p>
       </div>
      </div>
     </c:when>

     <c:otherwise>
      <h2>Pickup News<span>サイト紹介</span></h2>
     </c:otherwise>
    </c:choose>

    <div class="list">
     <figure>
      <img src="images/beer1.jpg" alt="">
     </figure>

     <div class="text">
      <h4>サイト紹介</h4>
      <br>
      <p>ビールが苦手な方、好きな方でもおススメできるビールを紹介するサイトです。</p>
      <p>簡単なサイト紹介をしているのでご覧くださいませ。</p>
      <p class="btn1">
       <a href="${pageContext.request.contextPath}/ServiceInitServlet">もっとみる</a>
      </p>
     </div>
    </div>

    <div class="list">
     <figure>
      <img src="images/sample11.jpg" alt="">
     </figure>

     <div class="text">
      <h4>あなたにお勧めのビール検索</h4>
      <br>
      <p>簡単な質問に答えていただくだけでおすすめのビールを紹介します。</p>
      <p>下記ボタンよりお進みください。</p>
      <p class="btn1">
       <a href="${pageContext.request.contextPath}/QuestionInitServlet">ビール検索してみる</a>
      </p>
     </div>
    </div>
   </section>
  </div>

  <aside id="mainimg">
   <img src="images/11.jpg" alt="" class="slide1">
   <img src="images/22.jpg" alt="" class="slide2">
   <img src="images/33.jpg" alt="" class="slide3">
  </aside>

  <jsp:include page="/WEB-INF/jsp/include/footer.jsp"/>
 </body>
</html>
