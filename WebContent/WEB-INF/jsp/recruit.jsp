<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Beer Site</title>
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

<header>
<h1 id="logo"><a href="index.jsp"><img src="images/title2.png"></a></h1>
<!--PC用（901px以上端末）メニュー-->
<nav id="menubar">
<ul>

<li class="ddmenu-title">Service
	<ul class="ddmenu">
	<li><a href="service.jsp">サイト紹介</a></li>
	<li><a href="recruit.jsp">あなたにお勧めのビール検索</a></li>

	</ul>
</li>


<li class="ddmenu-title">Login
<ul class="ddmenu">
	<li><a href="login.jsp">ログインする</a></li>
	<li><a href="newlogin.jsp">新規登録をする</a></li>

	</ul>
</li>

</ul>
</nav>
<!--小さい端末用（900px以下端末）メニュー-->
<nav id="menubar-s">

</nav>
<ul class="icon">
<li><a href="#"><img src="images/icon_facebook.png" alt="Facebook"></a></li>
<li><a href="#"><img src="images/icon_twitter.png" alt="Twitter"></a></li>
<li><a href="#"><img src="images/icon_instagram.png" alt="Instagram"></a></li>
<li><a href="#"><img src="images/icon_youtube.png" alt="TouTube"></a></li>
</ul>
</header>


<div id="contents">

<section>

<h2>Service<span>おススメビール検索</span></h2>

<div class="list">
<figure><img src="images/111.jpg" alt=""></figure>
<div class="text">
<h4>おススメのビールを検索するため質問にお答えください♬</h4>
</br>
<h5>質問1  ...お酒はつよいですか？？</h5>
<p></p>

<p class="btn1"><a href="recruit.html">回答する</a></p>
</div>
</div>



</section>

</div>
<!--/#contents-->

<footer>

<div id="footermenu">
</div>
<!--/#footermenu-->

<div id="copyright">
<h5>Beer Site</h5>
</div>
<!--/#copyright-->

</footer>

<!--ページの上部に戻る「↑」ボタン-->
<p class="nav-fix-pos-pagetop"><a href="#">↑</a></p>

<!--メニュー開閉ボタン-->
<div id="menubar_hdr" class="close"></div>

<!--メニューの開閉処理条件設定　900px以下-->
<script>
if (OCwindowWidth() <= 900) {
	open_close("menubar_hdr", "menubar-s");
}
</script>

<!--子メニュー-->
<script>
if (OCwindowWidth() <= 900) {
	open_close("menubar_hdr2", "menubar-s2");
}
</script>

</body>
</html>