<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
 <head>
 <meta charset="UTF-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <title>TrinkenVerein</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <meta name="description" content="ここにサイト説明を入れます">
 <meta name="keywords" content="キーワード１,キーワード２,キーワード３,キーワード４,キーワード５">
 <link rel="stylesheet" href="css/style.css">
 <script src="js/openclose.js"></script>
 <script src="js/fixmenu_pagetop.js"></script>
 <script src="js/ddmenu_min.js"></script>
 <!--[if lt IE 9]>
 <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
 <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
 <![endif]-->
 <style>
 h4:first-letter {
  font-size: 2em;
  color: #7172ac;
 }
 </style>
 </head>

 <body>
  <div id="container">
   <jsp:include page="/WEB-INF/jsp/include/header.jsp" /><%--ヘッダー表示--%>
  </div>

  <div id="contents">
   <section>
    <h2>
     Service<span>サイト紹介</span>
    </h2>

    <div class="list">
     <figure>
      <img src="images/sora.jpg" alt="">
     </figure>

     <div class="text">
      <div>
       <h4>TrinkenVerein~トリンケンヴェレーヌ~</h4>
      </div>

      <p>サイト紹介をご覧いただき、ありがとうございます✨</p>
      <p>こちらのサイトはお酒を扱うサイトとなっております。</p>
      <p>20歳以下の方は20歳になってからご利用をお願い致します👮</p>
      <br>
      <p>まず初めにサイト名【TrinkenVerein~トリンケンヴェレーヌ~】とは、</p>
      <p>ドイツ語です。日本語に直すと【飲酒クラブ】という意味になります。</p>
      <p><font color="red">飲酒推奨サイトです。</font></p>
      <br>
      <p>日本のビールだけでなく、あまり知られていない海外ビール🍺の、</p>
      <p>特徴や飲みやすさを紹介しております。紹介文へも注目していただけると幸いです。</p>
      <br>
      <p>簡単な質問に答えていただくだけで、</p>
      <p>ビールが好きな方、ビールが嫌いな方にもおすすめのビールを紹介致します。</p>
      <p>気になるビール🍺がありましたら、購入サイトへつながっておりますので、</p>
      <p>一度ご賞味くださいませ✨</p>
      <p>ぜひ一度ビール検索してみてください♬</p>
      <p><font color="red">~飲みすぎは注意です。人生を狂わす可能性があります~</font></p>
      <p class="btn1"><a href="${pageContext.request.contextPath}/RecruitInitServlet">ビール検索してみる🍺</a></p>
     </div>
    </div>
   </section>
  </div>
  <!--/#contents-->

  <jsp:include page="/WEB-INF/jsp/include/footer.jsp"/><%--フッター表示--%>
 </body>
</html>
