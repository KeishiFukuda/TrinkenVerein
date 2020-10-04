<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
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
 </head>

 <body class="home">
  <div id="container"></div>

  <jsp:include page="/WEB-INF/jsp/include/header.jsp"/>

  <div id="contents">
   <section>
    <h2>Pickup News<span>サイト紹介</span></h2>

    <div class="list">
     <figure>
      <img src="images/beer1.jpg" alt="">
     </figure>

     <div class="text">
      <h4>サイト紹介</h4>
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
