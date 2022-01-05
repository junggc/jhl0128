<%--
  Created by IntelliJ IDEA.
  User: wjdrm
  Date: 2022-01-05
  Time: 오후 8:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <h1>여기가 끝</h1>

<%=request.getAttribute("bb")%>

 ${bb}

<c:out value="${bb}"/>

</body>
</html>
