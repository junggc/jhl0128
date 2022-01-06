<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2021-12-30
  Time: 오후 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>이것은 타이틀</title>
  </head>
  <body>
<%--  이때의 경로는 /fff 이며 여기에도 버튼을 만들어 이번엔 /ddd로 가게 만든다 --%>
<%--HomeController 를 탐--%>
  <button type="button" onclick="location.href='/ddd'" class="btn btn-primary">누르면 ddd로 간다</button>

  <h1>/fff로 가서  index.jsp 불럿다</h1>
  </body>
</html>
