<%--
  Created by IntelliJ IDEA.
  User: wjdrm
  Date: 2022-01-03
  Time: 오후 7:52
  To change this template use File | Settings | File Templates.
--%>
<%--jsp 문법을 사용하게 해주는 어노테이션(?) --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%-- 첫 웰컴 페이지인 web > index.jsp파일에 버튼태그만들어서 버튼눌렀을때 localhost:8080/fff 로 가도록 만듦--%>
<%--MyController 를 타고감--%>
<button type="button" onclick="location.href='/fff'" class="btn btn-primary">누르면fff로 간다</button>
<%-- 버튼을 누르시오 라고 나오게 하나 썼음--%>
<h1>버튼을 누르시오</h1>
</body>
</html>
