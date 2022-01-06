<%--
  Created by IntelliJ IDEA.
  User: wjdrm
  Date: 2022-01-05
  Time: 오후 7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--/eee로 가서 이 페이지가 열리게 되고 여기엔 name이 bb 인 input box 를 하나 만들고  submit 버튼을 만든다--%>
<%--폼태그를 만들어서 폼액션으로 /complete를 달아 submit버튼을 눌렀을때  /complete로 가게 한다--%>
<%--이떄 TheController 를 탐--%>
 <form action="/complete">
     <input type="text" name="bb">
     <input type="submit" value="submit">
 </form>
</body>
</html>
