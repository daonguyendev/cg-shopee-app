<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/29/2023
  Time: 11:28 AM
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
<c:set var="a"
       value="${requestScope['a']}"/>
<c:set var="message" value="${requestScope['message']}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0"/>
    <title>Document</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/themify-icons/themify-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/footer.css">
    <c:choose>
        <c:when test = "${a eq 'home'}">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/home.css">
        </c:when>

        <c:when test = "${a eq 'ui'}">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/user-information.css">
        </c:when>
        <c:when test = "${a eq 'cart'}">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/cart-form.css">
        </c:when>
        <c:when test = "${a eq 'pm'}">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/product-managerment.css">
        </c:when>
        <c:otherwise>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/home.css">
        </c:otherwise>
    </c:choose>

</head>
<body <c:if test="${not empty message}">onload="x()"</c:if> >
<jsp:include
        page="${commonUrl}/header.jsp"></jsp:include>

<div>
    <dec:body>

    </dec:body>
</div>

<jsp:include
        page="${commonUrl}/footer.jsp"></jsp:include>



<c:choose>
    <c:when test = "${a eq 'home'}">
        <script src="${pageContext.request.contextPath}/resource/js/home.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/js/load-more.js"></script>
    </c:when>

    <c:when test = "${a eq 'ui'}">
        <script src="${pageContext.request.contextPath}/resource/js/user-information.js"></script>
    </c:when>
    <c:when test = "${a eq 'cart'}">
        <script src="${pageContext.request.contextPath}/resource/js/cart-form.js"></script>
    </c:when>
    <c:when test = "${a eq 'pm'}">
        <script src="${pageContext.request.contextPath}/resource/js/product-management.js"></script>
    </c:when>
    <c:otherwise>
        <script src="${pageContext.request.contextPath}/resource/js/home.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/resource/js/load-more.js"></script>
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
