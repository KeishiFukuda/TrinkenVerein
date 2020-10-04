<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
 <head>
 <meta charset="UTF-8">
 <title>ビール検索</title>
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

 .cp_ipradio {
  width: 90%;
  margin: 2em auto;
  text-align: left;
 }

 @
 keyframes click-wave {
  0% {
   position: relative;
   width: 30px;
   height: 30px;
   opacity: 0.35;
  }

  100% {
  width:200
  px;
  height:200
  px;
  margin-top:-80
  px;
  margin-left:-80
  px;
  opacity:0;
  }
 }
 .cp_ipradio .option-input {
  position: relative;
  position: relative;
  top: 13.33333px;
  right: 0;
  bottom: 0;
  left: 0;
  width: 30px;
  height: 30px;
  margin-right: 0.5rem;
  cursor: pointer;
  transition: all 0.15s ease-out 0s;
  color: #ffffff;
  border: none;
  outline: none;
  background: #d7cbcb;
  -webkit-appearance: none;
  appearance: none;
 }

 .cp_ipradio .option-input:hover {
  background: #d6a9a9;
 }

 .cp_ipradio .option-input:checked {
  background: #da3c41;
 }

 .cp_ipradio .option-input:checked::before {
  font-size: 20px;
  line-height: 30px;
  position: absolute;
  display: inline-block;
  width: 30px;
  height: 30px;
  content: '✔';
  text-align: center;
 }

 .cp_ipradio .option-input:checked::after {
  position: relative;
  display: block;
  content: '';
  -webkit-animation: click-wave 0.65s;
  animation: click-wave 0.65s;
  background: #da3c41;
 }

 .cp_ipradio .option-input.radio {
  border-radius: 50%;
 }

 .cp_ipradio .option-input.radio::after {
  border-radius: 50%;
 }

 .cp_ipradio label {
  line-height: 40px;
  display: block;
 }

 .cp_ipradio .option-input:disabled {
  cursor: not-allowed;
  background: #b8b7b7;
 }

 .cp_ipradio .option-input:disabled::before {
  font-size: 20px;
  line-height: 30px;
  position: absolute;
  display: inline-block;
  width: 30px;
  height: 30px;
  content: '✖︎';
  text-align: center;
 }

 .cp_ipradio .disabled {
  color: #9e9e9e;
 }

 .button {
  display: inline-block;
  border-radius: 5%;
  font-size: 14pt;
  text-align: center;
  cursor: pointer;
  padding: 5px 42px;
  background: #ff7f00;
  color: #ffffff;
  line-height: 1em;
  transition: .3s;
  box-shadow: 5px 5px 38px #666666;
  border: 2px solid #ff7f00;
 }

 .button:hover {
  box-shadow: none;
  color: #ff7f00;
  background: #ffffff;
 }
 </style>
 </head>

 <body>
  <div id="container">
   <jsp:include page="/WEB-INF/jsp/include/header.jsp"/>
  </div>

  <div id="contents">
   <section>
    <h2>Service<span>おススメビール検索</span></h2>

    <div class="list">
     <figure><img src="images/question3.jpg" alt=""></figure>

     <div class="text">
      <h4>おススメのビールを検索するため質問にお答えください♬</h4>
      <h5>${question.question}</h5>


      <div class="cp_ipradio">
       <form action="${pageContext.request.contextPath}/QuestionServlet" method="post">

        <div class="cp_ipradio">
         <label><input type="radio" class="option-input radio" name="answer" value="A1" checked /> YES</label>
         <label><input type="radio" class="option-input radio" name="answer" value="A2" /> NO</label>
        </div>

        <br>
        <input type="hidden" name="questionId" value="${question.questionId}" />
        <input type="submit" value="回答する 🍺" class="button">

       </form>
      </div>

     </div>
    </div>
   </section>
  </div>


  <jsp:include page="/WEB-INF/jsp/include/footer.jsp"/>
 </body>
</html>