<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 1/2/2024
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<c:set var="cart"
       value="${sessionScope['cart']}"/>
<c:set var="list"
       value="${cart.getProductArrayList()}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="cart-body">
    <form action="/payment" method="post" class="cart-body-container">
        <div class="cart-body-container-header">
            <div class="cart-body-container-header-productName">Sản phẩm</div>
            <div class="cart-body-container-header-category">Phân loại</div>
            <div class="cart-body-container-header-unitPrice">Đơn giá</div>
            <div class="cart-body-container-header-quantity">Số lượng</div>
            <div class="cart-body-container-header-totalPrice">Số tiền</div>
            <div class="cart-body-container-header-action">Thao tác</div>
        </div>
        <div class="cart-body-container-content">
            <div class="cart-body-container-content-row cart-header">
                <div
                        class="cart-body-container-content-row-shopIcon ti-briefcase"
                ></div>
                <div class="cart-body-container-content-row-shopName">Vannesa</div>
            </div>
            <!-- Begin product -->

            <c:forEach items="${list}" var="product">

                <div>
                    <div class="cart-body-container-content-row cart-content">
                        <div class="cart-body-container-header-productName cart-content">
                            <img
                                    class="cart-body-container-header-productName-img"
                                    src="${product.getUrl()}"
                                    alt=""
                            />
                            <p class="cart-body-container-header-productName-text">
                                ${product.getName()}
                            </p>
                        </div>
                        <div class="cart-body-container-header-category cart-content">
                            Đồ điện tử
                        </div>
                        <div class="cart-body-container-header-unitPrice cart-content">
                            <div class="cart-body-container-header-unitPrice-origin">
                                <sub>đ</sub>${product.getOriginUnitPrice()}
                            </div>
                            <div class="cart-body-container-header-unitPrice-modify">
                                <sub>đ</sub> <p>${product.getCurrentPrice()}</p>
                            </div>
                        </div>
                        <div class="cart-body-container-header-quantity cart-content">
                            <div class="cart-body-container-header-quantity-container">
                                <button
                                        class="minusButton"
                                        onclick=""
                                        type="button"
                                >
                                    -
                                </button>
                                <input
                                        type="text"
                                        name="${product.getId()}"
                                        class="quantityValue"
                                        id="${product.getId()}"
                                        onkeyup="value=value.replace(/[^\d]/g,'')"
                                        value="1"
                                />
                                <button
                                        class="plusButton"
                                        type="button"
                                        onclick=""
                                >
                                    +
                                </button>
                            </div>
                        </div>
                        <div class="cart-body-container-header-totalPrice cart-content">
                            <sub>đ</sub><p>${product.getCurrentPrice()}</p>
                        </div>
                        <a href="${pageContext.request.contextPath}/delete?id=${product.getId()}" class="cart-body-container-header-action cart-content">Xóa</a>
                    </div>
                </div>
            </c:forEach>

            <!-- End product -->
        </div>
        <div class="cart-body-container-footer">
            <div class="cart-body-container-footer-container">
                <div class="cart-body-container-footer-container-cartTotalMoney">
                    <p
                            class="cart-body-container-footer-container-cartTotalMoney-info"
                    >
                        Tổng thanh toán (<span> </span> Sản phẩm):
                    </p>
                    <p
                            class="cart-body-container-footer-container-cartTotalMoney-money"
                    >
                        <sub>đ</sub><span> </span>
                    </p>
                </div>
                <div class="cart-body-container-footer-container-payment">
                    <button type="submit">Mua Hàng</button>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
</html>
