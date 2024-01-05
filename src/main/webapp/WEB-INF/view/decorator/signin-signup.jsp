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
<c:set var="a" value="${requestScope['a']}"/>
<c:set var="message" value="${requestScope['message']}"/>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0"/>
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/signin-signup-background.css">
    <c:choose>
        <c:when test="${a eq 'signin'} ">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/signin-form.css">

        </c:when>
        <c:when test="${a eq 'signup'}">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/signup-form.css">
        </c:when>
        <c:otherwise>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/signin-form.css">
        </c:otherwise>
    </c:choose>

</head>
<body onload="x()">
<div class="header">
    <div class="header-container">
        <div class="header-container-left">
            <a href="/home" class="header-container-left-item1"></a>
            <div class="header-container-left-item2">
                <c:choose>
                    <c:when test="${a eq 'signin'} ">
                        <c:out value="${'Đăng nhập'}"/>
                    </c:when>
                    <c:when test="${a eq 'signup'}">
                        <c:out value="${'Đăng ký'}"/>
                    </c:when>
                    <c:otherwise>
                        <c:out value="${'Đăng nhập'}"/>
                    </c:otherwise>
                </c:choose>

            </div>
        </div>
        <div class="header-container-right">
            <a href="" class="header-container-right-item">Bạn cần giúp đỡ?</a>
        </div>
    </div>
</div>
<div class="body">
    <div class="body-container">
        <dec:body>

        </dec:body>
    </div>
</div>
<c:choose>
    <c:when test="${a eq 'signin'} ">
        <script src="${pageContext.request.contextPath}/resource/js/signin-form.js"></script>
    </c:when>
    <c:when test="${a eq 'signup'}">
        <script src="${pageContext.request.contextPath}/resource/js/signup-form.js"></script>
    </c:when>
    <c:otherwise>
        <script src="${pageContext.request.contextPath}/resource/js/signin-form.js"></script>
    </c:otherwise>
</c:choose>
<c:if test="${not empty message}">
    <script >
        function x(){
        alert("<c:out value="${message}">a</c:out>")}
    </script>
</c:if>
</body>
</html>