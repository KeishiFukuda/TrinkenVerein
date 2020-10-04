<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
 <head>
  <meta charset="UTF-8">
  <title>おススメのビール</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/style.css">
  <script src="js/openclose.js"></script>
  <script src="js/fixmenu_pagetop.js"></script>
  <script src="js/ddmenu_min.js"></script>

  <style>
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

 <body>
  <div id="container">
   <jsp:include page="/WEB-INF/jsp/include/header.jsp"/>

   <div id="contents">
    <section>
     <h2>Service<span>あなたにお勧めのビールはこちらです🍺</span></h2>
    </section>

    <c:forEach var="beerDisplay" items="${beerResultList}">
     <section>
      <div class="list">
       <figure><img src="${beerDisplay.image}" alt="ビール画像"></figure>
       <div class="text">
        <h4><c:out value="${beerDisplay.heading}" /></h4><br/>
        <h5><c:out value="${beerDisplay.productName}" /></h5>
        <p><c:out value="${beerDisplay.textParagraph1}" /></p>
        <p><c:out value="${beerDisplay.textParagraph2}" /></p>
        <p><c:out value="${beerDisplay.textParagraph3}" /></p>
        <p class="btn1"><a href="${beerDisplay.shopUrl}">買ってみる</a></p>
       </div>
      </div>
     </section>
    </c:forEach>

   </div>
   <jsp:include page="/WEB-INF/jsp/include/footer.jsp"/>
  </div>
 </body>
</html>
