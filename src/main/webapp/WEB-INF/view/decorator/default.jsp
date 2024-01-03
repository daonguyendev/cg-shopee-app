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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/home.css">
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/user-information.css">--%>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/cart-form.css">--%>

</head>
<body>
<jsp:include
        page="${commonUrl}/header.jsp"></jsp:include>

<div>
    <dec:body>

    </dec:body>
</div>

<jsp:include
        page="${commonUrl}/footer.jsp"></jsp:include>

<script src="${pageContext.request.contextPath}/resource/js/home.js"></script>
<%--<script src="${pageContext.request.contextPath}/resource/js/user-information.js"></script>--%>
<%--<script src="${pageContext.request.contextPath}/resource/js/cart-form.js"></script>--%>
</body>
</html>
