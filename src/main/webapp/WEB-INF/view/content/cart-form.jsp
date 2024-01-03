<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 1/2/2024
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="cart-body">
    <div class="cart-body-container">
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
            <form action="">
                <div class="cart-body-container-content-row cart-content">
                    <div class="cart-body-container-header-productName cart-content">
                        <img
                                class="cart-body-container-header-productName-img"
                                src="https://down-vn.img.susercontent.com/file/sg-11134201-7rbm5-lmh1fw304onk61"
                                alt=""
                        />
                        <p class="cart-body-container-header-productName-text">
                            Chuột logitech G703
                        </p>
                    </div>
                    <div class="cart-body-container-header-category cart-content">
                        Đồ điện tử
                    </div>
                    <div class="cart-body-container-header-unitPrice cart-content">
                        <div class="cart-body-container-header-unitPrice-origin">
                            <sub>đ</sub>20.000
                        </div>
                        <div class="cart-body-container-header-unitPrice-modify">
                            <sub>đ</sub>18.000
                        </div>
                    </div>
                    <div class="cart-body-container-header-quantity cart-content">
                        <div class="cart-body-container-header-quantity-container">
                            <button
                                    class="minusButton"
                                    onclick="decreaseQuantity()"
                                    type="button"
                            >
                                -
                            </button>
                            <input
                                    type="text"
                                    name="quantity"
                                    class="quantityValue"
                                    id="quantity"
                                    onkeyup="value=value.replace(/[^\d]/g,'')"
                                    value="1"

                            />
                            <button
                                    class="plusButton"
                                    type="button"
                                    onclick="increaseQuantity()"
                            >
                                +
                            </button>
                        </div>
                    </div>
                    <div class="cart-body-container-header-totalPrice cart-content">
                        <sub>đ</sub>18.000
                    </div>
                    <div class="cart-body-container-header-action cart-content">Xóa</div>
                </div>
            </form>
            <!-- End product -->
            <!-- Begin product -->
            <form action="">
                <div class="cart-body-container-content-row cart-content">
                    <div class="cart-body-container-header-productName cart-content">
                        <img
                                class="cart-body-container-header-productName-img"
                                src="https://down-vn.img.susercontent.com/file/sg-11134201-7rbm5-lmh1fw304onk61"
                                alt=""
                        />
                        <p class="cart-body-container-header-productName-text">
                            Chuột logitech G703
                        </p>
                    </div>
                    <div class="cart-body-container-header-category cart-content">
                        Đồ điện tử
                    </div>
                    <div class="cart-body-container-header-unitPrice cart-content">
                        <div class="cart-body-container-header-unitPrice-origin">
                            <sub>đ</sub>20.000
                        </div>
                        <div class="cart-body-container-header-unitPrice-modify">
                            <sub>đ</sub>18.000
                        </div>
                    </div>
                    <div class="cart-body-container-header-quantity cart-content">
                        <div class="cart-body-container-header-quantity-container">
                            <button
                                    class="minusButton"
                                    onclick="decreaseQuantity()"
                                    type="button"
                            >
                                -
                            </button>
                            <input
                                    type="text"
                                    name="quantity"
                                    id="quantity"
                                    onkeyup="value=value.replace(/[^\d]/g,'')"
                                    value="1"
                                    class="quantityValue"

                            />
                            <button
                                    class="plusButton"
                                    type="button"
                                    onclick="increaseQuantity()"
                            >
                                +
                            </button>
                        </div>
                    </div>
                    <div class="cart-body-container-header-totalPrice cart-content">
                        <sub>đ</sub>18.000
                    </div>
                    <div class="cart-body-container-header-action cart-content">Xóa</div>
                </div>
            </form>
            <!-- End product -->
        </div>
        <div class="cart-body-container-footer">
            <div class="cart-body-container-footer-container">
                <div class="cart-body-container-footer-container-cartTotalMoney">
                    <p
                            class="cart-body-container-footer-container-cartTotalMoney-info"
                    >
                        Tổng thanh toán (0 Sản phẩm):
                    </p>
                    <p
                            class="cart-body-container-footer-container-cartTotalMoney-money"
                    >
                        <sub>đ</sub>18.000
                    </p>
                </div>
                <div class="cart-body-container-footer-container-payment">
                    <button type="button">Mua Hàng</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
