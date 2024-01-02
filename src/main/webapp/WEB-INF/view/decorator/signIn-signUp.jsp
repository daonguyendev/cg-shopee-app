<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/31/2023
  Time: 10:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<%@ taglib
        uri="http://www.opensymphony.com/sitemesh/decorator"
        prefix="dec" %>
<c:set var="commonUrl"
       value="/WEB-INF/view/common"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0"/>
    <title>Document</title>
<%--    <link rel="stylesheet" href="/resource/css/login-form.css">--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/login-form.css">
<%--        <link rel="stylesheet" href="<c:url value="/resource/css/signin-signup-background.css"/>">--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/signin-signup-background.css">
    <script src="/resource/js/login-form.js"></script>
</head>
<body>
<div class="header">
    <div class="header-container">
        <div class="header-container-left">
            <a href="" class="header-container-left-item1"></a>
            <div class="header-container-left-item2">Đăng ký</div>
        </div>
        <div class="header-container-right">
            <a href="" class="header-container-right-item">Bạn cần giúp đỡ?</a>
        </div>
    </div>
</div>
<div class="body">
    <div class="main-container">
            <dec:body>

            </dec:body>
    </div>
</div>

</body>
</html>