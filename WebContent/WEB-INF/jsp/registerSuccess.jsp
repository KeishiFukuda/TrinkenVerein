<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
    <title>Registration Successed</title>
    <link rel="stylesheet" href="css/input.css">
<style>

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


</head>
<body>
 <h1>&emsp;</h1>
 <h2>&emsp;</h2>

<h3 style="text-align: center"><font color="white" size="+3">Registration Successed</font></h3>
<h3 style="text-align: center"><font color="white" size="+3">~登録が完了しました🍺~</font></h3>
</body>

    <div id="login">
      <form name='form-login'>


         <a href="${pageContext.request.contextPath}/MenuInitServlet">
            <button type="button" class="button">メニュー画面へ戻る</button>
        </a>
        <br>
        <br>
         <a href="${pageContext.request.contextPath}/loginInitServlet">
            <button type="button" class="button">ログイン画面へ進む</button>
        </a>

      </form>
      </div>


<footer>

<div id="footermenu">




</div>


<div id="copyright">
<h5 style="text-align: center"><font color="white">TrinkenVerein</font></h5>
</div>


</footer>


</html>