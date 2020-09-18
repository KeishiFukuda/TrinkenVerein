<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Beer Site</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Beer Site">
<meta name="keywords" content="キーワード１,キーワード２,キーワード３,キーワード４,キーワード５">
<link rel="stylesheet" href="css/style.css">
<script src="js/openclose.js"></script>
<script src="js/fixmenu_pagetop.js"></script>
<script src="js/ddmenu_min.js"></script>
<!--[if lt IE 10]>
<style>
.slide0,.slide2,.slide3 {display:none;}
</style>
<![endif]-->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body class="home">

<div id="container">

<header>
<h1 id="logo"><a href="index.html"><img src="images/title2.png"></a></h1>
<!--PC用（901px以上端末）メニュー-->
<nav id="menubar">
<ul>

<li class="ddmenu-title">Service
	<ul class="ddmenu">
	<li><a href="service.html">サイト紹介</a></li>
	<li><a href="service.html">あなたにお勧めのビール検索</a></li>

	</ul>
</li>


<li class="ddmenu-title">Login
<ul class="ddmenu">
	<li><a href="${pageContext.request.contextPath}/loginInitServlet">ログインする</a></li>
	<li><a href="newlogin.html">新規登録をする</a></li>

	</ul>
</li>

<li class="ddmenu-title">Logout
<ul class="ddmenu">
	<li><a href="index.html">ログアウトする</a></li>

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

<h2>Pickup News<span>サイト紹介</span></h2>

<div class="list">
<figure><img src="images/beer1.jpg" alt=""></figure>
<div class="text">
<h4>サイト紹介</h4>
<p>ビールが苦手な方、好きな方でもおススメできるビールを紹介するサイトです。</p>
<p>上記のビール選択から簡単な質問に答えるだけでおすすめビールを紹介します。</p>
<p class="btn1"><a href="service.html">もっとみる</a></p>
</div>
</div>

<div class="list">
<figure><img src="images/sample11.jpg" alt=""></figure>
<div class="text">
<h4>あなたにお勧めのビール検索</h4>
<p>簡単な質問に答えるだけでおすすめのビールを紹介します。</p>
<p>下記ボタンよりお進みください。</p>
<p class="btn1"><a href="service2.html">ビール検索してみる</a></p>
</div>
</div>

</section>


</div>
<!--/#contents-->

<footer>

<div id="footermenu">


<ul>
<li class="title">ご覧いただきありがとうございます。</li>
<a href="menu.jsp">上部に戻る</a>

</ul>

</div>
<!--/#footermenu-->

<div id="copyright">
<center><h5>Beer Site</h5></center>
</div>
<!--/#copyright-->

</footer>

<!--背景スライドショー-->

<aside id="mainimg">
<img src="images/11.jpg" alt="" class="slide1">
<img src="images/22.jpg" alt="" class="slide2">
<img src="images/33.jpg" alt="" class="slide3">
</aside>

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
