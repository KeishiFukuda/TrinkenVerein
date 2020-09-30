<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
  <meta charset="utf-8">
    <title>Login</title>

    <link rel="stylesheet" href="css/input.css">
<style>

.button {
  display       : inline-block;
  border-radius : 5%;          /* 角丸       */
  font-size     : 14pt;        /* 文字サイズ */
  text-align    : center;      /* 文字位置   */
  cursor        : pointer;     /* カーソル   */
  padding       : 5px 70px;   /* 余白       */
  background    : #ff7f00;     /* 背景色     */
  color         : #ffffff;     /* 文字色     */
  line-height   : 1em;         /* 1行の高さ  */
  transition    : .3s;         /* なめらか変化 */
  box-shadow    : 5px 5px 38px #666666;  /* 影の設定 */
  border        : 2px solid #ff7f00;    /* 枠の指定 */
}
.button:hover {
  box-shadow    : none;        /* カーソル時の影消去 */
  color         : #ff7f00;     /* 背景色     */
  background    : #ffffff;     /* 文字色     */
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
<!--/#footermenu-->

<div id="copyright">
<h5 style="text-align: center"><font color="white">TrinkenVerein</font></h5>
</div>
<!--/#copyright-->

</footer>


</html>