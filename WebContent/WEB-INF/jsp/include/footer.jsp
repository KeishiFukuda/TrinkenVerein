<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  <footer>
   <div id="footermenu">
    <ul>
     <li class="title">ご覧いただきありがとうございます。</li>
    </ul>
   </div>
   <!--/#footermenu-->

   <div id="copyright">
    <h5>TrinkenVerein</h5>
   </div>
   <!--/#copyright-->
  </footer>

  <!--ページの上部に戻る「↑」ボタン-->
  <p class="nav-fix-pos-pagetop">
   <a href="#">↑</a>
  </p>

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