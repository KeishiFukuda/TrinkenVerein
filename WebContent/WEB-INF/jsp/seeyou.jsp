<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ログアウト</title>
<link rel="stylesheet" type="text/css" href="/design/ショップID/m_sys_common.css">
<link rel="stylesheet" type="text/css" href="/css/shop/import.css">
</head>

<body>
<div style="text-align:center">
<h1><img src="images/seeyou1.jpg"></h1>
</div>
</body>

<style>
body{
background-color: #fff4ee;
background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='100%25' height='100%25' %3E%3Cdefs%3E%3ClinearGradient id='a' x1='0' x2='0' y1='0' y2='1'%3E%3Cstop offset='0' stop-color='%23ff9113'/%3E%3Cstop offset='1' stop-color='%23c3aa1c'/%3E%3C/linearGradient%3E%3C/defs%3E%3Cpattern id='b' width='24' height='24' patternUnits='userSpaceOnUse'%3E%3Ccircle fill='%23fff4ee' cx='12' cy='12' r='12'/%3E%3C/pattern%3E%3Crect width='100%25' height='100%25' fill='url(%23a)'/%3E%3Crect width='100%25' height='100%25' fill='url(%23b)' fill-opacity='0.1'/%3E%3C/svg%3E");
background-attachment: fixed;
background-size: cover;

}

#M_introWrap{
	width:540px;
	margin:50px auto;
	border:2px solid #ccc;
	background:#fff;
}
#M_introWrap h2{
	font-size:15px;
	margin-bottom:24px;
	padding-bottom:8px;
	border-bottom:1px dotted #ccc;
}
#M_introContent{
	margin:24px;
}
#M_introContent p{
	margin-bottom:16px;
}
#M_introContent .M_section p{
	text-align:center;
}
.M_button{
	overflow:hidden;
	_zoom:0;
}
.M_button a{
	background: #ccc;
	width: 120px;
	line-height:32px;
	margin: 0 auto;
	display:block;
	text-decoration:none;
	float:left;
	margin-left:40px;
}
.M_button a:hover{
	background: #555;
	color:#fff;
}

.button {
  display       : inline-block;
  border-radius : 5%;
  font-size     : 14pt;
  text-align    : center;
  cursor        : pointer;
  padding       : 5px 70px;
  background    : #ff7f00;
  color         : #ffffff;
  line-height   : 1em;
  transition    : .3s;
  box-shadow    : 5px 5px 38px #666666;
  border        : 2px solid #ff7f00;
}
.button:hover {
  box-shadow    : none;
  color         : #ff7f00;
  background    : #ffffff;
}


</style>

<div id="M_introWrap">

		<h2 style="text-align: center"><font color="red" size=4>ログアウトしました。</font></h2>

		<p  style="text-align: center">ご訪問いただきありがとうございました。</p>
        <p  style="text-align: center">気になるビールはございましたでしょうか？🍺</p>
        <p  style="text-align: center">またのご訪問をお待ちしております。</p>
        <br>
		<div class="M_section">

	    <h3 style="text-align: center">再度入室される方は【入室】ボタンよりお入り下さい✨</h3>
 <p style="text-align: center"><a href="${pageContext.request.contextPath}/MenuInitServlet">
            <button type="button" class="button">入室</button>
        </a>

	</div>

</div>
</html>


