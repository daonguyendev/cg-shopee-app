<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 1/9/2024
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Document</title>
  <link rel="stylesheet" href="/resource/css/error.css" />
</head>
<body>
<div class="error-container">
  <img
          class="error-cotainer-img"
          src="${pageContext.request.contextPath}/resource/asset/img/shopee-500.PNG"
          alt=""
  />
  <h2 class="error-cotainer-h2">500</h2>
  <p class="error-cotainer-p">It looks like something is wrong</p>
  <a class="error-cotainer-a" href="/home">Trở về trang chủ</a>
</div>
</body>
</html>

