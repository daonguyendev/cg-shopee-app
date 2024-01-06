<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Da`te: 12/29/2023
  Time: 8:50 AM
  To change this template use File | Settings | File Templates.
--%>
<c:set var="products"
       value="${requestScope['products']}"/>

<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- Slider Banner -->
<div class="banner">
    <div class="banner-sliderContain">
        <!-- Radio group -->

        <input class="radio" type="radio" name="radio" id="radio1" checked />
        <input class="radio" type="radio" name="radio" id="radio2" />
        <input class="radio" type="radio" name="radio" id="radio3" />
        <input class="radio" type="radio" name="radio" id="radio4" />

        <!-- End Radio group -->

        <!-- Img -->
        <div class="banner-sliderContain-group">
            <div class="banner-img banner-img1"></div>
            <div class="banner-img banner-img2"></div>
            <div class="banner-img banner-img3"></div>
            <div class="banner-img banner-img4"></div>
        </div>
        <!-- End img -->

        <!-- Manual Radio Button -->
        <div class="manual-radio-buttonGroup">
            <label
                    for="radio1"
                    class="manual-radio-button manual-radio-button1"
            ></label>
            <label
                    for="radio2"
                    class="manual-radio-button manual-radio-button2"
            ></label>
            <label
                    for="radio3"
                    class="manual-radio-button manual-radio-button3"
            ></label>
            <label
                    for="radio4"
                    class="manual-radio-button manual-radio-button4"
            ></label>
        </div>
    </div>
</div>

<div class="content">
    <!-- Category -->
    <div class="body-category">
        <div class="body-category-row1">
            <p class="body-category-row1-text">DANH MỤC</p>
        </div>
        <div class="body-category-row2">
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-1"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-1"
                >
                    Thời Trang Nam
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-2"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-2"
                >
                    Điện Thoại
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-3"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-3"
                >
                    Thời Trang Nữ
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-4"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-4"
                >
                    Laptop
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-5"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-5"
                >
                    Máy Ảnh
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-6"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-6"
                >
                    Đồng Hồ
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-7"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-7"
                >
                    Giày Nam
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-8"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-8"
                >
                    Thể Thao
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-9"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-9"
                >
                    Túi Ví Nữ
                </div>
            </div>
            <div class="body-category-row2-item">
                <div
                        class="body-category-row2-item-img body-category-row2-item-img-10"
                ></div>
                <div
                        class="body-category-row2-item-text body-category-row2-item-text-10"
                >
                    Giày Nữ
                </div>
            </div>
        </div>
    </div>
    <!-- End Category -->

    <!-- Product Title -->
    <div class="body-productTitle">
        <p>SẢN PHẨM</p>
    </div>
    <!-- End Product Title -->

    <!-- Product Container -->
    <div class="body-productContainer">
        <c:forEach items="${products}" var="product">
            <a      <c:if test="${product.getQuantity()<1}">style="opacity: 0.4; pointer-events: none"</c:if>
                    href="${pageContext.request.contextPath}/add?id=${product.getId()}" class="body-productContainer-product">
            <div class="body-productContainer-product-group">
                <img src="${product.getUrl()}" class="body-productContainer-product-prouctImg"></img>
                <div class="body-productContainer-product-productName">
                        ${product.getName()}
                </div>
                <div class="body-productContainer-product-unitPrice">
                    <div class="body-productContainer-product-unitPrice-origin"><sub>đ</sub> ${product.getOriginUnitPrice()}</div>
                    <div class="body-productContainer-product-unitPrice-sell"><sub>đ</sub> ${product.getCurrentPrice()}</div>

                </div>
                <div class="body-productContainer-product-productQuantity">
                    Số lượng: ${product.getQuantity()}
                </div>
            </div>
            </a>
        </c:forEach>
    </div>
    <!-- End Product Container -->
    <button type="button" onclick="loadMore()" class="body-loadMore">Xem thêm</button>
</div>
</body>
</html>
